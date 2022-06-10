/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.khaphp.mathutil.test.core;

import com.khaphp.mathutil.core.MathUtil;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author LENOVO
 */
@RunWith(value = Parameterized.class)
public class DDTByMe {
    
    @Parameterized.Parameters
    public static Object[][] DataTest() {
        return new Integer[][]{
                                {0, 1}
                               ,{1, 1}
                               ,{2, 2}
                               ,{3, 6}
                };
    };
    
    @Parameterized.Parameter(value = 0)
    public int input;
    
    @Parameterized.Parameter(value = 1)
    public long expected;
    
    @Test
    public void TestFacReturnWell(){
        assertEquals(expected, MathUtil.getFactorial(input));
    }
}
