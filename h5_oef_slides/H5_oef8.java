
package h5_oef8;

public class H5_oef8 {
// A
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
        System.out.println(); 
// B
        for (int i = 0;i<= 10;i++){
            for(int j = 0;j<=i;j++){
                System.out.print(' ');
            }
            for(int k =1;k<(10-i);k++){
                System.out.print('*');
            }
            System.out.println();
        }
        System.out.println();
// C
        for (int i = 0;i<10;i++){
            for(int j = 1; j < (10-i); j++){
                System.out.print('*');
            }
            System.out.println();
        }
        System.out.println();
//D
        for (int i = 0;i<= 10;i++){
            for(int k =0;k<(10-i);k++){
                System.out.print(' ');
            }
            for(int j = 0;j<=i;j++){
                System.out.print('*');
            }
            System.out.println();
        }
        System.out.println();
    }
    
}
