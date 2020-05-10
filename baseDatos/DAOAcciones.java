package baseDatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import aplicacion.BuenaAccion;
import aplicacion.Pecado;

class DAOAcciones extends AbstractDAO{

	public DAOAcciones(Connection conexion, aplicacion.FachadaAplicacion fa) {
        super.setConexion(conexion);
        super.setFachadaAplicacion(fa);
    }

	public java.util.List<BuenaAccion> listaBuenasAcciones(int id_usuario) {
		java.util.List<BuenaAccion> resultado = new java.util.ArrayList<BuenaAccion>();
		BuenaAccion AccionActual = null;
		Connection con;
		PreparedStatement stmBuenaAccion = null;
		ResultSet rsBuenaAccion;

		con = super.getConexion();

		String consulta = "select tba.descrip_accion, tba.puntuacion from vivo as v"
				+ " join buenaAccion as ba"
				+ " on v.id_vivo=ba.usuario"
				+ " join tipoBA as tba"
				+ " on tba.tipo_accion=ba.tipo_accion"
				+ " where v.id_vivo = ?";

		try {
			stmBuenaAccion = con.prepareStatement(consulta);
			stmBuenaAccion.setInt(1, id_usuario);
			rsBuenaAccion = stmBuenaAccion.executeQuery();
			while (rsBuenaAccion.next()) {
				AccionActual = new BuenaAccion(rsBuenaAccion.getFloat("puntuacion"), rsBuenaAccion.getString("descrip_accion"));
				resultado.add(AccionActual);

			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
		} finally {
			try {
				stmBuenaAccion.close();
			} catch (SQLException e) {
				System.out.println("Imposible cerrar cursores");
			}
		}
		return resultado;
	}
	public java.util.List<Pecado> listaPecados(int id_usuario) {
		java.util.List<Pecado> resultado = new java.util.ArrayList<Pecado>();
		Pecado PecadoActual = null;
		Connection con;
		PreparedStatement stmPecado = null;
		ResultSet rsPecado;

		con = super.getConexion();

		String consulta = "select tp.descrip_pecado, tp.gravedad, pe.fecha_hora, pe.confesado from vivo as v"
				+ " join pecado as pe"
				+ " on v.id_vivo=pe.usuario"
				+ " join tipoPecado as tp"
				+ " on tp.tipo_pecado=pe.tipo_pecado"
				+ " where v.id_vivo = ?";

		try {
			stmPecado = con.prepareStatement(consulta);
			stmPecado.setInt(1, id_usuario);
			rsPecado = stmPecado.executeQuery();
			while (rsPecado.next()) {
				PecadoActual = new Pecado(rsPecado.getFloat("gravedad"), rsPecado.getString("descrip_pecado"));
				resultado.add(PecadoActual);

			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
		} finally {
			try {
				stmPecado.close();
			} catch (SQLException e) {
				System.out.println("Imposible cerrar cursores");
			}
		}
		return resultado;
	}
	public java.util.List<Pecado> listaPecadosNoConfesados(int id_usuario) {
		java.util.List<Pecado> resultado = new java.util.ArrayList<Pecado>();
		Pecado PecadoActual = null;
		Connection con;
		PreparedStatement stmPecado = null;
		ResultSet rsPecado;

		con = super.getConexion();

		String consulta = "select tp.descrip_pecado, tp.gravedad, pe.fecha_hora, pe.confesado from vivo as v"
				+ " full join pecado as pe"
				+ " on v.id_vivo=pe.usuario"
				+ " full join tipoPecado as tp"
				+ " on tp.tipo_pecado=pe.tipo_pecado"
				+ " where v.id_vivo = ? and confesado = 'FALSE'";

		try {
			stmPecado = con.prepareStatement(consulta);
			stmPecado.setInt(1, id_usuario);
			rsPecado = stmPecado.executeQuery();
			while (rsPecado.next()) {
				PecadoActual = new Pecado(rsPecado.getFloat("gravedad"), rsPecado.getString("descrip_pecado"));
				resultado.add(PecadoActual);

			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
		} finally {
			try {
				stmPecado.close();
			} catch (SQLException e) {
				System.out.println("Imposible cerrar cursores");
			}
		}
		return resultado;
	}
	public java.util.List<Venganza> listaVenganzas() {
		java.util.List<Venganza> resultado = new java.util.ArrayList<Venganza>();
		Venganza VenganzaActual = null;
		Connection con;
		PreparedStatement stmVenganza = null;
		ResultSet rsVenganza;

		con = super.getConexion();

		String consulta = "select * "
				+ "from venganza ";

		try {
			stmVenganza = con.prepareStatement(consulta);
			rsVenganza = stmVenganza.executeQuery();
			while (rsVenganza.next()) {
				VenganzaActual = new Venganza(rsVenganza.getInt("nivel"),rsVenganza.getString("consecuencia"));
				resultado.add(VenganzaActual);

			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
		} finally {
			try {
				stmVenganza.close();
			} catch (SQLException e) {
				System.out.println("Imposible cerrar cursores");
			}
		}
		return resultado;
	}
	public java.util.List<String> localidades() {
		java.util.List<String> resultado = new java.util.ArrayList<String>();
		String LocalidadActual = null;
		Connection con;
		PreparedStatement stmLocalidad = null;
		ResultSet rsLocalidad;

		con = super.getConexion();

		String consulta = "select distinct localidad "
				+ "from vivo ";

		try {
			stmLocalidad = con.prepareStatement(consulta);
			rsLocalidad = stmLocalidad.executeQuery();
			while (rsLocalidad.next()) {
				LocalidadActual = rsLocalidad.getString("localidad");
				resultado.add(LocalidadActual);

			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
		} finally {
			try {
				stmLocalidad.close();
			} catch (SQLException e) {
				System.out.println("Imposible cerrar cursores");
			}
		}
		return resultado;
	}
	public Integer habitantesLocalidad(String localidad) {
		Integer nHabitantes = null;
		Connection con;
		PreparedStatement stmnHabitantes = null;
		ResultSet rsnHabitantes;

		con = super.getConexion();

		String consulta = "select count(id_vivo) as nHabitantes"
				+ "from vivo "
				+ "where localidad = ? ";

		try {
			stmnHabitantes = con.prepareStatement(consulta);
			stmnHabitantes.setString(1, localidad);
			rsnHabitantes = stmnHabitantes.executeQuery();
			if(rsnHabitantes.next()) {
				nHabitantes = rsnHabitantes.getInt("nHabitantes");

			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
		} finally {
			try {
				stmnHabitantes.close();
			} catch (SQLException e) {
				System.out.println("Imposible cerrar cursores");
			}
		}
		return nHabitantes;
	}
	public Integer numeroPecados(int id_usuario) {
		Integer nPecados = null;
		Connection con;
		PreparedStatement stmnPecados = null;
		ResultSet rsnPecados;

		con = super.getConexion();

		String consulta = "select count(id_vivo) "
				+ "from vivo "
				+ "where localidad = ? ";

		try {
			stmnPecados = con.prepareStatement(consulta);
			stmnPecados.setInt(1, id_usuario);
			rsnPecados = stmnPecados.executeQuery();
			if(rsnPecados.next()) {
				nPecados = rsnPecados.getInt("localidad");

			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
		} finally {
			try {
				stmnPecados.close();
			} catch (SQLException e) {
				System.out.println("Imposible cerrar cursores");
			}
		}
		return nPecados;
	}
	
	public void solicitarConfesion(int id_usuario, java.sql.Date fecha_hora) {
		Connection con;
		PreparedStatement stmConfesar = null;

		con = super.getConexion();

		String consulta = "update pecado "
				+ "set confesado_solicitada = 'TRUE' "
				+ "where usuario = ? "
				+ "and fecha_hora = ? ";

		try {
			stmConfesar = con.prepareStatement(consulta);
			stmConfesar.setInt(1, id_usuario);
			stmConfesar.setDate(1, fecha_hora);
			stmConfesar.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
		} finally {
			try {
				stmConfesar.close();
			} catch (SQLException e) {
				System.out.println("Imposible cerrar cursores");
			}
		}
	}
	
	public Float puntuacionLocalidad(String localidad) {
		Float puntuacion = (float)0.0;
		Connection con;
		PreparedStatement stmPuntuacion = null;
		ResultSet rsPuntuacion;

		con = super.getConexion();

		String consulta = "select SUM(puntuacion) as sumPuntuacion"
				+ "from vivo "
				+ "where localidad = ? ";

		try {
			stmPuntuacion = con.prepareStatement(consulta);
			stmPuntuacion.setString(1, localidad);
			rsPuntuacion = stmPuntuacion.executeQuery();
			if(rsPuntuacion.next()) {
				puntuacion = rsPuntuacion.getFloat("sumPuntuacion");

			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
		} finally {
			try {
				stmPuntuacion.close();
			} catch (SQLException e) {
				System.out.println("Imposible cerrar cursores");
			}
		}
		return puntuacion;
	}
}
