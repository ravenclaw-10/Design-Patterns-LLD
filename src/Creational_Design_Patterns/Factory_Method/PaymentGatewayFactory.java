package Creational_Design_Patterns.Factory_Method;

interface Gateway {
    public void pay();
}

class Paypal implements Gateway {
    @Override
    public void pay() {
        System.out.println("Pay with Paypal");
    }
}

class Razorpay implements Gateway {
    @Override
    public void pay() {
        System.out.println("Pay with Razorpay");
    }
}

public class PaymentGatewayFactory {
    public static Gateway getmode(String mode) {
        if (mode.equalsIgnoreCase("Paypal")) {
            return new Paypal();
        }
        else if (mode.equalsIgnoreCase("Razorpay")) {
            return new Razorpay();
        }
        throw new IllegalAccessError("Gateway not found");
    }
}
