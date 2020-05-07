package baseDatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import aplicacion.Vivo;

class DAOVivos extends AbstractDAO{

	public DAOVivos(Connection conexion, aplicacion.FachadaAplicacion fa) {
        super.setConexion(conexion);
        super.setFachadaAplicacion(fa);
    }

	public java.util.List<Vivo> VivosConJuicioPendiente (){
		 java.util.List<Vivo> resultado = new java.util.ArrayList<Vivo>();
		 	Vivo UsuarioActual;
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
	                UsuarioActual = new Vivo(rsUsuario.getFloat("puntuacion"),
	                		rsUsuario.getString("nombre")
	                        );
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
