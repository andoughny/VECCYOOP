package at.fhhgb.mtd.gop.math;

public class Matrix3 {
    private double[][] values;

    public Matrix3() {
        this.values = new double[][]{{1.0, 0.0, 0.0}, {0.0, 1.0, 0.0}, {0.0, 0.0, 1.0}};
    }

    public Matrix3(double[][] values) {
        this.values = values;
    }

    public Matrix3(Matrix3 matrix) {
        this.values = matrix.values;
    }



    //multipliziert zwei 3x3 matrizen
    public Matrix3 mult(Matrix3 matrix) {
        double[][] result = new double[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                result[i][j] = 0.0;
                for (int k = 0; k < 3; k++) {
                    result[i][j] += this.values[i][k] * matrix.values[k][j];
                }
            }
        }
        return new Matrix3(result);
    }

    //multiplikation eines vektors mit einer matrix
    public Vector3 mult(Vector3 vector) {
        double[] result = new double[3];
        for (int i = 0; i < 3; i++) {
            result[i] = 0.0;
            for (int j = 0; j < 3; j++) {
                result[i] += this.values[i][j] * vector.getValues()[j];
            }
        }
        return new Vector3(result);
    }


    // Returniert die Instanzvariable values
    public double[][] getValues() {
        return values;
    }

}