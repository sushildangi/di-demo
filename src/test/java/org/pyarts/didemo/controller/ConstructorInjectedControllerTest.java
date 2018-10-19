package org.pyarts.didemo.controller;

import org.junit.Before;
import org.junit.Test;
import org.pyarts.didemo.controllers.ConstructorInjectedController;
import org.pyarts.didemo.service.GreetingServiceImpl;

import static org.junit.Assert.assertEquals;

public class ConstructorInjectedControllerTest {

    private ConstructorInjectedController constructorInjectedController;

    @Before
    public void setUp() throws Exception{
       this.constructorInjectedController = new ConstructorInjectedController(new GreetingServiceImpl());
    }

    @Test
    public void testGreeting() throws Exception{
        assertEquals(GreetingServiceImpl.HELLO_SUSHIL,constructorInjectedController.sayHello());
    }
}
