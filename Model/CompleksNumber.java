package Model;

public class CompleksNumber {
// Комплексное число вида a+bi, где а вещественная чать , а bi мнимая часть
    private double a;
    public double b;

    public CompleksNumber(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public String toString() {
        if (b>0) return "Комплексное число: " + a +'+'+ b +'i';
        if (b<0) return "Комплексное число: " + a + b +'i';
        else return "Вещественное число: "+ a;
    }
}
