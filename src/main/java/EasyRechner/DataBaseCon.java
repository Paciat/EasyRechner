package EasyRechner;

import java.sql.*;
import java.util.ArrayList;

/**Klasse DataBaseCon -stellt die Verbindung zur Datenbank her und liefert die Methoden zum Eingeben und Auslesen der Datenbank.
 * 
 * @author Patricia Füruter
 */

public class DataBaseCon {
    Connection con;
    Statement stmt;
    ResultSet rst;
    PreparedStatement prep;
    int anzahl=0;
    ArrayList<Double> results;

/**
* Methode schreiben übernimmt die Parameter die in die Datenbank gespeichert werden
* stellt die Datenbankverbingung her und speichert die Daten in die Datenbank.
*
* @param zahl1      die erste Zahl die eingegeben wurde
* @param zahl2      die zweite Zahl die eingegeben wurde
* @param zeichen    das Rechenzeichen, welches die Rechenart präsentiert
*/
public void schreiben(double zahl1, double zahl2, String zeichen) {

    try {
        Class.forName("org.apache.derby.jdbc.ClientDriver");
    }
    catch (ClassNotFoundException e) {
        System.err.println("Keine Treiber-Klasse!");
    }
    
    try {
        con = DriverManager.getConnection("jdbc:derby://localhost:1527/RechernDb", "Pati", "test");
        String sql = "INSERT INTO PATI.zahlen2 (zahl1, zahl2, zeichen) VALUES (?,?,?)";
        prep = con.prepareStatement(sql);
        prep.setDouble(1, zahl1);
        prep.setDouble(2, zahl2);
        prep.setString(3, zeichen);
        prep.execute();
    } 
    catch (SQLException e) {
        System.err.println("Daten konnten nicht in Datenbank gespeichert werden!");
    } 
    finally {
        if (con != null) {
            try {
                con.close();
            } 
            catch (SQLException e) {
            
                System.err.println("Verbindung wurde nicht geschlossen!");
            }
        }
    }
}

/**
* Methode datensaetzeZaehlen ermittelt die Anzahl aller Datensätze in der Datenbank
* Diese entspricht der Anzahl der getätigten Berechnungen.
*
* @return anzahl    die ermittelte Anzahl aller Datensätze / getätigten Berechnungen
*/
public int datensaetzeZaehlen() {

    try {
        Class.forName("org.apache.derby.jdbc.ClientDriver");
    }
    catch (ClassNotFoundException e) {
        System.err.println("Keine Treiber-Klasse!");
    }

    try {
        con = DriverManager.getConnection("jdbc:derby://localhost:1527/RechernDb", "Pati", "test");
        stmt = con.createStatement();
        rst = stmt.executeQuery("Select count(ZID) FROM PATI.zahlen2");

        if (rst.next()) {
            anzahl = rst.getInt(1);
        }
    } 
    catch (SQLException e) {
        System.err.println("Anzahl aller Datensätze konnte nicht ermittelt werden.");
    } 
    finally {
        if (con != null) {
            try {
                con.close();
            }
            catch (SQLException e) { 
                System.err.println("Verbindung wurde nicht geschlossen!");
            }
        }
    }
    return anzahl;
}

/**
* Methode zaehleAddition zählt alle in der Datenbank hinterlegten Additionen.
*
* @return anzahl    die ermittelte Anzahl aller Additionen
*/
public int zaehleAddition() {

    try {
        Class.forName("org.apache.derby.jdbc.ClientDriver");
    }
    catch (ClassNotFoundException e) {
        System.err.println("Keine Treiber-Klasse!");
    }

    try {
        con = DriverManager.getConnection("jdbc:derby://localhost:1527/RechernDb", "Pati", "test");
        stmt = con.createStatement();
        rst = stmt.executeQuery("Select count(ZID) FROM PATI.zahlen2 where zeichen = '+'");
        if (rst.next()) {
            anzahl = rst.getInt(1);
        }
    } 
    catch (SQLException e) {
        System.err.println("Anzahl Rechenart konnte nicht ermittel werden!");
    } finally {
        if (con != null) {
            try {
            con.close();
            } catch (SQLException e) {
                System.err.println("Verbindung wurde nicht geschlossen!");
            }
        }
    }
    return anzahl;
}

/**
* Methode zaehleSubtraktion zählt alle in der Datenbank hinterlegten Subtraktionen.
*
* @return anzahl    die ermittelte Anzahl aller Subtraktionen
*/
public int zaehleSubtraktion() {

    try {
        Class.forName("org.apache.derby.jdbc.ClientDriver");
    }
    catch (ClassNotFoundException e) {
        System.err.println("Keine Treiber-Klasse!");
    }

    try {
        con = DriverManager.getConnection("jdbc:derby://localhost:1527/RechernDb", "Pati", "test");
        stmt = con.createStatement();
        rst = stmt.executeQuery("Select count(ZID) FROM PATI.zahlen2 where zeichen = '-'");
        if (rst.next()) {
            anzahl = rst.getInt(1);
        }
    } 
    catch (SQLException e) {
        System.err.println("Anzahl Rechenart konnte nicht ermittel werden!");
    } finally {
        if (con != null) {
            try {
            con.close();
            } catch (SQLException e) {
                System.err.println("Verbindung wurde nicht geschlossen!");
            }
        }
    }
    return anzahl;
}

/**
* Methode zaehleDivision zählt alle in der Datenbank hinterlegten Divisionen.
*
* @return anzahl    die ermittelte Anzahl aller Divisionen
*/
public int zaehleDivisionen() {

    try {
        Class.forName("org.apache.derby.jdbc.ClientDriver");
    }
    catch (ClassNotFoundException e) {
        System.err.println("Keine Treiber-Klasse!");
    }

    try {
        con = DriverManager.getConnection("jdbc:derby://localhost:1527/RechernDb", "Pati", "test");
        stmt = con.createStatement();
        rst = stmt.executeQuery("Select count(ZID) FROM PATI.zahlen2 where zeichen = '/'");
        if (rst.next()) {
           anzahl = rst.getInt(1);
        }
    } 
    catch (SQLException e) {
        System.err.println("Anzahl Rechenart konnte nicht ermittel werden!");
    } finally {
        if (con != null) {
            try {
            con.close();
            } catch (SQLException e) {
                System.err.println("Verbindung wurde nicht geschlossen!");
            }
        }
    }
    return anzahl;
}

/**
* Methode zaehleMultiplikationen zählt alle in der Datenbank hinterlegten Multiplikationen.
*
* @return anzahl    die ermittelte Anzahl aller Multiplikationen
*/
public int zaehleMultiplikation() {

    try {
        Class.forName("org.apache.derby.jdbc.ClientDriver");
    }
    catch (ClassNotFoundException e) {
        System.err.println("Keine Treiber-Klasse!");
    }

    try {
        con = DriverManager.getConnection("jdbc:derby://localhost:1527/RechernDb", "Pati", "test");
        stmt = con.createStatement();
        rst = stmt.executeQuery("Select count(ZID) FROM PATI.zahlen2 where zeichen = '*'");
        if (rst.next()) {
           anzahl = rst.getInt(1);
        }
    } 
    catch (SQLException e) {
        System.err.println("Anzahl Rechenart konnte nicht ermittel werden!");
    } finally {
        if (con != null) {
            try {
            con.close();
            } catch (SQLException e) {
                System.err.println("Verbindung wurde nicht geschlossen!");
            }
        }
    }
    return anzahl;
}

/**
* Methode zaehlePotenzieren zählt alle in der Datenbank hinterlegten Potenzrechnungen.
*
* @return anzahl    die ermittelte Anzahl aller Potenzrechnungen
*/
public int zaehlePotenziern() {

    try {
        Class.forName("org.apache.derby.jdbc.ClientDriver");
    }
    catch (ClassNotFoundException e) {
        System.err.println("Keine Treiber-Klasse!");
    }

    try {
        con = DriverManager.getConnection("jdbc:derby://localhost:1527/RechernDb", "Pati", "test");
        stmt = con.createStatement();
        rst = stmt.executeQuery("Select count(ZID) FROM PATI.zahlen2 where zeichen = '^'");
        if (rst.next()) {
         anzahl = rst.getInt(1);
        }
    } 
    catch (SQLException e) {
        System.err.println("Anzahl Rechenart konnte nicht ermittel werden!");
    } finally {
        if (con != null) {
            try {
            con.close();
            } catch (SQLException e) {
                System.err.println("Verbindung wurde nicht geschlossen!");
            }
        }
    }
    return anzahl;
}

/**
* Methode dieLetztenZahn gibt die letzten 10 eingegebenen Zahlen zurück, nutzt dafür die letzten 5 Berechnungen.
* 
* @return results    eine ArrayListe welche die letzten 10 Zahlen enthält
*/
public ArrayList dieLetztenZehn(){
    try {
        Class.forName("org.apache.derby.jdbc.ClientDriver");
    }
    catch (ClassNotFoundException e) {
        System.err.println("Keine Treiber-Klasse!");
    }

    try {
        con = DriverManager.getConnection("jdbc:derby://localhost:1527/RechernDb", "Pati", "test");
        stmt = con.createStatement();
        rst = stmt.executeQuery("SELECT zahl1, zahl2 FROM PATI.zahlen2 WHERE ZID >=((SELECT MAX(ZID) FROM PATI.zahlen2)-4)");

        ResultSetMetaData rsmd = rst.getMetaData();
        int columnCount = rsmd.getColumnCount();
        
        results = new ArrayList<>();
        while(rst.next()) {
            results.add(rst.getDouble(1));
            results.add(rst.getDouble(2));
        }

    }
    catch (SQLException e) {
        System.err.println("Anzahl Rechenart konnte nicht ermittel werden!");
    } finally {
        if (con != null) {
            try {
            con.close();
            } catch (SQLException e) {
                System.err.println("Verbindung wurde nicht geschlossen!");
            }
        }
    }
    return results;
} 

}