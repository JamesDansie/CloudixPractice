package cloudix;

import org.junit.Test;

import static org.junit.Assert.*;

public class PrimeTest {

    @Test
    public void bruteForce() {
        assertTrue("11 is prime",
                Prime.bruteForce(11));
        assertFalse("4 is not prime",
                Prime.bruteForce(4));
        assertFalse("121 is not prime",
                Prime.bruteForce(121));
        assertTrue("2 is prime",
                Prime.bruteForce(2));
    }
}