/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

/**
 *
 * @author Biebem
 */
public final class MijnGetal {

    private int waarde;
    public int mijnGetal;

    public MijnGetal(int al) {
        setWaarde(al);
    }

    public void setWaarde(int waarde) {
        if (waarde <= 0|| waarde >= 20) {
            this.waarde = waarde;
        } else {
            System.out.println("waarde is ongeldig");
        }
    }

    public int getWaarde() {
        return waarde;
    }

    public int getMijnGetal() {
        return mijnGetal;
    }

    public String bepaalUitvoer() {
        return "x";
    }

    public String berekenDelers() {
        return "y";
    }

    public long berekenFaculteit() {
        long fac = 1;
        for(int i = waarde; i>0 ; i--){
        fac*=i;
        }
        return fac;
    }
}
