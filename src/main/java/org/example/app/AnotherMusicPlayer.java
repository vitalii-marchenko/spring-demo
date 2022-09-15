package org.example.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AnotherMusicPlayer {

    private final Music firstGenre;
    private final Music secondGenre;


    @Autowired
    public AnotherMusicPlayer(@Qualifier("rockMusic") Music firstGenre, @Qualifier("classicalMusic") Music secondGenre) {
        this.firstGenre = firstGenre;
        this.secondGenre = secondGenre;
    }

    public String playMusic() {
        return "Playing: " + firstGenre.getSong() + ", " + secondGenre.getSong();
    }
}
