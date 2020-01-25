package problemstest.problem1;

import problems.problem1.ProblemOne;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ProblemOneTest {

    ProblemOne problemOne;

    @Before
    public void setUp(){
        problemOne = new ProblemOne();
    }

    @Test
    public void testOne(){
        Integer[] arr = {1,2,3};
        numOfUniqueTest(arr, 3);
    }

    @Test
    public void testTwo(){
        Integer[] arr = {4, 1, 3, 4, 2};
        numOfUniqueTest(arr, 3);
    }

    @Test
    public void testThree(){
        Integer[] arr = {1, 2, 5, 3, 9, 1};
        numOfUniqueTest(arr, 4);
    }


    public void numOfUniqueTest(Integer[] arr, int exp){
        int actual = problemOne.numOfUnique1(arr);

        Assert.assertEquals(exp, actual);
    }
}
