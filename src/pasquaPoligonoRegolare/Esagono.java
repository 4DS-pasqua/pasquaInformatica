package pasquaPoligonoRegolare;

class Esagono extends PoligonoRegolare {
    public Esagono(float lato) throws Exception {
        super(lato, 6);
    }

    public float area() {
        return 1.5f * (float) Math.sqrt(3) * getLato() * getLato();
    }

    public float perimetro() {
        return getnLati() * getLato();
    }

    public float diagonale() {
        return 2 * getLato();
    }

    public float apotema() {
        return 2 * area() / (2 * perimetro());
    }
}
