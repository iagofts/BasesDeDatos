/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import aplicacion.Usuario;
import javax.swing.table.*;
/**
 *
 * @author alumnogreibd
 */
public class ModeloTablaUsuarios extends AbstractTableModel{
    private java.util.List<Usuario> usuarios;
    
    public ModeloTablaUsuarios(){
        this.usuarios=new java.util.ArrayList<>();
    }

    @Override
    public int getRowCount() {
        return usuarios.size();
    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public Object getValueAt(int row, int col) {
           Object resultado=null;

        switch (col){
            case 0: resultado= usuarios.get(row).getNombre(); break;
            case 1: resultado= usuarios.get(row).getIdUsuario(); break;
        }
        return resultado;
    }
    @Override
    public String getColumnName(int col){
        String nombre="";

        switch (col){
            case 0: nombre= "Nombre"; break;
            case 1: nombre= "ID"; break;
        }
        return nombre;
    }

    @Override
    public Class getColumnClass(int col){
        Class clase=null;

        switch (col){
            case 0: clase= java.lang.String.class; break;
            case 1: clase= java.lang.Integer.class; break;
        }
        return clase;
    }
    
    public void setFilas(java.util.List<Usuario> usuarios){
        this.usuarios=usuarios;
        fireTableDataChanged();
    }
    
    @Override
    public boolean isCellEditable(int row, int col){
        return false;
    }

    public void borrarElemento(int i){
        this.usuarios.remove(i);
        fireTableDataChanged();
    }
   
    public aplicacion.Usuario getRow(int row){
        return this.usuarios.get(row);
    }
    
}
