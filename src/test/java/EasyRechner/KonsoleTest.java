/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EasyRechner;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Patricia
 */
public class KonsoleTest {
    
    public KonsoleTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of waehleRechenart method, of class Konsole.
     */
    @Test
    public void testWaehleRechenart() {
        System.out.println("waehleRechenart");
        Konsole instance = new Konsole();
        int expResult = 0;
        int result = instance.waehleRechenart();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of gibRechenArt method, of class Konsole.
     */
    @Test
    public void testGibRechenArt() {
        System.out.println("gibRechenArt");
        String name = "";
        Konsole instance = new Konsole();
        instance.gibRechenArt(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of einlesenZahlen method, of class Konsole.
     */
    @Test
    public void testEinlesenZahlen() {
        System.out.println("einlesenZahlen");
        Konsole instance = new Konsole();
        double[] expResult = null;
        double[] result = instance.einlesenZahlen();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ausgebenErgebnis method, of class Konsole.
     */
    @Test
    public void testAusgebenErgebnis() {
        System.out.println("ausgebenErgebnis");
        double zahl1 = 0.0;
        double zahl2 = 0.0;
        String rechenzeichen = "";
        double ergebnis = 0.0;
        Konsole instance = new Konsole();
        instance.ausgebenErgebnis(zahl1, zahl2, rechenzeichen, ergebnis);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of gibAnzahlRechenarten method, of class Konsole.
     */
    @Test
    public void testGibAnzahlRechenarten() {
        System.out.println("gibAnzahlRechenarten");
        int gesamt = 0;
        int add = 0;
        int sub = 0;
        int mul = 0;
        int div = 0;
        int pot = 0;
        Konsole instance = new Konsole();
        instance.gibAnzahlRechenarten(gesamt, add, sub, mul, div, pot);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of gibMittelVarianzStandardabweichung method, of class Konsole.
     */
    @Test
    public void testGibMittelVarianzStandardabweichung() {
        System.out.println("gibMittelVarianzStandardabweichung");
        double mit = 0.0;
        double var = 0.0;
        double sig = 0.0;
        Konsole instance = new Konsole();
        instance.gibMittelVarianzStandardabweichung(mit, var, sig);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
