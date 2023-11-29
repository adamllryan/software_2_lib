import static org.junit.Assert.assertEquals;

import org.junit.Test;

import components.naturalnumber.NaturalNumber;
import components.naturalnumber.NaturalNumber2;

/**
 * @author Adam Ryan
 *
 */
public class CryptoUtilitiesTest {

    /*
     * Tests of reduceToGCD
     */

    @Test
    public void testReduceToGCD_0_0() {
        NaturalNumber n = new NaturalNumber2(0);
        NaturalNumber nExpected = new NaturalNumber2(0);
        NaturalNumber m = new NaturalNumber2(0);
        NaturalNumber mExpected = new NaturalNumber2(0);
        CryptoUtilities.reduceToGCD(n, m);
        assertEquals(nExpected, n);
        assertEquals(mExpected, m);
    }

    @Test
    public void testReduceToGCD_30_21() {
        NaturalNumber n = new NaturalNumber2(30);
        NaturalNumber nExpected = new NaturalNumber2(3);
        NaturalNumber m = new NaturalNumber2(21);
        NaturalNumber mExpected = new NaturalNumber2(0);
        CryptoUtilities.reduceToGCD(n, m);
        assertEquals(nExpected, n);
        assertEquals(mExpected, m);
    }

    /*
     * Tests of isEven
     */

    @Test
    public void testIsEven_0() {
        NaturalNumber n = new NaturalNumber2(0);
        NaturalNumber nExpected = new NaturalNumber2(0);
        boolean result = CryptoUtilities.isEven(n);
        assertEquals(nExpected, n);
        assertEquals(true, result);
    }

    @Test
    public void testIsEven_1() {
        NaturalNumber n = new NaturalNumber2(1);
        NaturalNumber nExpected = new NaturalNumber2(1);
        boolean result = CryptoUtilities.isEven(n);
        assertEquals(nExpected, n);
        assertEquals(false, result);
    }

    /*
     * Tests of powerMod
     */

    @Test
    public void testPowerMod_0_0_2() {
        NaturalNumber n = new NaturalNumber2(0);
        NaturalNumber nExpected = new NaturalNumber2(1);
        NaturalNumber p = new NaturalNumber2(0);
        NaturalNumber pExpected = new NaturalNumber2(0);
        NaturalNumber m = new NaturalNumber2(2);
        NaturalNumber mExpected = new NaturalNumber2(2);
        CryptoUtilities.powerMod(n, p, m);
        assertEquals(nExpected, n);
        assertEquals(pExpected, p);
        assertEquals(mExpected, m);
    }

    @Test
    public void testPowerMod_17_18_19() {
        NaturalNumber n = new NaturalNumber2(17);
        NaturalNumber nExpected = new NaturalNumber2(1);
        NaturalNumber p = new NaturalNumber2(18);
        NaturalNumber pExpected = new NaturalNumber2(18);
        NaturalNumber m = new NaturalNumber2(19);
        NaturalNumber mExpected = new NaturalNumber2(19);
        CryptoUtilities.powerMod(n, p, m);
        assertEquals(nExpected, n);
        assertEquals(pExpected, p);
        assertEquals(mExpected, m);
    }
    
