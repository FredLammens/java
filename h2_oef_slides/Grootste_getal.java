
package hoofdstuk2.oef_slides;
import java.util.Scanner;

public class Grootste_getal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Geef een getal in : ");
        int getal = sc.nextInt();
        System.out.print("Geef een tweede getal in : ");
        int getal1 = sc.nextInt();
        System.out.printf(getal > getal1 ? getal+" is groter dan "+getal1 : getal1+" is groter dan "+getal+"%n");
        /*if(getal > getal1)
            System.out.println(getal+" is groter dan "+getal1);
        else 
            System.out.println(getal1+" is groter dan "+getal);*/
    }
    
}
