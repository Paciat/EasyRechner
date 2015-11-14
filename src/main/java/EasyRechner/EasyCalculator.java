package EasyRechner;



/**
 * Dies ist die Start-Klasse des EasyCalculators mit der Main-Methode.
 *
 * Der EasyCalculator ist ein einfacher Rechner, der mit 2 Zahlen einfache
 * Rechenmethoden wie: addieren, subtrahiere, dividieren oder multiplizieren
 * ausführt.
 *
 * @author Patricia Füruter
 */
public class EasyCalculator {

    public static void main(String[] args) {
        Controller CONTROLLER = new Controller();
        CONTROLLER.start();
    }
}
