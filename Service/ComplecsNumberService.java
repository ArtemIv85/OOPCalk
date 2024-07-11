package Service;

import Model.CompleksNumber;

public class ComplecsNumberService implements Calculable {
    private CompleksNumber result;

    @Override
    public CompleksNumber Sum(CompleksNumber num1, CompleksNumber num2) {
        CompleksNumber temp = new CompleksNumber(num1.getA()+num2.getA(),num1.getB()+num2.getB());
        result = temp;
        return temp;
    }

    @Override
    public CompleksNumber Divide(CompleksNumber num1, CompleksNumber num2) {
        double div = num2.getA()*num2.getA()+num2.getB()*num2.getB();
        if (div==0){
            System.out.println("Деление на данное число невозможно");
            return null;
        }
        else {
            CompleksNumber temp = new CompleksNumber(
                    (num1.getA() * num2.getA() + num1.getB() * num2.getB())/div,
                    (num1.getB()*num2.getA()-num1.getA()*num2.getB())/div
            );
            result = temp;
            return  temp;
        }
//         a = num1.getA()   b = num1.getB()
//         c = num2.getA()   d = num2.getB()

    }

    @Override
    public CompleksNumber Multiply(CompleksNumber num1, CompleksNumber num2) {
        CompleksNumber temp = new CompleksNumber(
                num1.getA()*num2.getA()-num1.getB()*num2.getB(),
                num1.getA()*num2.getB()+num1.getB()*num2.getA()
        );
        result = temp;
        return temp;
    }

    @Override
    public CompleksNumber Minus(CompleksNumber num1, CompleksNumber num2) {
        CompleksNumber temp = new CompleksNumber(num1.getA()-num2.getA(),num1.getB()-num2.getB());
        result = temp;
        return temp;
    }

    @Override
    public CompleksNumber result() {
        return result;
    }

    @Override
    public void clear() {
        result = null;
    }
}
