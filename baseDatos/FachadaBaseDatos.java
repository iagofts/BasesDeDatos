package baseDatos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Date;
import java.util.Properties;

import aplicacion.Angel;
import aplicacion.BuenaAccion;
import aplicacion.Demonio;
import aplicacion.Mortal;
import aplicacion.Pecado;
import aplicacion.Usuario;
import aplicacion.Vivo;

public class FachadaBaseDatos {
		private aplicacion.FachadaAplicacion fa;
		private java.sql.Connection conexion;
		private DAOUsuarios daoUsuarios;
		private DAOAcciones daoAcciones;
		private DAOVivos daoVivos;
		private DAOMortales daoMortales;
		
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
            daoMortales= new DAOMortales(conexion,fa);
            
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
		public void modificarUsuarioVivo(Integer id, String nombre, String clave, String localidad) {
	        this.daoVivos.modificarUsuarioVivo(id, nombre, clave, localidad);
	    }
		public java.util.List<Vivo> VivosConJuicioPendiente (){
			return daoVivos.VivosConJuicioPendiente();
		}
		public void RegistrarUsuarioVivo(Integer id_demonio, Integer id_angel, String nombre,String nombre_usuario,String localidad, String clave, Date fecha_nacimiento, Date fecha_muerte) {
			this.daoVivos.RegistrarUsuarioVivo(id_demonio, id_angel, nombre, nombre_usuario, localidad, clave, fecha_nacimiento, fecha_muerte);
		}
		public java.util.List<Pecado> listaPecados(int id_usuario){
			return this.daoAcciones.listaPecados(id_usuario);
		}
		public java.util.List<Pecado> listaPecadosNoConfesados(int id_usuario) {
			return this.daoAcciones.listaPecadosNoConfesados(id_usuario);
		}
		public java.util.List<BuenaAccion> listaBuenasAcciones(int id_usuario){
			return this.daoAcciones.listaBuenasAcciones(id_usuario);
		}
		public java.util.List<Vivo> listaVivosCielo(){
			return this.daoVivos.listaVivosCielo();
		}
		public java.util.List<Vivo> listaVivosInfierno(){
			return this.daoVivos.listaVivosInfierno();
		}
		public java.util.List<Vivo> listaVivosLimbo(){
			return this.daoVivos.listaVivosLimbo();
		}
		public java.util.List<Angel> listaAngelesCielo(){
			return this.daoMortales.listaAngelesCielo();
		}
		public java.util.List<Demonio> listaDemoniosInfierno(){
			return this.daoMortales.listaDemoniosInfierno();
		}
		public java.util.List<Vivo> listaVivosTierra(String nombre){
			return this.daoVivos.listaVivosTierra(nombre);
		}
		public void mandarALugar(int id_usuario,String lugar) {
			this.daoVivos.mandarALugar(id_usuario,lugar);
		}
		public void angelizar() {
			this.daoVivos.angelizar();
		}
		public void demonizar() {
			this.daoVivos.demonizar();
		}
		public java.util.List<String> listaVenganzas(){
			return this.daoAcciones.listaVenganzas();
		}
		public Vivo consultarUsuarioVivo(int id_usuario) {
			return this.daoVivos.consultarUsuarioVivo(id_usuario);  
		}
		public java.util.List<String> localidades() {
			return this.daoAcciones.localidades();
		}
		public Integer habitantesLocalidad(String localidad) {
			return this.daoAcciones.habitantesLocalidad(localidad);
		}
		public void solicitarConfesion(int id_usuario, java.sql.Date fecha_hora) {
			this.daoAcciones.solicitarConfesion(id_usuario, fecha_hora);
		}
		public Float puntuacionLocalidad(String localidad) {
			return this.daoAcciones.puntuacionLocalidad(localidad);
		}
}
