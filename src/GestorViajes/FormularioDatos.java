package GestorViajes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class FormularioDatos {

	public static Cliente datosCliente(Scanner scan) {
		
		Cliente cliente = new Cliente();
		
		System.out.println("Inserta el DNI del cliente");
		cliente.setDni(scan.nextLine());
		System.out.println("Inserta el nombre dee cliente");
		cliente.setNombre(scan.nextLine());
		System.out.println("Inserta el apellido del cliente");
		cliente.setApellido(scan.nextLine());
		System.out.println("Introduce la dirección del cliente");
		cliente.setDireccion(scan.nextLine());
		System.out.println("Introduce la localidad del cliente");
		cliente.setLocalidad(scan.nextLine());
		
		return cliente;
	}
	
	public static String pedirDniCliente(Scanner scan) {
		
		String dni;
		Visor.mostrarMensaje("Introduce el DNI del cliente");
		dni = scan.nextLine();
		
		return dni;
	}
	
	public static Cliente modificarDatosCliente(Scanner scan) {
		
		Cliente modCliente = new Cliente();
		
		System.out.println("Inserta el nuevo DNI del cliente");
		modCliente.setDni(scan.nextLine());
		System.out.println("Inserta el nuevo nombre del cliente");
		modCliente.setNombre(scan.nextLine());
		System.out.println("Inserta el nuevo apellido del cliente");
		modCliente.setApellido(scan.nextLine());
		System.out.println("Introduce la nueva dirección del cliente");
		modCliente.setDireccion(scan.nextLine());
		System.out.println("Introduce la nueva localidad del cliente");
		modCliente.setLocalidad(scan.nextLine());
		
		return modCliente;
	}
	
	public static Hotel altaHotel(Scanner scan) {
		
		Hotel hotel = new Hotel();
		
		System.out.println("Introduce el CIF del hotel");
		hotel.setCif(scan.nextLine());
		System.out.println("Introduce el nombre del hotel");
		hotel.setNombre(scan.nextLine());
		System.out.println("Introduce el nombre del gerente del hotel");
		hotel.setGerente(scan.nextLine());
		System.out.println("Introduce la cantidad de estrellas del hotel");
		hotel.setEstrellas(Integer.parseInt(scan.nextLine()));
		System.out.println("Introduce el nombre de la compañía a la que pertenece");
		hotel.setCompañia(scan.nextLine());
		
		return hotel;
	}
	
	public static Habitacion pedirDatosH(Scanner scan) {
		
		Habitacion habitacion = new Habitacion();
		
		System.out.println("Introduce el ID de la habitacion");
		habitacion.setId(Integer.parseInt(scan.nextLine()));
		System.out.println("Introduce el ID del hotel al que pertenece la habitacion");
		habitacion.setId_hotel(Integer.parseInt(scan.nextLine()));
		System.out.println("Introduce el número de habitacion");
		habitacion.setNumero(scan.nextLine());
		System.out.println("Introduce una descripción de la habitación");
		habitacion.setDescripcion(scan.nextLine());
		System.out.println("Introduce el precio de la habitacion");
		habitacion.setPrecio(Double.parseDouble(scan.nextLine()));
		
		return habitacion;
	}
		
	public static Reserva pedirDatosR(Scanner scan, String dniC) {
		
		Reserva reserva = new Reserva();
		
		System.out.println("Introduce el ID de la habitacion a reservar");
		reserva.setId_habitacion(Integer.parseInt(scan.nextLine()));
		reserva.setDni(dniC);
		System.out.println("Introduce una fecha de inicio (YYYY-MM-dd)");
		reserva.setDesde(java.sql.Date.valueOf(scan.nextLine()));
		System.out.println("Introduce la fecha de finalización (YYYY-MM-dd)");
		reserva.setHasta(java.sql.Date.valueOf(scan.nextLine()));
		
		return reserva;
	}
	
	public static int pedirIdReserva(Scanner scan) {
		
		int idReserva;
		
		Visor.mostrarMensaje("Introduce el ID de la reserva a eliminar");
		idReserva = Integer.parseInt(scan.nextLine());
		
		return idReserva;
	}
	

}
