package GestorViajes;

import java.util.Scanner;

public class GestorClientes {

	public static void run(Scanner scan) {
		
		int opcion;

		do {
			
			Menu.menuGestionClientes();
			opcion = Integer.parseInt(scan.nextLine());
			
			switch(opcion) {
		
			case Menu.INSERTAR_CLIENTE:
				
				Cliente cliente = new Cliente();
				cliente = FormularioDatos.datosCliente(scan);
				GestorBBDD insertarCliente = new GestorBBDD();
				insertarCliente.insertarCliente(cliente);
				
				Visor.mostrarMensaje("\nCliente insertado\n");
				
				break;
				
			case Menu.BAJA_CLIENTE:
				
				
				
				break;
		
		}
		}while(opcion != 0);
		
	}
	
}
