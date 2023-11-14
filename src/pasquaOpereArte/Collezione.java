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

    public String getNome() {
        return nome;
    }

    public String getLuogo() {
        return luogo;
    }

    public void inserisci(OperaArte nuovaOpera) throws Exception {
        if(nuovaOpera == null) {
            throw new Exception("\nOpera nulla!");
        } else if (dimLog == opere.length) {
            throw new Exception("\nCollezione piena!");
        }
        opere[dimLog] = nuovaOpera; //Aggregazione lasca
        dimLog++;
    }
    
    public String stampaCollezione() {
        String result = "\n\nCollezione: " + nome + " - Luogo: " + luogo + "\nOpere:\n";
        for (int i = 0; i < dimLog; i++) {
            result += opere[i].toString() + "\n";
        }
        return result;
    }

    public String stampaIngombro() {
        double ingombroTotale = 0.0;
        for (int i = 0; i < dimLog; i++) {
            ingombroTotale += opere[i].printIngombro();
        }
        return ("\n\nIngombro totale della collezione: " + ingombroTotale + " metri quadrati");
    }

}
