package GestorViajes;

import java.util.ArrayList;

public class Visor {

	public static void mostrarMensaje(String mensaje) {
		System.out.println(mensaje);
	}
	
	public static void mostrarHabitaciones(ArrayList<Habitacion> habitaciones) {
		
	for (Habitacion habitacion : habitaciones) {
		mostrarMensaje("ID: " + habitacion.getId() + "\nID_Hotel: " + habitacion.getId_hotel() + "\nNúmero: " + habitacion.getNumero() + "\nDescripción: " + habitacion.getDescripcion() + "\nPrecio: " + habitacion.getPrecio() + "\n");
	}	
	}
	
}
