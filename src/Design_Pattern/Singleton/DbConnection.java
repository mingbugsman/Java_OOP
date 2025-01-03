 package Design_Pattern.Singleton;


// simulated database connection class using singleton pattern
public class DbConnection {
    // step 1 : Private static instance of the Database connection
    private static DbConnection instance;

    // step 2 : Simulated connection variable
    private String connectionStatus;

    private DbConnection() {
        connectionStatus = "Successfully connection database";
        System.out.println(connectionStatus);
    }

    public static synchronized DbConnection getInstance() {
        if (instance == null) {
            instance = new DbConnection();
        }
        return instance;
    }
    public void performOperation(String query) {
        if (connectionStatus != null) {
            System.out.println("Executing query : " + query);

        } else {
            System.out.println("No connection established!");
        }
    }
    public void closeConnection() {
        connectionStatus = null;
        System.out.println("Successfully closing db");
    }
}
