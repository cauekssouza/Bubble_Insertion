public class Main_Insertion {
    public static void main(String[] args) {
        int[] array = {12, 11, 13, 5, 6};
        System.out.println("O Array Original:");
        for (int i : array) {
            System.out.println(i + " ");  // Exibindo o array original
        }

        Insertion_Sort.insertion_sort(array); 

        System.out.println("\nO Array Ordenado:");
        for (int i : array) {
            System.out.println(i + " ");  
        }
    }
}

