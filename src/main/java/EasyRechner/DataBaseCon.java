package EasyRechner;

import java.sql.*;
import java.util.ArrayList;

public class DataBaseCon {
    
    Connection con;
    Statement stmt;
    ResultSet rst;
    PreparedStatement prep;
    int anzahl=0;
    ArrayList<Double> results;

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
        System.err.println("Insert geht nicht!");
    } 
    finally {
        if (con != null) {
            try {
                con.close();
            } 
            catch (SQLException e) {}
        }
    }
}

public int datensätzeZaehlen() {

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
        System.err.println("Select Count() geht nicht!");
    } 
    finally {
        if (con != null) {
        try {
        con.close();
        }
        catch (SQLException e) { }
        }
    }
    return anzahl;
}

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
        System.err.println("Select Count() geht nicht!");
    } finally {
        if (con != null) {
            try {
            con.close();
            } catch (SQLException e) {}
        }
    }
    return anzahl;
}

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
        System.err.println("Select Count() geht nicht!");
    } finally {
        if (con != null) {
            try {
            con.close();
            } catch (SQLException e) {}
        }
    }
    return anzahl;
}

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
        System.err.println("Select Count() geht nicht!");
    } finally {
        if (con != null) {
            try {
            con.close();
            } catch (SQLException e) {}
        }
    }
    return anzahl;
}

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
        System.err.println("Select Count() geht nicht!");
    } finally {
        if (con != null) {
            try {
            con.close();
            } catch (SQLException e) {}
        }
    }
    return anzahl;
}

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
        System.err.println("Select Count() geht nicht!");
    } finally {
        if (con != null) {
            try {
            con.close();
            } catch (SQLException e) {}
        }
    }
    return anzahl;
}

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
        System.err.println("Mittelwert berechnen geht nicht!");
    } finally {
        if (con != null) {
            try {
            con.close();
            } catch (SQLException e) {}
        }
    }
    return results;
} 


}