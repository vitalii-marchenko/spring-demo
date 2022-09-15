package org.example.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:application.properties")
@ComponentScan("org.example")
public class SpringConfig {

    @Bean
    public RockMusic rockMusicFromConfigClass() {
        return new RockMusic();
    }

}
