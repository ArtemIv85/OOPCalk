package View;

import Controler.CalcContriller;
import Model.CompleksNumber;
import Service.ComplecsNumberService;

public class View {
CalcContriller contriller = new CalcContriller();
    public void Run (){
        CompleksNumber Numder1 = new CompleksNumber(2,3);
        CompleksNumber Numder2 = new CompleksNumber(2,-6);
        CompleksNumber Numder3 = new CompleksNumber(2,0);

        ComplecsNumberService service = new ComplecsNumberService();
        service.Sum(Numder1,Numder2);
        System.out.println(service.result());


    }

}
