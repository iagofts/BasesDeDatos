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
public class Venganza {
    private Integer nivel;
    private String consecuencia;

    public Venganza(Integer nivel, String consecuencia) {
        this.nivel = nivel;
        this.consecuencia = consecuencia;
    }

    public Integer getNivel() {
        return nivel;
    }

    public String getConsecuencia() {
        return consecuencia;
    }
    
}
