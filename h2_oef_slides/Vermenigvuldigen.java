
package hoofdstuk2.oef_slides;

import java.util.Scanner;

public class Vermenigvuldigen {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Geef eerste getal: ");
        int getal1 = sc.nextInt();
        System.out.print("Geef tweede getal: ");//print i.p.v println , println geeft enter
        int getal2 = sc.nextInt();
        System.out.print("Geef derde getal");
        int getal3 = sc.nextInt();
        System.out.printf("De vermenigvuldiging van %d, %d en %d is %d",getal1,getal2,getal3,getal1+getal2+getal3);
    }
    
}
