package GestorViajes;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class GestorBBDD {

	Conector con = new Conector();
	
	public void insertarCliente(Cliente cliente) {
		con.conectar();
		
        try {
			PreparedStatement insertarC = con.getConexion().prepareStatement("INSERT INTO clientes (dni, nombre, apellidos, direccion, localidad) VALUES (?,?,?,?,?)");
			insertarC.setString(1, cliente.getDni());
			insertarC.setString(2, cliente.getNombre());
			insertarC.setString(3, cliente.getApellido());
			insertarC.setString(4, cliente.getDireccion());
			insertarC.setString(5, cliente.getLocalidad());
			
			insertarC.execute();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

        try {
			con.cerrarConexion();
		} catch (SQLException e) {
			e.printStackTrace();
		}
        
	}
	
	public void eliminarCliente(String dni) {
		con.conectar();
		
		PreparedStatement eliminarC;
		try {
			eliminarC = con.getConexion().prepareStatement("DELETE FROM clientes WHERE dni = ?");
			eliminarC.setString(1, dni);
			
			eliminarC.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		try {
			con.cerrarConexion();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void modificarCliente(String dni, Cliente cliente) {
		con.conectar();
		
		try {
			PreparedStatement modificarC = con.getConexion().prepareStatement("UPDATE clientes SET dni= ?, nombre= ?, apellidos= ?, direccion= ?, localidad= ? WHERE dni = ?");
			modificarC.setString(1, cliente.getDni());
			modificarC.setString(2, cliente.getNombre());
			modificarC.setString(3, cliente.getApellido());
			modificarC.setString(4, cliente.getDireccion());
			modificarC.setString(5, cliente.getLocalidad());
			modificarC.setString(6, dni);
			
			modificarC.execute();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		try {
			con.cerrarConexion();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}
