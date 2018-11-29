
package hoofdstuk5_oef6;

public class Hoofdstuk5_oef6 {

    public static void main(String[] args) {
        double leeuwen = 50;
        int jaren = 0;
        while(leeuwen < 1000){
        leeuwen += (leeuwen * 0.15);
        jaren++;
        }
        System.out.printf("Het duurt %d jaren voor er meer dan 1000 leeuwen zijn%n",jaren);
    }
    
}
