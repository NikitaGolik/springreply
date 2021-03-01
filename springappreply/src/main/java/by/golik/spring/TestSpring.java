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
        ClassicalMusic classicalMusic = context.getBean("musicBean", ClassicalMusic.class);

        System.out.println(classicalMusic.getSong());

        context.close();
    }
}
