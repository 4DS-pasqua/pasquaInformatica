package pasquaStudenteClasse2;

public class Studente {
    private String cognome;
    private String nome;

    public Studente(String cognome, String nome) throws Exception {
        setCognome(cognome);
        setNome(nome);
    }

    public Studente(Studente stud) {
        this.cognome = stud.getCognome();
        this.nome = stud.getNome();
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) throws Exception {
                this.cognome = isNameValid(cognome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws Exception {
                this.nome = isNameValid(nome);
    }

    private String isNameValid(String str) throws Exception {
        boolean validity = true;
        if(str == null || str.isEmpty()) {
            validity = false;
            throw new Exception("\nStringa vuota o non valida");
        } else {
            /*
            String[] strSplit = str.split(" ");
            while(i < strSplit.length && validity) {
                if(!strSplit[i].matches("[A-Z][a-z]*")) {
                    validity = false;
                    throw new Exception("\nMaiuscole non valide");
                }
                i++;
            }
            */
            str = str.trim();

            if(((str.charAt(0)) >= 65 && (str.charAt(0)) <= 90)) {
                for (int i = 1; i < str.length(); i++) {
                    if (((str.charAt(i)) >= 97 && (str.charAt(i)) <= 122) || ((str.charAt(i)) >= 232 && (str.charAt(i)) <= 233) || ((str.charAt(i)) == 224) || ((str.charAt(i)) == 242) || ((str.charAt(i)) == 249) || (str.charAt(i)) == 32 || (str.charAt(i)) == 230 || ((str.charAt(i)) == 241)) {
                        if ((str.charAt(i)) == 32) {
                            if((str.charAt(i + 1)) == 32) {
                                str = str.substring(0, i) + str.substring(i+1);
                                i--;
                            }
                            else if (((str.charAt(i + 1)) >= 65 && (str.charAt(i+1)) <= 90)) {
                                i++;
                            } else {
                                throw new Exception("\nMaiuscole non valide");
                            }
                        }
                    } else {
                        throw new Exception("\nTipo di caratteri o maiuscole non validi");
                    }
                }
            } else {
                throw new Exception("\nPrima maiuscola non valida");
            }
        }
        return str;
    }

    public String toString() {
        return cognome + " " + nome;
    }
}
