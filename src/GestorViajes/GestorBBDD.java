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
	
}
