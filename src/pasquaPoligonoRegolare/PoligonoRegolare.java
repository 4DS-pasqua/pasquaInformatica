package pasquaPoligonoRegolare;

abstract class PoligonoRegolare {
    private float lato;
    private int nLati;
    private static int numIstanze;

    public PoligonoRegolare(float lato, int nLati) throws Exception {
        setLato(lato);
        setnLati(nLati);
        numIstanze++;
    }

    public float getLato() {
        return lato;
    }

    public float getnLati() {
        return nLati;
    }

    public static int getNumIstanze() {
        return numIstanze;
    }

    public void setLato(float lato) throws Exception {
        if (lato <= 0) {
            throw new Exception("La lunghezza del lato deve essere maggiore di zero.");
        }
        this.lato = lato;
    }

    public void setnLati(int nLati) throws Exception {
        if (nLati <= 2) {
            throw new Exception("Il numero dei lato deve essere maggiore di 2.");
        }
        this.nLati = nLati;
    }

    public String toString() {
        return "Numero di lati: " + nLati + "\nLunghezza lato: " + lato;
    }

    public abstract float area();

    public abstract String disegno(char carattere);

    public float perimetro() {
        return nLati * lato;
    }
}
