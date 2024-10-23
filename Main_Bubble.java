public class Main_Bubble {
    public static void main(String[] args) {
        int[] array = {12, 11, 13, 5, 6};
        System.out.println("O Array Original:");
        for (int i : array){
            System.out.println(i + "");
        }
        Bubble_Sort.bubble_sort(array);

        System.out.println("\nO Array Ordenado:");
        for (int i : array){
            System.out.println(i + "");
        }
    }
}
