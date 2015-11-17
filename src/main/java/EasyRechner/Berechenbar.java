package EasyRechner;


/**
 * Interface Berechenbar - legt die Methoden fest, die eine Rechenstrategie
 * beherrschen muss.
 *
 * @author Patricia
 * @version 01-11-2015
 */
public interface Berechenbar {

    /**
     * Methode führt die Berechnung durch und gibt das Ergebnis als Double
     * zurück. Sollte dann das Ergebnis mittels setErgebnis setzen.
     *
     * @return ergebnis - das berechnete Ergebnis
     */
    public double berechnen();

    /**
     * Methode setzt die erste Zahl, die für die Berechnung herangezogen wird.
     *
     * @param zahl1 - ein Array aus dem eine bestimmte Stelle verwendet wird
     */
    public void setZahl1(double[] zahl1);

    /**
     * Methode setzt die erste Zahl, die für die Berechnung herangezogen wird.
     *
     * @param zahl2 - - ein Array aus dem eine bestimmte Stelle verwendet wird
     */
    public void setZahl2(double[] zahl2);

    /**
     * Methode setzt das Ergebnis der Berechnung
     *
     * @param ergebnis - Ergebnis der Berechnung
     */
    public void setErgebnis(double ergebnis);

    /**
     * Methode gibt die erste Zahl, die für die Berechnung herangezogen wird,
     * zurück.
     *
     * @return zahl1 - die Zahl die als erste Zahl für die Berechnung
     * herangezogen wird
     */
    public double getZahl1();

    /**
     * Methode gibt die zweite Zahl, die für die Berechnung herangezogen wird,
     * zurück.
     *
     * @return zahl2 - die Zahl die als zweite Zahl für die Berechnung
     * herangezogen wird
     */
    public double getZahl2();

    /**
     * Methode gibt den Funktions-Name bspw. Addieren zurück.
     *
     * @return Name der Funktion
     */
    public String getNAME();

    /**
     * Methode gibt das Ergebnis zurück
     *
     * @return ergebnis - Ergebnis der Berechnung
     */
    public double getErgebnis();

    /**
     * Methode gibt das gespeicherte Rechenzeichen der Funktion bspw + zurück
     *
     * @return rechenzeichen
     */
    public String getRECHENZEICHEN();
}
