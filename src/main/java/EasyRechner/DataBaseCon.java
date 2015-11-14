/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EasyRechner;

/**

 @author Patricia

public class DataBaseCon {
    
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
    static final String DB_URL = "jdbc:mysql://localhost/datenbank";
    static final String USER = "root";
    static final String PASS = "";
    

    public Connection verbinden() throws SQLException {

        Connection con = d.connect(USER, null);

        if (con == null) {
            System.out.println("connection failed");
        }
        return con;
    }

    public void schreiben(double value1, double value2, char value3) throws SQLException {

        Connection con = verbinden();
        Statement stmt = con.createStatement();

        try {
            
            String sql = "INSERT INTO tbl_zahlen (z_erste, z_zweite, z_zeichen) VALUES(1,2,+)";
            stmt.executeUpdate(sql);
        } catch (SQLException e) {
            System.out.println("Leider nein!");
        }
    }

}

//        stmt.executeUpdate("INSERT INTO tbl_zahlen (z_erste,z_zweite, z_zeichen) VALUES ("+value1+","+value2+","+value3+");");
*/