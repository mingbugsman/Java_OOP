package Design_Pattern.Proxy_Pattern.Payment;

public class PaymentClient {
    public static void main(String[] args) {
        PaymentProxy paymentProxy = new PaymentProxy();
        paymentProxy.processPayment(100);
        paymentProxy.authenticateUser("admin", "password123");
        paymentProxy.processPayment(100);
    }
}
