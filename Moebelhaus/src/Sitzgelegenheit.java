public class Sitzgelegenheit extends einrichtuntsgegenstand{
    //Attribute
    private boolean Stoffbesatz;

    //Konstruktor
    public Sitzgelegenheit(String name, int jahr, double preis, boolean Stoffbesatz){
        super (name, jahr, preis);
        this.Stoffbesatz=Stoffbesatz;
    }

    public void setStoffbesatz(boolean stoffbesatz) {
        Stoffbesatz = stoffbesatz;
    }
    public boolean getStoffbesatz(){
        return Stoffbesatz;
    }
    public void print(){
        System.out.println("Sitzgelegenheit");
                super.print();
        System.out.println("Stoffbesatz: "+ Stoffbesatz);
    }
}
