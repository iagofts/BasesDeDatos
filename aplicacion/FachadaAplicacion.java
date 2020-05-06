/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion;

/**
 *
 * @author alumnogreibd
 */
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
    
    private void iniciaInterfazUsuario(){
        fgui.iniciaVista();
    }
    
    private void muestraExcepcion(String e){
        fgui.muestraExcepcion(e);
    }
}
