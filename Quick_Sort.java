// Classe Quick Sort
public class Quick_Sort {
    // Método Principal
    public static void quick_sort(int[] array, int  inicio, int fim){
        if (inicio < fim){
            int pivo = particiona(array, inicio, fim);
            quick_sort(array, inicio, pivo - 1);
            quick_sort(array,pivo + 1, fim);

        }
    }

    // Metodo particionar
    public static int particiona(int[] array, int inicio, int fim){
        int pivo = array[fim];
        int i = inicio - 1;
        for (int j = inicio; j < fim; j++){
            if (array[j] <= pivo){
                i++;
                trocar(array, i, j);
            }
        }
        trocar(array, i + 1, fim);
        return i + 1;
    }

    // Método Trocar
    public static void trocar(int[] array, int inicio, int fim){
        int aux = array[inicio];
        array[inicio] = array[fim];
        array[fim] = aux;
    }

    // Método Imprimir Array
    public static void imprimir_array(int[] array){
        for (int num : array){
            System.out.println(num + "");
        }
        System.out.println();
    }
    
}

