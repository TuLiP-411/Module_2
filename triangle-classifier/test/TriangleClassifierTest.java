import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {

    @org.junit.jupiter.api.Test
    @Test
    @DisplayName("Tam giac deu")
    void triangleClassifier1() {
        double side1 = 2;
        double side2 = 2;
        double side3 = 2;
        String expected = "Tam giác đều";
        String result = TriangleClassifier.triangleClassifier(side1, side2, side3);
        assertEquals(result, expected);
    }

    @org.junit.jupiter.api.Test
    @Test
    @DisplayName("Tam giac can")
    void triangleClassifier2() {
        double side1 = 2;
        double side2 = 2;
        double side3 = 3;
        String expected = "Tam giác cân";
        String result = TriangleClassifier.triangleClassifier(side1, side2, side3);
        assertEquals(result, expected);
    }

    @org.junit.jupiter.api.Test
    @Test
    @DisplayName("Tam giac thuong")
    void triangleClassifier3() {
        double side1 = 3;
        double side2 = 4;
        double side3 = 5;
        String expected = "Tam giác thường";
        String result = TriangleClassifier.triangleClassifier(side1, side2, side3);
        assertEquals(result, expected);
    }

    @org.junit.jupiter.api.Test
    @Test
    @DisplayName("Khong phai tam giac 1")
    void triangleClassifier4() {
        double side1 = 8;
        double side2 = 2;
        double side3 = 3;
        String expected = "Không phải tam giác";
        String result = TriangleClassifier.triangleClassifier(side1, side2, side3);
        assertEquals(result, expected);
    }

    @org.junit.jupiter.api.Test
    @Test
    @DisplayName("Khong phai tam giac 2")
    void triangleClassifier5() {
        double side1 = -1;
        double side2 = 2;
        double side3 = 1;
        String expected = "Không phải tam giác";
        String result = TriangleClassifier.triangleClassifier(side1, side2, side3);
        assertEquals(result, expected);
    }

    @org.junit.jupiter.api.Test
    @Test
    @DisplayName("Khong phai tam giac 3")
    void triangleClassifier6() {
        double side1 = 0;
        double side2 = 1;
        double side3 = 1;
        String expected = "Không phải tam giác";
        String result = TriangleClassifier.triangleClassifier(side1, side2, side3);
        assertEquals(result, expected);
    }
}