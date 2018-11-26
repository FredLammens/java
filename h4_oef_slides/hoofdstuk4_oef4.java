
package hoofdstuk4_oef1;

import java.util.Scanner;

public class hoofdstuk4_oef4 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int getal = 1;
        int kleinste = Integer.MAX_VALUE;
        int grootste = Integer.MIN_VALUE;
        while (getal != 0){
            System.out.print("Geef een getal (0 om af te sluiten) in: ");
            getal = sc.nextInt();
            if(getal !=0 && getal < kleinste)
                kleinste = getal;
            if (getal != 0 && getal > grootste)
                grootste = getal;
        }
        System.out.printf("Het grootste getal is: %d en het kleinste getal is: %d%n",grootste,kleinste);
    }
    
}
