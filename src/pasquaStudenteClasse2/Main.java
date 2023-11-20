package pasquaStudenteClasse2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String cognome, nome;
        int nStud = 0;
        boolean error = false;
        Classe classe = null;
        Studente[] studenti = null;
        Studente capoClasse = null;

        System.out.print("\nInserisci il numero di studenti: ");
        nStud = input.nextInt();
        studenti = new Studente[nStud];

        do {
            try {
                System.out.print("\n\nInserisci il cognome del Capo Classe: ");
                cognome = input.next();
                input = new Scanner(System.in);
                System.out.print("\nInserisci il nome del Capo Classe: ");
                nome = input.next();
                input = new Scanner(System.in);
                capoClasse = new Studente(cognome, nome);
                System.out.print(capoClasse);
                studenti[0] = capoClasse;
                for(int i = 1; i < nStud; i++) {
                    System.out.print("\n\nInserisci il cognome del " + (i + 1) + " studente: ");
                    cognome = input.next();
                    input = new Scanner(System.in);
                    System.out.print("\nInserisci il nome del " + (i + 1) + " studente: ");
                    nome = input.next();
                    input = new Scanner(System.in);
                    studenti[i] = new Studente(cognome, nome);
                }
                classe = new Classe(capoClasse, studenti);
                error = false;
            } catch(Exception e) {
                System.out.print("\nErrore: " + e.getMessage());
                error = true;
            }
        } while(error);

        System.out.printf("\n\nStudenti inseriti nel main: \n" + Arrays.toString(studenti));
        System.out.printf("\n\nStudenti inseriti nell'oggetto: \n" + classe);
        try {
            classe.invertiAttributi();
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
        System.out.printf("\n\nStudenti invertiti nell'oggetto: \n" + classe);
        System.out.printf("\n\nStudenti nel main dopo averli invertiti nell'oggetto: \n" + Arrays.toString(studenti));
    }
}

