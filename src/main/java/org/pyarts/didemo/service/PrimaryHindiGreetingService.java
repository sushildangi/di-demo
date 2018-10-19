package org.pyarts.didemo.service;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("hi")
@Primary
public class PrimaryHindiGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "हैलो - मैं प्राथमिक हिंदी नमस्कार सेवा हूं।";
    }
}
