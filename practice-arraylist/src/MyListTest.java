import java.util.ArrayList;

public class MyListTest {
    public static void main(String[] args) {
        MyList list = new MyList(12);
        list.add(0, 12);
        list.add(1, 13);
        list.add(2, 14);
        list.add(3, 15);
        list.add(4, 16);
        list.add(5, 17);
        list.printArray();
    }
}
