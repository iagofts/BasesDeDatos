package baseDatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import aplicacion.TipoUsuario;
import aplicacion.Usuario;

class DAOUsuarios extends AbstractDAO{

	public DAOUsuarios(Connection conexion, aplicacion.FachadaAplicacion fa) {
        super.setConexion(conexion);
        super.setFachadaAplicacion(fa);
    }
	
	 public Usuario validarUsuario(String idUsuario, String clave) {
	        Usuario resultado = null;
	        Connection con;
	        PreparedStatement stmUsuario = null;
	        ResultSet rsUsuario;

	        con = this.getConexion();

	        try {
	            stmUsuario = con.prepareStatement("select id_usuario, nombre_usuario, nombre, clave, tipo "
	                    + "from usuario "
	                    + "where nombre_usuario = ? and clave = ?");
	            stmUsuario.setString(1, idUsuario);
	            stmUsuario.setString(2, clave);
	            rsUsuario = stmUsuario.executeQuery();
	            if (rsUsuario.next()) {
	                resultado = new Usuario(rsUsuario.getString("id_usuario"),
	                        rsUsuario.getString("nombre_usuario"), rsUsuario.getString("nombre"),
	                        rsUsuario.getString("clave"), TipoUsuario.valueOf(rsUsuario.getString("tipo")));

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
}
