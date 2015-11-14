package EasyRechner;

/*
 * Testklasse für den Multiplizierer (Strategy)
 */


import EasyRechner.Multiplizierer;
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
}
