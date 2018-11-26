
package hoofdstuk4_oef1;

import java.util.Scanner;

public class Hoofdstuk4_oef3 {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double getal = 0;
    int som = 0;
    int aantalGetallen = 0 ;
    
    while (getal != -1){
        System.out.print("Geef een getal (-1 om te stoppen) in : ");
        getal = sc.nextDouble();
        if (getal<0 && getal != -1){
        som += getal;
        aantalGetallen++;
        }
        
    }
    double gemiddelde = som/aantalGetallen;
        if(som != 0)
        System.out.printf("Het gemiddelde van alle negatieve getallen zijn %.3f%n",gemiddelde);
        else
            System.out.println("Er werden geen negatieve getallen ingevoerd");
    }
    
}
