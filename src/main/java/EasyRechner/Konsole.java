package EasyRechner;
import java.util.*;

/**
 * Die Klasse Konsole stellt die Eingabeschnittstelle und die
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
    public void ausgebenErgebnis(double zahl1, double zahl2, String rechenzeichen, double ergebnis) {
        System.out.println("Ergebnis: "+zahl1 + " " + rechenzeichen + " " + zahl2 + " = " + ergebnis);
        //BerechnungenRechner r = new BerechnungenRechner();
        //DataBaseCon db = new DataBaseCon();
        //r.mittelwert(db.dieLetztenZehn());
    }
    
    public void gibAnzahlRechenarten(int gesamt, int add, int sub, int mul, int div, int pot){
        
        System.out.println("Gesamtanzahl aller Berechnungen: "+gesamt);
        System.out.println("Anzahl aller Additionen: "+add);
        System.out.println("Anzahl aller Subtraktionen: "+sub);
        System.out.println("Anzahl aller Multiplikationen: "+mul);
        System.out.println("Anzahl aller Divisionen: "+div);
        System.out.println("Anzahl aller Potenzrechnungen: "+pot);
    }
    
    public void gibMittelVarianzStandardabweichung(double mit, double var, double sig){
        System.out.println("Mittelwert der letzten 10 eingebenen Zahlen: "+mit);
        System.out.println("Varianz der letzten 10 eingebenen Zahlen: "+var);
        System.out.println("Standardabweichung der letzten 10 eingebenen Zahlen: "+sig);
    }
}