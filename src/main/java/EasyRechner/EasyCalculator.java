package EasyRechner;
/**
 * Dies ist die Start-Klasse des EasyCalculators mit der Main-Methode
 * 
 * Der EasyCalculator ist ein einfacher Rechner, der mit 2 Zahlen einfache
 * Rechenmethoden wie: Addieren, Subtrahiere, Dividieren oder Multiplizieren
 * ausführt 
 * 
 * Weiters speichert er die eingegebenen Zahlen in eine Datenbank und gibt verschiedene Details, 
 * wie bspw die Häufigkeit der gewählten Rechenarten und den Mittelwert udn die Standardabweichung der letzten 10 Zahlen
 * die eingegeben wurden.
 * 
 * @author Patricia Füruter
 * @version 2_17112015
 */

public class EasyCalculator {

    public static void main(String[] args) {
        Controller CONTROLLER = new Controller();
        CONTROLLER.start();
    }
}
