package com.evergent.coreJAVA.Srinithya.application4;

public class PaymentModule {
	static private int amount;
    static private String paymentMethod;

    // Parameterized constructor
    public PaymentModule(int amount, String paymentMethod) {
        this.amount = amount;
        this.paymentMethod = paymentMethod;
    }

    // Method to process payment
    public void processPayment() {
        System.out.println("Processing payment...");
        System.out.println("Amount: RS" + PaymentModule.amount);
        System.out.println("Payment Method: " + PaymentModule.paymentMethod);

        // Simulate payment processing
        if (paymentMethod.equalsIgnoreCase("Credit Card") || paymentMethod.equalsIgnoreCase("Debit Card") || paymentMethod.equalsIgnoreCase("Cash")) {
            System.out.println("Payment successful!");
        } else {
            System.out.println("Invalid payment method. Payment failed.");
        }
    }

}
