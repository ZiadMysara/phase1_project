package All.providers;

import All.AutrticationSystem.*;
import All.Discount.*;
import All.MainProgram.*;
import All.providers.*;
import All.services.*;
import All.UserThings.*;
import All.PaymentSystem.*;



import java.util.ArrayList;

public class LandLineProvider extends ServiceProvider{
    ArrayList<String> paymentMethods ;
    public LandLineProvider(){
        name = "Land-line Provider " ;
        paymentMethods = new ArrayList<>() ;
        form = new Form() ;
        paymentMethods.add("Wallet") ;
        paymentMethods.add("Cash") ;
        paymentMethods.add("CreditCard") ;
        // System.out.println("you got "+this.name);
    }
    
}
