
package ui;

import domein.Rekenmachine;
import java.util.Scanner;


public class rekenmachineApplicatie {

    public static void main(String[] args) {
        Rekenmachine calc = new Rekenmachine();
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome bij de rekenmachine");
        System.out.print("Geef een getal a.u.b. :");
        double getal = sc.nextDouble();
        calc.telOp(getal);
        System.out.print("Geen een tweede getal a.u.b.");
        double getal2 = sc.nextDouble();
        calc.vermenigvuldig(getal2);
        System.out.printf("%.2f x %.2f = %.2f%n",getal,getal2,calc.getResultaat());
    }
    
}
