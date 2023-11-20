package pasquaOpereArte;

public class Supporto {
    private double lunghezza;
    private double larghezza;
    private double profondita;

    public Supporto(double lunghezza, double larghezza, double profondita) {
        this.lunghezza = lunghezza;
        this.larghezza = larghezza;
        this.profondita = profondita;
    }

    public double getLunghezza() {
        return lunghezza;
    }

    public double getLarghezza() {
        return larghezza;
    }

    public double getProfondita() {
        return profondita;
    }

    @Override
    public String toString() {
        return "Supporto: Lunghezza=" + lunghezza + ", Larghezza=" + larghezza + ", Profondita=" + profondita;
    }

    public double printIngombro() {
        return lunghezza * larghezza * profondita;
    }
}
