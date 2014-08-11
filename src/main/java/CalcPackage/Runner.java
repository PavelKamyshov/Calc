package CalcPackage;

import java.util.Scanner;

/**
 * Created by Pavlo_Kamyshov on 8/11/2014.
 */
public class Runner {
   public static void main(String[] args) {
       boolean repeat = true;

       System.out.println('Please input the first digit or anything else to exit the program');

       Scanner scanner = new Scanner(System.in);
       float a = "0";
       a = scanner.nextFloat();

       System.out.println('Please entter the desired action: + summarize, - exclusion, * multiplication, / division');

       Scanner scanner = new Scanner(System.in);        //наверное Сканнер нельзя вызывать кучу раз и эту строку можно закомментить
       String action = "nothing";
       action = scanner.next();

       System.out.println('Please input the second digit or anything else to exit the program');
       Scanner scanner = new Scanner(System.in);
       float b = "0";
       b = scanner.nextFloat();


   }
}
