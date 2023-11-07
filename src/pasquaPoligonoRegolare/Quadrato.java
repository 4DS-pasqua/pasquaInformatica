package pasquaPoligonoRegolare;

class Quadrato extends PoligonoRegolare {
    public Quadrato(float lato) throws Exception {
        super(lato, 4);
    }

    //Abstract
    public float area() {
        return getLato() * getLato();
    }

    public float diagonale() {
        return (float) Math.sqrt(2) * getLato();
    }

    public float apotema() {
        return getLato() / 2;
    }

    @Override
    public String toString() {
        return "\nLato: " + this.getLato();
    }
}
