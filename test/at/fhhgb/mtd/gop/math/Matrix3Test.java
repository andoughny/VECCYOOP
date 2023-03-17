package at.fhhgb.mtd.gop.math;

import at.fhhgb.mtd.gop.veccy.shapes.Rectangle;
import org.junit.jupiter.api.Test;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Matrix3Test {
    @Test
        //testet ob die multiplikation zweier matrizen stimmt
    void TestMatrixMultiplication() {
        double[][] values = new double[][]{{1.0, 0.0, 0.0}, {0.0, 1.0, 0.0}, {0.0, 0.0, 1.0}};
        Matrix3 matrix1 = new Matrix3(values);
        Matrix3 matrix2 = new Matrix3(matrix1);

        Matrix3 matrixMultiplicated = matrix1.mult(matrix1);

        assertTrue(Arrays.deepEquals(matrix2.getValues(), matrixMultiplicated.getValues()));
    }
}