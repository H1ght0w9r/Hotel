public class einrichtuntsgegenstand {
    //Attribute
    private String name;
    private int produktionsjahr;
    private double preis;

    //Konstruktoren
    public einrichtuntsgegenstand(){
        name="NN";
        produktionsjahr=0;
        preis=0.0;
    }
    public einrichtuntsgegenstand(String name, int produktionsjahr, double preis){
        this.name=name;
        this.produktionsjahr=produktionsjahr;
        this.preis=preis;
    }


    //Methoden
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setProduktionsjahr(int produktionsjahr) {
        this.produktionsjahr = produktionsjahr;
    }

    public int getProduktionsjahr() {
        return produktionsjahr;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }

    public double getPreis() {
        return preis;
    }

    public void print(){
        System.out.println("Einrichtungsgegenstände");
        System.out.println("Name: " + name);
        System.out.println("Produktionsjahr: "+ produktionsjahr);
        System.out.println("Preis: " +preis);

    }
    public double getVerkausfspreis(){
        return Math.round((1.15 * preis)*100);
    }
}//end class
