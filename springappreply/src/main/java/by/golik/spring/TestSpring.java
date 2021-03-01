package by.golik.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Nikita Golik
 */
public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        Music music = context.getBean("classicalMusic", Music.class);

        MusicPlayer musicPlayer = new MusicPlayer(music);

        musicPlayer.playMusic();

        Music music1 = context.getBean("rockMusic", Music.class);

        MusicPlayer musicPlayer1 = new MusicPlayer(music1);

        musicPlayer1.playMusic();

        context.close();
    }
}
