package org.pyarts.didemo.service;

import org.springframework.stereotype.Service;

@Service
public class GetterGreetingService implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Hello - I am injected via in Getter!!!";
    }
}
