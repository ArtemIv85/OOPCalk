package Model;

public class CompleksNumber {
// Комплексное число вида a+bi, где а вещественная чать , а bi мнимая часть
    private int a;
    public int b;

    public CompleksNumber(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public String toString() {
        if (b>0) return "Комплексное число: " + a +'+'+ b +'i';
        if (b<0) return "Комплексное число: " + a + b +'i';
        else return "Вещественное число: "+ a;
    }
}
