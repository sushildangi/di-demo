package org.pyarts.didemo.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {

    public static final String HELLO_SUSHIL = "Hello Sushil !!!!";

    @Override
    public String sayGreeting() {
        return HELLO_SUSHIL;
    }
}
