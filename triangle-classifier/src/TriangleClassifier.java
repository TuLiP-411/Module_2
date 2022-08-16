public class TriangleClassifier {
    public static String triangleClassifier(double side1, double side2, double side3) {
        String result;
        if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
            result = "Không phải tam giác";
        } else if (side1 + side2 < side3 || side1 + side3 < side2 || side2 + side3 < side1) {
            result = "Không phải tam giác";
        } else {
            if (side1 == side2 && side2 == side3) {
                result = "Tam giác đều";
            } else if (side1 == side2 || side2 == side3 || side1 == side3) {
                result = "Tam giác cân";
            } else {
                result = "Tam giác thường";
            }
        }
        return result;
    }
}
