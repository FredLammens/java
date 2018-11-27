
package hoofdstuk4_oef2;

import java.util.Scanner;

public class Hoofdstuk4_oef2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int deler = -2;
        int getal = 0;
        int teller = 1;
        int deelbaar = 0;
        while (deler < 0){
        System.out.print("Geef de deler in: ");
        deler = sc.nextInt();
        }
        do{
            System.out.printf("Geef getal %d in (of stop met -1): ", teller);
            getal = sc.nextInt();
            teller++;
            if (getal % deler == 0)
                deelbaar++;
        } while (getal != -1);
        System.out.println("");
        System.out.printf("Er %s %d getal deelbaar door %d%n",(deelbaar>1)?"zijn":"is",deelbaar,deler);
    }
    
}
