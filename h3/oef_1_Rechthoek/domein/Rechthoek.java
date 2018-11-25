
package domein;

public class Rechthoek {
    private double lengte;
    private double breedte;
    //getters en setters
    public final void setLengte(double lengte){
    if (lengte > 0.0 && lengte < 20.0 )
        this.lengte = lengte;
    else this.lengte = 1;
    }
    public final double getLengte(){
    return lengte;
    }
    public final void setBreedte(double breedte){
    this.breedte = breedte;
    }
    public final double getBreedte(){
    return breedte;
    }
    //constructors en methoden 
    public Rechthoek(double lengte,double breedte){
    setLengte(lengte);
    setBreedte(breedte);
    }
    public double berekenOmtrek(){
    return lengte + breedte *2;
    }
    public double berekenOppervlakte(){
    return lengte * breedte;
    }
}
