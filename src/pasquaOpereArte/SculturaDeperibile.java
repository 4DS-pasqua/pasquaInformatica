package pasquaOpereArte;

public class SculturaDeperibile extends Scultura {
    private int eta;
    private float deperibilita;

    public SculturaDeperibile(double lunghezza, double larghezza, double profondita, String artista, String titolo, Supporto supporto, int eta, float deperibilita) throws Exception {
        super(lunghezza, larghezza, profondita, artista, titolo, supporto);
        if((1-(deperibilita / 100.0)*eta) <= 0){
            throw new Exception("\nLa scultura è completamente deperita!");
        }
        this.eta = eta;
        this.deperibilita = deperibilita;
    }

    public int getEta() {
        return eta;
    }

    public float getDeperibilita() {
        return deperibilita;
    }

    @Override
    public String toString() {
        return super.toString() + " - Dimensioni attuali: " + super.getLunghezza() * (1-(deperibilita / 100.0)*eta) + " x " + super.getLarghezza() * (1-(deperibilita / 100.0)*eta) + " x " + super.getProfondita() * (1-(deperibilita / 100.0)*eta);
    }
    public double printIngombro() {
        double ingombro = super.printIngombro();
        return ingombro * (1-(deperibilita / 100.0)*eta);
    }
}

