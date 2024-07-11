package View;

import Controler.CalcContriller;
import Model.CompleksNumber;
import Service.ComplecsNumberService;
import Service.FileLogger;

import java.util.Scanner;

public class View {
CalcContriller contriller = new CalcContriller();
FileLogger logger = new FileLogger();


public void Run (){

    logger.LogMessage("Запуск приложения.");

    while (true){
            System.out.println("Введите первое комплексное числа формата a+bi");
            double a = Double.parseDouble(prompt("Введите значение a: "));
            double b = Double.parseDouble(prompt("Введите значение b: "));
            CompleksNumber operand1 = new CompleksNumber(a,b);
            String operator = prompt("Enter math operation (+ / - *): ");
            System.out.println("Введите второе комплексное числа формата a+bi");
            double c = Double.parseDouble(prompt("Введите значение a: "));
            double d = Double.parseDouble(prompt("Введите значение b: "));
            CompleksNumber operand2 = new CompleksNumber(c,d);
            CompleksNumber result = contriller.Enter(operand1,operand2,operator);
            if (result!= null) {
                System.out.println(result);
                logger.log(operand1, operand2, operator, contriller.Enter(operand1, operand2, operator));
            }
            else {
                logger.logErr(operand1,operand2,"/","Ошибка деления на ноль");
            }
        }

    }
    private static String prompt(String message) {
        System.out.println(message);
        return new Scanner(System.in).next();
    }
}

