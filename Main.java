import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArbolInventario inventario = new ArbolInventario();

        int opcion;

        do {
            System.out.println("\n===== TREE-STOCK =====");
            System.out.println("1. Registrar Producto");
            System.out.println("2. Mostrar Inventario");
            System.out.println("3. Buscar Producto");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opcion: ");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {

                case 1:
                    System.out.print("Ingrese el ID del producto: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();

                    if (inventario.buscar(id) != null) {
                        System.out.println("Ya existe un producto con ese ID.");
                    } else {
                        System.out.print("Ingrese el nombre del producto: ");
                        String nombre = scanner.nextLine();

                        inventario.insertar(id, nombre);

                        System.out.println("Producto registrado correctamente.");
                    }
                    break;

                case 2:
                    System.out.println("\n===== INVENTARIO ORDENADO =====");

                    if (inventario.raiz == null) {
                        System.out.println("El inventario esta vacio.");
                    } else {
                        inventario.inorden();
                    }
                    break;

                case 3:
                    System.out.print("Ingrese el ID que desea buscar: ");
                    int idBuscar = scanner.nextInt();

                    Producto productoEncontrado = inventario.buscar(idBuscar);

                    if (productoEncontrado != null) {
                        System.out.println("Producto encontrado:");
                        System.out.println("ID: " + productoEncontrado.id);
                        System.out.println("Nombre: " + productoEncontrado.nombre);
                    } else {
                        System.out.println("Producto no encontrado.");
                    }
                    break;

                case 0:
                    System.out.println("Saliendo de Tree-Stock...");
                    break;

                default:
                    System.out.println("Opcion no valida. Intente nuevamente.");
            }

        } while (opcion != 0);

        scanner.close();
    }
}