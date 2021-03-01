package by.golik.spring;

import org.springframework.stereotype.Component;

/**
 * @author Nikita Golik
 */
@Component
public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "Wind cries Mary";
    }
}
