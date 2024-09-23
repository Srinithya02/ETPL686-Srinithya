package com.evergent.coreJAVA.Srinithya.application4;
import java.util.Scanner;

public class ClothingShoppingMain extends Clothing implements Accessories{
	 
	    @Override
	    public void tshirt() {
	        itemCost = 30;
	        calculateTotal();
	    }
	    @Override
	    public void dresses() {
	        itemCost = 50;
	        calculateTotal();
	    }
	    @Override
	    public void jeans() {
	        itemCost = 40;
	        calculateTotal();
	    }
	    @Override
	    public void earrings() {
	        itemCost = 20;
	        calculateTotal();
	    }
	    @Override
	    public void shoe() {
	        System.out.println("Shoe Options");
	        System.out.println("======================");
	        System.out.println("N - Nike (RS70 each)");
	        System.out.println("P - Puma (RS75 each)");
	        System.out.println("F - Adidas (RS80 each)");
	        System.out.print("Enter your shoe type (N, P, F): ");
	        Scanner br = new Scanner(System.in);
	        String type = br.nextLine();
	        switch (type.toUpperCase()) {
	            case "N":
	                itemCost = 70;
	                break;
	            case "P":
	                itemCost = 75;
	                break;
	            case "F":
	                itemCost = 80;
	                break;
	            default:
	                System.out.println("Invalid shoe type selected.");
	                return;
	        }
	        System.out.println("Available Sizes for Shoes: 5, 6, 7, 8, 9");
	        System.out.print("Enter your shoe size (5-9): ");
	        int shoeSize = Integer.parseInt(br.nextLine());
	        
	        if (shoeSize < 5 || shoeSize > 9) {
	            System.out.println("Invalid shoe size selected.");
	            br.close();
	            return; 
	        }
	        calculateTotal();
	    }
	    @Override
	    public void bags() {
	        System.out.println("Bag Options");
	        System.out.println("======================");
	        System.out.println("L - AmericanTourister (RS50 each)");
	        System.out.println("I - SkyBags (RS60 each)");
	        System.out.print("Enter your bag type (L, I): ");
	        Scanner br = new Scanner(System.in);
	        String type = br.nextLine();
	        switch (type.toUpperCase()) {
	            case "L":
	                itemCost = 50;
	                break;
	            case "I":
	                itemCost = 60;
	                break;
	            default:
	                System.out.println("Invalid bag type selected.");
	                return;
	        }
	        calculateTotal();
	    }
	    @Override
	    public void handBags() {
	        System.out.println("Handbag Options");
	        System.out.println("======================");
	        System.out.println("G - Gucci (RS90 each)");
	        System.out.println("N - Prada (RS100 each)");
	        System.out.println("V - LouisVuitton (RS120 each)");
	        System.out.print("Enter your handbag type (G, N, V): ");
	        Scanner br = new Scanner(System.in);
	        String type = br.nextLine();
	        switch (type.toUpperCase()) {
	            case "G":
	                itemCost = 90;
	                break;
	            case "N":
	                itemCost = 100;
	                break;
	            case "V":
	                itemCost = 120;
	                break;
	            default:
	                System.out.println("Invalid handbag type selected.");
	                return;
	        }
	        calculateTotal();
	    }
	    @Override
		public void initiatePayment(int amount) {
	    	Scanner br = new Scanner(System.in);
	        System.out.println("Payment Options");
	        System.out.println("======================");
	        System.out.println("1 - Credit Card");
	        System.out.println("2 - Debit Card");
	        System.out.println("3 - Cash");
	        System.out.print("Enter your payment method (1, 2, 3): ");
	        int paymentChoice = Integer.parseInt(br.nextLine());

	        String paymentMethod = "";
	        switch (paymentChoice) {
	            case 1:
	                paymentMethod = "Credit Card";
	                break;
	            case 2:
	                paymentMethod = "Debit Card";
	                break;
	            case 3:
	                paymentMethod = "Cash";
	                break;
	            default:
	                System.out.println("Invalid payment method selected.");
	                return;
	        }

	        // Creating PaymentModule instance
	        PaymentModule paymentModule = new PaymentModule(amount, paymentMethod);
	        paymentModule.processPayment();
	    }

	    	    
	    public static void main(String[] args) {
	        ClothingShoppingMain shop = new ClothingShoppingMain();
	        Scanner br = new Scanner(System.in);
	        boolean continueShopping = true;
	        
	        while (continueShopping) {
	            System.out.println("======================");
	            System.out.println("Shopping Main Menu");
	            System.out.print("Enter your category (W, G, M, B, K): ");  //TO CHOOSE CATEGORY OF WOMEN, GIRL, MEN, BOY,KIDS.
	            String option1 = br.nextLine();
	            System.out.println("======================");
	            System.out.println("C - Clothing");
	            System.out.println("A - Accessories");
	            System.out.println("R - Review ");
	            System.out.println("E - Exit");
	            System.out.println("======================");
	            System.out.print("Enter your option (C, A, R, E): ");  //CLOTHING,ACCESSORIES,EXIT
	            String option = br.nextLine();
	            switch (option.toUpperCase()) {
	            case "C":
	                System.out.println("Clothing Options");
	                System.out.println("======================");
	                System.out.println("T - T-Shirts");
	                System.out.println("D - Dresses");
	                System.out.println("J - Jeans");
	                System.out.println("======================");
	                System.out.print("Enter your clothing type (T, D, J): ");  //T-SHIRTS,DRESSES,JEANS
	                String clothingType = br.nextLine();
	                switch (clothingType.toUpperCase()) {
	                    case "T":
	                       
	                        System.out.println("Available Sizes for T-Shirts: S, M, L");  //SIZES-SMALL,MEDIUM,LARGE
	                        System.out.print("Enter your size (S, M, L): ");
	                        String tShirtSize = br.nextLine();
	                        if (!tShirtSize.equalsIgnoreCase("S") && !tShirtSize.equalsIgnoreCase("M") && !tShirtSize.equalsIgnoreCase("L")) {
	                            System.out.println("Invalid size selected.");
	                            return; 
	                        }
	                        shop.tshirt(); 
	                        break;
	                        
	                    case "D":
	                    	System.out.println("Available Sizes for Dresses:S, M, L");
	                        System.out.print("Enter your size (S, M, L): ");
	                        String dressSize = br.nextLine();
	                        if (!dressSize.equalsIgnoreCase("S") && !dressSize.equalsIgnoreCase("M") && !dressSize.equalsIgnoreCase("L")) {
	                            System.out.println("Invalid size selected.");
	                            return; 
	                        }
	                        shop.dresses(); 
	                        break;
	                        
	                    case "J":
	                        shop.jeans(); 
	                        break;
	                        
	                    default:
	                        System.out.println("Invalid clothing type selected.");
	                        break;
	                }
	                break;

	                case "A":
	                    System.out.println("Accessory Options");   //ACCESSORIES-EARRINGS,SHOE,BAGS,HANDBAGS
	                    System.out.println("======================");
	                    System.out.println("H - Earrings");
	                    System.out.println("S - Shoes");
	                    System.out.println("B - Bags");
	                    System.out.println("O - Handbags");
	                    System.out.println("======================");
	                    System.out.print("Enter your accessory type (H, S, B, O): ");
	                    String accessoryType = br.nextLine();
	                    switch (accessoryType.toUpperCase()) {
	                        case "H":
	                            shop.earrings();
	                            break;
	                        case "S":
	                            shop.shoe();
	                            break;
	                        case "B":
	                            shop.bags();
	                            break;
	                        case "O":
	                            shop.handBags();
	                            break;
	                        default:
	                            System.out.println("Invalid accessory type selected.");
	                    }
	                    break;
	                    
	                case "R":
	                    System.out.println("Prints Review");
	                    System.out.println("======================");
	                    System.out.println("C - Clothing Review");
	                    System.out.println("A - Accessory Review");
	                    System.out.print("Enter your review option (C, A): ");
	                    String reviewOption = br.nextLine();
	                    switch (reviewOption.toUpperCase()) {
	                        case "C":
	                            handleClothingReview();
	                            break;
	                        case "A":
	                            handleAccessoryReview();
	                            break;
	                        default:
	                            System.out.println("Invalid review option selected.");
	                    }
	                    break;

	                case "E":
	                    System.out.println("Exiting the system...");
	                    br.close();
	                    return;

	                default:
	                    System.out.println("Invalid option selected.");
	            }
	        }
	    }

