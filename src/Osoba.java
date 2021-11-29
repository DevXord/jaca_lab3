/* zad.1
         a) Stworzyć klasę Osoba z polami prywatnymi:
         - imie (String),
         - nazwisko (String),
         - indeks (Integer)

         b) stworzyc konstruktory, gettery i settery
         c) napisać metodę w klasie Osoba która zwróci informację o osobie,
      */


class Osoba {
    String imie;
    String nazwisko;
    Integer indeks;

    public Osoba(String imie) {
        this.imie = imie;
    }

    public Osoba(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public Osoba(String imie, String nazwisko, Integer indeks) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.indeks = indeks;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public Integer getIndeks() {
        return indeks;
    }

    public void setIndeks(Integer indeks) {
        this.indeks = indeks;
    }

    @Override
    public String toString() {
        return "Imie: " + imie + ", Nazwisko: " + nazwisko + ", Numer indeksu: " + indeks;
    }
}
