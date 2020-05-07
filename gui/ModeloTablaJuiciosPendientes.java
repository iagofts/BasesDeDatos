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
        return 5;
    }

    @Override
    public Object getValueAt(int row, int col) {
           Object resultado=null;

        switch (col){
            case 0: resultado= usuarios.get(row).getDNI(); break;
            case 1: resultado= usuarios.get(row).getNombre(); break;
            case 2: resultado=usuarios.get(row).getDireccion();break;
            case 3: resultado=usuarios.get(row).getEmail(); break;
            case 4: resultado=usuarios.get(row).getTelefono(); break;
        }
        return resultado;
    }
    @Override
    public String getColumnName(int col){
        String nombre="";

        switch (col){
            case 0: nombre= "DNI"; break;
            case 1: nombre= "Nombre"; break;
            case 2: nombre="Dirección"; break;
            case 3: nombre="E-mail"; break;
            case 4: nombre="Telefono"; break;
        }
        return nombre;
    }

    @Override
    public Class getColumnClass(int col){
        Class clase=null;

        switch (col){
            case 0: clase= java.lang.String.class; break;
            case 1: clase= java.lang.String.class; break;
            case 2: clase=java.lang.String.class; break;
            case 3: clase=java.lang.String.class; break;
            case 4: clase=java.lang.Integer.class; break;
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
