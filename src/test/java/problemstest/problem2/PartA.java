package problemstest.problem2;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PartA {
    problems.problem2.PartA partA;

    @Before
    public void setUp() {
        partA = new problems.problem2.PartA();
    }

    @Test
    public void testOne() {
        String[] arrA = {"a", "b", "c", "d"};
        String[] arrB = {"b", "c", "d"};
        getNumberOfCommonStringsTest(arrA, arrB, 3);
    }

    @Test
    public void testTwo() {
        String[] arrA = {"a", "b", "c", "d", "e", "f"};
        String[] arrB = {"a", "b", "c", "e", "f"};
        getNumberOfCommonStringsTest(arrA, arrB, 5);
    }

    @Test
    public void testThree() {
        String[] arrA = {"c", "d", "e", "f"};
        String[] arrB = {"b", "c", "d"};
        getNumberOfCommonStringsTest(arrA, arrB, 2);
    }

    public void getNumberOfCommonStringsTest(String[] arrA, String[] arrB, int exp) {
        int actual = partA.getNumberOfCommonStrings(arrA, arrB);
        Assert.assertEquals(exp, actual);
    }

}