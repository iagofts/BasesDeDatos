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
	                resultado = new Usuario(rsUsuario.getInt("id_usuario"),
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
	 
	 public java.util.List<Usuario> consultarUsuarios(Integer id, String nombre_usuario, String nombre) {
	        java.util.List<Usuario> resultado = new java.util.ArrayList<Usuario>();
	        Usuario UsuarioActual;
	        Connection con;
	        PreparedStatement stmUsuario = null;
	        ResultSet rsUsuario;

	        con = this.getConexion();
	        String consulta = "select id_usuario, nombre, nombre_usuario, nombre, clave, tipo "
	                + "from usuario as u "
	                + "where nombre_usuario like ? "
	                + "and nombre like ? ";
	        if (id != null) {
	            consulta += "and id_usuario = ?";
	        }

	        try {
	            stmUsuario = con.prepareStatement(consulta);
	            stmUsuario.setString(1, "%" + nombre_usuario + "%");
	            stmUsuario.setString(2, "%" + nombre + "%");
	            stmUsuario.setInt(3, id );
	            rsUsuario = stmUsuario.executeQuery();
	            while (rsUsuario.next()) {
	                UsuarioActual = new Usuario(rsUsuario.getInt("id_usuario"),
	                        rsUsuario.getString("nombre_usuario"), rsUsuario.getString("nombre"),
	                        rsUsuario.getString("clave"), TipoUsuario.valueOf(rsUsuario.getString("tipo")));
	                resultado.add(UsuarioActual);
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
	 public java.util.List<Usuario> consultarUsuariosMenos(Integer id, String nombre) {
	        java.util.List<Usuario> resultado = new java.util.ArrayList<Usuario>();
	        Usuario UsuarioActual;
	        Connection con;
	        PreparedStatement stmUsuario = null;
	        ResultSet rsUsuario;

	        con = this.getConexion();
	        String consulta = "select id_usuario, nombre "
	                + "from usuario as u FULL JOIN mortal as m "
	                + "on u.id_usuario = m.id_mortal "
	                + "where nombre like ? "
	                + "and id_usuario != ? "
	                + "and lugar = 'Tierra'";
	        
	        try {
	            stmUsuario = con.prepareStatement(consulta);
	            stmUsuario.setString(1, "%" + nombre + "%");
	            stmUsuario.setInt(2,  id );
	            rsUsuario = stmUsuario.executeQuery();
	            while (rsUsuario.next()) {
	                UsuarioActual = new Usuario(rsUsuario.getInt("id_usuario"),rsUsuario.getString("nombre"));
	                resultado.add(UsuarioActual);
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
