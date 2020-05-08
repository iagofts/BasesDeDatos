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
public class BuenaAccion {
    private float puntuacion;
    private String descripcion;

    public BuenaAccion(float puntuacion, String descripcion) {
        this.puntuacion = puntuacion;
        this.descripcion = descripcion;
    }
    
    public float getPuntuacion(){
        return this.puntuacion;
    }
    
    public String getDescripcion(){
        return this.descripcion;
    }
}
