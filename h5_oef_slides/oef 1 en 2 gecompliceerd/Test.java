
package ui;
import java.util.*;

public class Test {

    public static void main(String[] args) {
        ArrayList<Integer> t = new ArrayList<Integer>();
        for (int i = 1; i <= 5; i++) {
            t.add(i);
        }
        HulpMethoden.reverseArrayList(t);
        for (int j = 0; j < t.size(); j++) {
            System.out.print(t.get(j)+" ");
            
        }
    }
    
}
