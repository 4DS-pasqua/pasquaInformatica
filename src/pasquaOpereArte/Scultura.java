package pasquaOpereArte;

public class Scultura extends OperaArte {
    private double lunghezza;
    private double larghezza;
    private double profondita;

    public Scultura(double lunghezza, double larghezza, double profondita, String artista, String titolo) throws Exception {
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
        if(profondita > 0) {
            this.profondita = profondita;
        } else {
            throw new Exception("\nProfondità non valida!");
        }
    }

    @Override
    public double printIngombro() {
        return larghezza*lunghezza*profondita;
    }
}
