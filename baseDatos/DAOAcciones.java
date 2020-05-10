package baseDatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import aplicacion.BuenaAccion;
import aplicacion.Pecado;
import aplicacion.Venganza;

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

		String consulta = "select tba.descrip_accion, tba.puntuacion from vivo as v "
				+ "join buenaAccion as ba "
				+ "on v.id_vivo = ba.usuario "
				+ "join tipoBA as tba "
				+ "on tba.tipo_accion = ba.tipo_accion "
				+ "where v.id_vivo = ? ";

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

		String consulta = "select tp.descrip_pecado, tp.gravedad, pe.fecha_hora, pe.confesado, pe.confesion_solicitada from vivo as v"
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
				PecadoActual = new Pecado(rsPecado.getFloat("gravedad"), rsPecado.getString("descrip_pecado"),rsPecado.getBoolean("confesado"),
						rsPecado.getBoolean("confesion_solicitada"),rsPecado.getDate("fecha_hora"));
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

		String consulta = "select tp.descrip_pecado, tp.gravedad, pe.fecha_hora, pe.confesado, pe.confesion_solicitada from vivo as v"
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
				PecadoActual = new Pecado(rsPecado.getFloat("gravedad"), rsPecado.getString("descrip_pecado"),rsPecado.getBoolean("confesado"),
						rsPecado.getBoolean("confesion_solicitada"),rsPecado.getDate("fecha_hora"));
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
				if (LocalidadActual == "") {
					LocalidadActual = "Desconocido";
				}
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

		String consulta = "select count(id_vivo) as nHabitantes "
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
	public Integer habitantesEdad(int edad) {
		Integer nHabitantes = null;
		Connection con;
		PreparedStatement stmnHabitantes = null;
		ResultSet rsnHabitantes;

		con = super.getConexion();

		String consulta = "select count(tabla.edad) as nHabitantes"
				+ "from "
				+ "(select age(fecha_muerte,fecha_nacimiento) as edad from mortal as m) as tabla " 
				+ "where ";
		switch (edad) {
		case 0:
			consulta = consulta + "edad < age('1/1/2025','1/1/2000') ";
			break;
		case 1:
			consulta = consulta + "edad between age('1/1/2025','1/1/2000') and age('1/1/2050','1/1/2000') ";
			break;
		case 2:
			consulta = consulta + "edad between age('1/1/2050','1/1/2000') and age('1/1/2075','1/1/2000') ";
			break;
		case 3:
			consulta = consulta + "edad > age('1/1/2075','1/1/2000') ";
			break;
		}

		try {
			stmnHabitantes = con.prepareStatement(consulta);
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
	public Float puntuacionEdad(int edad) {
		Float Puntuacion = null;
		Connection con;
		PreparedStatement stmPuntuacion = null;
		ResultSet rsPuntuacion;

		con = super.getConexion();

		String consulta = "select SUM(puntuacion) as sumPuntuacion " + 
				"from (select v.puntuacion,age(m.fecha_muerte,m.fecha_nacimiento) as edad from mortal as m " + 
				"full join vivo as v on m.id_mortal = v.id_vivo " + 
				"where id_vivo NOTNULL) as tabla " + 
				"where tabla.edad ";
		switch (edad) {
		case 0:
			consulta = consulta + "< age('1/1/2025','1/1/2000') ";
			break;
		case 1:
			consulta = consulta + "between age('1/1/2025','1/1/2000') and age('1/1/2050','1/1/2000') ";
			break;
		case 2:
			consulta = consulta + "between age('1/1/2050','1/1/2000') and age('1/1/2075','1/1/2000') ";
			break;
		case 3:
			consulta = consulta + "> age('1/1/2075','1/1/2000') ";
			break;
		}

		try {
			stmPuntuacion = con.prepareStatement(consulta);
			rsPuntuacion = stmPuntuacion.executeQuery();
			if(rsPuntuacion.next()) {
				Puntuacion = rsPuntuacion.getFloat("sumPuntuacion");

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
		return Puntuacion;
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
				+ "set confesion_solicitada = 'TRUE' "
				+ "where usuario = ? "
				+ "and fecha_hora = ? ";

		try {
			stmConfesar = con.prepareStatement(consulta);
			stmConfesar.setInt(1, id_usuario);
			stmConfesar.setDate(2, fecha_hora);
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

		String consulta = "select SUM(puntuacion) as sumpuntuacion "
				+ "from vivo "
				+ "where localidad = ? ";

		try {
			stmPuntuacion = con.prepareStatement(consulta);
			stmPuntuacion.setString(1, localidad);
			rsPuntuacion = stmPuntuacion.executeQuery();
			if(rsPuntuacion.next()) {
				puntuacion = rsPuntuacion.getFloat("sumpuntuacion");
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
	public java.sql.Date getFecha() {
		java.sql.Date fecha = null;
		Connection con;
		PreparedStatement stmFecha = null;
		ResultSet rsFecha;

		con = super.getConexion();

		String consulta = "select CURRENT_TIMESTAMP as fecha";

		try {
			stmFecha = con.prepareStatement(consulta);
			rsFecha = stmFecha.executeQuery();
			if(rsFecha.next()) {
				fecha = rsFecha.getDate("fecha");

			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
		} finally {
			try {
				stmFecha.close();
			} catch (SQLException e) {
				System.out.println("Imposible cerrar cursores");
			}
		}
		return fecha;
	}
	
	public void solicitarVenganza(int id_usuario_solicitante, int id_usuario_solicitado, int id_venganza) {
		Connection con;
		PreparedStatement stmVengar = null;

		con = super.getConexion();

		String consulta = "insert into solicitar(fecha_solicitud,solicitante,victima,venganza,demonio) "
				+ "values (CURRENT_TIMESTAMP,?,?,?,(select dem_asignado from vivo where id_vivo = ?))";

		try {
			stmVengar = con.prepareStatement(consulta);
			stmVengar.setInt(1, id_usuario_solicitante);
			stmVengar.setInt(2, id_usuario_solicitado);
			stmVengar.setInt(3, id_venganza);
			stmVengar.setInt(4, id_usuario_solicitante);
			stmVengar.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
		} finally {
			try {
				stmVengar.close();
			} catch (SQLException e) {
				System.out.println("Imposible cerrar cursores");
			}
		}
	}
}
