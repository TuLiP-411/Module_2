public class AccountTest {
    public static AccountExample accountExample;
    public static final String[] validAccount = {"123abc_", "_abc123", "______", "123456", "abcdefg"};
    public static final String[] invalidAccount = {".@", "12345", "1234_", "abcde", " abcdefg"};

    public static void main(String[] args) {
        accountExample = new AccountExample();
        for (String account : validAccount
        ) {
            boolean result = accountExample.validate(account);
            System.out.println(account + " is a valid email: " + result);
        }
        for (String account : invalidAccount
        ) {
            boolean result = accountExample.validate(account);
            System.out.println(account + " is a valid email: " + result);
        }
    }
}
