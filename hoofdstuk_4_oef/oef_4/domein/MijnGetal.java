
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
    public String berekenDelers(){
    int getal = waarde;
    int deler = 2 ;
    String result = "1";
    while (deler <= getal/2){
        if(getal%deler == 0){
            result +=","+deler;
            deler++;}
        else
            deler++;
    }
    result +=" en " + getal;
    return result;
    }
}
