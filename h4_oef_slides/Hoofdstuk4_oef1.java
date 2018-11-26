
package hoofdstuk4_oef1;

import java.util.Scanner;

public class Hoofdstuk4_oef1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int getal;
        int even = 0;
        int deelbaar3 = 0;
        int som = 0;
        int i = 0;
        String zijnEven ="";
        String zijnDeelbaar3="";
        while (i < 5){
            System.out.print("Geef een getal in: ");
            getal = sc.nextInt();
            som += getal;
            i++;
        if(getal %2 == 0){
            even++;
        }
        if (getal %3 == 0){
            deelbaar3++;
        }
        
        }
        if(even > 1)
        zijnEven = "zijn";
        else if (even <= 1)
            zijnEven = "is";
        if(deelbaar3 > 1)
        zijnDeelbaar3 = "zijn";
        else if (deelbaar3 <= 1)
            zijnDeelbaar3 = "is";
        
        System.out.printf("De som van de getallen is : %d%n"
                + "%d getallen %s even %n"
                + "%d getallen %s deelbaar door 3 %n", som,even,zijnEven,deelbaar3,zijnDeelbaar3);
    }
    
}
