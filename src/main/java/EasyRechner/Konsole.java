package EasyRechner;



import java.util.*;

/**
 * Die KLasse Konsole stellt die Eingabeschnittstelle und die
 * Ausgabeschnittstelle des Easyalculators dar. Dafür implementiert sie die
 * Interface Darstellbar und Einlesbar.
 *
 * @author Patricia Füruter
 */
public class Konsole implements Darstellbar, Einlesbar {

    private final Scanner SCAN = new Scanner(System.in);

    @Override
    public int waehleRechenart() {
        System.out.println("Bitte wählen Sie als erstes die Art der Berechnung aus.");
        System.out.println("(1) Addition\n(2) Subtraktion\n(3) Division\n(4) Multiplikation\n(5) Potenzfunktion \n(0) Programmabbruch");
        int auswahl = SCAN.nextInt();
        return auswahl;
    }

    @Override
    public void gibRechenArt(String name) {
        System.out.println("Sie haben " + name + " gewählt.");
    }

    @Override
    public double[] einlesenZahlen() {
        double[] zahlen = new double[2];
        System.out.println("Bitte geben Sie die erste Zahl ein.");
        zahlen[0] = SCAN.nextDouble();
        System.out.println("Bitte geben Sie die zweite Zahl ein.");
        zahlen[1] = SCAN.nextDouble();
        return zahlen;
    }

    @Override
    public void ausgebenErgebnis(double zahl1, double zahl2, char rechenzeichen, double ergebnis) {
        System.out.println(zahl1 + " " + rechenzeichen + " " + zahl2 + " = " + ergebnis);
        //speichern(zahl1, zahl2, rechenzeichen);
    }
        
/*   public void speichern(double zahl1, double zahl2, char rechenzeichen)
    {
        DataBaseCon db= new DataBaseCon();
        try {
            db.verbinden();
            db.schreiben(zahl1,zahl2, rechenzeichen);
        } catch (SQLException ex) {
            System.out.println("keine DB");
        }
    }*/
}

