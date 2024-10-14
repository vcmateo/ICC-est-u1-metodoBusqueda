public class MetodosBusqueda {

    public void busquedaBinariaa(int[] bin) {
        for (int i = 0; i < 1000000; i++) {
            System.out.println(i + " ");
        }
    }

    public int busquedaSecuencial(int[] arreglo, int valorBuscado) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == valorBuscado) {
                return i;
            }
        }
        return -1;
    }

    public int busquedaBinaria(int[] arr, int value) {
        int inicio = 0;
        int fin = arr.length - 1;
        while (inicio <= fin) {
            int medio = inicio + (fin - inicio) / 2;
            if (arr[medio] == value) {
                return medio; // 
            }
            if (arr[medio] < value) {
                inicio = medio + 1; 
            } else {
                fin = medio - 1; 
            }
        }
        return -1; 
    }
}