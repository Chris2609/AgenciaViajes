package GestorViajes;

import java.util.Scanner;

public class GestorHotel {

	public static void run(Scanner scan) {
		
		int opcion;
		
		do {
			
			Menu.menuGestionHotel();
			opcion = Integer.parseInt(scan.nextLine());
			
			switch(opcion) {
			
			case Menu.ALTA_HOTEL:				
				
				Hotel hotel = new Hotel();
				hotel = FormularioDatos.altaHotel(scan);
				GestorBBDD altaH = new GestorBBDD();
				altaH.insertarHotel(hotel);
				
				Visor.mostrarMensaje("\nHotel insertado, ¿quieres añadir una habitación?\n");
				
				int opcion2;
				do {
				Menu.menuHabitacion();
				opcion2 = Integer.parseInt(scan.nextLine());
				
				if(opcion2 == Menu.INSERTAR_HABITACION) {
					Habitacion habitacion = new Habitacion();
					habitacion = FormularioDatos.pedirDatosH(scan);
					GestorBBDD insHabitacion = new GestorBBDD();
					insHabitacion.insertarHabitacion(habitacion);
				}
				}while(opcion2 != 0);

				break;
				
			case Menu.AÑA_HABITACION:
		
				Habitacion habitacion = new Habitacion();
				habitacion = FormularioDatos.pedirDatosH(scan);
				GestorBBDD insHabitacion = new GestorBBDD();
				insHabitacion.insertarHabitacion(habitacion);
				
				break;
				
			case Menu.SALIR:
				
				Visor.mostrarMensaje("\nVolviendo...\n");
				
				break;
				
			}
			
		}while(opcion != 0);
		
	}
	
}
