package gui;

import javax.swing.table.*;

public class ModeloTablaEdades extends AbstractTableModel {
 private java.util.List<String> edades;
 private java.util.List<Integer> habitantes;
 private java.util.List<Float> puntuaciones;
 
    public ModeloTablaEdades(){
        this.edades=new java.util.ArrayList<>();
        this.habitantes=new java.util.ArrayList<>();
        this.puntuaciones=new java.util.ArrayList<>();
    }

    @Override
    public int getRowCount() {
        return edades.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int row, int col) {
           Object resultado=null;

        switch (col){
            case 0: resultado= edades.get(row); break;
            case 1: resultado= habitantes.get(row); break;
            case 2: resultado= puntuaciones.get(row); break;
        }
        return resultado;
    }
    @Override
    public String getColumnName(int col){
        String nombre="";

        switch (col){
            case 0: nombre= "Rangos de edad"; break;
            case 1: nombre= "Habitantes"; break;
            case 2: nombre= "Puntuación"; break;
        }
        return nombre;
    }

    @Override
    public Class getColumnClass(int col){
        Class clase=null;

        switch (col){
            case 0: clase= java.lang.String.class; break;
            case 1: clase= java.lang.Integer.class; break;
            case 2: clase= java.lang.Float.class; break;
        }
        return clase;
    }
    
    public void setFilas(java.util.List<String> edades,java.util.List<Integer> habitantes,java.util.List<Float> puntuaciones){
        this.edades=edades;
        this.habitantes=habitantes;
        this.puntuaciones=puntuaciones;
        fireTableDataChanged();
    }
    
    @Override
    public boolean isCellEditable(int row, int col){
        return false;
    }

    public void borrarElemento(int i){
        this.edades.remove(i);
        this.habitantes.remove(i);
        this.puntuaciones.remove(i);
        fireTableDataChanged();
    }
}
