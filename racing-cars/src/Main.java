public class Main {
    public static int DISTANCE = 100;
    public static int STEP = 2;

    public static void main(String[] args) {
        RacingCars car1 = new RacingCars("A");
        RacingCars car2 = new RacingCars("B");
        RacingCars car3 = new RacingCars("C");
        RacingCars car4 = new RacingCars("D");

        Thread thread1 = new Thread(car1);
        Thread thread2 = new Thread(car2);
        Thread thread3 = new Thread(car3);
        Thread thread4 = new Thread(car4);

        System.out.println("Distance: 100KM");
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }

}
