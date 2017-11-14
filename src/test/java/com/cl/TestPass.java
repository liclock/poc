package com.cl;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestPass
{
    @Test
    public void testReturnTrue() throws Exception
    {
        DemoTest foo = new DemoTest();
        Assert.assertTrue(foo.returnTrue());
    }
}