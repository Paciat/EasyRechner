package EasyRechner;

/*
 * Testklasse für den Multiplizierer (Strategy)
 */


import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Patricia
 */
public class MultipliziererTest {

    public MultipliziererTest() {
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
     * Test: Multiplizieren mit kleinen Zahlen / Ziffern.
     */
    @Test
    public void testMultiplizierenZiffern() {
        System.out.println("MultiplizierenTest: testMultiplizierenZiffern()");
        Multiplizierer instance = new Multiplizierer();
        instance.setZahl1(new double[]{6.0, 0.0});
        instance.setZahl2(new double[]{0.0, 3.0});
        double result = instance.berechnen();
        Assert.assertEquals(18.0, result, 0.0);
    }

    /**
     * Test: Multiplizieren außer dem Wertebereich
     */
    @Test
    public void testMultiplizierenAusserWertebereich() {
        System.out.println("MultiplizierenTest: testMultiplizierenAusserWertebereich()");
        Multiplizierer instance = new Multiplizierer();
        instance.setZahl1(new double[]{1.7976931348623157E308, 0.0});
        instance.setZahl2(new double[]{0.0, 1.7976931348623157E308});
        double result = instance.berechnen();
        Assert.assertEquals(0.0, result, 0.0);
    }

    /**
     * Test: Multiplizieren mit Null 1
     */
    @Test
    public void testBerechnenMultiplizierenMitNull() {
        System.out.println("MultiplizierenTest: testBerechnenMultiplizierenMitNull() ");
        Multiplizierer instance = new Multiplizierer();
        instance.setZahl1(new double[]{7.0, 0.0});
        instance.setZahl2(new double[]{0.0, 0.0});
        double result = instance.berechnen();
        Assert.assertEquals(0.0, result, 0.0);
    }

    /**
     * Test: Multiplizieren mit negativen Zahlen
     */
    @Test
    public void testMultiplizierenmitNegativenZahlen() {
        System.out.println("MultiplizierenTest: testMultiplizierenmitNegativenZahlen() ");
        Multiplizierer instance = new Multiplizierer();
        instance.setZahl1(new double[]{-2.0, 0.0});
        instance.setZahl2(new double[]{0.0, -5.0});
        double result = instance.berechnen();
        Assert.assertEquals(10.0, result, 0.0);
    }

    /**
     * Test of berechnen method, of class Multiplizierer.
     */
    @Test
    public void testBerechnen() {
        System.out.println("berechnen");
        Multiplizierer instance = new Multiplizierer();
        double expResult = 0.0;
        double result = instance.berechnen();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setZahl1 method, of class Multiplizierer.
     */
    @Test
    public void testSetZahl1() {
        System.out.println("setZahl1");
        double[] zahl1 = null;
        Multiplizierer instance = new Multiplizierer();
        instance.setZahl1(zahl1);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setZahl2 method, of class Multiplizierer.
     */
    @Test
    public void testSetZahl2() {
        System.out.println("setZahl2");
        double[] zahl2 = null;
        Multiplizierer instance = new Multiplizierer();
        instance.setZahl2(zahl2);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setErgebnis method, of class Multiplizierer.
     */
    @Test
    public void testSetErgebnis() {
        System.out.println("setErgebnis");
        double ergebnis = 0.0;
        Multiplizierer instance = new Multiplizierer();
        instance.setErgebnis(ergebnis);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getZahl1 method, of class Multiplizierer.
     */
    @Test
    public void testGetZahl1() {
        System.out.println("getZahl1");
        Multiplizierer instance = new Multiplizierer();
        double expResult = 0.0;
        double result = instance.getZahl1();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getZahl2 method, of class Multiplizierer.
     */
    @Test
    public void testGetZahl2() {
        System.out.println("getZahl2");
        Multiplizierer instance = new Multiplizierer();
        double expResult = 0.0;
        double result = instance.getZahl2();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNAME method, of class Multiplizierer.
     */
    @Test
    public void testGetNAME() {
        System.out.println("getNAME");
        Multiplizierer instance = new Multiplizierer();
        String expResult = "";
        String result = instance.getNAME();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getErgebnis method, of class Multiplizierer.
     */
    @Test
    public void testGetErgebnis() {
        System.out.println("getErgebnis");
        Multiplizierer instance = new Multiplizierer();
        double expResult = 0.0;
        double result = instance.getErgebnis();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRECHENZEICHEN method, of class Multiplizierer.
     */
    @Test
    public void testGetRECHENZEICHEN() {
        System.out.println("getRECHENZEICHEN");
        Multiplizierer instance = new Multiplizierer();
        String expResult = "";
        String result = instance.getRECHENZEICHEN();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
