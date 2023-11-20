package pasquaOpereArte;

public class Scultura extends OperaArte {
    private double lunghezza;
    private double larghezza;
    private double profondita;
    private Supporto supporto; // Aggiunta del supporto come attributo

    public Scultura(double lunghezza, double larghezza, double profondita, String artista, String titolo, Supporto supporto) throws Exception {
        super(titolo, artista);
        if (larghezza > 0) {
            this.larghezza = larghezza;
        } else {
            throw new Exception("\nLarghezza non valida!");
        }
        if (lunghezza > 0) {
            this.lunghezza = lunghezza;
        } else {
            throw new Exception("\nLunghezza non valida!");
        }
        if (profondita > 0) {
            this.profondita = profondita;
        } else {
            throw new Exception("\nProfondità non valida!");
        }
        // Copia del supporto per l'aggregazione stretta
        this.supporto = new Supporto(supporto.getLunghezza(), supporto.getLarghezza(), supporto.getProfondita());
    }


    public Scultura(Scultura s) {
        super(s);
        this.larghezza = s.getLarghezza();
        this.lunghezza = s.getLunghezza();
        this.profondita = s.getProfondita();
    }

    public double getLarghezza() {
        return larghezza;
    }

    public double getLunghezza() {
        return lunghezza;
    }

    public double getProfondita() {
        return profondita;
    }

    @Override
    public double printIngombro() {
        return larghezza*lunghezza*profondita;
    }

    public String toString() {
        return super.toString() + " - Dimensioni: " + lunghezza + " x " + larghezza + " x " + profondita;
    }
}
