package Service;

import Model.CompleksNumber;

public class ComplecsNumberService implements Calculable {
    private CompleksNumber result;

    @Override
    public void Sum(CompleksNumber num1, CompleksNumber num2) {
    CompleksNumber temp = new CompleksNumber(num1.getA()+num2.getA(),num1.getB()+num2.getB());
    result = temp;
    }

    @Override
    public void Divide(CompleksNumber num1, CompleksNumber num2) {

    }

    @Override
    public void Multiply(CompleksNumber num1, CompleksNumber num2) {

    }

    @Override
    public void subtraction(CompleksNumber num1, CompleksNumber num2) {

    }

    @Override
    public CompleksNumber result() {
        return result;
    }

    @Override
    public void clear() {

    }
}
