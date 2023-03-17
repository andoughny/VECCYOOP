package at.fhhgb.mtd.gop.math;

public class Vector3 {


    public double [] values;

    //konstruktor
    public Vector3() {
     this.values = new double[]{0.0, 0.0, 1.0};
    }

    public Vector3(double[] values) {
        this.values = values;
    }

    public Vector3(Vector3 vector){
        this.values = vector.values;
    }

    public double[] getValues() {
        return values;
    }
}
