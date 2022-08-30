public class PhoneNumberTest {
    public static PhoneNumberExample phoneNumberExample;
    public static final String[] phoneNumber = {"(84)-(0978489648)", "(a8)-(22222222)"};

    public static void main(String[] args) {
        phoneNumberExample = new PhoneNumberExample();
        for (String number : phoneNumber
        ) {
            boolean result = phoneNumberExample.validate(number);
            System.out.println(number + " is a valid phone number: " + result);
        }
    }
}
