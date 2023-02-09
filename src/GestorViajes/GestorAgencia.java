package GestorViajes;

import java.util.Scanner;

public class GestorAgencia {

    public void run() {
    	Scanner scan = new Scanner(System.in);
    	int opcion;
    	
    	do {
    		Menu.menuPrincipal();
    		opcion = Integer.parseInt(scan.nextLine());
    		
    		switch(opcion) {
    		
    		case Menu.GESTIONAR_CLIENTES:
    			
    			GestorClientes.run(scan);
    			
    			break;
    			
    		case Menu.GESTIONAR_RESERVAS:
    			
    			GestorReservas.run(scan);
    			
    			break;
    			
    		case Menu.GESTIONAR_HOTEL:
    			
    			GestorHotel.run(scan);
    		
    			break;
    		
    		case Menu.SALIR:
    			
    			Visor.mostrarMensaje("\n¡ADIOS!\n");
    			
    			break;
    			
    		}
    		   		
    	}while(opcion != 0);
    }
	
}
