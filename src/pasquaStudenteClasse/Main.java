package pasquaStudenteClasse;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String cognome, nome;
        int nStud;
        boolean error = false;

        do {
            System.out.print("\nInserisci il numero di studenti: ");
            nStud = input.nextInt();
            input = new Scanner(System.in);
            System.out.print("\n\nInserisci il cognome del Capo Classe: ");
            cognome = input.next();
            input = new Scanner(System.in);
            System.out.print("\nInserisci il nome del Capo Classe: ");
            nome = input.next();
            input = new Scanner(System.in);
            Studente capoClasse = new Studente(cognome, nome);

            Studente[] studenti = new Studente[nStud];

            try {
                for (int i = 0; i < nStud; i++) {
                    System.out.print("\n\nInserisci il cognome del " + (i + 1) + " studente: ");
                    cognome = input.next();
                    input = new Scanner(System.in);
                    System.out.print("\nInserisci il nome del " + (i + 1) + " studente: ");
                    nome = input.next();
                    input = new Scanner(System.in);
                    studenti[i] = new Studente(cognome, nome);
                }

                Classe classe = new Classe(capoClasse, studenti);
            } catch(Exception e) {
                System.out.print(e.getMessage());
                error = true;
            }
        } while(error);
    }
}

