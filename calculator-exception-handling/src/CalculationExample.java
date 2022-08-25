import java.util.Scanner;

public class CalculationExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input x: ");
        int x = scanner.nextInt();
        System.out.println("Input y: ");
        int y = scanner.nextInt();
        CalculationExample calc = new CalculationExample();
        calc.calculate(x, y);

    }

    private void calculate(int x, int y) {
        try {
            int a = x + y;
            int b = x - y;
            int c = x * y;
            int d = x / y;
            System.out.println("Sum = " + a);
            System.out.println("Sub = " + b);
            System.out.println("Multi = " + c);
            System.out.println("Div = " + d);
        } catch (Exception e) {
            System.out.println("Exception is: " + e.getMessage());
        }
    }

}

