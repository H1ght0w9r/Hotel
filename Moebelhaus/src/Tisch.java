public class Tisch extends einrichtuntsgegenstand{
    //Attribute
    private int anzahlBeine;
    //Konstruktoren
    public Tisch(String name, int jahr, double preis, int anzahlBeine){
        super (name,jahr,preis);
        this.anzahlBeine= anzahlBeine;
    }
    //Methoden
    public void setAnzahlbeine (int Anzahl){
        anzahlBeine=Anzahl;
    }
    public int getAnzahlBeine(){
        return anzahlBeine;
    }
    public void print(){
        System.out.println("-----Tisch-----");
        super.print();
        System.out.println("Anzhal der Beine: "+ anzahlBeine);

    }
}
