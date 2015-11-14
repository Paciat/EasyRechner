package EasyRechner;

/*
 * Testklasse für den Subtrahierer (Strategy)
 */


import EasyRechner.Dividierer;
import EasyRechner.Subtrahierer;
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

}
