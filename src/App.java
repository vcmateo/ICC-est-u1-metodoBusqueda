import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        MetodosBusqueda metodoBusqueda = new MetodosBusqueda();
        Scanner scanner = new Scanner(System.in);

        // Crear un arreglo de números del 1 al 10,000,000
        int[] arreglo = new int[10000000];
        for (int i = 0; i < 10000000; i++) {
            arreglo[i] = i + 1;
        }

        System.out.println("Ingrese el número que desea buscar (Ej: 5418):");
        int numero = scanner.nextInt();

        System.out.println("Seleccione el método de búsqueda: ");
        System.out.println("1. Búsqueda Secuencial");
        System.out.println("2. Búsqueda Binaria");
        int opcion = scanner.nextInt();

        long startTime, endTime, tiempoTotal;
        int resultado = -1;

        if (opcion == 1) {
            startTime = System.nanoTime();
            resultado = metodoBusqueda.busquedaSecuencial(arreglo, numero);
            endTime = System.nanoTime();
            tiempoTotal = (endTime - startTime) / 1000000; 
            System.out.println("Búsqueda secuencial encontró el número en la posición: " + resultado);
            System.out.println("Tiempo de búsqueda secuencial: " + tiempoTotal + " ms");
        } else if (opcion == 2) {
            startTime = System.nanoTime();
            resultado = metodoBusqueda.busquedaBinaria(arreglo, numero);
            endTime = System.nanoTime();
            tiempoTotal = (endTime - startTime) / 1000000;
            System.out.println("Búsqueda binaria encontró el número en la posición: " + resultado);
            System.out.println("Tiempo de búsqueda binaria: " + tiempoTotal + " ms");
        } else {
            System.out.println("Opción no válida.");
        }

        scanner.close();
    }
}