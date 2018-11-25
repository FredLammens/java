
package domein;

public class Rekenmachine {
    private double resultaat ;
    //getters en setters
    public double getResultaat(){
    return resultaat;
    }
    //constructors en methoden 
    public void telOp(double getal){
        resultaat += getal;
    }
    public void trekAf(double getal){
        resultaat -= getal;
    }
    public void vermenigvuldig(double getal){
        resultaat *= getal;
    }
    public void deelDoor(double getal){
        resultaat /= getal;
    }
    public void clear(){
        resultaat = 0.0;
    }
}
