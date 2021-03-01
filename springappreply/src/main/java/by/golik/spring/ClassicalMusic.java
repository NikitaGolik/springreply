package by.golik.spring;

import org.springframework.stereotype.Component;

/**
 * @author Nikita Golik
 */
@Component
public class ClassicalMusic implements Music {

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
