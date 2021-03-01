package by.golik.spring;

/**
 * @author Nikita Golik
 */
public class ClassicalMusic implements Music {
    private ClassicalMusic() {}
    public static ClassicalMusic getClassicalMusic() {
        return new ClassicalMusic();
    }
    public void doMyInit() {
        System.out.println("Doing my initialization");
    }
    public void doMyDestroy() {
        System.out.println("Doing my destroying");
    }
    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
