package org.example.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {

    @Value("${volume.level}")
    private String volumeLevel;

    private final Environment environment;

    private final ClassicalMusic classicalMusic;

    private final RockMusic rockMusic;


    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic, Environment environment) {
        this.classicalMusic = classicalMusic;
        this.environment = environment;
        this.rockMusic = rockMusic;
    }

    public String playMusic() {
        return "Playing: " + classicalMusic.getSong() + ", " + rockMusic.getSong() + " on level: " + environment.getProperty("volume.level");
    }
}
