package com.evergent.coreJAVA.Srinithya.application5;

public class ShoppingExceptions {
	// Exception for invalid item selection
    public static class InvalidItemException extends Exception {
        public InvalidItemException(String message) {
            super(message);
        }
    }

    // Exception for invalid size selection
    public static class InvalidSizeException extends Exception {
        public InvalidSizeException(String message) {
            super(message);
        }
    }

    // Exception for invalid payment method
    public static class InvalidPaymentMethodException extends Exception {
        public InvalidPaymentMethodException(String message) {
            super(message);
        }
    }
}
