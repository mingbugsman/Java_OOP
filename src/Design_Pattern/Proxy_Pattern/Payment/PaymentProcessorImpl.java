package Design_Pattern.Proxy_Pattern.Payment;

public class PaymentProcessorImpl  implements  PaymentProcessor{
    private final String paymentGateway;

    public PaymentProcessorImpl(String paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing payment of $" + amount + " through " + paymentGateway);
    }
}
