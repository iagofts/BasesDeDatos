package gui;

import aplicacion.TipoUsuario;
import aplicacion.Usuario;
import aplicacion.Vivo;

public class FachadaGui {
    aplicacion.FachadaAplicacion fa;
    
   public FachadaGui(aplicacion.FachadaAplicacion fa){
     this.fa=fa;
   } 

    public void iniciaVista(){
       VAutentificacion va;
      va = new VAutentificacion(fa);
      va.setVisible(true);
    }
    
    public void muestraExcepcion(String txtExcepcion){
       VAviso va;
       va = new VAviso(txtExcepcion);
       va.setVisible(true);
    }
     public void muestraExcepcion(java.awt.Frame parent, boolean modal, String txtExcepcion){
        VAviso va;
       va = new VAviso(parent,modal,txtExcepcion);
       va.setVisible(true);
    }
    public void muestraVPrincipal(Usuario user){
        if(user.getTipoUsuario().equals(TipoUsuario.Dios)){ //Ventana principal Dios
            VDios vD;
            vD=new VDios(fa);
            vD.setVisible(true);
        }else{ //Ventana principal Usuario Vivo
            VUsuarioVivo vUV;
            vUV=new VUsuarioVivo(fa,user);
            vUV.setVisible(true);
        }
    }
    
    public void muestraVJuzgar(java.awt.Frame parent, boolean modal,Vivo vivo,aplicacion.FachadaAplicacion fa){
        VJuzgar vj;
        vj = new VJuzgar(parent,modal,vivo,fa);
        vj.setVisible(true);
    }
    
    public void muestraVEstadisticas(java.awt.Frame parent,boolean modal){
        VEstadisticas ve;
        ve=new VEstadisticas(parent,modal);
        ve.setVisible(modal);
    }
     
    public void muestraVRegistrar(java.awt.Frame parent,boolean modal){
       VRegistrar vr;
       vr=new VRegistrar(parent,modal);
       vr.setVisible(modal);
    }
    
}
