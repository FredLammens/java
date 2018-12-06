
package hoofdstuk5_oef9;

import java.util.Scanner;

public class Hoofdstuk5_oef9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("wat is het cijfer");
        int i = sc.nextInt();
        int k;
        switch (i){
            case 1: k = 3;
            break;
            case 2: k = 6;
            break;
            case 3 : case 4 : k= 10;
            break;
            default: k = 20;
            break;
        }
        System.out.println(k);
//deel 2
        int y = 0;
        System.out.println("Wat is je waarde voor x");
        int x = sc.nextInt();
        switch(x){
            case 100:case 150:case 170:case 199:
                y++;
        }
        System.out.println(y);
    }
}
