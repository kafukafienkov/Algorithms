package pl.bartek.duplicatesCheck;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * author: Bartek
 */
public class DuplicatesCheckerTest extends TestCase {

    int[] numbers = {12, 27, 28, 20, 98898, 68798, 78, 27, 766, 8909};
    int[] numbers1 = {98349, 8493, 439, 3, 3424, 324, 324, 43, 433};
    int[] numbers2 = {0, 9231, 434, 32, 1324, 435, 345, 43, 434};
    int[] numbers3 = {34, 546, 6536, 6356, 356536, 3456, 34566, 6356};
    int[] numbers4 = {3214, 456, 456, 547, 54, 76, 47, 6, 7, 65, 8, 654, 63, 653, 74, 657};
    int[] numbers5 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    int[] numbers6 = {98, 76, 56, 23, 12, 34, 5465, 454546, 65675656, 657657};
    int[] numbers7 = {234235, 57658578, 4535346, 968790, 457646583, 234, 1234};
    int[] numbers8 = {65437, 2356577, 2345, 2485768, 1341, 879, 3426};
    int[] numbers9 = {87659, 123, 4367684, 123123, 45637875, 75683};

    private DuplicatesChecker checker;

    @Before
    public void setUp() throws Exception {
        checker = new DuplicatesChecker();
    }

    @After
    public void tearDown() throws Exception {
        checker = null;
    }

    @Test
    public void testContainsDuplicate() throws Exception {
        assertTrue(checker.containsDuplicate(numbers));
        assertTrue(checker.containsDuplicate(numbers1));
        assertTrue(checker.containsDuplicate(numbers2));
        assertTrue(checker.containsDuplicate(numbers3));
        assertTrue(checker.containsDuplicate(numbers4));

        assertFalse(checker.containsDuplicate(numbers5));
        assertFalse(checker.containsDuplicate(numbers6));
        assertFalse(checker.containsDuplicate(numbers7));
        assertFalse(checker.containsDuplicate(numbers8));
        assertFalse(checker.containsDuplicate(numbers9));
    }
}