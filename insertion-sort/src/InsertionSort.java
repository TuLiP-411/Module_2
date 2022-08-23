public class InsertionSort {

    public static void main(String[] args) {
        int[] list = {4, -6, 8, 9, -12, 34, 0, 1};
        insertionSort(list);
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + "\t");
        }
    }

    public static void insertionSort(int[] list) {
        int valueToInsert, holePosition;
        for (int i = 1; i < list.length; i++) {
            valueToInsert = list[i];
            holePosition = i;
            while (holePosition > 0 && valueToInsert < list[holePosition - 1]) {
                list[holePosition] = list[holePosition - 1];
                holePosition--;
            }
            if (holePosition != i) {
                list[holePosition] = valueToInsert;
            }
        }
    }
}
