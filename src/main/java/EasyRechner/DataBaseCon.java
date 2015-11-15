
package EasyRechner;
import java.sql.*;

public class DataBaseCon {
    
    Connection con;
    Statement stmt;
    ResultSet rst;
    PreparedStatement prep;

public void schreiben(double zahl1, double zahl2, String zeichen) {
    
    try
    {
      Class.forName("org.apache.derby.jdbc.ClientDriver");
    }
    catch ( ClassNotFoundException e )
    {
      System.err.println( "Keine Treiber-Klasse!" );
      return;
    }

    try
    {
      con = DriverManager.getConnection("jdbc:derby://localhost:1527/RechernDb", "Pati", "test");
      String sql = "INSERT INTO PATI.zahlen2 (zahl1, zahl2, zeichen) VALUES (?,?,?)";
      prep = con.prepareStatement(sql);
      prep.setDouble(1, zahl1);
      prep.setDouble(2, zahl2);
      prep.setString(3, zeichen);
      prep.execute();

    }
    catch ( SQLException e )
    {
        System.err.println("Insert geht nicht!");
    }
    
    finally
    {
    if ( con != null )
    try { con.close(); } catch ( SQLException e ) {}
    }
}
}
