package gui;


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
     System.out.println("Error");
        VAviso va;
       
       va = new VAviso(null, true, txtExcepcion);
       va.setVisible(true);
    }
    
}
