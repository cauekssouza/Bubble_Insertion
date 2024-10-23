// Classe InsertionSort
public class Insertion_Sort {

    // Método para realizar o Insertion Sort
    public static void insertion_sort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int chave = array[i];
            int j = i - 1;

            
            while (j >= 0 && array[j] > chave) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = chave;
        }
    }
}