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
    public void RegistrarUsuarioVivo(Integer id_demonio, Integer id_angel, String nombre, String nombre_usuario, String localidad, String clave, java.sql.Date fecha_nacimiento, java.sql.Date fecha_muerte){
        cu.RegistrarUsuarioVivo(id_demonio, id_angel, nombre, nombre_usuario, localidad, clave, fecha_nacimiento, fecha_muerte);
    }
    
    public void muestraVPrincipal(Usuario user){
        fgui.muestraVPrincipal(user);
    }
    
    public java.util.List<Vivo> juiciosPendientes(){
        return cu.juiciosPendientes();
    }
    
    public void muestraVJuzgar(java.awt.Frame parent,boolean modal,Vivo v){
        fgui.muestraVJuzgar(parent,modal,v,this);
    }
    
    public void muestraVRegistrar(java.awt.Frame parent,boolean modal){
        fgui.muestraVRegistrar(parent, modal);
    }
    
    public void muestraVEstadisticas(java.awt.Frame parent,boolean modal){
        fgui.muestraVEstadisticas(parent, modal);
    }
    public Vivo obtenerUsuarioVivo(int id_usuario){
        return cu.obtenerUsuarioVivo(id_usuario);
    }
    public void modificarUsuarioVivo(Integer id, String nombre, String clave, String localidad) {
	cu.modificarUsuarioVivo(id, nombre, clave, localidad);
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
    
    public java.util.List<String> listaStringVivosCielo() {
    	return cu.listaStringVivosCielo();
    }
    public java.util.List<String> listaStringVivosInfierno() {
    	return cu.listaStringVivosInfierno();
    }
    public java.util.List<String> listaStringVivosLimbo() {
    	return cu.listaStringVivosLimbo();
    }
    public java.util.List<String> listaStringDemoniosInfierno() {
    	return cu.listaStringDemoniosInfierno();
    }
    public java.util.List<String> listaStringAngelesCielo() {
    	return cu.listaStringAngelesCielo();
    }
    public int juzgarUsuario(Vivo v){
        return cu.juzgarUsuario(v);
    }
    public java.util.List<Pecado> listaPecados(int id_usuario){
        return cu.listaPecados(id_usuario);
    }
    public java.util.List<BuenaAccion> listaBuenasAcciones(int id_usuario){
        return cu.listaBuenasAcciones(id_usuario);
    }
    
}
