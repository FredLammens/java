/*
Schrijf  een  applicatie  die  aan  de  gebruiker  de lengte en  de  breedte  van  een  rechthoek
(geheel getal) vraagt.
Geef van de rechthoek onder elkaar
- De omtrek
- De oppervlakte
Gebruik printf!
*/
package hoofdstuk2_oef;
import java.util.Scanner;

public class oef2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Geef de lengte van de rechthoek in: ");
        int lengte = sc.nextInt();
        System.out.print("Geef de breedte van de rechthoek in: ");
        int breedte = sc.nextInt();
        System.out.printf("De omtrek van de rechthoek is %d en de oppervlakte is %d%n",(lengte+breedte)*2,lengte*breedte/2);
    }
    
}
