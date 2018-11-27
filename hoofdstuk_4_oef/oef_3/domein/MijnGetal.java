
package domein;

public class MijnGetal {
    private int waarde;
    //getters en setters
    public int getWaarde(){
    return waarde;
    }
    private void setWaarde(int waarde){
        if (waarde >0)
        this.waarde = waarde;
    }
    //constructoren en methoden
    public MijnGetal(int waarde){
    setWaarde(waarde);
    }
    public String bepaalUitvoer(){
    int getal = getWaarde(); // kan ook gwn waarde intypen want in zelfde klasse 
    String outputstring ="";
    while (getal != 1){
        if (getal % 2 == 0)
            getal /= 2;
        else {
            getal *= 3;
            getal++;}
        outputstring += getal + " ";
    }
        return outputstring;
    }
}
