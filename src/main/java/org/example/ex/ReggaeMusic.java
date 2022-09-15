package org.example.ex;

import org.example.app.Music;
import org.springframework.stereotype.Component;

@Component
public class ReggaeMusic implements Music {
    @Override
    public String getSong() {
        return "Roots, Rock, Reggae";
    }
}
