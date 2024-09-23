package com.evergent.coreJAVA.Srinithya.application4;

import java.util.Scanner;

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
	    abstract public void tshirt();
	    abstract public void dresses();
	    abstract public void jeans();
	    abstract public  void initiatePayment(int amount);
	    //Method to calculate total amount
	    public void calculateTotal(){
	        System.out.print("Enter the number of items: ");
	        Scanner br = new Scanner(System.in);
	        itemCount = Integer.parseInt(br.nextLine());
	        totalAmount = itemCost * itemCount;
	        System.out.println("Total cost: RS" + Clothing.totalAmount);
	        initiatePayment(totalAmount);
	    }
}
