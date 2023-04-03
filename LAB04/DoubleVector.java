public class DoubleVector {
    private double[] vector = null;
    public DoubleVector(double[] vector){
        this.vector = vector;
    }
    // Скалярний добуток векторів
    public double mult(DoubleVector anotherVector){
        double s = 0;
        for ( int i = 0; i < vector.length; i++ ){
            s += vector[i] * anotherVector.vector[i];
        }
        return s;
    }
    public static double mult(DoubleVector a, DoubleVector b){
        return a.mult(b);
    }
    public double add(DoubleVector anotherVector) {
        double s = 0;
        for (int i = 0; i < vector.length; i++) {
            s += vector[i] + anotherVector.vector[i];
        }
        return s;
    }
    public double subtract(DoubleVector anotherVector) {
        double s = 0;
        for (int i = 0; i < vector.length; i++) {
            s += vector[i] - anotherVector.vector[i];
        }
        return s;
    }
    public static double substract(DoubleVector a, DoubleVector b){
        return a.subtract(b);
    }
    public static void main(String[] args){
        double[] a = {1, 2, 3, 4};
        double[] b = {1, 1, 1, 1};
        double[] c = {2, 2, 2, 2};
        DoubleVector v1 = new DoubleVector(a);
        DoubleVector v2 = new DoubleVector(b);
        DoubleVector v3 = new DoubleVector(c);
        System.out.println("v1*v2=" + v1.mult(v2));
        System.out.println("v1*v2=" + DoubleVector.mult(v1, v2));
        System.out.println("v1*v3=" + v1.mult(v3));
        System.out.println("Нові функції: ");
        System.out.println("v1+v2=" + v1.add(v2));
        System.out.println("v2-v3=" + DoubleVector.substract(v2, v3));
    }
}
