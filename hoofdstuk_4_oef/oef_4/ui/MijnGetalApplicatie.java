
package ui;

import domein.MijnGetal;
import java.util.Scanner;

public class MijnGetalApplicatie {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Geef positief, van 0 verschillend geheel getal in: ");
        int getal = sc.nextInt();
        MijnGetal getal1 = new MijnGetal(getal);
        System.out.printf("De delers zijn: %s%n",getal1.berekenDelers());
    }
    
}
