package Service;

import Model.CompleksNumber;

public interface Calculable {
    void Sum (CompleksNumber num1,CompleksNumber num2);// Сложение
    void Divide(CompleksNumber num1,CompleksNumber num2);// Деление
    void Multiply(CompleksNumber num1,CompleksNumber num2);// Умножение
    void subtraction(CompleksNumber num1,CompleksNumber num2); //Вычитание
    CompleksNumber result();
    void clear();
}
