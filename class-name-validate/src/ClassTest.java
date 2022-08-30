public class ClassTest {
    public static ClassNameExample classNameExample;
    public static final String[] className = {"C0318G", "M0318G", "P0323A"};

    public static void main(String[] args) {
        classNameExample = new ClassNameExample();
        for (String account : className
        ) {
            boolean result = classNameExample.validate(account);
            System.out.println(account + " is a valid class name: " + result);
        }
    }
}
