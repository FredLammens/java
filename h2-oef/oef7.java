/*
Schrijf een applicatie die aan de gebruiker drie gehele getallen vraagt en daarvan de som,
het gemiddelde (als geheel getal), de rest van de berekening van het gemiddelde als geheel getal
en het grootste getal weergeeft. Bepaal het grootste getal zo performant mogelijk!
*/
package hoofdstuk2_oef;

import java.util.Scanner;

public class oef7 {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.print("Geef eerste getal: ");
        int getal = sc.nextInt();
        System.out.print("Geef tweede getal: ");
        int getal1 = sc.nextInt();
        System.out.print("Geef derde getal: ");
        int getal2 = sc.nextInt();
        int aantal = 3;
        int som = getal+getal1+getal2;
        int gemiddelde = som/ aantal;
        int rest = som %aantal;
        int grootsteGetal = 0;
        if(getal > getal1)
            grootsteGetal = getal;
        else grootsteGetal = getal1;
        if(getal2 > grootsteGetal)
            grootsteGetal = getal2;
        System.out.printf("Van de ingevoerde getallen %d, %d en %d%nis de som %d%nhet gemiddelde %d%nde rest %d%nen het grootste getal %d%n",getal,getal1,getal2,som,gemiddelde,rest,grootsteGetal);
    }
    
}
