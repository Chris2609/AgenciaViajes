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
		System.out.println("1. Insertar cliente\n2. Baja cliente\n3. Modificación cliente\n4. Mostrar Clientes (Alf. apellido)\n5. Mostrar Clientes (Alf. nombre)\n6. Mostrar Clientes (Contienen)\n0. Salir");
	}
	
	public static final int INSERTAR_CLIENTE = 1;
	public static final int BAJA_CLIENTE = 2;
	public static final int MODIFICAR_CLIENTE = 3;
	public static final int MOSTRAR_CLIENTESAPE = 4;
	public static final int MOSTRAR_CLIENTESNOM = 5;
	public static final int MOSTRAR_CLIENTECON = 6;

	public static void menuGestorResevas() {
		System.out.println("1. Realizar reserva\n2. Anular reserva\n3. Consultar reservas entre fechas\n0. Salir");
	}
	
	public static final int REALIZAR_RESERVA = 1;
	public static final int ANULAR_RESERVA = 2;
	public static final int CONSULTAR_RESERVAS_FECHAS = 3;
	
	public static void menuGestionHotel() {
		System.out.println("1. Álta de hotel\n2. Añadir habitación\n0. Salir");
	}

	public static final int ALTA_HOTEL = 1;
	public static final int AÑA_HABITACION = 2;
	
	public static void menuHabitacion() {
		System.out.println("\n1. Añadir habitación\n0. Salir");
	}
	
	public static final int INSERTAR_HABITACION = 1;
	
}
