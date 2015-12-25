package com.test.app;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AppTest
{
    private App app;

    @Before
    public void setUp() {
        this.app = new App();
    }

    @Test
    public void whenTheGreetingIsRequestedThenTheAppGreetsTheWorld()
    {
        assertEquals( "Hello World!", app.getGreeting());
    }
}
