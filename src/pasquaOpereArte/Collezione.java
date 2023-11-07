package pasquaOpereArte;

public class Collezione {
    private String nome;
    private String luogo;
    private OperaArte[] opere;
    int dimLog = 0;

    public Collezione(String nome, String luogo, int dim) throws Exception {
        this.nome = nome;
        this.luogo = luogo;
        if(dim > 0) {
            opere = new OperaArte[dim];
        } else {
            throw new Exception("\nDimensione non valida!");
        }
    }

    public void inserisci(OperaArte nuovaOpera) {
        opere[dimLog] = nuovaOpera; //Aggregazione lasca
        dimLog++;
    }
}
