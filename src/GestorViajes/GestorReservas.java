package GestorViajes;

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
					
				} else {
					System.out.println("\nERROR, el cliente no existe, volviendo...\n");
					break;
				}
				
			break;
			
			
			case Menu.SALIR:
				
				Visor.mostrarMensaje("\nVolviendo...\n");
				
			break;
			
			}
			
		}while(opcion != 0);
	}
	
}
