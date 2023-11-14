package pasquaOpereArte;

public class TestOpereArte {
    public static void main(String[] args) {
        Collezione collezione = null;
        try {
            collezione = new Collezione("Esposizione d'Arte", "Roma", 5);
        } catch(Exception e) {
            System.out.print(e.getMessage());
            System.exit(0);
        }

        Quadro op1 = null;
        try {
            op1 = new Quadro(25, 15, "Gianni", "Natura Morta");
        } catch(Exception e) {
            System.out.print(e.getMessage());
            System.exit(0);
        }

        try {
            collezione.inserisci(op1);
        } catch(Exception e) {
            System.out.print(e.getMessage());
        }


        Scultura op2 = null;
        try {
            op2 = new Scultura(191.5, 60, 40,"Donatello", "David");
        } catch(Exception e) {
            System.out.print(e.getMessage());
            System.exit(0);
        }

        try {
            collezione.inserisci(op2);
        } catch(Exception e) {
            System.out.print(e.getMessage());
        }

        System.out.print(collezione.stampaCollezione());
        System.out.print(collezione.stampaIngombro());
        System.out.print(collezione.stampaIngombro());
    }
}
