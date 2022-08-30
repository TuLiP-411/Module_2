public class TestEmail {
    private static EmailExample emailExample;
    public static final String[] validEmail = {"a@gmail.com", "ab@yahoo.com", "abc@hotmail.com"};
    public static final String[] invalidEmail = {"@gmail.com", "ab@gmail.", "@#abc@gmail.com"};

    public static void main(String[] args) {
        EmailExample example = new EmailExample();
        for (String email : validEmail
        ) {
            boolean result = example.validate(email);
            System.out.println(email + " is a valid email: " + result);
        }
        for (String email : invalidEmail
        ) {
            boolean result = example.validate(email);
            System.out.println(email + " is a valid email: " + result);
        }
    }
}
