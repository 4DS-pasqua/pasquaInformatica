package pasquaPoligonoRegolare;

class Rombo extends PoligonoRegolare {
    private float diagonaleMaggiore;

    public Rombo(float lato, float diagonaleMaggiore) throws Exception {
        super(lato, 4);
        if (diagonaleMaggiore <= 0) {
            throw new Exception("La diagonale maggiore deve essere maggiore di zero.");
        }
        this.diagonaleMaggiore = diagonaleMaggiore;
    }

    public float area() {
        return getLato() * getLato() * (float) Math.sin(Math.toRadians(60)); // Assume angolo fisso di 60 gradi
    }

    public float diagonaleMinore() {
        return (2 * area()) / diagonaleMaggiore;
    }

    public float apotema() {
        return 2 * area() / perimetro();
    }
}
