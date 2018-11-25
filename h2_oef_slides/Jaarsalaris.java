
package hoofdstuk2.oef_slides;

import java.util.Scanner;

public class Jaarsalaris {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hallo dit is uw jaarsalaris rekenmachine");
        System.out.println("Wat is uw maandsalaris ?");
        int maandsalaris = sc.nextInt();
        int jaarsalaris = maandsalaris *12;
        int vakantiegeld = jaarsalaris * 8 / 100;
        //System.out.println("Uw jaarsalaris is "+jaarsalaris+" € en uw vakantiegeld bedraagt " +vakantiegeld+" €");
        System.out.printf("uw jaarsalaris is %d € en uw vakantiegeld bedraagt %d €",jaarsalaris,vakantiegeld);
    }
    
}
