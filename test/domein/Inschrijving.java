
package domein;

public final class Inschrijving {
    private String naam;
    private char categorie;
    private int aantalBroodjes;
//getters en setters
    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public char getCategorie() {
        return categorie;
    }

    public void setCategorie(char categorie) {
        switch (categorie) {
            case 'w':
                this.categorie = categorie;
                break;
            case 'p':
                this.categorie = categorie;
                break;
            case 'g':
                this.categorie = categorie;
                break;
            default:
                this.categorie = 'g';
                break;
        }
    }

    public int getAantalBroodjes() {
        return aantalBroodjes;
    }

    public void setAantalBroodjes(int aantalBroodjes) {
        if (aantalBroodjes > 0 && aantalBroodjes <= geefAantalPersonen()*5)
            this.aantalBroodjes = aantalBroodjes;
        this.aantalBroodjes = geefAantalPersonen()*2;
    }
//contructoren en methoden
    public Inschrijving(String naam,char categorie){
    setNaam(naam);
    setCategorie(categorie);
    }
    public int geefAantalPersonen(){
        int aantalPersonen = 0;
    switch (categorie){
        case 'w': case 'g': aantalPersonen = 1;
        break;
        case 'p': aantalPersonen = 2;
        break;
    }
    return aantalPersonen;
    }
    
}
