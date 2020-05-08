package baseDatos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Date;
import java.util.Properties;

import aplicacion.Usuario;
import aplicacion.Vivo;

public class FachadaBaseDatos {
		private aplicacion.FachadaAplicacion fa;
		private java.sql.Connection conexion;
		private DAOUsuarios daoUsuarios;
		private DAOAcciones daoAcciones;
		private DAOVivos daoVivos;
		
		public FachadaBaseDatos(aplicacion.FachadaAplicacion fa) {
		Properties configuracion = new Properties();
		this.fa=fa;
		FileInputStream arqConfiguracion;
		try {
            arqConfiguracion = new FileInputStream("baseDatos.properties");
            configuracion.load(arqConfiguracion);
            arqConfiguracion.close();

            Properties usuario = new Properties();

            String gestor = configuracion.getProperty("gestor");

            usuario.setProperty("user", configuracion.getProperty("usuario"));
            usuario.setProperty("password", configuracion.getProperty("clave"));
            this.conexion = java.sql.DriverManager.getConnection("jdbc:" + gestor + "://"
                    + configuracion.getProperty("servidor") + ":"
                    + configuracion.getProperty("puerto") + "/"
                    + configuracion.getProperty("baseDatos"),
                    usuario);

            daoUsuarios=new DAOUsuarios(conexion,fa);
            daoAcciones=new DAOAcciones(conexion,fa);
            daoVivos=new DAOVivos(conexion,fa);
            
        } catch (FileNotFoundException f) {
            System.out.println(f.getMessage());
            fa.muestraExcepcion(f.getMessage());
        } catch (IOException i) {
            System.out.println(i.getMessage());
            fa.muestraExcepcion(i.getMessage());
        } catch (java.sql.SQLException e) {
            System.out.println(e.getMessage());
            fa.muestraExcepcion(e.getMessage());
        }
		
	}
		
		public Usuario validarUsuario(String idUsuario, String clave) {
	        return daoUsuarios.validarUsuario(idUsuario, clave);
	    }
		public java.util.List<Usuario> consultarUsuarios(Integer id, String nombre_usuario, String nombre) {
	        return daoUsuarios.consultarUsuarios(id, nombre_usuario,nombre);
	    }
		public void modificarUsuarioVivo(Integer id, String nombre_usuario, String clave, String localidad) {
	        this.daoUsuarios.modificarUsuarioVivo(id, nombre_usuario, clave, localidad);
	    }
		public java.util.List<Vivo> VivosConJuicioPendiente (){
			return daoVivos.VivosConJuicioPendiente();
		}
		public void RegistrarUsuarioVivo(Integer id_demonio, Integer id_angel, String nombre,String nombre_usuario,String localidad, String clave, Date fecha_nacimiento, Date fecha_muerte) {
			this.daoVivos.RegistrarUsuarioVivo(id_demonio, id_angel, nombre, nombre_usuario, localidad, clave, fecha_nacimiento, fecha_muerte);
		}
	
}
