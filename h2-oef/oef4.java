/*
Een behanger wenst te weten hoeveel rollen papier hij nodig heeft voor het behangen van
een muur zonder deuren of vensters.  1 rol behangpapier is 10 m lang en 50 cm breed. 
De lengte  en  de  breedte  van  de  muur  (=gehele  getallen)  worden  ingevoerd  in  cm
en  het programma moet het aantal rollen meedelen. Let op: als er een rest is, dan bestel je best een extra rol!
*/
package hoofdstuk2_oef;

import java.util.Scanner;

public class oef4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rolLengte = 1000;
        int rolBreedte = 50;
        System.out.print("Geef de hoogte van de muur in cm in: ");
        int muurHoogte = sc.nextInt();
        System.out.print("Geef de breedte van de muur in cm in: ");
        int muurBreedte = sc.nextInt();
        if((muurBreedte*muurHoogte) % (rolLengte * rolBreedte) > 0)
            System.out.printf("Het aantal benodigde rollen = %d%n",(muurBreedte * muurHoogte) / (rolLengte * rolBreedte) + 1);
        else 
            System.out.printf("Het aantal benodigde rollen = %d%n",(muurBreedte * muurHoogte) / (rolLengte * rolBreedte));
    }
    
}
