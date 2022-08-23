import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input array length");
        int length = scanner.nextInt();
        int[] arr = new int[length];
        System.out.println("Input each elements bellow: ");
        for (int i = 0; i < length; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Array before sort: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
        insertionSort(arr);
        System.out.println("Array after sort: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }

    }

    public static void insertionSort(int[] arr) {
        int value, hole;
        for (int i = 1; i < arr.length; i++) {
            value = arr[i];
            hole = i;
            while (hole > 0 && value < arr[hole - 1]) {
                arr[hole] = arr[hole - 1];
                hole--;
            }
            if (hole != i) {
                arr[hole] = value;
            }
        }
    }
}
