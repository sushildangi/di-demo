package org.pyarts.didemo.controller;

import org.junit.Before;
import org.junit.Test;
import org.pyarts.didemo.controllers.SetterInjectedController;
import org.pyarts.didemo.service.GreetingServiceImpl;

import static org.junit.Assert.assertEquals;

public class SetterInjectedControllerTest {

    private SetterInjectedController setterInjectedController;

    @Before
    public void setUp() throws Exception{
        this.setterInjectedController = new SetterInjectedController();
        this.setterInjectedController.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    public void testGreeting() throws Exception{
        assertEquals(GreetingServiceImpl.HELLO_SUSHIL,setterInjectedController.sayHello());
    }
}
