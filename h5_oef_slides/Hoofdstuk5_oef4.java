
package hoofdstuk5_oef4;

import java.util.Scanner;

public class Hoofdstuk5_oef4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int getal;
        do{
            System.out.print("Geef een strikt negatief oneven getal in ");
            getal = sc.nextInt();
        }while(getal == 0 || getal > 0);
    }
    
}
