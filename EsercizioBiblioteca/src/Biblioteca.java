import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Scaffale> scaffali = new ArrayList<>();
    private Pubblicazione pubblicazioni;
    private int posizione;
    private int id;
    private String nomeAutore;
    private int numeber;

    public void newLibrary(int id, int number){
        Scaffale scaffale = new Scaffale(id, number);
        this.scaffali.add(scaffale);
    }

    public void nuovoLibro(int id, Pubblicazione pubblicazioni, int posizione) {
        for (int i = 0; i < scaffali.size(); i++){
            if (scaffali.get(i).getId() == id){
                scaffali.get(i).setPubblicazioni(pubblicazioni, posizione);
                break;
            }
        }
    }

    public void stampaElenco() {
        for (int i = 0; i < scaffali.size(); i++) {
            scaffali.get(i).listaPubblicazioni();
        }
    }

    public void ricercaPerAutore(String nomeAutore) {
        for (int i = 0; i < scaffali.size(); i++) {
            for (int j = 0; j < scaffali.get(i).getNumeroPubblicazioni(); j++) {
                if(this.scaffali.get(i).getPubblicazioni(j).getAutore().equals(nomeAutore))
                    this.scaffali.get(i).getPubblicazioni(j).toString();
            }
        }
    }

    public int verificaPosti() {
        int counter = 0;
        for (int i = 0; i < scaffali.size(); i++) {
            for (int j = 0; j < scaffali.get(i).getNumeroPubblicazioni(); j++) {
                if (this.scaffali.get(i).getPubblicazioni(j) == null)
                    break;
            }
        }
        return counter++;
    }
}
