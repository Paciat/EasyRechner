package EasyRechner;

/**
 * Klasse Multiplizierer - führt die Rechenstrategie Multiplizieren für 2 Zahlen
 * aus und implementiert dafür das Interface Berechenbar.
 *
 * @author Patricia Füruter
 */
public class Multiplizierer implements Berechenbar {

    private double zahl1;
    private double zahl2;
    private String RECHENZEICHEN = "*"; // Rechenzeichen für Ausgabe
    private double ergebnis;
    private final String NAME = "Multiplizieren"; // Funktionsname für Ausgabe

    @Override
    public double berechnen() {
        if (zahl1 < Double.MAX_VALUE && zahl2 < Double.MAX_VALUE && zahl1 > Double.NEGATIVE_INFINITY && zahl2 > Double.NEGATIVE_INFINITY && zahl1 * zahl2 > Double.NEGATIVE_INFINITY && zahl1 * zahl2 < Double.MAX_VALUE) {
            this.ergebnis = zahl1 * zahl2;
            return zahl1 * zahl2;
        }
        else 
        {
            System.out.println("Berechnung liegt außerhalb des Wertebereichs, Ausgabe 0.0 nicht korrekt");
            return 0.0;
        }
    }

    @Override
    public void setZahl1(double[] zahl1) {
        this.zahl1 = zahl1[0];
    }

    @Override
    public void setZahl2(double[] zahl2) {
        this.zahl2 = zahl2[1];
    }

    @Override
    public void setErgebnis(double ergebnis) {
        this.ergebnis = ergebnis;
    }

    @Override
    public double getZahl1() {
        return zahl1;
    }

    @Override
    public double getZahl2() {
        return zahl2;
    }

    @Override
    public String getNAME() {
        return NAME;
    }

    @Override
    public double getErgebnis() {
        return ergebnis;
    }

    @Override
    public String getRECHENZEICHEN() {
        return RECHENZEICHEN;
    }
}
