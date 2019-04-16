import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int choice;
        Biblioteca biblioteca = new Biblioteca();

        Scanner scanIn = new Scanner(System.in);

        do{
            System.out.println("\t - - - - MENU - - - -");
            System.out.println("\t 1. Inserisci nuovo scaffale;");
            System.out.println("\t 2. Stampa tutti i libri;");
            System.out.println("\t 3. Ricerca libro per autore;");
            System.out.println("\t 4. Verifica posti;");
            System.out.println("\t 0. Exit.");

            choice = scanIn.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Inserisci l'id: ");
                    int id = scanIn.nextInt();
                    System.out.println("Inserisci il numero dello scaffale: ");
                    int number = scanIn.nextInt();
                    biblioteca.newLibrary(id, number);
                    break;
                case 2:
                    biblioteca.stampaElenco();
                    break;
                case 3:
                    System.out.println("Inserisci il nome dell'autore: ");
                    String autore = scanIn.nextLine();
                    biblioteca.ricercaPerAutore(autore);
                    break;
                case 4:
                    biblioteca.verificaPosti();
                    break;
                default:
                    System.out.println("Type a number between 1 and 4!");
            }
        }
        while (choice != 0);

    }
}
