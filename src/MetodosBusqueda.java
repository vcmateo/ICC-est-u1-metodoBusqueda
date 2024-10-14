public class MetodosBusqueda {
    public int busquedaSecuencial(int[] arreglo, int valorBusqueda){
        for(int i=0;i<arreglo.length;i++){
            if(arreglo[i]==valorBusqueda){
                return i;
            }
        }
        return -1;
    }
//crear un arreglo del 1 hasta el 1000000 ordenado y buscamos el numero 50418
public void arreglom(int[] bin){
  for(int i=0;i<100001;i++){
    System.out.println(i+" ");
    }
}

    public void printArreglo(int[] arreglo){
        for(int elem: arreglo){
           System.out.println(elem+" ");
        }
    }

    public int busquedaBinaria(int[] arr,int value){
        int inicio=0;
        int fin=arr.length -1;
        while(inicio<=fin){
            int medio=inicio+(fin-inicio)/2;
            if(arr[medio]==value){
                return medio;
            }
            if(arr[medio]<value){
                inicio=medio+1;//buscar la mitad de la derecha
            }else{
                fin=medio-1; //buscar la mitad de la izquierda
            }
        }
        return -1;
    }
}
