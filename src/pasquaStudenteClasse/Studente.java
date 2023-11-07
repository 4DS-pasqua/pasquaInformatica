package pasquaPoligonoRegolare;;

public class Studente {
    private String cognome;
    private String nome;

    public Studente(String cognome, String nome) {
        this.cognome = cognome;
        this.nome = nome;
    }

    public Studente(Studente stud) {
        this.cognome = stud.getCognome();
        this.nome = stud.getNome();
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String toString() {
        return cognome + nome;
    }
}
