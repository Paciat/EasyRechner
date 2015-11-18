package EasyRechner;

/*
 * Testklasse für den Dividierer (Strategy)
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
public class DividiererTest {

    public DividiererTest() {
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
     * Test: Dividieren mit kleinen Zahlen / Ziffern.
     */
    @Test
    public void testBerechnenZiffern() {
        System.out.println("DividierenTest: testBerechnenZiffern()");
        Dividierer instance = new Dividierer();
        instance.setZahl1(new double[]{6.0, 0.0});
        instance.setZahl2(new double[]{0.0, 3.0});
        double result = instance.berechnen();
        Assert.assertEquals(2, result, 0.0);
    }

    /**
     * Test: Dividieren mit großen Zahlen
     */
    @Test
    public void testBerechnenGroßeZahlen() {
        System.out.println("DividierenTest: testBerechnenGroßeZahlen()");
        Dividierer instance = new Dividierer();
        instance.setZahl1(new double[]{666666666.666666666666666, 0.0});
        instance.setZahl2(new double[]{0.0, 333333333.333333333333333});
        double result = instance.berechnen();
        Assert.assertEquals(2.0, result, 0.0);
    }

    /**
     * Test: Dividieren von Null
     */
    @Test
    public void testDividierenVonNull() {
        System.out.println("DividierenTest: testDividierenVonNull() ");
        Dividierer instance = new Dividierer();
        instance.setZahl1(new double[]{0.0, 0.0});
        instance.setZahl2(new double[]{0.0, 5.0});
        double result = instance.berechnen();
        Assert.assertEquals(0.0, result, 0.0);
    }

    /**
     * Test: Dividieren durch Null
     */
    @Test
    public void testDividierenDurchNull() {
        System.out.println("DividierenTest: testDividierenDurchNull() ");
        Dividierer instance = new Dividierer();
        instance.setZahl1(new double[]{5.0, 0.0});
        instance.setZahl2(new double[]{0.0, 0.0});
        double result = instance.berechnen();
        Assert.assertEquals(0.0, result, 0.0);
    }

    /**
     * Test: Dividieren mit negativen Zahlen
     */
    @Test
    public void testDividierenVonNegativenZahlen() {
        System.out.println("DividierenTest: testDividierenVonNegativenZahlen( ");
        Dividierer instance = new Dividierer();
        instance.setZahl1(new double[]{-10.0, 0.0});
        instance.setZahl2(new double[]{0.0, -5.0});
        double result = instance.berechnen();
        Assert.assertEquals(2.0, result, 0.0);
    }
    /**
     * Test: Dividieren außer dem Wertebereich
     */
    @Test
    public void testDividierenAusserWertebereich() {
        System.out.println("Dividieren: testDividierenAusserWertebereich()");
        Dividierer instance = new Dividierer();
        instance.setZahl1(new double[]{1.7976931348623157E308, 0.0});
        instance.setZahl2(new double[]{0.0, 0.5});
        double result = instance.berechnen();
        Assert.assertEquals(0.0, result, 0.0);
    }

    /**
     * Test of berechnen method, of class Dividierer.
     */
    @Test
    public void testBerechnen() {
        System.out.println("berechnen");
        Dividierer instance = new Dividierer();
        double expResult = 0.0;
        double result = instance.berechnen();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setZahl1 method, of class Dividierer.
     */
    @Test
    public void testSetZahl1() {
        System.out.println("setZahl1");
        double[] zahl1 = null;
        Dividierer instance = new Dividierer();
        instance.setZahl1(zahl1);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setZahl2 method, of class Dividierer.
     */
    @Test
    public void testSetZahl2() {
        System.out.println("setZahl2");
        double[] zahl2 = null;
        Dividierer instance = new Dividierer();
        instance.setZahl2(zahl2);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setErgebnis method, of class Dividierer.
     */
    @Test
    public void testSetErgebnis() {
        System.out.println("setErgebnis");
        double ergebnis = 0.0;
        Dividierer instance = new Dividierer();
        instance.setErgebnis(ergebnis);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getZahl1 method, of class Dividierer.
     */
    @Test
    public void testGetZahl1() {
        System.out.println("getZahl1");
        Dividierer instance = new Dividierer();
        double expResult = 0.0;
        double result = instance.getZahl1();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getZahl2 method, of class Dividierer.
     */
    @Test
    public void testGetZahl2() {
        System.out.println("getZahl2");
        Dividierer instance = new Dividierer();
        double expResult = 0.0;
        double result = instance.getZahl2();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNAME method, of class Dividierer.
     */
    @Test
    public void testGetNAME() {
        System.out.println("getNAME");
        Dividierer instance = new Dividierer();
        String expResult = "";
        String result = instance.getNAME();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getErgebnis method, of class Dividierer.
     */
    @Test
    public void testGetErgebnis() {
        System.out.println("getErgebnis");
        Dividierer instance = new Dividierer();
        double expResult = 0.0;
        double result = instance.getErgebnis();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRECHENZEICHEN method, of class Dividierer.
     */
    @Test
    public void testGetRECHENZEICHEN() {
        System.out.println("getRECHENZEICHEN");
        Dividierer instance = new Dividierer();
        String expResult = "";
        String result = instance.getRECHENZEICHEN();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
