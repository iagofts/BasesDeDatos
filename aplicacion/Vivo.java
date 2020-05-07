/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion;

import java.util.Date;

/**
 *
 * @author alumnogreibd
 */
public class Vivo extends Mortal{
    private float puntuacion;
    private boolean pendienteDeJuicio;
    
    public Vivo(int id_usuario, String nombre_usuario, String nombre, String clave, TipoUsuario tipo, Date fecha_nacimiento, Date fecha_muerte, TipoLugar lugar, float puntuacion, boolean pendienteDeJuicio){
        super(id_usuario, nombre_usuario, nombre, clave, tipo, fecha_nacimiento, fecha_muerte, lugar);
        this.puntuacion=puntuacion;
        this.pendienteDeJuicio=pendienteDeJuicio;
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

    
    
}
