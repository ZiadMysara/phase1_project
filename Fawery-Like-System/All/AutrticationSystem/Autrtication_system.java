package All.AutrticationSystem;

import All.UserThings.Customer;
import All.MainProgram.Storage;

import java.util.Scanner;

public class Autrtication_system {

    public Customer Autrticationsystem(Storage d){
        SignUpPage s = new SignUpPage(d);
        loginpage l = new loginpage(d);
        Customer u = null;
        int choose;

        String temp1;
        String temp2;
        String temp3;
        Scanner strVal = new Scanner(System.in);
        Scanner intVal = new Scanner(System.in);

        System.out.println("enter :");
        System.out.println("1 to Sign up");
        System.out.println("2 to log in");
        choose = intVal.nextInt();
        boolean flag = false;
        while (flag == false) {
            switch (choose) {
                case 1: {
                    System.out.println("please enter Email, username and passwords");
                    temp1 = strVal.nextLine();
                    temp2 = strVal.nextLine();
                    temp3 = strVal.nextLine();
                    u = s.Signin(temp1,temp2,temp3);
                    System.out.println("success sign up");
                    flag = true;
                    break;
                }
                case 2: {
                    System.out.println("please enter ID and passwords");
                    temp1 = strVal.nextLine();
                    temp2 = strVal.nextLine();
                    u = l.loin(temp1,temp2);
                    System.out.println("success log in");

                    flag = true;
                    break;
                }
                default: {
                    System.out.println("enter a valid number");
                    choose = intVal.nextInt();
                }
            }
        }
        return u;
    }
}
