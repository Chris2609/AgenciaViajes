package GestorViajes;

import java.text.Normalizer.Form;
import java.util.ArrayList;
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
		
				String dniC = FormularioDatos.pedirDniCliente(scan);
				GestorBBDD bajaCliente = new GestorBBDD();
				bajaCliente.eliminarCliente(dniC);
				
				Visor.mostrarMensaje("\nCliente dado de baja\n");
				
				break;
				
			case Menu.MODIFICAR_CLIENTE:
				
				GestorBBDD modificarCliente = new GestorBBDD();
				modificarCliente.modificarCliente(FormularioDatos.pedirDniCliente(scan), FormularioDatos.modificarDatosCliente(scan));
				
				Visor.mostrarMensaje("\nCliente modificado\n");
				
				break;
			
			case Menu.MOSTRAR_CLIENTESAPE:
				
				GestorBBDD clientesApe = new GestorBBDD();
				ArrayList<Cliente> clientesA = clientesApe.clientes();
				Visor.clientesApellido(clientesA);
								
				break;
				
			case Menu.MOSTRAR_CLIENTESNOM:
				
				GestorBBDD clientesNom = new GestorBBDD();
				ArrayList<Cliente> clientesN = clientesNom.clientes();
				Visor.clientesNombre(clientesN);
				
				break;
				
			case Menu.MOSTRAR_CLIENTECON:
				
				GestorBBDD clientesCon = new GestorBBDD();
				ArrayList<Cliente> clientesCont = clientesCon.clientes();
				Visor.clientesConti(clientesCont, scan);
				break;
				
			case Menu.SALIR:
				
				Visor.mostrarMensaje("\nVolviendo...\n");
				
				break;
		
		}
		}while(opcion != 0);
		
	}
	
}
