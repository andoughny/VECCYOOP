package at.fhhgb.mtd.gop.math;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Vector3Test {
    @Test
        //testet ob die multiplikation eines vektox und einer matrix stimmt
    void TestMatrixMultiplication() {
        double [] valuesForMultiplicator = {10.0, 10.0, 10.0};
        Vector3 multiplicator = new Vector3 (valuesForMultiplicator);

        double [] resultOfMultiplication = {10.0, 10.0, 10.0};

        Matrix3 matrix1 = new Matrix3();
        Vector3 vectorResult = matrix1.mult(multiplicator);
        double [] result = vectorResult.values;

        //vergleicht das ergebnis der multiplikation mit dem fix stimmenden wert
        assertArrayEquals(result, resultOfMultiplication);

    }
}