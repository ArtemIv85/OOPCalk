package Service;

import Model.CompleksNumber;

public interface Calculable {
    CompleksNumber Sum (CompleksNumber num1,CompleksNumber num2);// Сложение
    CompleksNumber Divide(CompleksNumber num1,CompleksNumber num2);// Деление
    CompleksNumber Multiply(CompleksNumber num1,CompleksNumber num2);// Умножение
    CompleksNumber Minus(CompleksNumber num1,CompleksNumber num2); //Вычитание
    CompleksNumber result();
    void clear();
}
