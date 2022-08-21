import java.util.Scanner;
import java.util.Stack;

public class ReverseNumber {
    public static void main(String[] args) {
        Stack<Character> number = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a string: ");
        String input = scanner.nextLine();
        for (int i = 0; i < input.length(); i++) {
            number.push(input.charAt(i));
        }
        System.out.println("Original string: " + number);
        Stack<Character> numberReverse = new Stack<>();
        for (int i = 0; i < input.length(); i++) {
            numberReverse.push(number.peek());
            number.pop();
        }
        System.out.println("Reverse string: " + numberReverse);
    }


}
