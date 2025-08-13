package Creational_Design_Patterns.Factory_Method;

public class Main {
    public static void main(String[] args) {
        PaymentGatewayService service = new PaymentGatewayService();
        service.payWith("Razorpay");
        service.payWith("Paypal");
        service.payWith("Stripe");
    }
}
