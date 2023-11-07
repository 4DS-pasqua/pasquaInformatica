package pasquaPoligonoRegolare;

class ElencoPoligoni {
    private PoligonoRegolare[] poligoni;
    int dimLog = 0;

    public ElencoPoligoni(int nPoligoni) {
        poligoni = new PoligonoRegolare[nPoligoni];
    }

    public void aggiungiPoligono(PoligonoRegolare p) {
        poligoni[dimLog] = p;
        dimLog++;
    }

    public float calcolaAreaMedia() throws Exception {
        if (dimLog == 0) {
            return 0;
        }

        float sommaAree = 0;
        for (int i = 0; i < dimLog; i++) {
            sommaAree += poligoni[i].area();
        }

        return sommaAree / dimLog;
    }

    public float calcolaPerimetroTotale() throws Exception {
        float perimetroTotale = 0.0f;
        for (int i = 0; i < dimLog; i++) {
            perimetroTotale += poligoni[i].perimetro();
        }
        return perimetroTotale;
    }
}
