
package hoofdstuk2.oef_slides;
import java.util.Scanner;

public class Comparison {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first integer: ");
        int number1 = sc.nextInt();
        System.out.println("Enter second integer: ");
        int number2 = sc.nextInt();
        if (number1 == number2)
            System.out.printf("%d == %d%n",number1,number2);
        if (number1 != number2)
            System.out.printf("%d != %d%n",number1,number2);
         if (number1 < number2)
            System.out.printf("%d < %d%n",number1,number2);
        if (number1 > number2)
            System.out.printf("%d > %d%n",number1,number2);
        if (number1 <= number2)
            System.out.printf("%d <= %d%n",number1,number2);
        if (number1 >= number2){
            System.out.printf("%d >= %d%n",number1,number2); //haakjes niet nodig bij 1 lijn code
        }
    }
    
}
