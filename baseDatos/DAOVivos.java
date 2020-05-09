package baseDatos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import aplicacion.TipoLugar;
import aplicacion.TipoUsuario;
import aplicacion.Usuario;
import aplicacion.Vivo;

class DAOVivos extends AbstractDAO {

	public DAOVivos(Connection conexion, aplicacion.FachadaAplicacion fa) {
		super.setConexion(conexion);
		super.setFachadaAplicacion(fa);
	}

	public java.util.List<Vivo> VivosConJuicioPendiente() {
		java.util.List<Vivo> resultado = new java.util.ArrayList<Vivo>();
		Vivo UsuarioActual = null;
		Connection con;
		PreparedStatement stmUsuario = null;
		ResultSet rsUsuario;

		con = this.getConexion();

		String consulta = "select * from usuario as u " + "full join vivo as v " + "on u.id_usuario=v.id_vivo "
				+ "full join mortal as m " + "on u.id_usuario=m.id_mortal " + "where pendiente_juicio=FALSE";

		try {
			stmUsuario = con.prepareStatement(consulta);
			rsUsuario = stmUsuario.executeQuery();
			while (rsUsuario.next()) {
				UsuarioActual = new Vivo(rsUsuario.getInt("id_usuario"), rsUsuario.getString("nombre_usuario"),
						rsUsuario.getString("nombre"), rsUsuario.getString("clave"),
						TipoUsuario.valueOf(rsUsuario.getString("tipo")), rsUsuario.getDate("fecha_nacimiento"),
						rsUsuario.getDate("fecha_muerte"), TipoLugar.valueOf(rsUsuario.getString("lugar")),
						rsUsuario.getFloat("puntuacion"), rsUsuario.getBoolean("pendiente_juicio"),rsUsuario.getString("localidad"));
				resultado.add(UsuarioActual);
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
		} finally {
			try {
				stmUsuario.close();
			} catch (SQLException e) {
				System.out.println("Imposible cerrar cursores");
			}
		}
		return resultado;
	}

	public void RegistrarUsuarioVivo(Integer id_demonio, Integer id_angel, String nombre,String nombre_usuario,String localidad, String clave, Date fecha_nacimiento, Date fecha_muerte) {
		Connection con;
		PreparedStatement stmUsuario = null;

		con = super.getConexion();

		try {
			stmUsuario = con.prepareStatement("insert into usuario(nombre_usuario, nombre, clave, tipo) "
							+ "values (?,?,?,?) "
							+ "insert into mortal(fecha_nacimiento,fecha_muerte,lugar) "
							+ "values (?,?,?) "
							+ "insert into vivo(ang_asignado,dem_asignado) "
							+ "values(?,?) ");
			stmUsuario.setString(1, nombre_usuario);
			stmUsuario.setString(2, nombre);
			stmUsuario.setString(3, clave);
			stmUsuario.setString(4, "Mortal");
			stmUsuario.setDate(5, fecha_nacimiento);
			stmUsuario.setDate(6, fecha_muerte);
			stmUsuario.setString(7, "Tierra");
			stmUsuario.setInt(8, id_angel);
			stmUsuario.setInt(9, id_demonio);
			stmUsuario.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
		} finally {
			try {
				stmUsuario.close();
			} catch (SQLException e) {
				System.out.println("Imposible cerrar cursores");
			}
		}

	}
	 public void modificarUsuarioVivo(Integer id, String nombre_usuario, String clave, String localidad) {
	        Connection con;
	        PreparedStatement stmUsuario = null;

	        con = super.getConexion();

	        try {
	            stmUsuario = con.prepareStatement("update vivo "
	                    + "set localidad=? "
	                    + "where id_vivo=? "
	                    + "update usuario "
	                    + "set nombre_usuario=?,"
	                    + "set clave=? "
	                    + "where id_usuario=?");
	            stmUsuario.setString(1, localidad);
	            stmUsuario.setInt(2, id);
	            stmUsuario.setString(3, nombre_usuario);
	            stmUsuario.setString(4, clave);
	            stmUsuario.setInt(5, id);
	            stmUsuario.executeUpdate();
	        } catch (SQLException e) {
	            System.out.println(e.getMessage());
	            this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
	        } finally {
	            try {
	                stmUsuario.close();
	            } catch (SQLException e) {
	                System.out.println("Imposible cerrar cursores");
	            }
	        }
	    }
	 
	 public java.util.List<Vivo> listaVivosCielo() {
	        java.util.List<Vivo> resultado = new java.util.ArrayList<Vivo>();
	        Vivo UsuarioActual;
	        Connection con;
	        PreparedStatement stmUsuario = null;
	        ResultSet rsUsuario;

	        con = this.getConexion();
	        String consulta = "select * "
	                + "from mortal as m full join usuario as u on "
	                + "u.id_usuario = m.id_mortal "
	                + "full join vivo as v on "
	                + "m.id_mortal = v.id_vivo "
	                + "where lugar = 'Cielo' and id_vivo NOTNULL";

	        try {
	            stmUsuario = con.prepareStatement(consulta);
	            rsUsuario = stmUsuario.executeQuery();
	            while (rsUsuario.next()) {
	                UsuarioActual = new Vivo(rsUsuario.getInt("id_usuario"),rsUsuario.getString("nombre"));
	                resultado.add(UsuarioActual);
	            }
	        } catch (SQLException e) {
	            System.out.println(e.getMessage());
	            this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
	        } finally {
	            try {
	                stmUsuario.close();
	            } catch (SQLException e) {
	                System.out.println("Imposible cerrar cursores");
	            }
	        }
	        return resultado;
	    }
		
		public java.util.List<Vivo> listaVivosInfierno() {
	        java.util.List<Vivo> resultado = new java.util.ArrayList<Vivo>();
	        Vivo UsuarioActual;
	        Connection con;
	        PreparedStatement stmUsuario = null;
	        ResultSet rsUsuario;

	        con = this.getConexion();
	        String consulta = "select * "
	                + "from mortal as m full join usuario as u on "
	                + "u.id_usuario = m.id_mortal "
	                + "full join vivo as v on "
	                + "m.id_mortal = v.id_vivo "
	                + "where lugar = 'Infierno' and id_vivo NOTNULL";

	        try {
	            stmUsuario = con.prepareStatement(consulta);
	            rsUsuario = stmUsuario.executeQuery();
	            while (rsUsuario.next()) {
	                UsuarioActual = new Vivo(rsUsuario.getInt("id_usuario"),rsUsuario.getString("nombre"));
	                resultado.add(UsuarioActual);
	            }
	        } catch (SQLException e) {
	            System.out.println(e.getMessage());
	            this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
	        } finally {
	            try {
	                stmUsuario.close();
	            } catch (SQLException e) {
	                System.out.println("Imposible cerrar cursores");
	            }
	        }
	        return resultado;
	    }
		
		public java.util.List<Vivo> listaVivosLimbo() {
	        java.util.List<Vivo> resultado = new java.util.ArrayList<Vivo>();
	        Vivo UsuarioActual;
	        Connection con;
	        PreparedStatement stmUsuario = null;
	        ResultSet rsUsuario;

	        con = this.getConexion();
	        String consulta = "select * "
	                + "from mortal as m full join usuario as u on "
	                + "u.id_usuario = m.id_mortal "
	                + "full join vivo as v on "
	                + "m.id_mortal = v.id_vivo "
	                + "where lugar = 'Limbo' and id_vivo NOTNULL";

	        try {
	            stmUsuario = con.prepareStatement(consulta);
	            rsUsuario = stmUsuario.executeQuery();
	            while (rsUsuario.next()) {
	                UsuarioActual = new Vivo(rsUsuario.getInt("id_usuario"),rsUsuario.getString("nombre"));
	                resultado.add(UsuarioActual);
	            }
	        } catch (SQLException e) {
	            System.out.println(e.getMessage());
	            this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
	        } finally {
	            try {
	                stmUsuario.close();
	            } catch (SQLException e) {
	                System.out.println("Imposible cerrar cursores");
	            }
	        }
	        return resultado;
	    }

		public java.util.List<Vivo> listaVivosTierra(String nombre){

	        java.util.List<Vivo> resultado = new java.util.ArrayList<Vivo>();
	        Vivo UsuarioActual;
	        Connection con;
	        PreparedStatement stmUsuario = null;
	        ResultSet rsUsuario;

	        con = this.getConexion();
	        String consulta = "select * from vivo as v full join usuario as u on "
	        		+ "v.id_vivo = u.id_usuario "
	        		+ "where lugar = 'Tierra' and nombre like ? ";

	        try {
	            stmUsuario = con.prepareStatement(consulta);
	            stmUsuario.setString(1, "%" + nombre + "%");
	            rsUsuario = stmUsuario.executeQuery();
	            while (rsUsuario.next()) {
	                UsuarioActual = new Vivo(rsUsuario.getInt("id_usuario"),rsUsuario.getString("nombre"));
	                resultado.add(UsuarioActual);
	            }
	        } catch (SQLException e) {
	            System.out.println(e.getMessage());
	            this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
	        } finally {
	            try {
	                stmUsuario.close();
	            } catch (SQLException e) {
	                System.out.println("Imposible cerrar cursores");
	            }
	        }
	        return resultado;
	    }
		public void mandarALugar(int id_usuario,String lugar) {
	 		Connection con;
	        PreparedStatement stmUsuario = null;

	        con = super.getConexion();

	        try {
	            stmUsuario = con.prepareStatement("update mortal "
	                    + "set lugar = ? "
	                    + "where id_mortal= ?");
	            stmUsuario.setString(1, lugar);
	            stmUsuario.setInt(2, id_usuario);
	            stmUsuario.executeUpdate();
	        } catch (SQLException e) {
	            System.out.println(e.getMessage());
	            this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
	        } finally {
	            try {
	                stmUsuario.close();
	            } catch (SQLException e) {
	                System.out.println("Imposible cerrar cursores");
	            }
	        }
	 	}
		public void angelizar(int id_usuario) {
	 		Connection con;
	        PreparedStatement stmUsuario = null;

	        con = super.getConexion();

	        try {
	            stmUsuario = con.prepareStatement("delete from buenaAccion "
	            		+ "where usuario = ? "
	            		+ "delete from pecado "
	            		+" where usuario = ?"
	                    + "delete from vivo "
	                    + "where id_vivo = ? "
	                    + "update mortal "
	                    + "set lugar = 'Cielo' "
	                    + "where id_mortal = ? "
	                    + "insert into angel "
	                    + "(id) values (?) ");
	            stmUsuario.setInt(1, id_usuario);
	            stmUsuario.setInt(2, id_usuario);
	            stmUsuario.setInt(3, id_usuario);
	            stmUsuario.setInt(4, id_usuario);
	            stmUsuario.setInt(5, id_usuario);
	            stmUsuario.executeUpdate();
	        } catch (SQLException e) {
	            System.out.println(e.getMessage());
	            this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
	        } finally {
	            try {
	                stmUsuario.close();
	            } catch (SQLException e) {
	                System.out.println("Imposible cerrar cursores");
	            }
	        }
	 	}
		public void demonizar(int id_usuario) {
	 		Connection con;
	        PreparedStatement stmUsuario = null;

	        con = super.getConexion();

	        try {
	            stmUsuario = con.prepareStatement("delete from buenaAccion "
	            		+ "where usuario = ? "
	            		+ "delete from pecado "
	            		+" where usuario = ?"
	                    + "delete from vivo "
	                    + "where id_vivo = ? "
	                    + "update mortal "
	                    + "set lugar = 'Infierno' "
	                    + "where id_mortal = ? "
	                    + "insert into demonio "
	                    + "(id) values (?) ");
	            stmUsuario.setInt(1, id_usuario);
	            stmUsuario.setInt(2, id_usuario);
	            stmUsuario.setInt(3, id_usuario);
	            stmUsuario.setInt(4, id_usuario);
	            stmUsuario.setInt(5, id_usuario);
	            stmUsuario.executeUpdate();
	        } catch (SQLException e) {
	            System.out.println(e.getMessage());
	            this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
	        } finally {
	            try {
	                stmUsuario.close();
	            } catch (SQLException e) {
	                System.out.println("Imposible cerrar cursores");
	            }
	        }
	 	}
		public Vivo consultarUsuarioVivo(int id_usuario) {
			Vivo resultado = null;
	        Connection con;
	        PreparedStatement stmUsuario = null;
	        ResultSet rsUsuario;

	        con = this.getConexion();

	        try {
	            stmUsuario = con.prepareStatement("select * "
	                    + "from usuario full join mortal "
	                    + "on id_usuario = id_mortal "
	                    + "full join vivo "
	                    + "on id_mortal = id_vivo "
	                    + "where id_usuario = ? ");
	            stmUsuario.setInt(1, id_usuario);
	            rsUsuario = stmUsuario.executeQuery();
	            if (rsUsuario.next()) {
	                resultado = new Vivo(rsUsuario.getInt("id_usuario"),
	                        rsUsuario.getString("nombre_usuario"), rsUsuario.getString("nombre"),
	                        rsUsuario.getString("clave"), TipoUsuario.valueOf(rsUsuario.getString("tipo")),
	                        rsUsuario.getDate("fecha_nacimiento"),rsUsuario.getDate("fecha_muerte"),TipoLugar.valueOf(rsUsuario.getString("lugar")),
	                        rsUsuario.getFloat("puntuacion"),rsUsuario.getBoolean("pendiente_juicio"),rsUsuario.getString("localidad"));

	            }
	        } catch (SQLException e) {
	            System.out.println(e.getMessage());
	            this.getFachadaAplicacion().muestraExcepcion(e.getMessage());
	        } finally {
	            try {
	                stmUsuario.close();
	            } catch (SQLException e) {
	                System.out.println("Imposible cerrar cursores");
	            }
	        }
	        return resultado;
	    }
}
