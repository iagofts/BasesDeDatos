package aplicacion;

import gui.FachadaGui;
import baseDatos.FachadaBaseDatos;

public class GestionUsuarios {
     
    FachadaGui fgui;
    FachadaBaseDatos fbd;
    
   
    public GestionUsuarios(FachadaGui fgui, FachadaBaseDatos fbd){
     this.fgui=fgui;
     this.fbd=fbd;
    }
    
    public Usuario comprobarAutentificacion(String user,String key){
        return fbd.validarUsuario(user, key);
    }
    
    public java.util.List<Usuario> consultarUsuarios(Integer id_usuario, String nombre_usuario, String nombre){
        return fbd.consultarUsuarios(id_usuario, nombre_usuario, nombre);
    }
    public java.util.List<Usuario> consultarUsuariosMenos(Integer id, String nombre) {
	return fbd.consultarUsuariosMenos(id, nombre);
    }
    
    public String RegistrarUsuarioVivo(String nombre, String nombre_usuario, String localidad, String fecha_muerte){
        java.sql.Date fecha_nacimiento=fbd.getFecha();
        java.sql.Date fMuerte=java.sql.Date.valueOf(fecha_muerte);
        fbd.RegistrarUsuarioVivo(fbd.listaDemoniosInfierno().get(0).getIdUsuario(), fbd.listaAngelesCielo().get(0).getIdUsuario(), nombre, nombre_usuario, localidad, "0000", fecha_nacimiento, fMuerte);
        return fecha_nacimiento.toString();
    }
    
    public void modificarUsuarioVivo(Integer id, String nombre, String clave, String localidad) {
	fbd.modificarUsuarioVivo(id, nombre, clave, localidad);
    }
    
    public java.util.List<Vivo> juiciosPendientes(){
        return fbd.VivosConJuicioPendiente();
    }
    public Vivo obtenerUsuarioVivo(int id_usuario){
        Vivo v=fbd.consultarUsuarioVivo(id_usuario);
        v.setBuenasAcciones(fbd.listaBuenasAcciones(id_usuario));
        v.setPecados(fbd.listaPecadosNoConfesados(id_usuario));
        return v;
    }
    public java.util.List<Vivo> listaVivosCielo() {
    	java.util.List<Vivo> listaVivos=null;
    	listaVivos = fbd.listaVivosCielo();
    	if(listaVivos!=null) {
    	for(Vivo v: listaVivos) {
    			v.setBuenasAcciones(fbd.listaBuenasAcciones(v.getIdUsuario()));
    		}
    	}
    	return listaVivos;
    }
    
    public java.util.List<Vivo> listaVivosInfierno() {
    	java.util.List<Vivo> listaVivos=null;
    	listaVivos = fbd.listaVivosInfierno();
    	if(listaVivos!=null) {
    	for(Vivo v: listaVivos) {
    			v.setPecados(fbd.listaPecados(v.getIdUsuario()));
    		}
    	}
    	return listaVivos;
    }
    public java.util.List<Vivo> listaVivosLimbo() {
    	java.util.List<Vivo> listaVivos=null;
    	listaVivos = fbd.listaVivosLimbo();
    	if(listaVivos!=null) {
    	for(Vivo v: listaVivos) {
    			v.setBuenasAcciones(fbd.listaBuenasAcciones(v.getIdUsuario()));
    			v.setPecados(fbd.listaPecados(v.getIdUsuario()));
    		}
    	}
    	return listaVivos;
    }
    public java.util.List<Demonio> listaDemoniosInfierno() {
    	return fbd.listaDemoniosInfierno();
    }
    public java.util.List<Angel> listaAngelesCielo() {
    	return fbd.listaAngelesCielo();
    }
    
