
package hoofdstuk2.oef_slides;
import java.util.Scanner;

public class Comparison_met_ternary_operators {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int number1;
        int number2;
        System.out.println("Enter first integer: ");
        number1 = sc.nextInt();
        System.out.println("Enter second integer: ");
        number2 = sc.nextInt();
        System.out.println(number1 == number2 ? number1+" is gelijk aan "+number2 : number1+" is niet gelijk aan "+number2); //ternary operator
        System.out.println(number1 < number2 ? number1+" is kleiner dan "+number2 : number1+" is groter dan "+number2);
        
    }
    
}
