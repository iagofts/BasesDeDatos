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
public class Angel extends Mortal{

    public Angel(int id_usuario, String nombre_usuario, String nombre, String clave, TipoUsuario tipo, Date fecha_nacimiento, Date fecha_muerte, TipoLugar lugar) {
        super(id_usuario, nombre_usuario, nombre, clave, tipo, fecha_nacimiento, fecha_muerte, lugar);
    }

    public Angel(String nombre) {
        super(nombre);
    }
    public Angel(int id_usuario,String nombre) {
		super(id_usuario,nombre);
	}
}
