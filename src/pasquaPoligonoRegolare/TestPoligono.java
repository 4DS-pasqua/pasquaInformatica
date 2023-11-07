package pasquaPoligonoRegolare;

public class TestPoligono {
    public static void main(String[] args) {
        Quadrato quadrato = null;
        Rombo rombo = null;
        Pentagono pentagono = null;

        try {
            // Test della classe Quadrato
            System.out.println("\nTest della classe Quadrato:");
            quadrato = new Quadrato(4);
            System.out.println(quadrato);
            System.out.println("Area: " + quadrato.area());
            System.out.println("Perimetro: " + quadrato.perimetro());
            System.out.println("Diagonale: " + quadrato.diagonale());
            System.out.println("Apotema: " + quadrato.apotema());
            System.out.println("Numero di istanze: " + PoligonoRegolare.getNumIstanze());
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }

        try {
            // Test della classe Rombo
            System.out.println("\nTest della classe Rombo:");
            rombo = new Rombo(3, 4);
            System.out.println(rombo);
            System.out.println("Area: " + rombo.area());
            System.out.println("Perimetro: " + rombo.perimetro());
            System.out.println("Diagonale minore: " + rombo.diagonaleMinore());
            System.out.println("Apotema: " + rombo.apotema());
            System.out.println("Numero di istanze: " + PoligonoRegolare.getNumIstanze());
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }

        try {
            // Test della classe Pentagono
            System.out.println("\nTest della classe Pentagono:");
            pentagono = new Pentagono(6);
            System.out.println(pentagono);
            System.out.println("Area: " + pentagono.area());
            System.out.println("Perimetro: " + pentagono.perimetro());
            System.out.println("Diagonale: " + pentagono.diagonale());
            System.out.println("Apotema: " + pentagono.apotema());
            System.out.println("Numero di istanze: " + PoligonoRegolare.getNumIstanze());
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }

        try {
            // Test della classe Esagono
            System.out.println("\nTest della classe Esagono:");
            Esagono esagono = new Esagono(2);
            System.out.println(esagono);
            System.out.println("Area: " + esagono.area());
            System.out.println("Perimetro: " + esagono.perimetro());
            System.out.println("Diagonale: " + esagono.diagonale());
            System.out.println("Apotema: " + esagono.apotema());
            System.out.println("Numero di istanze: " + PoligonoRegolare.getNumIstanze());
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }

        try {
            // Test della classe ElencoPoligoni
            System.out.println("\nTest della classe ElencoPoligoni:");
            ElencoPoligoni elenco = new ElencoPoligoni(3);
            elenco.aggiungiPoligono(quadrato);
            elenco.aggiungiPoligono(rombo);
            elenco.aggiungiPoligono(pentagono);
            System.out.println("Area media: " + elenco.calcolaAreaMedia());
            System.out.println("Perimetro totale: " + elenco.calcolaPerimetroTotale());
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }
}


