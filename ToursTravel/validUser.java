package ToursTravel;
import java.util.Scanner;
interface Login{

    void login();
}
class validUser implements Login{

    @Override
    public void login() {

        System.out.println("<<<< WELCOME TO TOURS & TRAVEL >>>>");

        System.out.println(" ");
        System.out.println("PLEASE REGISTRATION YOURSELF");
        Scanner sc = new Scanner(System.in);
        System.out.println(" ");
        System.out.print("ENTER YOUR NAME: ");
        sc.nextLine();
        

        System.out.print("ENTER YOUR NUMBER: ");
        try{
            sc.nextInt();
        }
        // char[] i = new char[size];
        // if (size.length < 10) {
        //     throw new NumException(); //CUSTOM EXCEPTION
        // } 
        // }
        catch(Exception e){
            System.out.println("************************* ");
            System.out.println("Please Enter numeric data");
            System.out.println("************************* ");
        }

        System.out.print("ENTER YOUR E-MAIL ID:");
        sc.next();

        System.out.print("THANK YOU FOR REGISTERING");    
        sc.close();    // remove this
    }
    
}
