// Classe Bubble Sort
public class Bubble_Sort {
    // Método do Bubble Sort
    public static void bubble_sort(int[] array){
        int n = array.length;
        for (int i = 0; i < n-1; i++){
            for (int j = 0; j < n-i-1; j++){
                if (array[j] > array[j + 1]){
                    int tempo = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tempo;
                }
            }
        }
    }
}
