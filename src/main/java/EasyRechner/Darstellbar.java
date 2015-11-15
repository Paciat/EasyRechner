package EasyRechner;



/**
 * Interface Darstellbar - legt die Methoden fest, die eine Ausgabeeinheit,
 * bspw. Konsole beherrschen muss.
 *
 * @author Patricia Füruter
 * 
 * schreib noch was
 */
public interface Darstellbar {

    /**
     * Methode gibRechenArt übernimmt den Name (Funktionsnamen) des Objekts und
     * kann damit bspw. einen String auf der Konsole ausgeben.
     *
     * @param name
     */
    public void gibRechenArt(String name);

    /**
     * Methode ausgebenErgebnis übernimmtdie einzelenen Rechnungsbestandteile
     * kann damit bspw. einen String auf der Konsole ausgeben..
     *
     * @param zahl1
     * @param zahl2
     * @param rechenzeichen
     * @param ergebnis
     */
    public void ausgebenErgebnis(double zahl1, double zahl2, String rechenzeichen, double ergebnis);

}
