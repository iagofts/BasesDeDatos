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
    
    public java.util.List<Vivo> juiciosPendientes(){
        return fbd.VivosConJuicioPendiente();
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
    
    
 
}
