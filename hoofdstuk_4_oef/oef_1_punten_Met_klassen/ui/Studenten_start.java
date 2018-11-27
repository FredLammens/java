/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import domein.Studenten_berekeningen;
import java.util.Scanner;

/**
 *
 * @author Biebem
 */
public class Studenten_start {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int totaalStudenten = 0;
        int som = 0;
        int getal;
        int fout = 0;
        while (totaalStudenten <= 9) {
                System.out.print("Geef een eerste getal in op 100: ");
                getal = sc.nextInt();
                if(getal == 0){
                totaalStudenten++;
                System.out.println("euh waarde zelf aanwezig ?");
                }
                if(getal <= 100){
                som += getal;
                totaalStudenten++;
                }else if (fout < 2){
                    System.out.println("Euhm da is een getal groter dan 100 ?");
                    fout++;
                }
                else if (fout == 2){
                    System.out.println("Da is nu al de 3e keer dat u een getal groter dan 100 ingeeft . NOG ENE KEER EN HET IS GEDAAN E !");
                    fout++;
                } else if (fout == 3){
                    System.out.println("Fuck off!");
                    break;}
            }
        if (fout < 4){
        Studenten_berekeningen student = new Studenten_berekeningen();
        int gem = student.gemiddelde(som, totaalStudenten);
        System.out.printf("De totale punten van alle leerlingen bedraagt :%d ", student.getSom());
        System.out.printf("en de gemiddelde is :%d%n", gem);
        if (gem >= 50) 
            System.out.println("goed gedaan je bent erdoor !");
         else 
            System.out.println("Volgende keer beter !");
        }
    }

}
