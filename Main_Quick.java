public class Main_Quick {
    public static void main(String[] args) {
        int[] array = {12, 11, 13, 5, 6};
        System.out.println("Array Original:");
        imprimir_array(array);

        Quick_Sort.quick_sort(array, 0, array.length - 1);

        System.out.println("Array Ordenado:");
        imprimir_array(array);
    }

    // Método para imprimir o array
    public static void imprimir_array(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}