package problemstest.problem1;

import org.junit.Test;
import problems.problem1.ProblemOne;
import problemstest.RandomUtils;

public class PerformanceTest {
    private ProblemOne problemOne = new ProblemOne();

    @Test
    public void test1() {
        test(99999);
    }

    @Test
    public void test2() {
        test(999999);
    }

    @Test
    public void test3() {
        test(9999999);
    }

    private void test(Integer numberOfElements) {
        RandomUtils randomUtils = new RandomUtils();
        Integer[] input = randomUtils.createIntegerArray(0, 100, numberOfElements);
        problemOne.numOfUnique1(input);
    }
}
