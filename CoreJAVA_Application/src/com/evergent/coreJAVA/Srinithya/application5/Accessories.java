package com.evergent.coreJAVA.Srinithya.application5;

import com.evergent.coreJAVA.Srinithya.application5.ShoppingExceptions.InvalidPaymentMethodException;

public interface Accessories {
    void earrings() throws ShoppingExceptions.InvalidItemException, ShoppingExceptions.InvalidPaymentMethodException;
    void shoe() throws ShoppingExceptions.InvalidItemException, ShoppingExceptions.InvalidSizeException, ShoppingExceptions.InvalidPaymentMethodException;
    void bags() throws ShoppingExceptions.InvalidItemException, ShoppingExceptions.InvalidPaymentMethodException;
    void handBags() throws ShoppingExceptions.InvalidItemException, ShoppingExceptions.InvalidPaymentMethodException;
}
