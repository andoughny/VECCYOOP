package at.fhhgb.mtd.gop.math;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertTrue;

class Matrix3ConstructorTest {
    @Test
        //testet die area funktion eines rectangles
    void TestMatrixConstructors() {
        double[][] values = new double[][]{{1.0, 0.0, 0.0}, {0.0, 1.0, 0.0}, {0.0, 0.0, 1.0}};
        Matrix3 matrix1 = new Matrix3();
        Matrix3 matrix2 = new Matrix3(matrix1);
        Matrix3 matrix3 = new Matrix3(values);

        //die 3 matritzen sollten alle gleich sein
        assertTrue(Arrays.deepEquals(matrix1.getValues(), matrix2.getValues()));
        assertTrue(Arrays.deepEquals(matrix2.getValues(), matrix3.getValues()));
    }
}