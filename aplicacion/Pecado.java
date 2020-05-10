/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion;

import java.sql.Date;

/**
 *
 * @author alumnogreibd
 */
public class Pecado {
    private float gravedad;
    private String descripcion;
    private boolean confesado;
    private boolean confesionSolicitada;
    private Date fecha;
    private Integer tipoPecado;

    public Pecado(float gravedad, String descripcion, boolean confesado, boolean confesionSolicitada, Date fecha, Integer tipoPecado) {
        this.gravedad = gravedad;
        this.descripcion = descripcion;
        this.confesado = confesado;
        this.confesionSolicitada = confesionSolicitada;
        this.fecha = fecha;
        this.tipoPecado=tipoPecado;
    }

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
    
    public boolean isConfesionSolicitada(){
        return confesionSolicitada;
    }
    
    public Date getFecha() {
        return fecha;
    }
    
    public int getTipoPecado(){
        return tipoPecado;
    }
    
}
