package pasquaOpereArte;

public class TestOpereArte {
    public static void main(String[] args) {
        try {
            // Creazione di una cornice
            Cornice corniceQuadro = new Cornice(2, 2);

            // Creazione di una supporto
            Supporto supportoScultura = new Supporto(3, 3, 1);
            Supporto supportoScultura2 = new Supporto(15, 10, 5);

            // Creazione di una collezione
            Collezione collezione = new Collezione("Esposizione d'Arte", "Roma", 5);

            try {
                // Creazione di un quadro con cornice
                Quadro op1 = new Quadro(25, 15, "Gianni", "Natura Morta", corniceQuadro);
                collezione.inserisci(op1);
            } catch (Exception e) {
                System.out.println("Errore nella creazione del quadro: " + e.getMessage());
            }

            try {
                // Creazione di una scultura con supporto
                Scultura op2 = new Scultura(191.5, 60, 40, "Donatello", "David", supportoScultura);
                collezione.inserisci(op2);
            } catch (Exception e) {
                System.out.println("Errore nella creazione della scultura: " + e.getMessage());
            }

            try {
                // Creazione di una scultura deperibile
                SculturaDeperibile op3 = new SculturaDeperibile(100, 50, 30, "Michelangelo", "Pietà", supportoScultura, 1917, 0.01f);
                collezione.inserisci(op3);
            } catch (Exception e) {
                System.out.println("Errore nella creazione della scultura deperibile: " + e.getMessage());
            }

            // Stampa della collezione
            System.out.println(collezione.stampaCollezione());

            // Stampa dell'ingombro totale
            System.out.println(collezione.stampaIngombro());

        } catch (Exception e) {
            System.out.println("Errore generale: " + e.getMessage());
        }
    }
}