package baseDatos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import aplicacion.TipoLugar;
import aplicacion.TipoUsuario;
import aplicacion.Vivo;

class DAOVivos extends AbstractDAO {

	public DAOVivos(Connection conexion, aplicacion.FachadaAplicacion fa) {
		super.setConexion(conexion);
		super.setFachadaAplicacion(fa);
	}

	public java.util.List<Vivo> VivosConJuicioPendiente() {
		java.util.List<Vivo> resultado = new java.util.ArrayList<Vivo>();
		Vivo UsuarioActual = null;
		Connection con;
		PreparedStatement stmUsuario = null;
		ResultSet rsUsuario;

		con = this.getConexion();

		String consulta = "select * from usuario as u " + "full join vivo as v " + "on u.id_usuario=v.id_vivo "
				+ "full join mortal as m " + "on u.id_usuario=m.id_mortal " + "where pendiente_juicio=FALSE";

		try {
			stmUsuario = con.prepareStatement(consulta);
			rsUsuario = stmUsuario.executeQuery();
			while (rsUsuario.next()) {
				UsuarioActual = new Vivo(rsUsuario.getInt("id_usuario"), rsUsuario.getString("nombre_usuario"),
						rsUsuario.getString("nombre"), rsUsuario.getString("clave"),
						TipoUsuario.valueOf(rsUsuario.getString("tipo")), rsUsuario.getDate("fecha_nacimiento"),
						rsUsuario.getDate("fecha_muerte"), TipoLugar.valueOf(rsUsuario.getString("lugar")),
						rsUsuario.getFloat("puntuacion"), rsUsuario.getBoolean("pendiente_juicio"));
				resultado.add(UsuarioActual);

				System.out.println(UsuarioActual.getNombre());
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
		} finally {
			try {
				stmUsuario.close();
			} catch (SQLException e) {
				System.out.println("Imposible cerrar cursores");
			}
		}
		return resultado;
	}

	public void RegistrarUsuarioVivo(Integer id_demonio, Integer id_angel, String nombre,String nombre_usuario,String localidad, String clave, Date fecha_nacimiento, Date fecha_muerte) {
		Connection con;
		PreparedStatement stmUsuario = null;

		con = super.getConexion();

		try {
			stmUsuario = con.prepareStatement("insert into usuario(nombre_usuario, nombre, clave, tipo) "
							+ "values (?,?,?,?) "
							+ "insert into mortal(fecha_nacimiento,fecha_muerte,lugar) "
							+ "values (?,?,?) "
							+ "insert into vivo(ang_asignado,dem_asignado) "
							+ "values(?,?) ");
			stmUsuario.setString(1, nombre_usuario);
			stmUsuario.setString(2, nombre);
			stmUsuario.setString(3, clave);
			stmUsuario.setString(4, "Mortal");
			stmUsuario.setDate(5, fecha_nacimiento);
			stmUsuario.setDate(6, fecha_muerte);
			stmUsuario.setString(7, "Tierra");
			stmUsuario.setInt(8, id_angel);
			stmUsuario.setInt(9, id_demonio);
			stmUsuario.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
		} finally {
			try {
				stmUsuario.close();
			} catch (SQLException e) {
				System.out.println("Imposible cerrar cursores");
			}
		}

	}

}
