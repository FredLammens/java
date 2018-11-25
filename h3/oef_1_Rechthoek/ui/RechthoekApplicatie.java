
package ui;

import domein.Rechthoek;

public class RechthoekApplicatie {

    public static void main(String[] args) {
        Rechthoek rcht1 = new Rechthoek(2.0,4.5);
        Rechthoek rcht2 = new Rechthoek(-2,6.5);
        System.out.println("De eerste Rechthoek :");
        System.out.printf("Met als lengte %.2f%n",rcht1.getLengte());
        System.out.printf("Met als breedte %.2f%n",rcht1.getBreedte());
        System.out.printf("Met als omtrek %.2f%n",rcht1.berekenOmtrek());
        System.out.printf("Met als oppervlakte %.2f%n",rcht1.berekenOppervlakte());
        System.out.println("De tweede Rechthoek :");
        System.out.printf("Met als lengte %.2f%n",rcht2.getLengte());
        System.out.printf("Met als breedte %.2f%n",rcht2.getBreedte());
        System.out.printf("Met als omtrek %.2f%n",rcht2.berekenOmtrek());
        System.out.printf("Met als oppervlakte %.2f%n",rcht2.berekenOppervlakte());
        
    }
    
}
