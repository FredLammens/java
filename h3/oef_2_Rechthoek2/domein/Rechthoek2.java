
package domein;

public class Rechthoek2 {
    private double lengte;
    private double breedte;
    private int linkerbovenhoekX;
    private int linkerbovenhoekY;
//getters en setters
    public double getLengte() {
        return lengte;
    }

    public final void setLengte(double lengte) {
        this.lengte = lengte;
    }

    public double getBreedte() {
        return breedte;
    }

    public final void setBreedte(double breedte) {
        this.breedte = breedte;
    }

    public int getLinkerbovenhoekX() {
        return linkerbovenhoekX;
    }

    public final void setLinkerbovenhoekX(int linkerbovenhoekX) {
        this.linkerbovenhoekX = linkerbovenhoekX;
    }

    public int getLinkerbovenhoekY() {
        return linkerbovenhoekY;
    }

    public final void setLinkerbovenhoekY(int linkerbovenhoekY) {
        this.linkerbovenhoekY = linkerbovenhoekY;
    }
//constructoren en methoden 
    public Rechthoek2(double lengte,double breedte,int linkerbovenhoekX,int linkerbovenhoekY){
    setLengte(lengte);
    setBreedte(breedte);
    setLinkerbovenhoekX(linkerbovenhoekX);
    setLinkerbovenhoekY(linkerbovenhoekY);
    }
    public double berekenOmtrek(){
    return lengte+breedte*2;
    }
    public double berekenOppervlakte(){
    return lengte * breedte;
    }
}
