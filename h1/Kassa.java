
package hoofdstuk1;

public class Kassa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int teBetalen = 45, ontvangenBedrag = 100;
        int terug = ontvangenBedrag - teBetalen;
        System.out.println("Te betalen = "+teBetalen+"\nOntvangen bedrag = "+ontvangenBedrag+"\nTerug = "+ terug);
    }
    
}
