
package h5_oefeningen;

import java.util.*;

public class h5_oef1 {

    public static void main(String[] args) {
        int getal = 1;
        int deelbaar12 = 0;
        List <Integer> arrayOnevenList = new ArrayList<>();
        while (getal < 500){
        if (getal % 12 == 0)
            deelbaar12++;
        if (getal % 2 != 0 && getal >=51) //voor alle getallen tussen 51 en 500 check of oneven en steek in arrayList
            arrayOnevenList.add(getal);
        getal++;
        }
        /*System.out.println("De getallen tussen 51 en 500 die oneven zijn :");
        for (int i : HulpMethoden.reverseArray(arrayOneven)){
            System.out.printf(" %d ", i);
        }
        System.out.println();*/ // via array => nog arrayList omzetten naar array met naam arrayOneven
        
        
        System.out.printf("Er zijn %d getallen tussen 1 en 500 deelbaar 12%n",deelbaar12);
    }
    
}
