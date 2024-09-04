package com.evergent.coreJAVA.Srinithya.application5;
import java.util.Scanner;

public class ClothingShoppingMain extends Clothing implements Accessories{
	 
	@Override
    public void tshirt() throws ShoppingExceptions.InvalidItemException,ShoppingExceptions.InvalidPaymentMethodException {
        itemCost = 30;
        calculateTotal();
    }

    @Override
    public void dresses() throws ShoppingExceptions.InvalidItemException,ShoppingExceptions.InvalidPaymentMethodException {
        itemCost = 50;
        calculateTotal();
    }

    @Override
    public void jeans() throws ShoppingExceptions.InvalidItemException,ShoppingExceptions.InvalidPaymentMethodException {
        itemCost = 40;
        calculateTotal();
    }

    @Override
    public void earrings() throws ShoppingExceptions.InvalidItemException,ShoppingExceptions.InvalidPaymentMethodException {
        itemCost = 20;
        calculateTotal();
    }

    @Override
    public void shoe() throws ShoppingExceptions.InvalidItemException, ShoppingExceptions.InvalidSizeException,ShoppingExceptions.InvalidPaymentMethodException{
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
                throw new ShoppingExceptions.InvalidItemException("Invalid shoe type selected.");
        }
        System.out.println("Available Sizes for Shoes: 5, 6, 7, 8, 9");
        System.out.print("Enter your shoe size (5-9): ");
        int shoeSize = Integer.parseInt(br.nextLine());

        if (shoeSize < 5 || shoeSize > 9) {
            throw new ShoppingExceptions.InvalidSizeException("Invalid shoe size selected.");
        }
        calculateTotal();
    }

    @Override
    public void bags() throws ShoppingExceptions.InvalidItemException,ShoppingExceptions.InvalidPaymentMethodException{
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
                throw new ShoppingExceptions.InvalidItemException("Invalid bag type selected.");
        }
        calculateTotal();
    }

    @Override
    public void handBags() throws ShoppingExceptions.InvalidItemException,ShoppingExceptions.InvalidPaymentMethodException {
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
                throw new ShoppingExceptions.InvalidItemException("Invalid handbag type selected.");
        }
        calculateTotal();
    }

    @Override
    public void initiatePayment(int amount) throws ShoppingExceptions.InvalidPaymentMethodException {
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
                throw new ShoppingExceptions.InvalidPaymentMethodException("Invalid payment method selected.");
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
            System.out.print("Enter your category (W, G, M, B, K): ");  // TO CHOOSE CATEGORY OF WOMEN, GIRL, MEN, BOY, KIDS.
            String option1 = br.nextLine();
            System.out.println("======================");
            System.out.println("C - Clothing");
            System.out.println("A - Accessories");
            System.out.println("R - Review ");
            System.out.println("E - Exit");
            System.out.println("======================");
            System.out.print("Enter your option (C, A, R, E): ");  // CLOTHING, ACCESSORIES, EXIT
            String option = br.nextLine();
            try {
                switch (option.toUpperCase()) {
                    case "C":
                        System.out.println("Clothing Options");
                        System.out.println("======================");
                        System.out.println("T - T-Shirts");
                        System.out.println("D - Dresses");
                        System.out.println("J - Jeans");
                        System.out.print("Enter your choice (T, D, J): ");
                        String clothingChoice = br.nextLine();
                        switch (clothingChoice.toUpperCase()) {
                            case "T":
                                shop.tshirt();
                                break;
                            case "D":
                                shop.dresses();
                                break;
                            case "J":
                                shop.jeans();
                                break;
                            default:
                                throw new ShoppingExceptions.InvalidItemException("Invalid clothing item selected.");
                        }
                        break;
                    case "A":
                        System.out.println("Accessories Options");
                        System.out.println("======================");
                        System.out.println("E - Earrings");
                        System.out.println("S - Shoes");
                        System.out.println("B - Bags");
                        System.out.println("H - Handbags");
                        System.out.print("Enter your choice (E, S, B, H): ");
                        String accessoryChoice = br.nextLine();
                        switch (accessoryChoice.toUpperCase()) {
                            case "E":
                                shop.earrings();
                                break;
                            case "S":
                                shop.shoe();
                                break;
                            case "B":
                                shop.bags();
                                break;
                            case "H":
                                shop.handBags();
                                break;
                            default:
                                throw new ShoppingExceptions.InvalidItemException("Invalid accessory item selected.");
                        }
                        break;
                    case "R":
                        System.out.print("Enter your review message: ");
                        String reviewMessage = br.nextLine();
                        System.out.print("Enter your review type (Clothing, Accessory): ");
                        String reviewType = br.nextLine();
                        if (reviewType.equalsIgnoreCase("Clothing")) {
                            ClothingReview review = new ClothingReview(reviewMessage);
                            review.displayReview();
                        } else if (reviewType.equalsIgnoreCase("Accessory")) {
                            AccessoryReview review = new AccessoryReview(reviewMessage);
                            review.displayReview();
                        } else {
                            System.out.println("Invalid review type selected.");
                        }
                        break;
                    case "E":
                        System.out.println("Thank you for shopping with us!");
                        continueShopping = false;
                        break;
                    default:
                        System.out.println("Invalid option selected.");
                }
            } catch (ShoppingExceptions.InvalidItemException e) {
                System.out.println(e.getMessage());
            } catch (ShoppingExceptions.InvalidSizeException e) {
                System.out.println(e.getMessage());
            } catch (ShoppingExceptions.InvalidPaymentMethodException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}