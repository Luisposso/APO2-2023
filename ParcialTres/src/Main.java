import java.util.Scanner;

public class Main {
    // Resto del código

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("----- MENU -----");
            System.out.println("1. Crear nave");
            System.out.println("2. Buscar nave");
            System.out.println("3. Mostrar inventario");
            System.out.println("4. Terminar programa");
            System.out.print("Ingrese una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer de entrada

            switch (opcion) {
                case 1:
                    System.out.print("¿Desea crear una nave de combate? (S/N): ");
                    String respuesta = scanner.nextLine();
                    if (respuesta.equalsIgnoreCase("S")) {
                        inventario.add(new NaveCombateClaseA());
                        inventario.add(new NaveExploradoraClaseB());
                        System.out.println("Nave de combate creada y agregada al inventario.");
                    } else {
                        // Lógica para crear otros tipos de naves
                    }
                    break;
                case 2:
                    buscarNave1();
                    break;
                case 3:
                    mostrarInventario();
                    break;
                case 4:
                    System.out.println("Programa terminado.");
                    return; // Salir del método main y finalizar la ejecución del programa
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }

            System.out.println();
        }
    }
    
    public static void main1(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear naves de combate
        for (int i = 0; i < 3; i++) {
            inventario.add(new NaveCombateClaseA());
        }

        // Crear naves exploradoras
        for (int i = 0; i < 3; i++) {
            inventario.add(new NaveExploradoraClaseB());
        }

        // Crear naves de carga
        for (int i = 0; i < 3; i++) {
            inventario.add(new NaveCargaClaseC());
        }

        // Crear naves de transporte de pasajeros
        for (int i = 0; i < 3; i++) {
            inventario.add(new NavePasajerosClaseD());
        }

        while (true) {
         
        }
    }
    private static void buscarNave1() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el tipo de nave a buscar: ");
        String tipoNave = scanner.nextLine();

        boolean encontrada = false;
        NaveEspacial[] inventario = null;
		for (NaveEspacial nave : inventario) {
            if (nave.getTipoNave().equalsIgnoreCase(tipoNave)) {
                encontrada = true;
                System.out.println("Nave encontrada en el inventario: " + nave.getTipoNave());
                break;
            }
        }

        if (!encontrada) {
            System.out.println("Nave no encontrada en el inventario.");
        }
    }


    // Resto de métodos de la clase Main

	private static void mostrarInventario() {
		// TODO Auto-generated method stub
		
	}

	private static void buscarNave() {
		// TODO Auto-generated method stub
		
	}

    // Resto de métodos de la clase Main
}
