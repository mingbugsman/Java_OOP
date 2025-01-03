package Design_Pattern.Singleton;

public class Singleton {
    // step 1 : create a private static instance;
    private static Singleton instance;

    // step 2 : Make the constructor private to prevent instantiation
    private  Singleton() {};

    // step 3 : Provide a public static method for access
    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    // demonstrate functionality
    public void showMessage() {
        System.out.println("Singleton instance accessed");
    }
}
