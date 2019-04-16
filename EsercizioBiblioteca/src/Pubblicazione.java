public class Pubblicazione {
    private String titolo;
    private String autore;
    private float prezzo;
    private int numeroPagine;


    public Pubblicazione(String titolo, String autore, float prezzo) {
        this.titolo = titolo;
        this.autore = autore;
        this.prezzo = prezzo;
        this.numeroPagine = (int)(this.prezzo/0.10);
    }

    public String getTitolo() {
        return titolo;
    }

    public String getAutore() {
        return autore;
    }

    public float getPrezzo() {
        return prezzo;
    }

    public int getNumeroPagine() {
        return numeroPagine;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public void setPrezzo(float prezzo) {
        this.prezzo = prezzo;
    }

    public void setNumeroPagine(int numeroPagine) {
        this.numeroPagine = numeroPagine;
        float price = (float)(numeroPagine * 0.10);
        this.setPrezzo(price);
    }

    @Override
    public String toString() {
        return "Titolo del libro: " + titolo +
                "Autore del libro: " + autore +
                "Prezzo del libro: " + prezzo +
                "Numero di pagine presenti: " + numeroPagine;
    }
}
