public class TriangleException {
    public static void main(String[] args) {
        try {
            checkTriangle(3, 0, 55);
        } catch (IllegalTriangleException e) {
            System.out.println(e.);
        }
    }

    public static void checkTriangle(int side1, int side2, int side3) throws IllegalTriangleException {
        if (side1 <= 0 || side2 <= 0 || side3 <= 0 || side1 >= side2 + side3 || side1 <= Math.abs(side3 - side2)) {
            throw new IllegalTriangleException("Input sides are not sides of a triangle");
        }
    }
}
