package com.evergent.coreJAVA.Srinithya.application4;

public class AccessoryReview extends ItemReview{
	

	    public AccessoryReview(String reviewMessage) {
	        super(reviewMessage);
	    }

	    @Override
	    public void displayReview() {
	        System.out.println("Accessory Review: " + reviewMessage);
	    }

	
}
