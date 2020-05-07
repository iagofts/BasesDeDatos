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
 
}
