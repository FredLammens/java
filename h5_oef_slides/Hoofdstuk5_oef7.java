
package hoofdstuk5_oef7;

import java.util.Scanner;

public class Hoofdstuk5_oef7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int getal ;
        int aantalGetallen = 0;
        int totaal = 0 ;
        int gem ;
        do{
            System.out.print("Geef een geheel getal in(-1 om te stoppen): ");
            getal = sc.nextInt();
            if(getal != -1){
                aantalGetallen++;
                totaal += getal;}
        }while(getal != -1 && aantalGetallen != 10);
        if(aantalGetallen > 0){
            gem = totaal / aantalGetallen;
            System.out.println("Het gemiddelde is :"+gem);
        }else 
            System.out.println("Er zijn geen getallen ingegeven!");
        
    }
    
}
