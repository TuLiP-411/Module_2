public class SelectionSort {
    static double[] list = {1, 9, 4.5, 6.6, 5.7, -4.5};


    public static void selectionSort(double[] list) {
        for (int i = 0; i < list.length - 1; i++) {
//            gán min tạm thời là phần tử đầu tiên
            double currentMin = list[i];
            int currentMinIndex = i;
//check xem từ phần tử đó về sau có phần tử nào nhỏ hơn ko
            for (int j = i + 1; j < list.length; j++) {
                if (currentMin > list[j]) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }
//            Nếu có thì đổi chỗ
            if (currentMinIndex != i) {
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
    }

    public static void main(String[] args) {
        selectionSort(list);
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " \t ");
    }
}
