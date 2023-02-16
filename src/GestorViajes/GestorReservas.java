package GestorViajes;

import java.text.Normalizer.Form;
import java.util.ArrayList;
import java.util.Scanner;

public class GestorReservas {

	public static void run(Scanner scan) {
		
		int opcion;
		
		do {
			
			Menu.menuGestorResevas();
			opcion = Integer.parseInt(scan.nextLine());
			
			switch(opcion) {
			
			case Menu.REALIZAR_RESERVA:

				String dniC = FormularioDatos.pedirDniCliente(scan);
				GestorBBDD comprobar = new GestorBBDD();
				ArrayList dnisbbdd = comprobar.comprobarDNI();
				
				boolean existe = dnisbbdd.contains(dniC);
				if (existe == true) {
					System.out.println("\nEl cliente existe, continuando...\n");
					Visor.mostrarMensaje("Introduce el ID del hotel");
					int idHotel = Integer.parseInt(scan.nextLine());
					ArrayList<Habitacion> habitaciones = comprobar.habitacionesHotel(idHotel);
					Visor.mostrarHabitaciones(habitaciones);
					
					Reserva reserva = FormularioDatos.pedirDatosR(scan, dniC);
					comprobar.insertarReserva(reserva);
					
					Visor.mostrarMensaje("\nReserva realizada\n");
				} else {
					System.out.println("\nERROR, el cliente no existe, volviendo...\n");
					break;
				}
				
			break;
			
			case Menu.ANULAR_RESERVA:
				
				int idR = FormularioDatos.pedirIdReserva(scan);
				GestorBBDD elimRese = new GestorBBDD();
				elimRese.eliminarReserva(idR);
				
				Visor.mostrarMensaje("\nReserva eliminada\n");
				
			break;
				
			case Menu.SALIR:
				
				Visor.mostrarMensaje("\nVolviendo...\n");
				
			break;
			
			}
			
		}while(opcion != 0);
	}
	
}
