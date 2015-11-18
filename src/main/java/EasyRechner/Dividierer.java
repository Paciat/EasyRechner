package EasyRechner;

/**
 * Klasse Dividierer - führt die Rechenstrategie Dividieren für 2 Zahlen aus und
 * implementiert dafür das Interface Berechenbar.
 *
 * @author Patricia Füruter
 */
public class Dividierer implements Berechenbar {

    private double zahl1;
    private double zahl2;
    private final String RECHENZEICHEN = "/"; // Rechenzeichen für die Ausgabe
    private double ergebnis;
    private final String NAME = "Dividieren";  // Name für die Ausgabe

    @Override
    public double berechnen() {
        if (zahl2 != 0 && zahl1 < Double.POSITIVE_INFINITY && zahl2 < Double.POSITIVE_INFINITY && zahl1 > Double.NEGATIVE_INFINITY && zahl2 > Double.NEGATIVE_INFINITY && zahl1 / zahl2 > Double.NEGATIVE_INFINITY && zahl1 / zahl2 < Double.POSITIVE_INFINITY) {
            this.ergebnis = zahl1 / zahl2;
            return zahl1 / zahl2;
        } else {
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
