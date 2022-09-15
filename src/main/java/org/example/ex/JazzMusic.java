package org.example.ex;

import org.example.app.Music;
import org.springframework.stereotype.Component;

@Component("springWorkshop")
public class JazzMusic implements Music {
    @Override
    public String getSong() {
        return "Fly Me to the Moon";
    }
}
