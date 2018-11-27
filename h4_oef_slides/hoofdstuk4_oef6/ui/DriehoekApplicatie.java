package ui;

import domein.Driehoek;
import java.util.Scanner;

public class DriehoekApplicatie {

    public static void main(String[] args) {
        int keer = 1;
        while (keer < 4){
        int zijde1;
        int zijde2;
        int zijde3;
        Scanner sc = new Scanner(System.in);
        System.out.printf("Driehoek %d:%n",keer);
        System.out.print("Geef een geheel getal verschillend van 0 voor de eerste zijde : ");
        zijde1 = sc.nextInt();
        System.out.print("Geef een geheel getal verschillend van 0 voor de tweede zijde : ");
        zijde2 = sc.nextInt();
        System.out.print("Geef een geheel getal verschillend van 0 voor de derde zijde : ");
        zijde3 = sc.nextInt();
        Driehoek driehoek1 = new Driehoek(zijde1,zijde2,zijde3);
        if (driehoek1.isRechtHoekigeDriehoek() == true)
            System.out.printf("De driehoek met zijden %d , %d , %d is rechthoekig%n%n",zijde1,zijde2,zijde3);
        else 
            System.out.printf("De driehoek met zijden %d , %d , %d is niet rechthoekig%n%n",zijde1,zijde2,zijde3);
        keer++;
        }
    }
    
}
