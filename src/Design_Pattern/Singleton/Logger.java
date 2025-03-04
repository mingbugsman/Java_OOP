package Design_Pattern.Singleton;

public class Logger {
    private static Logger instance;

    private Logger() {}

    private synchronized Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String message) {
        System.out.println("LOG: " + message);
    }
}
