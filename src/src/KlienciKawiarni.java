import java.util.Objects;

public class KlienciKawiarni {

    private int idKlienta;
    private String imie;
    private String nazwisko;
    private String email;

    public KlienciKawiarni(int idKlienta, String imie, String nazwisko, String email) {
        this.setIdKlienta(idKlienta);
        this.setImie(imie);
        this.setNazwisko(nazwisko);
        this.setEmail(email);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email.isEmpty()) {
            System.out.println("Email nie moze być pusty!");
        }
        this.email = email;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        if (nazwisko.isEmpty()) {
            System.out.println("Pole nazwisko nie moze być puste!");
        }
        this.nazwisko = nazwisko;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        if (imie.isEmpty()) {
            System.out.println("Pole imie nie moze być puste!");
        }
        this.imie = imie;
    }

    public int getIdKlienta() {
        return idKlienta;
    }

    public void setIdKlienta(int idKlienta) {
        if (idKlienta < 0) {
            System.out.println("ID nie moze być liczbą ujemną!");
        }
        this.idKlienta = idKlienta;
    }

    public void wypiszDane(){
        System.out.println("idKlienta: " + idKlienta + ", Imie: " + imie + ", Nazwisko: " + nazwisko + ", Email" + email);
    }

    @Override
    public String toString() {
        return "KlienciKawiarni{" +
                "idKlienta=" + idKlienta +
                ", imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof KlienciKawiarni that)) return false;
        return idKlienta == that.idKlienta;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(idKlienta);
    }

}
