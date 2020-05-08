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
public class Pecado {
    private float gravedad;
    private String descripcion;

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
    
}
