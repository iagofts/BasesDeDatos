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
public class Mortal extends Usuario{
    private Date fecha_nacimiento;
    private Date fecha_muerte;
    private TipoLugar lugar;
    
    public Mortal(int id_usuario, String nombre_usuario, String nombre, String clave, TipoUsuario tipo, Date fecha_nacimiento, Date fecha_muerte, TipoLugar lugar){
    super(id_usuario, nombre_usuario, nombre, clave, tipo);
    this.fecha_nacimiento=fecha_nacimiento;
    this.fecha_muerte=fecha_muerte;
    this.lugar=lugar;
    }

    public Mortal(String nombre) {
        super(nombre);
    }
    
    public Mortal(int id_usuario){
        super(id_usuario);
    }
    
    public Date getFechaNacimiento(){
        return this.fecha_nacimiento;
    }
    
    public Date getFechaMuerte(){
        return this.fecha_muerte;
    }
    
    public TipoLugar getLugar(){
        return this.lugar;
    }

    public void setFechaNacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }
    
    public void setFechaMuerte(Date fecha_muerte){
        this.fecha_muerte=fecha_muerte;
    }
    
    public void setLugar(TipoLugar lugar){
        this.lugar=lugar;
    }
    
}
