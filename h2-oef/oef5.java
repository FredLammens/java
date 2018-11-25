/*
Bereken hoeveel dagen het nog duurt om terug nieuwjaar te kunnen vieren.
Vraag de huidige datum als een geheel  getal in, in de vorm ddmmjjjj.
(We nemen aan dat elke maand 30 dagen telt.)
*/
package hoofdstuk2_oef;

import java.util.Scanner;

public class oef5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Geef een datum in <ddmmjjjj>: ");
        int datum = sc.nextInt();
        int jaar = datum % 10000;
        int maand = (datum/10000) % 100;
        int dag = datum/1000000;
        System.out.printf("Het duurt nog %d dagen voor het nieuwjaar %d is .",(11 - maand)*30 + (30 - dag),jaar+1);
    }
    
}
