
package ui;

import domein.Rechthoek2;
import java.util.Scanner;

public class Rechthoek2Applicatie {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Geef de lengte van een rechthoek: ");
        double lengte = sc.nextDouble();
        System.out.println("Geef de breedte van een rechthoek");
        double breedte = sc.nextDouble();
        Rechthoek2 rcht = new Rechthoek2(lengte,breedte,10,50);
        int linkerbovenhoekX = rcht.getLinkerbovenhoekX();
        int linkerbovenhoekY = rcht.getLinkerbovenhoekY();
        int linkeronderhoekX = rcht.getLinkerbovenhoekX() ;
        int linkerondderhoekY = rcht.getLinkerbovenhoekY() - (int) breedte;
        int rechterbovenhoekX = rcht.getLinkerbovenhoekX() + (int)breedte;
        int rechterbovenhoekY = rcht.getLinkerbovenhoekX();
        int rechteronderhoekX = rcht.getLinkerbovenhoekX() + (int) breedte;
        int rechteronderhoekY = rcht.getLinkerbovenhoekY() - (int) breedte;
        System.out.printf("Coordinatenparen van de rechthoek met lengte %.2f en breedte %.2f%n",rcht.getLengte(),rcht.getBreedte());
        System.out.printf("Linkerbovenhoek \t : (%d,%d)%n",linkerbovenhoekX,linkerbovenhoekY);
        System.out.printf("Linkeronderhoek \t : (%d,%d)%n",linkeronderhoekX,linkerondderhoekY);
        System.out.printf("Rechterbovenhoek \t : (%d,%d)%n",rechterbovenhoekX,rechterbovenhoekY);
        System.out.printf("Rechteronderhoek \t : (%d,%d)%n",rechteronderhoekX,rechteronderhoekY);
    }
    
}
