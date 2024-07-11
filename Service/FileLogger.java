package Service;

import Model.CompleksNumber;
import impl.Loggable;


import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class FileLogger implements Loggable {



    @Override
    public void LogMessage(String message){
        try(FileWriter writer = new FileWriter("log.txt", true))
        {
            // запись всей строки
            writer.write(LocalDateTime.now() + " <--- : ---> " + message);
            // запись по символам
            writer.append('\n');
            writer.flush();
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }

    }

    public void log(CompleksNumber N1,CompleksNumber N2, String operator, CompleksNumber result) {
        try(FileWriter writer = new FileWriter("log.txt", true))
        {
            // запись всей строки
            String text = LocalDateTime.now() + " <--- : ---> " +
                    "Число 1 {"+N1+"} Оператор {"+operator+"} Число 2 {"+N2+
                    "} Результат {"+result+"}";
            writer.write(text);
            // запись по символам
            writer.append('\n');
            writer.flush();
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
    public void logErr(CompleksNumber N1,CompleksNumber N2, String operator, String result) {
        try(FileWriter writer = new FileWriter("log.txt", true))
        {
            // запись всей строки
            String text = LocalDateTime.now() + " <--- : ---> " +
                    "Число 1 {"+N1+"} Оператор {"+operator+"} Число 2 {"+N2+
                    "} Результат {"+result+"}";
            writer.write(text);
            // запись по символам
            writer.append('\n');
            writer.flush();
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }

    }

}
