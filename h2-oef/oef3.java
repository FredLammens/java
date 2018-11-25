/*
Lees  een  geheel  getal  (>999  en  <=9999)  in.    Druk  af  uit  hoeveel  duizendtallen
honderdtallen, tientallen en eenheden het getal bestaat.
*/
package hoofdstuk2_oef;

import java.util.Scanner;

public class oef3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int safe = 0;
        System.out.println("Geef een getal (>999 en <=9999) in");
        int getal = sc.nextInt();
        if (getal/1000 >= 10)
            System.out.printf("je getal %d is groter dan 9999%n", getal);
        else{
        System.out.println("Het getal bestaat uit: ");
        if (getal/1000 !=0){
            System.out.printf("%d duizendtallen%n",getal/1000);
            getal %= 1000;
        }
        if (getal/100 != 0){
            System.out.printf("%d honderdtallen%n",getal/100);
            getal %= 100;
        }
        if (getal/10 != 0){
            System.out.printf("%d tientallen%n",getal/10);
            getal %= 10;
        }
        if (getal/1 !=0 ){
            System.out.printf("%d eenheden%n",getal/1);
            getal %= 1;
        }
    }
    }
    
}
