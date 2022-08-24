import javax.swing.plaf.synth.SynthLookAndFeel;
import java.util.Random;
import java.util.Scanner;

public class ArrayExample {
    public Integer[] creatRandom() {
        Random rd = new Random();
        Integer[] arr = new Integer[100];
        System.out.println("Danh sách phần tử của mảng: ");
        for (int i = 0; i < 100; i++) {
            arr[i] = rd.nextInt(100);
            System.out.print(arr[i] + "\t");
        }
        return arr;
    }

    public static void main(String[] args) {
        ArrayExample arrayExample = new ArrayExample();
        Integer[] arr = arrayExample.creatRandom();

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nNhập chỉ số của phần tử bất kì: ");
        int x = scanner.nextInt();
        try {
            System.out.println("Giá trị của phần tử " + x + " là " + arr[x]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Chỉ số vượt quá giới hạn của mảng");
            ;
        }
    }
}
