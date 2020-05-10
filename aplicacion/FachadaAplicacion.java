package aplicacion;

public class FachadaAplicacion {
	gui.FachadaGui fgui;
	baseDatos.FachadaBaseDatos fbd;
	GestionUsuarios cu;

	public FachadaAplicacion() {
		fgui = new gui.FachadaGui(this);
		fbd = new baseDatos.FachadaBaseDatos(this);
		cu = new GestionUsuarios(fgui, fbd);
	}

	public static void main(String args[]) {
		FachadaAplicacion fa;

		fa = new FachadaAplicacion();
		fa.iniciaInterfazUsuario();
	}

	public void iniciaInterfazUsuario() {
		fgui.iniciaVista();
	}

	public void muestraExcepcion(String e) {
		fgui.muestraExcepcion(e);
	}

	public void muestraExcepcion(java.awt.Frame parent, boolean modal, String txtExcepcion) {
		fgui.muestraExcepcion(parent, modal, txtExcepcion);
	}

	public Usuario comprobarAutentificacion(String user, String key) {
		return cu.comprobarAutentificacion(user, key);
	}

	public java.util.List<Usuario> consultarUsuarios(Integer id_usuario, String nombre_usuario, String nombre) {
		return cu.consultarUsuarios(id_usuario, nombre_usuario, nombre);
	}

	public java.util.List<Usuario> consultarUsuariosMenos(Integer id, String nombre) {
		return cu.consultarUsuariosMenos(id, nombre);
	}

	public String RegistrarUsuarioVivo(String nombre, String nombre_usuario, String localidad, String fecha_muerte) {
		return cu.RegistrarUsuarioVivo(nombre, nombre_usuario, localidad, fecha_muerte);
	}

	public void muestraVPrincipal(Usuario user) {
		fgui.muestraVPrincipal(user);
	}

	public java.util.List<Vivo> juiciosPendientes() {
		return cu.juiciosPendientes();
	}

	public void muestraVJuzgar(java.awt.Frame parent, boolean modal, Vivo v) {
		fgui.muestraVJuzgar(parent, modal, v, this);
	}

	public void muestraVRegistrar(java.awt.Frame parent, boolean modal) {
		fgui.muestraVRegistrar(parent, modal, this);
	}

	public void muestraVEstadisticas(java.awt.Frame parent, boolean modal) {
		fgui.muestraVEstadisticas(parent, modal, this);
	}

	public Vivo obtenerUsuarioVivo(int id_usuario) {
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

	public int juzgarUsuario(Vivo v) {
		return cu.juzgarUsuario(v);
	}

	public java.util.List<Pecado> listaPecados(int id_usuario) {
		return cu.listaPecados(id_usuario);
	}

	public java.util.List<BuenaAccion> listaBuenasAcciones(int id_usuario) {
		return cu.listaBuenasAcciones(id_usuario);
	}

	public void mandarACielo(int id_usuario) {
		cu.mandarACielo(id_usuario);
	}

	public void mandarALimbo(int id_usuario) {
		cu.mandarALimbo(id_usuario);
	}

	public void mandarAInfierno(int id_usuario) {
		cu.mandarAInfierno(id_usuario);
	}

	public java.util.List<Venganza> listaVenganzas() {
		return cu.listaVenganzas();
	}

	public java.util.List<String> localidades() {
		return cu.localidades();
	}

	public Integer habitantesLocalidad(String localidad) {
		return cu.habitantesLocalidad(localidad);
	}

	public void solicitarConfesion(int id_usuario, java.sql.Date fecha_hora) {
		cu.solicitarConfesion(id_usuario, fecha_hora);
	}

	public Float puntuacionLocalidad(String localidad) {
		return cu.puntuacionLocalidad(localidad);
	}

	public void solicitarVenganza(Integer id_solicitante, Integer id_vengado, Integer id_venganza) {
		cu.solicitarVenganza(id_solicitante, id_vengado, id_venganza);
	}

	public void angelizar() {
		cu.angelizar();
	}

	public void demonizar() {
		cu.demonizar();
	}

	public Float puntuacionEdad(Integer edad) {
		return cu.puntuacionEdad(edad);
	}

	public Integer habitantesEdad(Integer edad) {
		return cu.habitantesEdad(edad);
	}
}
