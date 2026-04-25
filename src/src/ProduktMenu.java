public class ProduktMenu {

    private String kod;
    private String nazwa;
    private double cena;
    private String kategoria;
    private static int liczbaProduktow = 0;

    public ProduktMenu(String kod, String kategoria, double cena, String nazwa) {
        this.kod = kod;
        this.kategoria = kategoria;
        this.cena = cena;
        this.nazwa = nazwa;
        liczbaProduktow++;
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

   public void porownanie(String kodProduktu){
        if ((this.getKod()).equals(kodProduktu)) {
            System.out.println("To jest ten sam produkt!");
       } else {
            System.out.println("To nie jest ten sam produkt!");
        }
   }
   @Override
   public String toString(){
        return "Kod produktu: " + kod + ", Nazwa: " + ", Kategoria: " + kategoria + ", Cena: " + cena;
   }




}
