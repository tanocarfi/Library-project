
public class Scaffale {
    private Pubblicazione[] pubblicazioni;
    private int numeroPubblicazioni;
    private int posizione;
    private Pubblicazione pubblicazione;
    private String titolo;
    private int id;

    public Scaffale(int id, int numeroPubblicazioni) {
        this.id = id;
        this.pubblicazioni = new Pubblicazione[numeroPubblicazioni];
        for (int i = 0; i < numeroPubblicazioni; i++){
            pubblicazioni[i] = null;
        }
    }

    public int getId() {
        return id;
    }

    public int getNumeroPubblicazioni() {
        return numeroPubblicazioni;
    }

    public Pubblicazione getPubblicazioni(int posizione) {
        if (this.pubblicazioni[posizione] != null)
            return pubblicazioni[posizione];
        else
            return null;
    }

    public void setPubblicazioni(Pubblicazione publicazione, int posizione) {
        if (this.pubblicazioni[posizione] != null)
            this.pubblicazioni[posizione] = null;
        else
            this.pubblicazioni[posizione] = pubblicazione;
    }

    public int ricerca(String titolo) {
        int i;
        for (i = 0; i < numeroPubblicazioni; i++) {
            if (pubblicazioni[i].getTitolo().equals(titolo))
                break;
        }
        return i;
    }

    public void listaPubblicazioni() {
        for (int i = 0; i < numeroPubblicazioni; i++){
            System.out.println(pubblicazioni[i].toString());
        }
    }
}
