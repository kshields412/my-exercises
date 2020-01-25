package com.github.kshields412.problem1;

import org.junit.Assert;
import org.junit.Test;

public class PartATest {

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
        PartA problemOne = new PartA(arr);
        int actual = problemOne.numOfUnique();
        Assert.assertEquals(exp, actual);
    }
}
