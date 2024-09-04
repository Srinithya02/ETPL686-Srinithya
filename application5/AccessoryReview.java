package com.evergent.coreJAVA.Srinithya.application5;

public class AccessoryReview extends ItemReview{
	

	    public AccessoryReview(String reviewMessage) {
	        super(reviewMessage);
	    }

	    @Override
	    public void displayReview() {
	        System.out.println("Accessory Review: " + reviewMessage);
	    }

	
}
