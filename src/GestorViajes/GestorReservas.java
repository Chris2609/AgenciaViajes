package GestorViajes;

import java.util.Scanner;

public class GestorReservas {

	public static void run(Scanner scan) {
		
		int opcion;
		
		do {
			
			Menu.menuGestorResevas();
			opcion = Integer.parseInt(scan.nextLine());
			
			switch(opcion) {
			
			case Menu.REALIZAR_RESERVA:

				
				
			break;
			
			
			case Menu.SALIR:
				
				Visor.mostrarMensaje("\nVolviendo...\n");
				
			break;
			
			}
			
		}while(opcion != 0);
	}
	
}
