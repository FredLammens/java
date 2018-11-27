/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.util.Scanner;

/**
 *
 * @author Biebem
 */
public class Studenten_punten_start {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int totaal = 0;
        int getal ;
        int i = 0;
        Scanner sc = new Scanner(System.in);
        while(i <= 9){
        System.out.print("Enter Grade: ");
        getal = sc.nextInt();
        totaal += getal;
        i++;
        }
        int gemiddelde = totaal / i;
        System.out.println("");
        System.out.printf("Total of all 10 grades is : %d%n" , totaal);
        System.out.printf("Class average is :%d%n",gemiddelde);
    }
    
}
