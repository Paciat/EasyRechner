package EasyRechner;

/**
 * Interface Darstellbar - legt die Methoden fest, die eine Eingabeeinheit, 
 * bspw eine Konsole beherrschen muss.
 *
 * @author Patricia Füruter
 */
public interface Einlesbar {

    /**
     * Methode gibRechenArt die Wahl der Rechenart anhand eines Integers zurück.
     *
     * @return auswahl - ein Integer, der die gewählte Rechenart repräsentiert
     */
    public int waehleRechenart();

    /**
     * Methode gibt einen Array mit den eingelsenen Zahlen zurück, die für die
     * Berechnung benötigt werden.
     *
     * @return zahlen - Array mit den Berechnungs-Zahlen
     */
    public double[] einlesenZahlen();

}
