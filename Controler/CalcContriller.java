package Controler;

import Model.CompleksNumber;
import Service.Calculable;
import Service.ComplecsNumberService;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CalcContriller {




    public  CompleksNumber   Enter(CompleksNumber operand1, CompleksNumber operand2 ,String operator) {
        Map<String, CompleksNumber> operations = new HashMap<>();
        ComplecsNumberService service = new ComplecsNumberService();

            operations.put("+", service.Sum(operand1,operand2));
            operations.put("-", service.Minus(operand1,operand2));
            operations.put("*", service.Multiply(operand1,operand2));
            operations.put("/", service.Divide(operand1,operand2));

        if (operations.containsKey(operator))
            return operations.get(operator);
        else
            throw new RuntimeException("Unsupported math operation");
    }


}



