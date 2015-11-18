package EasyRechner;

/*
 * Testklasse für den Subtrahierer (Strategy)
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
public class SubtrahiererTest {

    public SubtrahiererTest() {
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
     * Test: Subtrahieren von kleinen Zahlen / Ziffern.
     */
    @Test
    public void testBerechnenZiffern() {
        System.out.println("SubtrahierTest: testBerechnenZiffern()");
        Subtrahierer instance = new Subtrahierer();
        instance.setZahl1(new double[]{6.0, 0.0});
        instance.setZahl2(new double[]{0.0, 3.0});
        double result = instance.berechnen();
        Assert.assertEquals(3, result, 0.0);
    }

    /**
     * Test: Subtrahieren von großen Zahlen
     */
    @Test
    public void testBerechnenGroßeZahlen() {
        System.out.println("SubtrahierTest: testBerechnenGroßeZahlen()");
        Subtrahierer instance = new Subtrahierer();
        instance.setZahl1(new double[]{222222222.5, 0.0});
        instance.setZahl2(new double[]{0.0, 111111111.2});
        double result = instance.berechnen();
        Assert.assertEquals(111111111.3, result, 0.0);
    }

    /**
     * Test: Subtrahieren mit Null 1
     */
    @Test
    public void testSubtrahierenmitNull1() {
        System.out.println("testSubtrahierenmitNull1() ");
        Subtrahierer instance = new Subtrahierer();
        instance.setZahl1(new double[]{7.5, 0.0});
        instance.setZahl2(new double[]{0.0, 0.0});
        double result = instance.berechnen();
        Assert.assertEquals(7.5, result, 0.0);
    }

    /**
     * Test: Subtrahieren mit negativen Zahlen
     */
    @Test
    public void testSubtrahierenMitNegativenZahlen() {
        System.out.println("SubtrahierTest: testSubtrahierenMitNegativenZahlen() ");
        Subtrahierer instance = new Subtrahierer();
        instance.setZahl1(new double[]{-2.0, 0.0});
        instance.setZahl2(new double[]{0.0, -5.0});
        double result = instance.berechnen();
        Assert.assertEquals(3.0, result, 0.0);
    }

    /**
     * Test: Subtrahieren außer dem Wertebereich
     */
    @Test
    public void testSubtrahierenAusserWertebereich() {
        System.out.println("Subtrahieren: testSubtrahierenAusserWertebereich()");
        Dividierer instance = new Dividierer();
        instance.setZahl1(new double[]{-1.7976931348623157E308, 0.0});
        instance.setZahl2(new double[]{0.0, 0.0});
        double result = instance.berechnen();
        Assert.assertEquals(0.0, result, 0.0);
    }

    /**
     * Test of berechnen method, of class Subtrahierer.
     */
    @Test
    public void testBerechnen() {
        System.out.println("berechnen");
        Subtrahierer instance = new Subtrahierer();
        double expResult = 0.0;
        double result = instance.berechnen();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setZahl1 method, of class Subtrahierer.
     */
    @Test
    public void testSetZahl1() {
        System.out.println("setZahl1");
        double[] zahl1 = null;
        Subtrahierer instance = new Subtrahierer();
        instance.setZahl1(zahl1);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setZahl2 method, of class Subtrahierer.
     */
    @Test
    public void testSetZahl2() {
        System.out.println("setZahl2");
        double[] zahl2 = null;
        Subtrahierer instance = new Subtrahierer();
        instance.setZahl2(zahl2);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setErgebnis method, of class Subtrahierer.
     */
    @Test
    public void testSetErgebnis() {
        System.out.println("setErgebnis");
        double ergebnis = 0.0;
        Subtrahierer instance = new Subtrahierer();
        instance.setErgebnis(ergebnis);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getZahl1 method, of class Subtrahierer.
     */
    @Test
    public void testGetZahl1() {
        System.out.println("getZahl1");
        Subtrahierer instance = new Subtrahierer();
        double expResult = 0.0;
        double result = instance.getZahl1();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getZahl2 method, of class Subtrahierer.
     */
    @Test
    public void testGetZahl2() {
        System.out.println("getZahl2");
        Subtrahierer instance = new Subtrahierer();
        double expResult = 0.0;
        double result = instance.getZahl2();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNAME method, of class Subtrahierer.
     */
    @Test
    public void testGetNAME() {
        System.out.println("getNAME");
        Subtrahierer instance = new Subtrahierer();
        String expResult = "";
        String result = instance.getNAME();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getErgebnis method, of class Subtrahierer.
     */
    @Test
    public void testGetErgebnis() {
        System.out.println("getErgebnis");
        Subtrahierer instance = new Subtrahierer();
        double expResult = 0.0;
        double result = instance.getErgebnis();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRECHENZEICHEN method, of class Subtrahierer.
     */
    @Test
    public void testGetRECHENZEICHEN() {
        System.out.println("getRECHENZEICHEN");
        Subtrahierer instance = new Subtrahierer();
        String expResult = "";
        String result = instance.getRECHENZEICHEN();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
