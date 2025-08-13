package Creational_Design_Patterns.Factory_Method;

public class PaymentGatewayService{
    public void payWith(String mode) {
        Gateway gateway = PaymentGatewayFactory.getmode(mode);
        gateway.pay();
    }
}
