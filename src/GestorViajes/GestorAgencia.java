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
    		
    		}
    		
    	}while(opcion != 0);
    }
	
}
