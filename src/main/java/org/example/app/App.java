package org.example.app;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main( String[] args ) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                SpringConfig.class
        );

        // Manually created Java object
//        Music musicManuallyCreated = new RockMusic();
//        System.out.println(musicManuallyCreated.getSong());

        // Bean crated by Spring
//        Music rockMusicBySpring = context.getBean("rockMusic", Music.class);
//        System.out.println(rockMusicBySpring.getSong());

        // bean created manually in config
//        Music rockCreatedInConfig = context.getBean("rockMusicFromConfigClass", Music.class);
//        System.out.println(rockCreatedInConfig.getSong());

        // Autowire
//        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        System.out.println(musicPlayer.playMusic());

        // Beans with the same name
//        AnotherMusicPlayer anotherMusicPlayer = context.getBean("anotherMusicPlayer", AnotherMusicPlayer.class);
//        System.out.println(anotherMusicPlayer.playMusic());

        // Missing @Component and scan
//        Music reggaeMusic = context.getBean("reggaeMusic", Music.class);
//        System.out.println(reggaeMusic.getSong());


        // Wrong bean name
//        Music jazzMusic = context.getBean("springWorkshop", Music.class);
//        System.out.println(jazzMusic.getSong());

        // Injecting from properties file
        MusicPlayer musicPlayerWithProperties = context.getBean("musicPlayer", MusicPlayer.class);
        System.out.println(musicPlayerWithProperties.playMusic());
    }
}
