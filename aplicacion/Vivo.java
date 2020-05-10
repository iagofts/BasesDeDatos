/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion;

import java.util.Date;
import java.util.ArrayList;

/**
 *
 * @author alumnogreibd
 */
public class Vivo extends Mortal{
    private float puntuacion;
    private boolean pendienteDeJuicio;
    private String localidad;
    private java.util.List<Pecado> pecados;
    private java.util.List<BuenaAccion> buenasAcciones;
    
    public Vivo(int id_usuario, String nombre_usuario, String nombre, String clave, TipoUsuario tipo, Date fecha_nacimiento, Date fecha_muerte, TipoLugar lugar, float puntuacion, boolean pendienteDeJuicio, String localidad){
        super(id_usuario, nombre_usuario, nombre, clave, tipo, fecha_nacimiento, fecha_muerte, lugar);
        this.puntuacion=puntuacion;
        this.pendienteDeJuicio=pendienteDeJuicio;
        this.localidad=localidad;
        this.pecados=null;
        this.buenasAcciones=null;
    }

    public Vivo(int id_usuario, String nombre, float puntuacion){
        super(id_usuario, nombre);
        this.puntuacion = puntuacion;
    }
    
    public Vivo(int id_usuario,String nombre){
        super(id_usuario,nombre);
    }
    
    public Vivo(float puntuacion, String nombre) {
        super(nombre);
        this.puntuacion = puntuacion;
    }

    public float getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(float puntuacion) {
        this.puntuacion = puntuacion;
    }

    public boolean isPendienteDeJuicio() {
        return pendienteDeJuicio;
    }

    public void setPendienteDeJuicio(boolean pendienteDeJuicio) {
        this.pendienteDeJuicio = pendienteDeJuicio;
    }

    public java.util.List<Pecado> getPecados() {
        return pecados;
    }

    public void setPecados(java.util.List<Pecado> pecados) {
        this.pecados = pecados;
    }

    public java.util.List<BuenaAccion> getBuenasAcciones() {
        return buenasAcciones;
    }

    public void setBuenasAcciones(java.util.List<BuenaAccion> buenasAcciones) {
        this.buenasAcciones = buenasAcciones;
    }
    
    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getLocalidad() {
        return localidad;
    }
    
}
