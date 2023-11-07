package pasquaPoligonoRegolare;

class Esagono extends PoligonoRegolare {
    public Esagono(float lato) throws Exception {
        super(lato, 6);
    }

    public float area() {
        return 1.5f * (float) Math.sqrt(3) * getLato() * getLato();
    }

    public float diagonale() {
        return 2 * getLato();
    }

    public float apotema() {
        return 2 * area() / (2 * perimetro());
    }

    @Override
    public String toString() {
        return "\nEsagono\n\nLato: " + this.getLato() + "\nNumero di Lati: " + this.getnLati() + "\n";
    }

    public String disegno(char carattere) {
        return "";
    };
}
