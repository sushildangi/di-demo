package org.pyarts.didemo.service;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("ka")
@Primary
public class PrimaryKannadaGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "ಹಲೋ - ನಾನು ಪ್ರಾಥಮಿಕ ಹಿಂದಿ ಸ್ವಾಗತ ಸೇವೆ.";
    }
}
