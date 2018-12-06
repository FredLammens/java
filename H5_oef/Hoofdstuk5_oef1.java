
package hoofdstuk5_oef1;

import java.util.Scanner;

/* Lees een rij positieve gehele getallen in (controleer op invoer!),
afgesloten door het getal 0. Bepaal hoeveel van deze getallen door 2 deelbaar zijn,
hoeveel door 3 en hoeveel door 6. Toon ook telkens welke getallen en let op meervoud/enkelvoud bij de zinsbouw.
Merk op: een getal dat deelbaar is door 6 is OOK deelbaar door 2 en door 3
*/
public class Hoofdstuk5_oef1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int getal;
        int deelbaar2 = 0;
        String deelbaardoor2="";
        int deelbaar3 = 0;
        String deelbaardoor3="";
        int deelbaar6 = 0;
        String deelbaardoor6="";
        
        do {
        System.out.print("Geef een positief geheel getal (0 om te stoppen) :");
        getal = sc.nextInt();
        if (getal % 2 == 0){
            deelbaar2++;
            deelbaardoor2 += getal + " ";}
        if (getal %3 == 0){
            deelbaar3++;
            deelbaardoor3 += getal + " ";}
        if (getal % 6 == 0){
            deelbaar6++;
            deelbaardoor6 += getal + " ";}
        }while (getal != 0);
        
        System.out.printf("Er %s %d getallen deelbaar door 2, namelijk : %s%n", (deelbaar2 > 1)? "zijn" : "is",deelbaar2,deelbaardoor2);
        System.out.printf("Er %s %d getallen deelbaar door 3, namelijk : %s%n", (deelbaar3 > 1)? "zijn" : "is",deelbaar3,deelbaardoor3);
        System.out.printf("Er %s %d getallen deelbaar door 6, namelijk : %s%n", (deelbaar6 > 1)? "zijn" : "is",deelbaar6,deelbaardoor6);
    }
    
}
