package baseDatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import aplicacion.Angel;
import aplicacion.Demonio;
import aplicacion.Mortal;
import aplicacion.TipoUsuario;
import aplicacion.Usuario;
import aplicacion.Vivo;

class DAOMortales extends AbstractDAO {

	public DAOMortales(Connection conexion, aplicacion.FachadaAplicacion fa) {
        super.setConexion(conexion);
        super.setFachadaAplicacion(fa);
    }
	
	public java.util.List<Angel> listaAngelesCielo() {
        java.util.List<Angel> resultado = new java.util.ArrayList<Angel>();
        Angel UsuarioActual;
        Connection con;
        PreparedStatement stmUsuario = null;
        ResultSet rsUsuario;

        con = this.getConexion();
        String consulta = "select * "
                + "from mortal as m full join usuario as u on "
                + "u.id_usuario = m.id_mortal full join angel as a on "
                + "m.id_mortal = a.id_angel "
                + "where lugar = 'Cielo' and a.id_angel NOTNULL ";

        try {
            stmUsuario = con.prepareStatement(consulta);
            rsUsuario = stmUsuario.executeQuery();
            while (rsUsuario.next()) {
                UsuarioActual = new Angel(rsUsuario.getInt("id_usuario"),rsUsuario.getString("nombre"));
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
	public java.util.List<Demonio> listaDemoniosInfierno() {
        java.util.List<Demonio> resultado = new java.util.ArrayList<Demonio>();
        Demonio UsuarioActual;
        Connection con;
        PreparedStatement stmUsuario = null;
        ResultSet rsUsuario;

        con = this.getConexion();
        String consulta = "select * "
                + "from mortal as m full join usuario as u on "
                + "u.id_usuario = m.id_mortal full join demonio as d on "
                + "m.id_mortal = d.id_demonio "
                + "where lugar = 'Infierno' and d.id_demonio NOTNULL ";

        try {
            stmUsuario = con.prepareStatement(consulta);
            rsUsuario = stmUsuario.executeQuery();
            while (rsUsuario.next()) {
                UsuarioActual = new Demonio(rsUsuario.getInt("id_usuario"),rsUsuario.getString("nombre"));
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
