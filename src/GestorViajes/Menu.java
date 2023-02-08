package GestorViajes;

public class Menu {

	public static final int SALIR = 0;

	public static void menuPrincipal(){
		System.out.println("1. Gestión de Clientes\n2. Gestión de Reservas\n3. Gestión de Hotel\n0. Salir");
	}
	
	public static final int GESTIONAR_CLIENTES = 1;
	public static final int GESTIONAR_RESERVAS = 2;
	public static final int GESTIONAR_HOTEL = 3;

	public static void menuGestionClientes() {
		System.out.println("1. Insertar cliente\n2. Baja cliente\n3. Modificación cliente\n0. Salir");
	}
	
	public static final int INSERTAR_CLIENTE = 1;
	public static final int BAJA_CLIENTE = 2;
	public static final int MODIFICAR_CLIENTE = 3;
	
	public static void menuGestionHotel() {
		System.out.println("1. Álta de hotel\n0. Salir");
	}

	public static final int ALTA_HOTEL = 1;
	
	public static void menuHabitacion() {
		System.out.println("1. Añadir habitación\n0. Salir");
	}
	
	public static final int INSERTAR_HABITACION = 1;
	
}
