import java.util.Scanner;

/**
 * Clase vista que maneja el menú e interacción con el usuario.
 */
public class Vista {
    public static void main(String[] args) {
        Modelo modelo = new Modelo();
        Controlador controlador = new Controlador(modelo);
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- Menú ---");
            System.out.println("1. Crear coche");
            System.out.println("2. Aumentar velocidad");
            System.out.println("3. Disminuir velocidad");
            System.out.println("4. Mostrar coches");
            System.out.println("5. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt(); sc.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Marca: ");
                    String marca = sc.nextLine();
                    System.out.print("Modelo: ");
                    String modeloC = sc.nextLine();
                    controlador.crearCoche(marca, modeloC);
                    break;
                case 2:
                    controlador.mostrarCoches();
                    System.out.print("Índice del coche: ");
                    int index1 = sc.nextInt();
                    controlador.aumentarVelocidad(index1);
                    break;
                case 3:
                    controlador.mostrarCoches();
                    System.out.print("Índice del coche: ");
                    int index2 = sc.nextInt();
                    controlador.disminuirVelocidad(index2);
                    break;
                case 4:
                    controlador.mostrarCoches();
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 5);

        sc.close();
    }
}
