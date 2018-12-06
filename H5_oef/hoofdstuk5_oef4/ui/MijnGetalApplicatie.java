
package ui;

import domein.MijnGetal;
import java.util.Scanner;

public class MijnGetalApplicatie {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int waarde;
        do{
        System.out.print("Geef een positief geheel getal, keliner dan 20 in:");
        waarde = sc.nextInt();
        }while(waarde >= 20);
        MijnGetal getal = new MijnGetal(waarde);
        System.out.printf("%d! = %d%n",waarde,getal.berekenFaculteit());
    }
    
}
