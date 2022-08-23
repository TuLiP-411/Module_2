import java.sql.SQLOutput;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input array length");
        int length = scanner.nextInt();
        int[] list = new int[length];
        System.out.println("Input " + length + " elements");
        for (int j = 0; j < length; j++) {
            list[j] = scanner.nextInt();
        }
        System.out.println("List before sort");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + "\t");
        }
        System.out.println();
        bubbleSort(list);
    }

    public static void bubbleSort(int[] list) {
        boolean needSwap = true;
        for (int i = 1; i < list.length && needSwap; i++) {
            needSwap = false;
            for (int j = 0; j < list.length - i; j++) {
                if (list[j] > list[j + 1]) {
                    int temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                    needSwap = true;
                }

            }
            if (needSwap == false) {
                System.out.println("Array may be sorted and next pass not needed");
            }
            System.out.print("List after the  " + i + "' sort: ");
            for (int k = 0; k < list.length; k++) {
                System.out.print(list[k] + " \t ");
            }
            System.out.println();

        }
    }
}
