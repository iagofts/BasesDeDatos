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
    
    public void RegistrarUsuarioVivo(Integer id_demonio, Integer id_angel, String nombre, String nombre_usuario, String localidad, String clave, java.sql.Date fecha_nacimiento, java.sql.Date fecha_muerte){
        fbd.RegistrarUsuarioVivo(id_demonio, id_angel, nombre, nombre_usuario, localidad, clave, fecha_nacimiento, fecha_muerte);
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
    	listaVivos = fbd.listaVivosCielo();
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
        if(v.getPuntuacion()<-2.0){
            fbd.demonizar(v.getIdUsuario());
            return 1;
        }
        else if(v.getPuntuacion()<-0.5){
            fbd.mandarALugar(v.getIdUsuario(), "Infierno");
            return 2;
        }
        else if(v.getPuntuacion()<0.5){
            fbd.mandarALugar(v.getIdUsuario(), "Limbo");
            return 3;
        }
        else if(v.getPuntuacion()<2.0){
            fbd.mandarALugar(v.getIdUsuario(), "Cielo");
            return 4;
        }
        else{
            fbd.angelizar(v.getIdUsuario());
            return 5;
        }
    }
    
 
}
