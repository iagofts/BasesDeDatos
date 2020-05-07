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
	            stmUsuario.setString(1, "%" + nombre + "%");
	            stmUsuario.setString(2, "%" + id + "%");
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

	 public void modificarUsuarioVivo(Integer id, String nombre_usuario, String clave, String localidad) {
	        Connection con;
	        PreparedStatement stmUsuario = null;

	        con = super.getConexion();

	        try {
	            stmUsuario = con.prepareStatement("update vivo "
	                    + "set localidad=? "
	                    + "where id_vivo=? "
	                    + "update usuario "
	                    + "set nombre_usuario=?,"
	                    + "set clave=? "
	                    + "where id_usuario=?");
	            stmUsuario.setString(1, localidad);
	            stmUsuario.setInt(2, id);
	            stmUsuario.setString(3, nombre_usuario);
	            stmUsuario.setString(4, clave);
	            stmUsuario.setInt(5, id);
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

	 public java.util.List<Vivo> VivosConJuicioPendiente (){
		 java.util.List<Vivo> resultado = new java.util.ArrayList<Vivo>();
	        Usuario UsuarioActual;
	        Connection con;
	        PreparedStatement stmUsuario = null;
	        ResultSet rsUsuario;

	        con = this.getConexion();
	        
	        String consulta = "select * from usuario as u "
	        		+ "full join vivo as v "
	        		+ "on u.id_usuario=v.id_vivo "
	        		+ "where pendiente_juicio=FALSE";

	        try {
	            stmUsuario = con.prepareStatement(consulta);
	            rsUsuario = stmUsuario.executeQuery();
	            while (rsUsuario.next()) {
	                UsuarioActual = new Vivo(rsUsuario.getString("nombre"),
	                        rsUsuario.getFloat("puntuacion")));
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
