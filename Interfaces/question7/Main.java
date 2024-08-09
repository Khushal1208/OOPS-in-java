package OOPS.Interfaces.question7;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] arr = {2,4,62,6,4,88,99,22,34,21};
        Sortable bubbleSort = new BubbleSort();
        bubbleSort.sort(arr);
        System.out.println("Bubble Sort: ");
        System.out.println(Arrays.toString(arr));

        Sortable selectionSort = new SelectionSort();
        selectionSort.sort(arr);
        System.out.println("Selection Sort: ");
        System.out.println(Arrays.toString(arr));

    }
}
