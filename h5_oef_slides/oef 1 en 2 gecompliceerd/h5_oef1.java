
package ui;

import java.util.*;

public class h5_oef1 {

    public static void main(String[] args) {
        int getal = 1;
        int deelbaar12 = 0;
        ArrayList <Integer> arrayOnevenList = new ArrayList<Integer>();
        while (getal < 500){
        if (getal % 12 == 0)
            deelbaar12++;
        if (getal % 2 != 0 && getal >=51) //voor alle getallen tussen 51 en 500 check of oneven en steek in arrayList
            arrayOnevenList.add(getal);
        getal++;
        }
        HulpMethoden.reverseArrayList(arrayOnevenList);
        System.out.print("De getallen tussen 51 en 500 en oneven zijn :");
        arrayOnevenList.forEach((n) -> print(n));
        System.out.println("");
        System.out.printf("Er zijn %d getallen tussen 1 en 500 deelbaar 12%n",deelbaar12);
        
    }
    public static void print(int s)
    {
     System.out.print(s+ " ");
    }
    
}