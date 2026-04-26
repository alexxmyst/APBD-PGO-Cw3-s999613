import java.util.Objects;

public class ProduktMenu {

    private String kod;
    private String nazwa;
    private double cena;
    private String kategoria;
    private static int liczbaProduktow = 0;

    public ProduktMenu(String kod, String kategoria, double cena, String nazwa) {
        this.setKod(kod);
        this.setKategoria(kategoria);
        this.setCena(cena);
        this.setNazwa(nazwa);
        ProduktMenu.liczbaProduktow++;
    }

    public static int getLiczbaProduktow() {
        return liczbaProduktow;
    }

    public String getKod() {
        return kod;
    }

    public String getNazwa() {
        return nazwa;
    }

    public double getCena() {
        return cena;
    }

    public String getKategoria() {
        return kategoria;
    }

    public void setKategoria(String kategoria) {
        if (kategoria.isEmpty()){
            System.out.println("Kategoria nie moze być pusta!");
        }
        this.kategoria = kategoria;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public void setKod(String kod) {
        this.kod = kod;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof ProduktMenu that)) return false;
        return Objects.equals(kod, that.kod);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(kod);
    }

    @Override
   public String toString(){
        return "Kod produktu: " + kod + ", Nazwa: " + nazwa + ", Kategoria: " + kategoria + ", Cena: " + cena;
   }

}
