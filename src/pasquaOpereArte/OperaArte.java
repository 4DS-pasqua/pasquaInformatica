package pasquaOpereArte;

public abstract class OperaArte {
    protected String titolo;
    protected String artista;

    public OperaArte(String titolo, String artista) {
        this.titolo = titolo;
        this.artista = artista;
    }

    public abstract double printIngombro();

    public boolean equals(OperaArte o) {
        return o.equals(this);
    }
}
