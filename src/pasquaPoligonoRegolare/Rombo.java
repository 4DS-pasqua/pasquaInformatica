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

    @Override
    public String toString() {
        return "\nRombo\n\nLato: " + this.getLato() + "\nNumero di Lati: " + this.getnLati() + "\n";
    }

    public String disegno(char carattere) {
        int n = (int)this.getnLati();

        String str = "";

        //parte sopra del rombo
        for (int i = 1; i <= n; i++) {
            for (int j = n; j > i; j--){
                str += " ";
            }
            str += carattere;
            for (int j = 1; j < (i - 1) * 2; j++){
                str += " ";
            }

            if (i == 1){
                str += "\n";
            }else{
                str += (carattere + "\n");
            }

        }

        // Costruzione della parte inferiore del rombo
        for (int i = n - 1; i >= 1; i--) {
            for (int j = n; j > i; j--){
                str += " ";
            }
            str += carattere;
            for (int j = 1; j < (i - 1) * 2; j++){
                str += " ";
            }

            if (i == 1){
                str += "\n";
            }else{
                str += (carattere + "\n");
            }
        }

        return str;
    }
}
