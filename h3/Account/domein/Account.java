
package domein;

public class Account {
    private double balans;
    private String naam;
    //gettters en setters
    private void setBalans(double balans){
        if(balans > 0.0)
        this.balans = balans;
    }
    public double getBalans(){
    return balans;
    }
    private void setNaam(String naam){
    this.naam = naam;
    }
    public String getNaam(){
    return naam;
    }
    //constructoren
    public Account(String naam,double balans){
    setNaam(naam);
    setBalans(balans);
    }
    public void stort(double bedrag){
        if(bedrag > 0.0)
        balans += bedrag;
    }
}
