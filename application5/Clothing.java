package com.evergent.coreJAVA.Srinithya.application5;

import java.util.Scanner;

import com.evergent.coreJAVA.Srinithya.application5.ShoppingExceptions.InvalidPaymentMethodException;

public abstract class Clothing {
		static protected int itemCost;
	    static protected int totalAmount;
	    static protected int itemCount;
	    //constructor
	    public Clothing(){
	    	System.out.println("WELCOME TO ONLINE SHOPPING EXPERIENCE");
	    	System.out.println("CHOOSE YOUR OPTIONS ACCORDING TO YOUR PREFERENCES");
	    }
	    //abstract methods
	    abstract public void tshirt() throws ShoppingExceptions.InvalidItemException, ShoppingExceptions.InvalidPaymentMethodException;
	    abstract public void dresses() throws ShoppingExceptions.InvalidItemException, ShoppingExceptions.InvalidPaymentMethodException;
	    abstract public void jeans() throws ShoppingExceptions.InvalidItemException, ShoppingExceptions.InvalidPaymentMethodException;
	    abstract public  void initiatePayment(int amount) throws ShoppingExceptions.InvalidPaymentMethodException;
	    //Method to calculate total amount
	    public void calculateTotal() throws ShoppingExceptions.InvalidItemException, InvalidPaymentMethodException{
	        System.out.print("Enter the number of items: ");
	        Scanner br = new Scanner(System.in);
	        itemCount = Integer.parseInt(br.nextLine());
	        totalAmount = itemCost * itemCount;
	        System.out.println("Total cost: RS" + Clothing.totalAmount);
	        initiatePayment(totalAmount);
	    }
}
