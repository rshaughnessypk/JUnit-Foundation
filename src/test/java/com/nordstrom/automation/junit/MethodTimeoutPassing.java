package com.nordstrom.automation.junit;

import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.junit.Test;

public class MethodTimeoutPassing {
    
    @Test
    public void testPassed() {
        System.out.println("testPassed");
        assertTrue(true);
    }
    
    @Test(timeout = 1000)
    public void testPassedWithSpecifiedTimeout() throws InterruptedException {
        System.out.println("testPassedWithSpecifiedTimeout");
        TimeUnit.MILLISECONDS.sleep(600);
        assertTrue(true);
    }

}
