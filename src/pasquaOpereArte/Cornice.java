package pasquaOpereArte;

public class Cornice {
    private double lunghezza;
    private double larghezza;

    public Cornice(double lunghezza, double larghezza) {
        this.lunghezza = lunghezza;
        this.larghezza = larghezza;
    }

    public double getLunghezza() {
        return lunghezza;
    }

    public double getLarghezza() {
        return larghezza;
    }

    @Override
    public String toString() {
        return "Cornice: Lunghezza=" + lunghezza + ", Larghezza=" + larghezza;
    }

    public double printIngombro() {
        return lunghezza * larghezza;
    }
}