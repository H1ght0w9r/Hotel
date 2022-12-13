public class Stuhl extends Sitzgelegenheit {


        //Attribute
        private int Beine;

        //Konstruktor
        public Stuhl(String name, int jahr, double preis, boolean Stoffbesatz, int Beine){
            super (name, jahr, preis, Stoffbesatz);
            this.Beine=Beine;
        }

    public void setBeine(int beine) {
        Beine = beine;
    }

    public int getBeine() {
        return Beine;
    }


        public void print(){
            System.out.println("Stühle");
            super.print();
            System.out.println("Beine: "+ Beine);
        }
    }


