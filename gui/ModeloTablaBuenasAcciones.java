package gui;

import aplicacion.BuenaAccion;
import javax.swing.table.*;

public class ModeloTablaBuenasAcciones extends AbstractTableModel {
 private java.util.List<BuenaAccion> buenasAcciones;
 
    public ModeloTablaBuenasAcciones(){
        this.buenasAcciones=new java.util.ArrayList<>();
    }

    @Override
    public int getRowCount() {
        return this.buenasAcciones.size();
    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public Object getValueAt(int row, int col) {
           Object resultado=null;

        switch (col){
            case 0: resultado= this.buenasAcciones.get(row).getPuntuacion(); break;
            case 1: resultado= this.buenasAcciones.get(row).getDescripcion(); break;
        }
        return resultado;
    }
    @Override
    public String getColumnName(int col){
        String nombre="";

        switch (col){
            case 0: nombre= "Puntuación"; break;
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
    
    public void setFilas(java.util.List<BuenaAccion> buenasAcciones){
        this.buenasAcciones=buenasAcciones;
        fireTableDataChanged();
    }
    
    @Override
    public boolean isCellEditable(int row, int col){
        return false;
    }

    public void borrarElemento(int i){
        this.buenasAcciones.remove(i);
        fireTableDataChanged();
    }
   
    public aplicacion.BuenaAccion getRow(int row){
        return this.buenasAcciones.get(row);
    }
}
