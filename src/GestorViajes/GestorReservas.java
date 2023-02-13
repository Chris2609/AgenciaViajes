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
				GestorBBDD comprobardni = new GestorBBDD();
				ArrayList dnisbbdd = comprobardni.comprobarDNI();
				boolean existe = dnisbbdd.contains(dniC);
				if (existe) {
					System.out.println("El cliente existe, continuando...");
				} else {
					System.out.println("ERROR, el cliente no existe");
				}
				
			break;
			
			
			case Menu.SALIR:
				
				Visor.mostrarMensaje("\nVolviendo...\n");
				
			break;
			
			}
			
		}while(opcion != 0);
	}
	
}
