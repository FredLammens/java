
package domein;

public class Driehoek {
    private int a;
    private int b;
    private int c;
//getters en setters 
    public int getA() {
        return a;
    }

    public final void setA(int a) {
        if(a>0)
        this.a = a;
        else
        this.a = 0;
    }

    public int getB() {
        return b;
    }

    public final void setB(int b) {
        if(b>0)
        this.b = b;
        else
        this.b = 0;
    }

    public int getC() {
        return c;
    }

    public final void setC(int c) {
        if(c>0)
        this.c = c;
        else
        this.c = 0;
    }
//methoden en constructoren 
    public boolean isRechtHoekigeDriehoek(){
    a = getA();
    b = getB();
    c = getC();
    
        return (a*a)+(b*b)==(c*c);
    }
    public Driehoek(int a ,int b,int c){
        setA(a);
        setB(b);
        setC(c);
    }
}
