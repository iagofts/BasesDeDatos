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
public abstract class Usuario {
    private int id_usuario;
    private String nombre_usuario;
    private String nombre;
    private String clave;
    private TipoUsuario tipo;
    
    public Usuario(int id_usuario, String nombre_usuario, String nombre, String clave, TipoUsuario tipo){
        this.id_usuario=id_usuario;
        this.nombre_usuario=nombre_usuario;
        this.nombre=nombre;
        this.clave=clave;
        this.tipo=tipo;
    }
    
    public int getIdUsuario(){
        return this.id_usuario;
    }
    
    public String getNombreUsuario(){
        return this.nombre_usuario;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public String getClave(){
        return this.clave;
    }
    
    public TipoUsuario getTipoUsuario(){
        return this.tipo;
    }
    
    public void setIdUsuario(int id_usuario){
        this.id_usuario=id_usuario;
    }
    
    public void setNombreUsuario(String nombre_usuario){
        this.nombre_usuario=nombre_usuario;
    }
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public void setClave(String clave){
        this.clave=clave;
    }
    
    public void setTipoUsuario(TipoUsuario tipo){
        this.tipo=tipo;
    }
}
