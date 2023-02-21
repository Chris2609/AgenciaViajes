package GestorViajes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;

public class Visor {

	public static void mostrarMensaje(String mensaje) {
		System.out.println(mensaje);
	}

	public static void mostrarHabitaciones(ArrayList<Habitacion> habitaciones) {

		for (Habitacion habitacion : habitaciones) {
			mostrarMensaje("ID: " + habitacion.getId() + "\nID_Hotel: " + habitacion.getId_hotel() + "\nNúmero: "
					+ habitacion.getNumero() + "\nDescripción: " + habitacion.getDescripcion() + "\nPrecio: "
					+ habitacion.getPrecio() + "\n");
		}
	}

	public static void clientesApellido(ArrayList<Cliente> clientes) {

		clientes.sort((o1, o2) -> o1.getApellido().toLowerCase().compareTo(o2.getApellido().toLowerCase()));
		System.out.println("\n");
		for (Cliente cliente : clientes) {
			System.out.println(cliente.getNombre() + "|" + cliente.getApellido() + "|" + cliente.getDireccion()
					+ "|" + cliente.getLocalidad());
		}
		System.out.println("\n");
	}

	public static void clientesNombre(ArrayList<Cliente> clientes) {

		clientes.sort((o1, o2) -> o1.getNombre().compareTo(o2.getNombre()));
		System.out.println("\n");
		for (Cliente cliente : clientes) {
			System.out.println(cliente.getNombre() + "|" + cliente.getApellido() + "|" + cliente.getDireccion() + "|"
					+ cliente.getLocalidad());
		}
		System.out.println("\n");
	}

	public static void clientesConti(ArrayList<Cliente> clientes, Scanner scan) {

		System.out.println("Introduce la cadena de caracteres");
		String cadena = scan.nextLine();
		boolean hayUsuarios = false;
		System.out.println("\n");
		for (Cliente cliente : clientes) {
			if (cliente.getNombre().contains(cadena) || cliente.getApellido().contains(cadena)) {
				System.out.println(cliente.getNombre() + "|" + cliente.getApellido() + "|" + cliente.getDireccion()
						+ "|" + cliente.getLocalidad());
				hayUsuarios = true;
			}
		}
		if (hayUsuarios == false) {
			mostrarMensaje("No se han encontrado usuarios que contengan '" + cadena + "' en su nombre o apellido");
		}
		System.out.println("\n");
	}

	public static void reservasEntreFechas(ArrayList<Reserva> reservas, Scanner scan) {

		System.out.println("Introduce la fecha de inicio (yyyy-MM-dd)");
		Date inicio = java.sql.Date.valueOf(scan.nextLine());
		System.out.println("Introduce una fecha de fin (yyyy-MM-dd)");
		Date hasta = (java.sql.Date.valueOf(scan.nextLine()));
        
		for (Reserva reserva : reservas) {
			if (reserva.getDesde().getTime() >= inicio.getTime() && reserva.getHasta().getTime() <= hasta.getTime()) {
				System.out.println("\nID habitacion: " + reserva.getId_habitacion() + "\nDNI: " + reserva.getDni() + "\nDesde:" + reserva.getDesde() + "\nHasta: " + reserva.getHasta() + "\n");
			}
		}
	}
	
	public static void reservasCliente(ArrayList<Reserva> reservas, Scanner scan) {
		
		System.out.println("Introduce el DNI del cliente");
		String dni = scan.nextLine();
		
		for (Reserva reserva : reservas) {
			if(reserva.getDni().contains(dni)) {
				System.out.println("\nID habitacion: " + reserva.getId_habitacion() + "\nDNI: " + reserva.getDni() + "\nDesde:" + reserva.getDesde() + "\nHasta: " + reserva.getHasta() + "\n");
			}
		}
	}

}
