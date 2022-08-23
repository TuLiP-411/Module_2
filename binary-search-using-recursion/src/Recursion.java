import java.util.Arrays;
import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input array length ");
        int length = scanner.nextInt();
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.println("Input element at index of " + i + " :");
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Input element to search:");
        int value = scanner.nextInt();
        System.out.println("Value exists at index of " + binarySearch(arr, 0, arr.length - 1, value));
    }

    public static int binarySearch(int arr[], int low, int high, int value) {
        low = 0;
        high = arr.length - 1;
        int mid = (low + high) / 2;
        if (high >= low) {
            if (arr[mid] == value) {
                return mid;
            }
            if (arr[mid] > value) {
                return binarySearch(arr, low, mid - 1, value);
            } else
                return binarySearch(arr, mid + 1, high, value);
        }
        return -1;
    }
}
