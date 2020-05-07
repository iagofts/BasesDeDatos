package gui;

import aplicacion.TipoUsuario;
import aplicacion.Usuario;

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
        if(user.getTipoUsuario().equals(TipoUsuario.Dios)){
            VDios vD;
            vD=new VDios(fa);
            vD.setVisible(true);
        }else{
            VUsuarioVivo vUV;
            vUV=new VUsuarioVivo(fa);
            vUV.setVisible(true);
        }
    }
    
}
