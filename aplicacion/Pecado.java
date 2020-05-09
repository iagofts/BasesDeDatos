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
public class Pecado {
    private float gravedad;
    private String descripcion;
    private boolean confesado;
    private java.util.Date fecha;

    public Pecado(float gravedad, String descripcion) {
        this.gravedad = gravedad;
        this.descripcion = descripcion;
    }
    
    public float getGravedad(){
        return this.gravedad;
    }
    
    public String getDescripcion(){
        return this.descripcion;
    }

    public boolean isConfesado() {
        return confesado;
    }

    public Date getFecha() {
        return fecha;
    }
    
}
