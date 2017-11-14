package com.cl;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestFail
{
    @Test
    public void testFail() throws Exception
    {
        DemoTest foo = new DemoTest();
        Assert.assertTrue(foo.returnFalse());
    }
}
