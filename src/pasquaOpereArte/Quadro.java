package pasquaOpereArte;

public class Quadro extends OperaArte {
    private double lunghezza;
    private double larghezza;

    public Quadro(double lunghezza, double larghezza, String artista, String titolo) throws Exception {
        super(titolo, artista);
        if(larghezza > 0) {
            this.larghezza = larghezza;
        } else {
            throw new Exception("\nLarghezza non valida!");
        }
        if(lunghezza > 0) {
            this.lunghezza = lunghezza;
        } else {
            throw new Exception("\nLunghezza non valida!");
        }
    }

    @Override
    public double printIngombro() {
        return larghezza*lunghezza;
    }
}
