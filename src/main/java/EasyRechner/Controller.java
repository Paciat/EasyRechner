package EasyRechner;



/**
 * Der Controller steuert die Vorgänge: Rechenart wählen, Zahlen einlesen,
 * Berechnen, Ergebnis ausgeben
 *
 * @author Patricia Füruter
 */
public class Controller {

    private Berechenbar rechnen;
    private final Konsole CONSOLE;

    public Controller() {
        rechnen = new Addierer();
        CONSOLE = new Konsole();
    }

    /**
     * Die Start-Methode wird von der Main-Methode in der Klasse EasyCalculator
     * aufgerufen. Sie arbeite eine Rechenprozedur ab und interagiert dafür mit
     * der Ein- und Ausgabe sowie mit der Berechnung.
     */
    public void start() {
        auswaehlen(CONSOLE.waehleRechenart());
        CONSOLE.gibRechenArt(rechnen.getNAME());
        double[] zahlen = CONSOLE.einlesenZahlen();
        rechnen.setZahl1(zahlen);
        rechnen.setZahl2(zahlen);
        rechnen.setErgebnis(rechnen.berechnen());
        CONSOLE.ausgebenErgebnis(rechnen.getZahl1(), rechnen.getZahl2(), rechnen.getRECHENZEICHEN(), rechnen.getErgebnis());
    }

    /**
     * Die auswählen-Methode erhält einen Integer anhand dem Sie den
     * entsprechenden Rechner (Strategy) erzeugt.
     *
     * @param auswahl - Integer der die Auswahl der Rechenmethode, oder den
     * Programmabbruch darstellt
     */
    public void auswaehlen(int auswahl) {
        if (auswahl == 1) {
            rechnen = new Addierer();
        } else if (auswahl == 2) {
            rechnen = new Subtrahierer();
        } else if (auswahl == 3) {
            rechnen = new Dividierer();
        } else if (auswahl == 4) {
            rechnen = new Multiplizierer();
        } else if (auswahl == 5) {
            rechnen = new Potenzierer();
        } else if (auswahl == 0) {
            System.exit(0);
        } else {
            System.out.println("Eingabe nicht erkannt!");
            auswaehlen(CONSOLE.waehleRechenart());
        }
    }
}
