package gui;

import aplicacion.Usuario;
import javax.swing.table.*;

public class ModeloTablaJuiciosPendientes extends AbstractTableModel {
 private java.util.List<Usuario> usuarios;
 
    public ModeloTablaJuiciosPendientes(){
        this.usuarios=new java.util.ArrayList<Usuario>();
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
            case 1: resultado= usuarios.get(row).getPuntuacion(); break;
        }
        return resultado;
    }
    @Override
    public String getColumnName(int col){
        String nombre="";

        switch (col){
            case 0: nombre= "Nombre"; break;
            case 1: nombre= "Puntuación"; break;
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
   
    public Usuario getRow(int row){
        return this.usuarios.get(row);
    }
}
