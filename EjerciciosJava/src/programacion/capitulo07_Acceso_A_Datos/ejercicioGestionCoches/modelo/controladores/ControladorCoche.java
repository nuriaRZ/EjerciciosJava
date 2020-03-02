package programacion.capitulo07_Acceso_A_Datos.ejercicioGestionCoches.modelo.controladores;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import programacion.capitulo07_Acceso_A_Datos.ejercicioGestionCoches.modelo.Coche;

public class ControladorCoche extends ControladorBBDD {

	public static List<Coche> getAll(){
		List<Coche> coches = new ArrayList<Coche>();
		
		Connection conn = null;
		
		try {
			conn = ConnectionManagerV2.getConexion();
			Statement s = conn.createStatement();
			ResultSet rs = s.executeQuery("Select * from coche");
			
			while(rs.next()) {
				Coche co = new Coche();
				co.setId(rs.getInt("id"));
				co.setIdFabricante(rs.getInt("idfabricante"));
				co.setBastidor(rs.getString("bastidor"));
				co.setModelo(rs.getString("modelo"));
				co.setColor(rs.getString("color"));
				
				coches.add(co);
			}
			rs.close();
			s.close();
			
		}catch (SQLException | ImposibleConectarException e) {
			e.printStackTrace();
		}
		return coches;
	}
	/**
	 * 
	 * @param id
	 * @return
	 * @throws ErrorBBDDException
	 */
	
	public static Coche get (int id) throws ErrorBBDDException {
		Connection conn = null;
		Coche co = null;
		
		try {
			conn =  ConnectionManagerV2.getConexion();
			Statement s = conn.createStatement();
			ResultSet rs = s.executeQuery("Select * from coche where id = " + id);
			
			if(rs.next()) {
				co = new Coche();
				co.setId(id);				
				co.setIdFabricante(rs.getInt("idfabricante"));
				co.setBastidor(rs.getString("bastidor"));
				co.setModelo(rs.getString("modelo"));
				co.setColor(rs.getString("color"));
				
			}
			rs.close();
			s.close();
			
		}catch (SQLException | ImposibleConectarException e) {
			throw new ErrorBBDDException();
		}
		
		return co;
	}
	/**
	 * 
	 * @param co
	 * @throws ErrorBBDDException
	 */
	private static void almacenarNuevo (Coche co) throws ErrorBBDDException {
		Connection conn = null;
		
		try {
			conn = ConnectionManagerV2.getConexion();
			PreparedStatement ps = (PreparedStatement) conn.
					prepareStatement("insert into coche (id, idfabricante, bastidor, modelo, color) values (?,?,?,?,?)");
			int registrosInsertados;
			ps.setInt(1, nextIdEnTabla(conn, "coche"));
			ps.setInt(2, co.getIdFabricante());
			ps.setString(3, co.getBastidor());
			ps.setString(4, co.getModelo());
			ps.setString(5, co.getColor());
			
			
			registrosInsertados = ps.executeUpdate();
			if(registrosInsertados != 1) {
				throw new ErrorBBDDException("No ha sido posible insertar el nuevo registro");
			}
			ps.close();
		}catch (SQLException | ImposibleConectarException e) {
			throw new ErrorBBDDException(e);
		}		
		
	}
	/**
	 * 
	 * @param co
	 * @throws ErrorBBDDException
	 */
	private static void almacenarModificado (Coche co) throws ErrorBBDDException {
		Connection conn = null;
		try {
			conn = ConnectionManagerV2.getConexion();
			PreparedStatement ps = (PreparedStatement) conn.
					prepareStatement("update coche set idfabricante = ?, bastidor = ?, modelo = ?, color = ?, where id = ?");
			
			int registrosInsertados;
			ps.setInt(1, co.getIdFabricante());
			ps.setString(2, co.getBastidor());
			ps.setString(3, co.getModelo());
			ps.setString(4, co.getColor());
			ps.setInt(5, co.getId());
			
			
			registrosInsertados = ps.executeUpdate();
			if(registrosInsertados != 1) {
				throw new ErrorBBDDException("No se ha podido modificar el registro");
			}
			ps.close();
			
		}catch (SQLException | ImposibleConectarException e) {
			throw new ErrorBBDDException(e);
		}
	}
	
	public static void almacenar (Coche co) throws ErrorBBDDException {
		if (get(co.getId()) != null) {
			almacenarModificado(co);
		}
		else almacenarNuevo(co);
	}
	/**
	 * 
	 * @param co
	 * @throws ErrorBBDDException
	 */
	public static void eliminar (Coche co) throws ErrorBBDDException {
		Connection conn = null;
		try {
			conn = ConnectionManagerV2.getConexion();
			PreparedStatement ps = (PreparedStatement) conn.prepareStatement("delete from coche where id = ?");
			
			int registrosInsertados;
			ps.setInt(1, co.getId());
			
			registrosInsertados = ps.executeUpdate();
			if(registrosInsertados != 1) {
				throw new ErrorBBDDException("No se ha podido eliminar el registro");
			}
			ps.close();
			
		}catch (SQLException | ImposibleConectarException e) {
			throw new ErrorBBDDException(e);
		}
	}

}
