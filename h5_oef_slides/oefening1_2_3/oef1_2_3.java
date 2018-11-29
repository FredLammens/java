
package hoofdstuk5_oef;

public class oef1_2_3 {

    public static void main(String[] args) {
        // oef 1 alle gehele getallen tussen 1 en 500 deelbaar door 12
        int getal = 1;
        int getal2 = 500;
        int deelbaar12 = 0; 
        String onevenGetallen = "";
        
        while (getal < 500){
        if (getal %12 == 0){
            deelbaar12++;
            getal++;
        }else 
            getal++;
        }
        System.out.printf("Het aantal getallen deelbaar door 12 %s %d%n" , (deelbaar12 > 1)?"zijn":"is", deelbaar12);
        //oef 2 alle oneven getallen , beginnend bij 51 in dalende volgorde weergegeven 
        while (getal2 >=51 && getal2 <= 500){
            if (getal2 % 2 != 0){
                onevenGetallen += getal2 + " ";
                getal2--;
            }else 
            getal2--;
        }
        System.out.printf("Alle oneven getallen beginnend bij 51 zijn :%s%n",onevenGetallen);
        //oef 3 alfabet weergeven 
        for(int i = 0; i<26 ; i++){
            System.out.print((char)(97 + i)+" ");
        }
        System.out.println("");
        
    }
    
}
