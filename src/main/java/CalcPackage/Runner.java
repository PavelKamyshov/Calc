package calcPackage;

import java.util.Scanner;

/**
 * Created by Pavlo_Kamyshov on 8/11/2014.
 */
public class Runner {
   public static void main(String[] args) {
       boolean repeat = false;
       float a = 0; float b = 0;

       Scanner scanner = new Scanner(System.in);

       do {

           System.out.println("Please input the first digit or anything else to exit the program");

           try {

               a = scanner.nextFloat();

               repeat = false;

           } catch (Exception e) {


               scanner.;

               System.out.println("You entered incorrect value, please try again");
               //System.exit(0);
               repeat = true;
           }

       } while (repeat);

       System.out.println("Please enter the desired action: + summarize, - exclusion, * multiplication, / division");

       //Scanner scanner = new Scanner(System.in);        //наверное Сканнер нельзя вызывать кучу раз и эту строку можно закомментить
       String action = "nothing";
       try {
       action = scanner.next();}
       catch (Exception e) {
           System.out.println("You entered incorrect value, the program will now exit");
           System.exit(0);
       }

       System.out.println("Please input the second digit or anything else to exit the program");
      // Scanner scanner = new Scanner(System.in);

       try {
       b = scanner.nextFloat(); }
       catch (Exception e) {
           System.out.println("You entered incorrect value, the program will now exit");
           System.exit(0);
       }

       switch (action) {
           case "+":

               System.out.println("Summ = " + Calc.sum(a, b));
           break;

           case "-":

               System.out.println("Summ = " + Calc.minus(a, b));
               break;

           case "*":

               System.out.println("Summ = " + Calc.mult(a, b));
               break;

           case "/":

               System.out.println("Summ = " + Calc.divide(a, b));
               break;
           default:
               System.out.println("Incorrect value! You are a stupid monkey!!!");
       }
   }
}
