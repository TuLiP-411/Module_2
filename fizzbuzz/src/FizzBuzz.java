public class FizzBuzz {
    public static String fizzBuzz(int number) {
        String stringNumber = String.valueOf(number);
        String result = stringNumber;
        if (number % 3 == 0 && number % 5 == 0) {
            result = "FizzBuzz";
        } else if (number % 3 == 0) {
            result = "Fizz";
        } else if (number % 5 == 0) {
            result = "Buzz";
        } else {
            for (int i = 0; i < stringNumber.length(); i++) {
                if (stringNumber.charAt(i) == '3') {
                    result = "Fizz";
                }
                if (stringNumber.charAt(i) == '5') {
                    result = "Buzz";
                }
            }
        }
        return result;
    }
}
