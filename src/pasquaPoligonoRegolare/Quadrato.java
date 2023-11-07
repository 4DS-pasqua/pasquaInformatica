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
        return "\nQuadrato\n\nLato: " + this.getLato() + "\nNumero di Lati: " + this.getnLati() + "\n";
    }

    public String disegno(char carattere) {
        String disegno = "";
        for (int i = 0; i < getLato(); i++) {
            if (i == 0 || i == getLato()-1) {
                for (int j = 0; j < getLato(); j++) {
                    disegno += carattere;
                }
                disegno += "\n";
            } else {
                disegno += carattere;
                for (int r = 0; r < getLato() - 2; r++) {
                    disegno = disegno + " ";
                }
                disegno = disegno + carattere + "\n";
            }
        }
        return disegno;
    }
}
