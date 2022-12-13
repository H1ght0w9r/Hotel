public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        einrichtuntsgegenstand gegenstand1 = new einrichtuntsgegenstand("Kleiner Tisch",2004,569.99);
        gegenstand1.print();
        double preis = gegenstand1.getVerkausfspreis()/100;  //((Math.round(Tisch.getVerkausfspreis())*100))/100;
        System.out.println("Verkaufspreis: "+preis);

        einrichtuntsgegenstand runderStuhl= new einrichtuntsgegenstand("runder Stuhl", 2003,80.00);
        runderStuhl.print();

        Tisch tisch1= new Tisch("Super Duper", 2024,174.31,5);
        tisch1.print();

        Sitzgelegenheit sitzgelegenheit1 = new Sitzgelegenheit("komfi", 1999,2000.50,true);
        sitzgelegenheit1.print();

        Stuhl stuhl1= new Stuhl("Willy",1000,10.50,true,4);
        stuhl1.print();
    }
}