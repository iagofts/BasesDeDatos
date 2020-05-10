package gui;

import javax.swing.table.*;

public class ModeloTablaLocalidades extends AbstractTableModel {
 private java.util.List<String> localidades;
 private java.util.List<Integer> habitantes;
 private java.util.List<Float> puntuaciones;
 
    public ModeloTablaLocalidades(){
        this.localidades=new java.util.ArrayList<>();
        this.habitantes=new java.util.ArrayList<>();
        this.puntuaciones=new java.util.ArrayList<>();
    }

    @Override
    public int getRowCount() {
        return localidades.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int row, int col) {
           Object resultado=null;

        switch (col){
            case 0: resultado= localidades.get(row); break;
            case 1: resultado= habitantes.get(row); break;
            case 3: resultado= puntuaciones.get(row); break;
        }
        return resultado;
    }
    @Override
    public String getColumnName(int col){
        String nombre="";

        switch (col){
            case 0: nombre= "Localidad"; break;
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
    
    public void setFilas(java.util.List<String> localidades,java.util.List<Integer> habitantes,java.util.List<Float> puntuaciones){
        this.localidades=localidades;
        this.habitantes=habitantes;
        this.puntuaciones=puntuaciones;
        fireTableDataChanged();
    }
    
    @Override
    public boolean isCellEditable(int row, int col){
        return false;
    }

    public void borrarElemento(int i){
        this.localidades.remove(i);
        this.habitantes.remove(i);
        this.puntuaciones.remove(i);
        fireTableDataChanged();
    }
}
