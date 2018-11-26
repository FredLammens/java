
package hoofdstuk4_oef1;

public class Hoofdstuk4_oef5 {

    public static void main(String[] args) {
        int x = 1;
        System.out.printf("%8s%8s%8s%8s%n","N","10*N","100*N","1000*N");
        while (x < 6){
            System.out.printf("%8d%8d%8d%8d%n",x,x*10,x*100,x*1000);
            x++;
        }
    }
    
}
