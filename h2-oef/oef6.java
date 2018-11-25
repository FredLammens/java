/*
Voer een geheel getal in. Vermenigvuldig dit getal met 1, 10, 100, 1000 en 10000.
Toon het resultaat van deze berekeningen in tabelvorm met bijhorende titel 
en aligneer telkens rechts in een veldbreedte van 10 posities:
*/
package hoofdstuk2_oef;

import java.util.Scanner;

public class oef6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Geef een positief getal in: ");
        int getal = sc.nextInt();
        System.out.printf("%8d%8d%8d%8d%8d%n",1,10,100,1000,10000);
        System.out.printf("%8d%8d%8d%8d%8d%n",1*getal,10*getal,100*getal,1000*getal,10000*getal);
    }
    
}
