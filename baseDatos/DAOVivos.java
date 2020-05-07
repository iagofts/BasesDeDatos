package baseDatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import aplicacion.TipoLugar;
import aplicacion.TipoUsuario;
import aplicacion.Vivo;

class DAOVivos extends AbstractDAO{

	public DAOVivos(Connection conexion, aplicacion.FachadaAplicacion fa) {
        super.setConexion(conexion);
        super.setFachadaAplicacion(fa);
    }

	public java.util.List<Vivo> VivosConJuicioPendiente (){
		 java.util.List<Vivo> resultado = new java.util.ArrayList<Vivo>();
		 	Vivo UsuarioActual=null;
	        Connection con;
	        PreparedStatement stmUsuario = null;
	        ResultSet rsUsuario;

	        con = this.getConexion();
	        
	        String consulta = "select * from usuario as u "
	        		+ "full join vivo as v "
	        		+ "on u.id_usuario=v.id_vivo "
	        		+ "full join mortal as m "
	        		+ "on u.id_usuario=m.id_mortal "
	        		+ "where pendiente_juicio=FALSE";

	        try {
	            stmUsuario = con.prepareStatement(consulta);
	            rsUsuario = stmUsuario.executeQuery();
	            while (rsUsuario.next()) {
	                UsuarioActual = new Vivo(rsUsuario.getInt("id_usuario"),
	                		rsUsuario.getString("nombre_usuario"),rsUsuario.getString("nombre"),
	                		rsUsuario.getString("clave"),TipoUsuario.valueOf(rsUsuario.getString("tipo")),rsUsuario.getDate("fecha_nacimiento"),
	                		rsUsuario.getDate("fecha_muerte"),TipoLugar.valueOf(rsUsuario.getString("lugar")),rsUsuario.getFloat("puntuacion"),
	                		rsUsuario.getBoolean("pendiente_juicio"));
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
}