    public java.util.List<String> listaStringVivosCielo() {
    	java.util.List<Vivo> listaVivos=null;
        java.util.List<String> listaNombres=null;
    	listaVivos = fbd.listaVivosCielo();
    	if(listaVivos!=null) {
        listaNombres=new java.util.ArrayList();
    	for(Vivo v: listaVivos) {
    			listaNombres.add(v.getNombre());
    		}
    	}
    	return listaNombres;
    }
    public java.util.List<String> listaStringVivosInfierno() {
    	java.util.List<Vivo> listaVivos=null;
        java.util.List<String> listaNombres=null;
    	listaVivos = fbd.listaVivosInfierno();
    	if(listaVivos!=null) {
        listaNombres=new java.util.ArrayList();
    	for(Vivo v: listaVivos) {
    			listaNombres.add(v.getNombre());
    		}
    	}
    	return listaNombres;
    }
    public java.util.List<String> listaStringVivosLimbo() {
    	java.util.List<Vivo> listaVivos=null;
        java.util.List<String> listaNombres=null;
    	listaVivos = fbd.listaVivosLimbo();
    	if(listaVivos!=null) {
        listaNombres=new java.util.ArrayList();
    	for(Vivo v: listaVivos) {
    			listaNombres.add(v.getNombre());
    		}
    	}
    	return listaNombres;
    }
    public java.util.List<String> listaStringDemoniosInfierno() {
    	java.util.List<Demonio> listaDemonios=null;
        java.util.List<String> listaNombres=null;
    	listaDemonios = fbd.listaDemoniosInfierno();
    	if(listaDemonios!=null) {
        listaNombres=new java.util.ArrayList();
    	for(Demonio d: listaDemonios) {
    			listaNombres.add(d.getNombre());
    		}
    	}
    	return listaNombres;
    }
    public java.util.List<String> listaStringAngelesCielo() {
    	java.util.List<Angel> listaAngeles=null;
        java.util.List<String> listaNombres=null;
    	listaAngeles = fbd.listaAngelesCielo();
    	if(listaAngeles!=null) {
        listaNombres=new java.util.ArrayList();
    	for(Angel a: listaAngeles) {
    			listaNombres.add(a.getNombre());
    		}
    	}
    	return listaNombres;
    }
    public java.util.List<Pecado> listaPecados(int id_usuario){
        return fbd.listaPecados(id_usuario);
    }
    public java.util.List<BuenaAccion> listaBuenasAcciones(int id_usuario){
        return fbd.listaBuenasAcciones(id_usuario);
    }
    public int juzgarUsuario(Vivo v){
        if(v.getPuntuacion()<-0.5){
            fbd.mandarALugar(v.getIdUsuario(), "Infierno");
            return 1;
        }
        else if(v.getPuntuacion()<0.5){
            fbd.mandarALugar(v.getIdUsuario(), "Limbo");
            return 2;
        }
        else{
            fbd.mandarALugar(v.getIdUsuario(), "Cielo");
            return 3;
        }
    }
    public void mandarACielo(int id_usuario){
        fbd.mandarALugar(id_usuario, "Cielo");
    }
    public void mandarALimbo(int id_usuario){
        fbd.mandarALugar(id_usuario, "Limbo");
    }
    public void mandarAInfierno(int id_usuario){
        fbd.mandarALugar(id_usuario, "Infierno");
    }
    
    public java.util.List<Venganza> listaVenganzas(){
        return fbd.listaVenganzas();
    }
    public java.util.List<String> localidades() {
        return fbd.localidades();
    }
    public Integer habitantesLocalidad(String localidad) {
	return fbd.habitantesLocalidad(localidad);
    }
    public void solicitarConfesion(int id_usuario, java.sql.Date fecha_hora, int tipoPecado) {
	fbd.solicitarConfesion(id_usuario, fecha_hora, tipoPecado);
    }
    public Float puntuacionLocalidad(String localidad) {
	return fbd.puntuacionLocalidad(localidad);
    }
    public void solicitarVenganza(Integer id_solicitante, Integer id_vengado, Integer id_venganza){
        fbd.solicitarVenganza(id_solicitante, id_vengado, id_venganza);
    }
    public void angelizar(){
        fbd.angelizar();
    }
    public void demonizar(){
        fbd.demonizar();
    }
    public Float puntuacionEdad(Integer edad) {
		return fbd.puntuacionEdad(edad);
	}
    public Integer habitantesEdad(Integer edad) {
		return fbd.habitantesEdad(edad);
	}
}
