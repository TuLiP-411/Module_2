public class Main {
    public static void main(String[] args) {
        OddThread oddThread = new OddThread();
        EvenThread evenThread = new EvenThread();
        Thread odd = new Thread(oddThread);
        Thread even = new Thread(evenThread);
        odd.start();
        try {
            odd.join(8);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        even.start();

    }
}
