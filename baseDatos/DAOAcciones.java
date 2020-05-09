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
				+ " full join buenaAccion as ba"
				+ " on v.id_vivo=ba.usuario"
				+ " full join tipoBA as tba"
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

		String consulta = "select tp.descrip_pecado, tp.gravedad from vivo as v"
				+ " full join pecado as pe"
				+ " on v.id_vivo=pe.usuario"
				+ " full join tipoPecado as tp"
				+ " on tp.tipo_pecado=pe.tipo_pecado"
				+ " where v.id_vivo = ?";

		try {
			stmPecado = con.prepareStatement(consulta);
			stmPecado.setInt(1, id_usuario);
			rsPecado = stmPecado.executeQuery();
			while (rsPecado.next()) {
				PecadoActual = new Pecado(rsPecado.getFloat("gravedad"), rsPecado.getString("descrip_accion"));
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

		String consulta = "select tp.descrip_pecado, tp.gravedad from vivo as v"
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
				PecadoActual = new Pecado(rsPecado.getFloat("gravedad"), rsPecado.getString("descrip_accion"));
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
	public java.util.List<String> listaVenganzas() {
		java.util.List<String> resultado = new java.util.ArrayList<String>();
		String VenganzaActual = null;
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
				VenganzaActual = rsVenganza.getString("consecuencia");
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
	public int numeroHabitantesPorLocalidad() {
		return 5;
	}
	
}
