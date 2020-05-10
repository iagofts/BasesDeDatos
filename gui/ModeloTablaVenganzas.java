/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import javax.swing.table.*;
import aplicacion.Venganza;
/**
 *
 * @author alumnogreibd
 */
public class ModeloTablaVenganzas extends AbstractTableModel{
    private java.util.List<Venganza> venganzas;
    
    public ModeloTablaVenganzas(){
        this.venganzas=new java.util.ArrayList<>();
    }

    @Override
    public int getRowCount() {
        return venganzas.size();
    }

    @Override
    public int getColumnCount() {
        return 1;
    }

    @Override
    public Object getValueAt(int row, int col) {
           Object resultado=null;

        switch (col){
            case 0: resultado= venganzas.get(row).getConsecuencia(); break;
        }
        return resultado;
    }
    @Override
    public String getColumnName(int col){
        String nombre="";

        switch (col){
            case 0: nombre= "Venganza"; break;
        }
        return nombre;
    }

    @Override
    public Class getColumnClass(int col){
        Class clase=null;

        switch (col){
            case 0: clase= java.lang.String.class; break;
        }
        return clase;
    }
    
    public void setFilas(java.util.List<Venganza> venganzas){
        this.venganzas=venganzas;
        fireTableDataChanged();
    }
    
    @Override
    public boolean isCellEditable(int row, int col){
        return false;
    }

    public void borrarElemento(int i){
        this.venganzas.remove(i);
        fireTableDataChanged();
    }
   
    public aplicacion.Venganza getRow(int row){
        return this.venganzas.get(row);
    }
    
}
