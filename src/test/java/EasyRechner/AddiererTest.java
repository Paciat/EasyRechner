package EasyRechner;

/*
 * Testklasse für den Addierer (Strategy)
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
public class AddiererTest {

    public AddiererTest() {
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
     * Test: Addieren von kleinen Zahlen / Ziffern.
     */
    @Test
    public void testBerechnenZiffern() {
        System.out.println("AddiererTest: testBerechnenZiffern()");
        Addierer instance = new Addierer();
        instance.setZahl1(new double[]{6.0, 0.0});
        instance.setZahl2(new double[]{0.0, 3.0});
        double result = instance.berechnen();
        Assert.assertEquals(9, result, 0.0);
    }

    /**
     * Test: Addieren von großen Zahlen
     */
    @Test
    public void testBerechnenGroßeZahlen() {
        System.out.println("AddiererTest: testBerechnenGroßeZahlen()");
        Addierer instance = new Addierer();
        instance.setZahl1(new double[]{222222222.2222222222222223, 0.0});
        instance.setZahl2(new double[]{0.0, 333333333.3333333333333335});
        double result = instance.berechnen();
        Assert.assertEquals(555555555.5555555555555558, result, 0.0);
    }

    /**
     * Test: Addieren mit Null
     */
    @Test
    public void testAddierenmitNull() {
        System.out.println("AddiererTest: testAddierenmitNull() ");
        Addierer instance = new Addierer();
        instance.setZahl1(new double[]{0.0, 0.0});
        instance.setZahl2(new double[]{0.0, 0.0});
        double result = instance.berechnen();
        Assert.assertEquals(0.0, result, 0.0);
    }

    /**
     * Test: Addieren von negativen Zahlen
     */
    @Test
    public void testAddierenVonNegativenZahlen() {
        System.out.println("AddiererTest: testAddierenVonNegativenZahlen() ");
        Addierer instance = new Addierer();
        instance.setZahl1(new double[]{-2.0, 0.0});
        instance.setZahl2(new double[]{0.0, -5.0});
        double result = instance.berechnen();
        Assert.assertEquals(-7.0, result, 0.0);
    }

    /**
     * Test: Addieren außer dem Wertebereich
     */
    @Test
    public void testAddierenAusserWertebereich() {
        System.out.println("AddiererTest: testAddierenAusserWertebereich()");
        Addierer instance = new Addierer();
        instance.setZahl1(new double[]{1.7976931348623157E308, 0.0});
        instance.setZahl2(new double[]{0.0, 1.0});
        double result = instance.berechnen();
        Assert.assertEquals(0.0, result, 0.0);
    }

    /**
     * Test of berechnen method, of class Addierer.
     */
    @Test
    public void testBerechnen() {
        System.out.println("berechnen");
        Addierer instance = new Addierer();
        double expResult = 0.0;
        double result = instance.berechnen();
    }


}