    @Test
    public void testPowerMod_0_2_4() {
        NaturalNumber n = new NaturalNumber2(0);
        NaturalNumber nExpected = new NaturalNumber2(0);
        NaturalNumber p = new NaturalNumber2(2);
        NaturalNumber pExpected = new NaturalNumber2(2);
        NaturalNumber m = new NaturalNumber2(4);
        NaturalNumber mExpected = new NaturalNumber2(4);
        CryptoUtilities.powerMod(n, p, m);
        assertEquals(nExpected, n);
        assertEquals(pExpected, p);
        assertEquals(mExpected, m);
    }
    @Test
    public void testPowerMod_3_2_2() {
        NaturalNumber n = new NaturalNumber2(3);
        NaturalNumber nExpected = new NaturalNumber2(1);
        NaturalNumber p = new NaturalNumber2(2);
        NaturalNumber pExpected = new NaturalNumber2(2);
        NaturalNumber m = new NaturalNumber2(2);
        NaturalNumber mExpected = new NaturalNumber2(2);
        CryptoUtilities.powerMod(n, p, m);
        assertEquals(nExpected, n);
        assertEquals(pExpected, p);
        assertEquals(mExpected, m);
    }
    @Test
    public void testPowerMod_2_2_2() {
        NaturalNumber n = new NaturalNumber2(2);
        NaturalNumber nExpected = new NaturalNumber2(0);
        NaturalNumber p = new NaturalNumber2(2);
        NaturalNumber pExpected = new NaturalNumber2(2);
        NaturalNumber m = new NaturalNumber2(2);
        NaturalNumber mExpected = new NaturalNumber2(2);
        CryptoUtilities.powerMod(n, p, m);
        assertEquals(nExpected, n);
        assertEquals(pExpected, p);
        assertEquals(mExpected, m);
    }
    @Test
    public void testPowerMod_10_3_4() {
        NaturalNumber n = new NaturalNumber2(10);
        NaturalNumber nExpected = new NaturalNumber2(0);
        NaturalNumber p = new NaturalNumber2(3);
        NaturalNumber pExpected = new NaturalNumber2(3);
        NaturalNumber m = new NaturalNumber2(4);
        NaturalNumber mExpected = new NaturalNumber2(4);
        CryptoUtilities.powerMod(n, p, m);
        assertEquals(nExpected, n);
        assertEquals(pExpected, p);
        assertEquals(mExpected, m);
    }
    @Test
    public void testPowerMod_15_7_7() {
        NaturalNumber n = new NaturalNumber2(15);
        NaturalNumber nExpected = new NaturalNumber2(1);
        NaturalNumber p = new NaturalNumber2(7);
        NaturalNumber pExpected = new NaturalNumber2(7);
        NaturalNumber m = new NaturalNumber2(7);
        NaturalNumber mExpected = new NaturalNumber2(7);
        CryptoUtilities.powerMod(n, p, m);
        assertEquals(nExpected, n);
        assertEquals(pExpected, p);
        assertEquals(mExpected, m);
    }
    @Test
    public void testPowerModBruteTest() throws InterruptedException {
    	for (int i = 0; i<=30;i++) {
    		for (int j = 0; j<=15;j++) {
    			for (int k = 2; k<=15; k++) {
    				NaturalNumber n = new NaturalNumber2(i);
    				NaturalNumber nTemp = new NaturalNumber2(n);
    				NaturalNumber temp = new NaturalNumber2(n);
    				nTemp.power(j);
    				NaturalNumber m = new NaturalNumber2(k);
    				NaturalNumber nDiv = nTemp.divide(m);
    		        NaturalNumber nExpected = new NaturalNumber2(nDiv);
    		        NaturalNumber p = new NaturalNumber2(j);
    		        NaturalNumber pExpected = new NaturalNumber2(j);
    		        NaturalNumber mExpected = new NaturalNumber2(k);
    		        CryptoUtilities.powerMod(n, p, m);
    		        if (n.compareTo(nExpected)!=0 || p.compareTo(pExpected)!=0 || m.compareTo(mExpected)!=0) 
    		        	System.out.println("Failure at: \n"
    		        			+ "n: " + n + " Expected: " + nExpected + "\n"
    		        			+ "n: " + p + " Expected: " + pExpected + "\n"
    		        			+ "n: " + m + " Expected: " + mExpected + "\n"
    		        			+ "n: " + temp + " p: " + p + " m: " + m + "\n-----------");
    		        assertEquals(nExpected, n);
    		        assertEquals(pExpected, p);
    		        assertEquals(mExpected, m);
    			}
    		}
    	}
    }
    @Test
    public void testPowerMod_1_1_2() {
        NaturalNumber n = new NaturalNumber2(1);
        NaturalNumber nExpected = new NaturalNumber2(1);
        NaturalNumber p = new NaturalNumber2(1);
        NaturalNumber pExpected = new NaturalNumber2(1);
        NaturalNumber m = new NaturalNumber2(2);
        NaturalNumber mExpected = new NaturalNumber2(2);
        CryptoUtilities.powerMod(n, p, m);
        assertEquals(nExpected, n);
        assertEquals(pExpected, p);
        assertEquals(mExpected, m);
    }
    //Test isWitnessToCompositness
    @Test
    public void testPrime_99() {
    	NaturalNumber p = new NaturalNumber2(99);
    	assertEquals(CryptoUtilities.isPrime2(p), false);
    }
    @Test
    public void testPrime_2() {
    	NaturalNumber p = new NaturalNumber2(2);
    	assertEquals(CryptoUtilities.isPrime2(p), true);
    }
    @Test
    public void testPrime_53() {
    	NaturalNumber p = new NaturalNumber2(53);
    	assertEquals(CryptoUtilities.isPrime2(p), true);
    }
    @Test
    public void testPrime_1000() {
    	NaturalNumber p = new NaturalNumber2(1000);
    	assertEquals(CryptoUtilities.isPrime2(p), false);
    }
}