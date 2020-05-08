package gui;

import aplicacion.Pecado;
import javax.swing.table.*;

public class ModeloTablaPecados extends AbstractTableModel {
 private java.util.List<Pecado> pecados;
 
    public ModeloTablaPecados(){
        this.pecados=new java.util.ArrayList<>();
    }

    @Override
    public int getRowCount() {
        return pecados.size();
    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public Object getValueAt(int row, int col) {
           Object resultado=null;

        switch (col){
            case 0: resultado= pecados.get(row).getGravedad(); break;
            case 1: resultado= pecados.get(row).getDescripcion(); break;
        }
        return resultado;
    }
    @Override
    public String getColumnName(int col){
        String nombre="";

        switch (col){
            case 0: nombre= "Gravedad"; break;
            case 1: nombre= "Descripción"; break;
        }
        return nombre;
    }

    @Override
    public Class getColumnClass(int col){
        Class clase=null;

        switch (col){
            case 0: clase= java.lang.Float.class; break;
            case 1: clase= java.lang.String.class; break;
        }
        return clase;
    }
    
    public void setFilas(java.util.List<Pecado> pecados){
        this.pecados=pecados;
        fireTableDataChanged();
    }
    
    @Override
    public boolean isCellEditable(int row, int col){
        return false;
    }

    public void borrarElemento(int i){
        this.pecados.remove(i);
        fireTableDataChanged();
    }
   
    public aplicacion.Pecado getRow(int row){
        return this.pecados.get(row);
    }
}