	    public static void handleClothingReview() {
	        System.out.println("Clothing Review Options:");
	        System.out.println("1 - Review 1: Great quality and fit!");
	        System.out.println("2 - Review 2: Average quality and fit!");
	        System.out.print("Enter your review option (1, 2): ");
	        Scanner br = new Scanner(System.in);
	        String reviewChoice = br.nextLine();
	        
	        switch (reviewChoice) {
	            case "1":
	                ClothingReview clothingReview = new ClothingReview("Great quality and fit! \n------ThankYou for your great review.");
	                clothingReview.displayReview();
	                break;
	            case "2":
	                ClothingReview clothingReview1 = new ClothingReview("Average quality and fit! \n------Thank you. we'll keep that in mind");
	                clothingReview1.displayReview();
	                break;
	            default:
	                System.out.println("Invalid review option selected.");
	        }
	    }
	    public static void handleAccessoryReview() {
	        System.out.println("Clothing Review Options:");
	        System.out.println("1 - Review 1: Great quality!");
	        System.out.println("2 - Review 2: Average quality!");
	        System.out.print("Enter your review option (1, 2): ");
	        Scanner br = new Scanner(System.in);
	        String reviewChoice = br.nextLine();
	        
	        switch (reviewChoice) {
	            case "1":
	                AccessoryReview accessoryReview = new AccessoryReview("Great quality! \n------ThankYou for your great review.");
	                accessoryReview.displayReview();
	                break;
	            case "2":
	                AccessoryReview accessoryReview1 = new AccessoryReview("Average quality! \n------Thank you. we'll keep that in mind");
	                accessoryReview1.displayReview();
	                break;
	            default:
	                System.out.println("Invalid review option selected.");
	        }
	    }                
	                
}