
package ui;

import java.util.*;

public class HulpMethoden {
    //methode voor string om te draaien 
    public static String reverseString(String s){
    char[] tempArray = s.toCharArray(); //string omzetten met toCharArray methode
    int links , rechts = 0; // array scannen van beide kanten .
    rechts = tempArray.length -1;
    //gaat door waarden van links naar rechts en van rechts naar links
        for (links = 0;  links < rechts ; links++,rechts--) {
            //temporary waarde om het in te kunnen stoppen.
          char temp = tempArray[links];
          //zet waarde rechts in waarde van links
          tempArray[links] = tempArray[rechts];
          //zet temporary waarde links in op rechts
          tempArray[rechts] = temp;
          
        }
        String str = new String(tempArray);
        return str;
        //uitlezen array en teruggeven als string
        /* werkt niet => char kun je niet concatinaten tot string 
        String resultaat = "";
        for (int i = 0;i<=tempArray.length; i++){
            resultaat += tempArray[i];
        }
        return resultaat; 
        */
    }
    //methode reverseArrayList 
   public static ArrayList<Integer> reverseArrayList(ArrayList<Integer> t){
        int links , rechts = 0;
        rechts = t.size() - 1;
        for (links = 0;links < rechts ; links++,rechts--){
        int temp = t.get(links);
        t.set(links ,t.get(rechts));
        t.set(rechts,temp);
        }
        return t;
        }  
   //mehode reverseArray 
    public static int[] reverseArray(int[] t){
        int links , rechts = 0;
        rechts = t.length - 1;
        for (links = 0;links < rechts ; links++,rechts--){
        int temp = t[links];
        t[links] = t[rechts];
        t[rechts] = temp;
        }
        return t;
        }
    }