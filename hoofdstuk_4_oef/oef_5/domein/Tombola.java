
package domein;

public class Tombola {
    private String verenigingnaam;
    private int aantalLotjes;
    private double prijsPerLot;
    
    //getters en setters
    public String getVerenigingnaam(){
    return verenigingnaam;
    }
    public int getAantalLotjes(){
    return aantalLotjes;
    }
    public double getPrijsPerLot(){
    return prijsPerLot;
    }
    
    private void setVerenigingnaam(String verenigingnaam){
    this.verenigingnaam = verenigingnaam;
    }
    public void setAantalLotjes(int aantalLotjes){
        if (aantalLotjes > 0)
            this.aantalLotjes = aantalLotjes;
    }
    private void setPrijsPerLot(double prijsPerLot){
        if (prijsPerLot > 0 && prijsPerLot < 5)
            this.prijsPerLot = prijsPerLot;
        else 
            this.prijsPerLot = 1.0;
    }
    //methoden en constructoren
    public Tombola(String verenigingnaam,int aantalLotjes,double prijsPerLot){
        setVerenigingnaam(verenigingnaam);
        setAantalLotjes(aantalLotjes);
        setPrijsPerLot(prijsPerLot);
    
    }
    public double geefPrijsVanaf5Lotjes(){
    return prijsPerLot - (prijsPerLot * 0.10);
    }
    public double geefPrijsVanaf10Lotjes(){
    return prijsPerLot - (prijsPerLot *0.25);
    }
}
