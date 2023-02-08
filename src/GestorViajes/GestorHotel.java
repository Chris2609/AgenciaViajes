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
				
				
				break;
				
				
			
			case Menu.SALIR:
				
				Visor.mostrarMensaje("\nVolviendo...\n");
				
				break;
				
			}
			
		}while(opcion != 0);
		
	}
	
}
