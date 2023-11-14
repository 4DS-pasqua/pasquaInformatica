package pasquaOpereArte;

public abstract class OperaArte {
    protected String titolo;
    protected String artista;

    public OperaArte(String titolo, String artista) {
        this.titolo = titolo;
        this.artista = artista;
    }

    public OperaArte(OperaArte op) {
        this.titolo = op.getTitolo();
        this.artista = op.getArtista();
    }

    public String getArtista() {
        return artista;
    }

    public String getTitolo() {
        return titolo;
    }

    public abstract double printIngombro();

    public boolean equals(OperaArte o) {
        return o.equals(this);
    }

    public String toString() {
        return "Opera: " + titolo + " - Artista: " + artista;
    }
}
