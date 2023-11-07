package pasquaStudenteClasse;

import java.util.Arrays;
import java.lang.Character;
import java.lang.String;

public class Classe {
    private Studente capoClasse;
    private Studente[] studenti;

    public Classe(Studente capoClasse, Studente[] studenti) throws Exception {
        if(isStringValid(capoClasse.getCognome()) && isStringValid(capoClasse.getNome())) {
            this.capoClasse = new Studente(capoClasse);
        } else {
            throw new Exception("\nNome o Cognome del Capo Classe non validi!");
        }
        for (int i = 0; i < studenti.length; i++) {
            if(isStringValid(studenti[i].getCognome()) && isStringValid(studenti[i].getNome())) {
                this.studenti[i] = new Studente(studenti[i]);
            } else {
                throw new Exception("\nNome o cognome del " + (i+1) + " studente non valido!");
            }
        }
    }

    public Studente getCapoClasse() {
        return new Studente(capoClasse);
    }

    public void setCapoClasse(Studente capoClasse) {
        this.capoClasse.setCognome(capoClasse.getCognome());
        this.capoClasse.setNome(capoClasse.getNome());
    }

    public Studente[] getStudenti() {
        return studenti.clone() ;
    }

    public void setStudenti(Studente[] studenti) throws Exception {
        if(studenti.length != this.studenti.length) {
            throw new Exception("\nNumero di studenti non valido!");
        } else {
            this.studenti = studenti.clone();
        }
    }

    private void invertiAttributi() {

        for (int i = 0; i < studenti.length; i++) {
            String tmp = studenti[i].getNome();
            studenti[i].setNome(studenti[i].getCognome());
            studenti[i].setCognome(tmp);
        }
        String tmp = capoClasse.getNome();
        capoClasse.setNome(capoClasse.getCognome());
        capoClasse.setCognome(tmp);
    }

    private boolean isStringValid(String str) {
        boolean validity = true;
        int i = 0;
        if(str.isEmpty()) {
            validity = false;
        }
        while(i < str.length() && validity) {
            if(Character.isAlphabetic(str.charAt(i)) || Character.isWhitespace(str.charAt(i))) {
                i++;
            } else {
                validity = false;
            }
        }
        return validity;
    }

    public String toString() {
        return "\nCapo Classe: " + capoClasse.toString() + "\nStudenti: " + Arrays.toString(studenti);
    }
}
