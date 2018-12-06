/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hoofdstuk5_oef2;

import java.util.Scanner;

/**
 *
 * @author Biebem
 */
public class Hoofdstuk5_oef2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Geef een postnummer in");
        int postnummer = sc.nextInt();
        //if (postnummer % 1000 >10 && postnummer % 1000 < 0){
       
       // }
        String stad = "";
        switch (postnummer) {
            case 9000:
                stad = "Gent";
                break;
            case 2000:
                stad = "Antwerpen";
                break;
            case 1000:
                stad = "Brussel";
                break;
            case 9200:
                stad = "Dendermonde";
                break;
            case 8500:
                stad = "Kortijk";
                break;
            case 9700:
                stad = "Oudenaarde";
                break;
            case 2300:
                stad = "Turnhout";
                break;

        }
        if (stad.length() != 0){
        System.out.println("Postnummer " + postnummer + " komt overeen met de stad " + stad);
        }else {
        System.out.println("Postnummer " + postnummer + " bestaat niet of komt overeen met een stad die niet in de tabel is opgenomen ");
        }
    }

}
