package baseDatos;

import java.sql.Connection;

class DAOAcciones extends AbstractDAO{

	public DAOAcciones(Connection conexion, aplicacion.FachadaAplicacion fa) {
        super.setConexion(conexion);
        super.setFachadaAplicacion(fa);
    }

}
