package problemstest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import problems.problem3.ProblemThree;

public class ProblemThreeTest {
    ProblemThree problemThree;

    @Before
    public void setUp(){
        problemThree = new ProblemThree();
    }

    @Test
    public void testOne(){
        Integer[] arr = {4, 1, 3, 4, 2, 2, 3};
        getMissingNumberTest(arr, 1);
    }

    @Test
    public void testTwo(){
        Integer[] arr = {8, 6, 3, 2, 8, 2, 3};
        getMissingNumberTest(arr, 6);
    }

    @Test
    public void testThree(){
        Integer[] arr = {1, 1, 2, 9, 3, 8, 2, 3, 9};
        getMissingNumberTest(arr, 8);
    }

    public void getMissingNumberTest(Integer[] numArr, int exp){
        int actual = problemThree.getColumnAMissingNum(numArr);

        Assert.assertEquals(exp, actual);
    }
}
