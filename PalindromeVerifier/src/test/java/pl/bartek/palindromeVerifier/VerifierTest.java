package pl.bartek.palindromeVerifier;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * author: Bartek
 */
public class VerifierTest extends TestCase {

    private Verifier verifier;

    @Before
    public void setUp() throws Exception {
        verifier = new Verifier();
    }

    @After
    public void tearDown() throws Exception {
        verifier = null;
    }

    @Test
    public void testIsPalindrome() throws Exception {
        assertTrue(verifier.isPalindrome("kajak", "kajak"));
        assertTrue(verifier.isPalindrome("ikar ³apa³ raki", "ikar ³apa³ raki"));

        assertFalse(verifier.isPalindrome("motorower", "motorower"));
        assertFalse(verifier.isPalindrome("komputer", "komputer"));
    }
}