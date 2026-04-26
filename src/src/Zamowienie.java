import java.util.ArrayList;

public class Zamowienie {

    private int numerZamowienia;
    private KlienciKawiarni klient;
    private ArrayList<ProduktMenu> produkty = new ArrayList<>();
    private boolean oplacone = false;
    private static int kolejnyNumer = 1;

    public Zamowienie(KlienciKawiarni klient) {
        this.klient = klient;
        this.numerZamowienia = kolejnyNumer++;
    }



    public void dodajProdukt(ProduktMenu produkt) {
        (this.produkty).add(produkt);
    }
    public double policzWartosc() {
        double suma = 0;
        for (ProduktMenu produkt : produkty) {
        suma += produkt.getCena();
        }
        return suma;
    }

    public int policzLiczbeProduktow() {
       return produkty.size();
    }

    public void oznaczJakoOplacone() {
        this.oplacone = true;
    }

    public void setOplacone() {
        this.oplacone = true;
    }

    @Override
    public String toString() {
        return "Zamowienie{" +
                "oplacone=" + oplacone +
                ", numerZamowienia=" + numerZamowienia +
                ", klient=" + klient +
                ", produkty=" + produkty +
                '}';
    }
    public static int pobierzKolejnyNumer () { return kolejnyNumer;
    }
}
