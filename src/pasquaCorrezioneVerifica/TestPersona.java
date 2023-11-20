package pasquaCorrezioneVerifica;

public class TestPersona {
    public static void main(String[] args) {
        try {
            Persona p1 = new Persona("Rossi", "Samuel", "ABCDEF11G22H333I","29/01/2006");
            System.out.println(p1.toString());
            Persona p2 = new Persona("Rossi", "Samuel", "ALEPAS00T06P000A","04/10/2006");
            System.out.println(p2.toString());
            Persona p3 = new Persona("Baratella", "Alex", "ALXBRT28E06L378C","28/11/2006");
            System.out.println(p3.toString());
            System.out.print("\nEtà Samuel Rossi: " + p1.calcolaEta());
            System.out.print("\nEtà Alex Baratella: " + p3.calcolaEta());
            if(p1.verificaOmonimia(p2)){
                System.out.println("\nSono omonimi");
            }
            else {
                System.out.println("\nSon sono omonimi");
            }
            Prenotazione pre1 = new Prenotazione(p2, "30/01/2226", "01:01:02");
            System.out.println(pre1.toString());
        }catch (NullPointerException e){
            System.out.println(e);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
