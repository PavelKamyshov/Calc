package CalcPackage;

import java.util.Scanner;

/**
 * Created by Pavlo_Kamyshov on 8/11/2014.
 */
public class Runner {
    public static void main(String[] args) {
        boolean repeat = false;
        float a = 0;
        float b = 0;
        String action = "nothing";

        Scanner scanner = new Scanner(System.in);

        do {

            do {

                System.out.println("Please input the first digit. Input 0 to exit the program.");

                try {

                    a = scanner.nextFloat();
                    if (a == 0) {
                        System.exit(0);
                    }
                    repeat = false;

                } catch (Exception e) {

                    scanner.next();

                    System.out.println("You entered incorrect value, please try again");
                    repeat = true;
                }

            } while (repeat);


            do {

                System.out.println("Please enter the desired action: + summarize, - exclusion, * multiplication, / division");

                //  try {
                action = scanner.next();
                try {
                    if (Integer.parseInt(action) == 0) {
                        System.exit(0);
                    }
                } catch (Exception e) {


                    if (action.contentEquals("+") || action.contentEquals("-") || action.contentEquals("*") || action.contentEquals("/")) {

                        repeat = false;
                    } else {
                        //scanner.next();
                        System.out.println("You entered incorrect value, please try again");
                        repeat = true;
                    }
                }

//           } catch (Exception e) {
//
//               //scanner.next();
//
//               System.out.println("You entered incorrect value, please try again");
//               repeat = true;
//           }

            } while (repeat);


            do {

                System.out.println("Please input the second digit. Input 0 to exit the program.");

                try {

                    b = scanner.nextFloat();
                    if (b == 0) {
                        System.exit(0);
                    }
                    repeat = false;

                } catch (Exception e) {

                    scanner.next();

                    System.out.println("You entered incorrect value, please try again");
                    repeat = true;
                }

            } while (repeat);

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
                    System.out.println("Incorrect action value! You are a stupid monkey!!!");
            }
        }  while ( a == a);
    }
}
