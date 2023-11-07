package pasquaPoligonoRegolare;

class Pentagono extends PoligonoRegolare {
    public Pentagono(float lato) throws Exception {
        super(lato, 5);
    }

    public float area() {
        return 1.72f * getLato() * getLato();
    }

    public float diagonale() {
        return getLato() * (1 + (float) Math.sqrt(5)) / 2;
    }

    public float apotema() {
        return getLato() * 0.688f;
    }

    @Override
    public String toString() {
        return "\nPentagono\n\nLato: " + this.getLato() + "\nNumero di Lati: " + this.getnLati() + "\n";
    }

    public String disegno(char carattere) {
        return "";
    };
}
