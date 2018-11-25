//programma dat de som van 2 ingegeven getallen weergeeft.
package hoofdstuk2.oef_slides; //groepen gerelateerde klassen
import java.util.Scanner;

public class Addition {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in); //creëer object van Scanner
        int number1;
        int number2;
        System.out.print("Enter first integer: ");
        number1 = sc.nextInt();
        System.out.print("Enter second integer: ");
        number2 = sc.nextInt();
        int sum = number1+number2;
        System.out.printf("Sum is %d%n",sum);
        
    }
    
}
