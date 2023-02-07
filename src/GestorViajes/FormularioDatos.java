package GestorViajes;

import java.util.Scanner;

public class FormularioDatos {

	public static Cliente datosCliente(Scanner scan) {
		
		Cliente cliente = new Cliente();
		
		System.out.println("Inserta el DNI del cliente");
		cliente.setDni(scan.nextLine());
		System.out.println("Inserta el nombre dle cliente");
		cliente.setNombre(scan.nextLine());
		System.out.println("Inserta el apellido del cliente");
		cliente.setApellido(scan.nextLine());
		System.out.println("Introduce la dirección del cliente");
		cliente.setDireccion(scan.nextLine());
		System.out.println("Introduce la localidad del cliente");
		cliente.setLocalidad(scan.nextLine());
		
		return cliente;
	}
	
}
