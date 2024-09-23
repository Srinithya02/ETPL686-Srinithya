package com.evergent.coreJAVA.Srinithya.application4;

public abstract class ItemReview {
	 protected String reviewMessage;

	    public ItemReview(String reviewMessage) {
	        this.reviewMessage = reviewMessage;
	    }

	    public abstract void displayReview();
	 
}
