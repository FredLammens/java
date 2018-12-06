/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domein;

import java.util.Scanner;
import ui.MijnGetal;

/**
 *
 * @author Biebem
 */
public class MijnGetalApplicatie {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int getal;
        do{
            System.out.print("geef een positief getal in ");
            getal =sc.nextInt();
        }while(getal < 0);
        MijnGetal mg = new MijnGetal(getal);
        System.out.println(mg.berekenFaculteit()); 
    }
    
}
