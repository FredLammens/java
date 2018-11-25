/*
-Vraag een geheel getal aan de gebruiker.
-Als  dit  getal  strikt  positief  is,  trek  er  dan  10  van  af.  Als  dit  getal  negatief  is, vermeerder het dan met 10. Als dit getal gelijk aan nul is, vermeerder het met 1. 
-Schrijf     in     een     volzin     uit     wat     er     gebeurd     is.
*/
package hoofdstuk2_oef;

import java.util.Scanner;

public class oef8 {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.print("Geef een geheel getal in: ");
        int getal = sc.nextInt();
        if (getal % 2 != 0){
            getal += 10;
            System.out.printf("Het gegeven getal was negatief en werd vermeerderd met 10%nHet heeft nu de waarde %d%n",getal);
        }
        else {
            getal -= 10;
            System.out.printf("Het gegeven getal was positief en werd verminderd met 10%nHet heeft nu de waarde %d%n",getal);
        }
        if (getal == 0){
            getal++;
            System.out.println("Het gegeven getal was nul en vermeerderd met 1.\n");
        }
       
    }
    
    
}
