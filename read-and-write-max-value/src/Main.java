import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input the file path: ");
        String filePath = scanner.nextLine();
        ReadAndWriteFile file = new ReadAndWriteFile();
        List<Integer> listNumber = file.readFile(filePath);
        int max = file.findMax(listNumber);
        file.writeMax(filePath, max);
        System.out.println("Max value is written into the file. Please check the file!");
    }


}
