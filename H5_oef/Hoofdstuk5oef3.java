/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hoofdstuk5oef3;

import java.util.Scanner;

/**
 *
 * @author Biebem
 */
public class Hoofdstuk5oef3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int afstand ;
        do{
        System.out.println("geef een geheel strikt positief aantal kilometer in :");
        afstand = sc.nextInt();
        }while (afstand <= 0);
        for(int i = 40 ;i <= 140 ; i+=10){
        int tijdNodigUur = afstand / i ;
        int tijdNodigMinuten = (afstand % i) * 60 / i;
        //System.out.printf(afstand + "%05d" + i +"%05d" + tijdNodigUur +" u"+ tijdNodigMinuten +" min");
        //System.out.printf("%d%s%5d%s%05d%s%05d%s",afstand,"km",i,"km/u",tijdNodigUur,"u",tijdNodigMinuten,"min");
        System.out.printf("%6d km%6d km/u %6d u %06d min %n" , afstand , i,tijdNodigUur,tijdNodigMinuten);
        }
        
        
    }
    
}
