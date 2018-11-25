
package ui;

import domein.Account;
import java.util.Scanner;

public class AccountApplicatie {

    public static void main(String[] args) {
        Account rekeningnummer = new Account("Frederic",40.56);
        Account rekeningnummer2 = new Account("Luckas",4.20);
        Scanner sc = new Scanner(System.in);
        System.out.print("Geef deposit bedrag voor account1:");
        double bedrag = sc.nextDouble();
        System.out.printf("Het bedrag %.2f wordt gestort voor account1%n",bedrag);
        rekeningnummer.stort(bedrag);
        System.out.printf("Geef deposit bedrag voor account2%n");
        double bedrag2 = sc.nextDouble();
        System.out.printf("Het bedrag %.2f wordt gestort voor account2%n",bedrag2);
        rekeningnummer2.stort(bedrag);
        double totBedrag = rekeningnummer.getBalans();
        double totBedrag2 = rekeningnummer2.getBalans();
        System.out.printf("De rekeninen bedragen nu voor account1: %.2f en voor account2: %.2f%n",totBedrag,totBedrag2);
    }
    
}
