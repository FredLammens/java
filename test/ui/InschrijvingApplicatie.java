
package ui;

import domein.Inschrijving;
import java.util.Scanner;

public class InschrijvingApplicatie {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String antwoord = " ";
        String naam;
        String categorie = " ";
        char categoriechar = categorie.toLowerCase().charAt(0);
        char eersteLetter = antwoord.toLowerCase().charAt(0);
        int inschrijvingenW = 0;
        int inschrijvingenP = 0;
        int inschrijvingenG = 0;
        int broodjesTotaal = 0;
        
        do{
        System.out.println("Zijn er nog inschrijvingen?");
        antwoord = sc.nextLine();
        System.out.println("Wie mag ik inschrijven ?");
        naam = sc.nextLine();
        do{
        System.out.printf("Tot welke categorie behoort %s%n",naam);
        System.out.print("Typ w voor een werknemer, p voor een werknemer met partner,g voor een gast:");
        categorie = sc.nextLine();
        }while(categoriechar == 'w' || categoriechar == 'p' || categoriechar == 'g');
        Inschrijving inschrijving = new Inschrijving(naam,categoriechar);
        do{
        System.out.printf("hoeveel broodjes wil je bestellen (max. %d)",inschrijving.geefAantalPersonen()*5);
        inschrijving.setAantalBroodjes(sc.nextInt());
        }while(inschrijving.getAantalBroodjes() < 0 || inschrijving.getAantalBroodjes() > inschrijving.geefAantalPersonen()*5 );
        
        switch (inschrijving.getCategorie()) {
        case 'w':inschrijvingenW++;
        break;
        case 'p':inschrijvingenP++;
        break;
        case 'g': inschrijvingenG++;
        break;
        }
        broodjesTotaal += inschrijving.getAantalBroodjes();
        
        }while(eersteLetter != 'n');
        System.out.printf("Er komen %d werknemer(s) zonder partner, %d werknemer(s)met partner en %d gast(en) naar de receptie. Er dienen %d broodjes besteld te worden .",inschrijvingenW,inschrijvingenP,inschrijvingenG,broodjesTotaal);
    }
    
}
