package aplicacion;


public class FachadaAplicacion {
    gui.FachadaGui fgui;
    baseDatos.FachadaBaseDatos fbd;
    
    public FachadaAplicacion(){
        fgui=new gui.FachadaGui(this);
        fbd=new baseDatos.FachadaBaseDatos(this);
    }
    
    public static void main(String args[]){
        FachadaAplicacion fa;
        
        fa=new FachadaAplicacion();
        fa.iniciaInterfazUsuario();
    }
    
    public void iniciaInterfazUsuario(){
        fgui.iniciaVista();
    }
    
    public void muestraExcepcion(String e){
        fgui.muestraExcepcion(e);
    }
    public void muestraExcepcion(java.awt.Frame parent, boolean modal, String txtExcepcion){
        fgui.muestraExcepcion(parent,modal,txtExcepcion);
    }
    
    public Usuario comprobarAutentificacion(String user,String key){
        return fbd.validarUsuario(user, key);
    }
    
    public void muestraVPrincipal(Usuario user){
        fgui.muestraVPrincipal(user);
    }
}
