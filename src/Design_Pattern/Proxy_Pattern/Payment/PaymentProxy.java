package Design_Pattern.Proxy_Pattern.Payment;

public class PaymentProxy implements  PaymentProcessor {
    private PaymentProcessorImpl realPaymentProcessor;
    private boolean isAuthenticated;

    public PaymentProxy() {
        this.isAuthenticated = false;  // By default, the user is not authenticated
    }


    @Override
    public void processPayment(double amount) {
        if (!isAuthenticated) {
            System.out.println("Authentication failed. User must login first");
            return;
        }
        if  (realPaymentProcessor == null) {
            realPaymentProcessor = new PaymentProcessorImpl("PayPal");
        }
        logPaymentAttempt(amount);
        realPaymentProcessor.processPayment(amount);
    }
    // Method to authenticate the user
    public void authenticateUser(String username, String password) {
        // Simulate user authentication
        if (username.equals("admin") && password.equals("password123")) {
            isAuthenticated = true;
            System.out.println("Authentication successful. User is now logged in.");
        } else {
            System.out.println("Authentication failed. Invalid username or password.");
        }
    }

    // Method to log payment attempt
    private void logPaymentAttempt(double amount) {
        System.out.println("Logging payment attempt: $" + amount);
    }

}
