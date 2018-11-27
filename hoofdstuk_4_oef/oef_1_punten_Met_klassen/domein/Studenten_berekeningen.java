
package domein;

public class Studenten_berekeningen {
    int som;
    int aantal;
    //getters en setters
    public int getSom() {
        return som;
    }

    public void setSom(int som) {
        this.som = som;
    }
    //constructoren en methoden 
    public final int gemiddelde (int som,int aantal){
    this.som = som;
    this.aantal = aantal;
    return som/aantal;
    }
    
}
