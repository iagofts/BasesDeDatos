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
    
    public void muestraVJuzgar(java.awt.Frame parent,boolean modal,Vivo v){
        fgui.muestraVJuzgar(parent,modal,v);
    }
    
    public void muestraVRegistrar(){
        fgui.muestraVRegistrar();
    }
    
    public void muestraVEstadisticas(){
        fgui.muestraVEstadisticas();
    }
 
}
