package aplicacion;


public class FachadaAplicacion {
    gui.FachadaGui fgui;
    baseDatos.FachadaBaseDatos fbd;
    GestionUsuarios cu;
    
    public FachadaAplicacion(){
        fgui=new gui.FachadaGui(this);
        fbd=new baseDatos.FachadaBaseDatos(this);
        cu=new GestionUsuarios(fgui,fbd);
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
        return cu.comprobarAutentificacion(user, key);
    }
    
    public void muestraVPrincipal(Usuario user){
        fgui.muestraVPrincipal(user);
    }
    
    public java.util.List<Vivo> juiciosPendientes(){
        return cu.juiciosPendientes();
    }
    
    public void muestraVJuzgar(java.awt.Frame parent,boolean modal,Vivo v){
        fgui.muestraVJuzgar(parent,modal,v);
    }
    
    public void muestraVRegistrar(java.awt.Frame parent,boolean modal){
        fgui.muestraVRegistrar(parent,modal);
    }
    
    public void muestraVEstadisticas(java.awt.Frame parent,boolean modal){
        fgui.muestraVEstadisticas(parent,modal);
    }
    public java.util.List<Vivo> listaVivosCielo() {
    	return cu.listaVivosCielo();
    }
    public java.util.List<Vivo> listaVivosInfierno() {
    	return cu.listaVivosInfierno();
    }
    public java.util.List<Vivo> listaVivosLimbo() {
    	return cu.listaVivosLimbo();
    }
    public java.util.List<Demonio> listaDemoniosInfierno() {
    	return cu.listaDemoniosInfierno();
    }
    public java.util.List<Angel> listaAngelesCielo() {
    	return cu.listaAngelesCielo();
    }
}
