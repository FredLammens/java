
package hoofdstuk5_oef5;

import java.util.Scanner;

public class Hoofdstuk5_oef5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int eersteGetal;
        do{
            System.out.print("Geef een getal in verschillend van 1000 en niet deelbaar door 12 ");
            eersteGetal = sc.nextInt();
        }while(eersteGetal == 1000 || eersteGetal % 12 == 0);
        int tweedeGetal;
        do{
            System.out.print("Geef een getal in groter dan het eerste getal: ");
            tweedeGetal = sc.nextInt();
        }while(tweedeGetal < eersteGetal);
    }
    
}
