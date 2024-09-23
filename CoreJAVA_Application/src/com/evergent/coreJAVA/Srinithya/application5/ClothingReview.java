package com.evergent.coreJAVA.Srinithya.application5;

public class ClothingReview extends ItemReview {
	public ClothingReview(String reviewMessage) {
        super(reviewMessage);
    }

    @Override
    public void displayReview() {
        System.out.println("Clothing Review: " + reviewMessage);
    }
}


