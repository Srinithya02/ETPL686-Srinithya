package com.evergent.coreJAVA.Srinithya.application2;

import java.io.IOException;
import java.util.Scanner;

public class ClothingShopping2 {

    enum Category {W, G, M, B, K, E}  // Women, Girls, Men, Boys, Kids, Exit
    enum SubCategory {C, A, R}  // Clothing, Accessories, Main Menu
    enum SubCategory1 {T, D, J}  // Clothing - T-Shirts, Dresses, Jeans
    enum SubCategory2 {H, S, B, O}  // Accessories - earrings, Shoes, Bags, HandBags
    enum SubCategory3 {N, P, F} // Shoes - Nike, Puma, Adidas
    enum SubCategory4 {L, I} // Bags - AmericanTourister, SkyBags
    enum SubCategory5 {G, N, V} // Handbags - Gucci, Prada, LouisVuitton

    static int itemCost;
    static int totalAmount;
    static int itemCount;

    public static void main(String[] args) throws IOException {
        String module = null;

        Scanner br = new Scanner(System.in);

        System.out.println("\n\t\t\t Welcome to the Clothing Shopping System");

        while (true) {
            System.out.println("======================");
            System.out.println(" Shopping Main Menu");
            System.out.println("======================");
            System.out.println("W - Women's Clothing");
            System.out.println("G - Girls' Clothing");
            System.out.println("M - Men's Clothing");
            System.out.println("B - Boys' Clothing");
            System.out.println("K - Kids' Clothing");
            System.out.println("E - Exit");
            System.out.println("======================");
            System.out.print("Enter your category (W, G, M, B, K, E): ");

            module = br.nextLine();
            System.out.println("You entered module is  : " + module);

            if (module.equalsIgnoreCase("E")) {
                System.out.println("Exiting the system...");
                break;
            }

            try {
                switch (Category.valueOf(module)) {
                    case W:
                    case G:
                    case M:
                    case B:
                    case K:
                        System.out.println("Category Menu");
                        System.out.println("======================");
                        System.out.println("C - Clothing");
                        System.out.println("A - Accessories");
                        System.out.println("M - Main Menu");
                        System.out.println("======================");
                        System.out.print("Enter your option (C, A, M): ");

                        module = br.nextLine();
                        System.out.println("You entered option is  : " + module);

                        switch (SubCategory.valueOf(module)) {
                            case C:
                                System.out.println("Clothing Options");
                                System.out.println("======================");
                                System.out.println("T - T-Shirts (RS30 each)");
                                System.out.println("D - Dresses (RS50 each)");
                                System.out.println("J - Jeans (RS40 each)");
                                System.out.println("======================");
                                System.out.print("Enter your clothing type (T, D, J): ");
                                module = br.nextLine();

                                switch (SubCategory1.valueOf(module)) {
                                    case T:
                                        System.out.println("Available Sizes for T-Shirts: S, M, L");
                                        System.out.print("Enter your size (S, M, L): ");
                                        String tShirtSize = br.nextLine();
                                        if (!tShirtSize.equals("S") &&
                                                !tShirtSize.equals("M") &&
                                                !tShirtSize.equals("L")) {
                                            System.out.println("Invalid size selected.");
                                            continue;
                                        }
                                        itemCost = 30;
                                        break;
                                        
                                    case D:
                                        System.out.println("Available Sizes for Dresses: S, M, L");
                                        System.out.print("Enter your size (S, M, L): ");
                                        String dressSize = br.nextLine();
                                        if (!dressSize.equals("S") &&
                                                !dressSize.equals("M") &&
                                                !dressSize.equals("L")) {
                                            System.out.println("Invalid size selected.");
                                            continue;
                                        }
                                        itemCost = 50;
                                        break;
                                        
                                    case J:
                                        itemCost = 40;
                                        break;
                                        
                                    default:
                                        System.out.println("Invalid clothing type selected.");
                                        continue;
                                }
                                
                                System.out.print("Enter the number of items: ");
                                itemCount = Integer.parseInt(br.nextLine());
                                totalAmount = itemCost * itemCount;
                                System.out.println("Total cost for selected clothing: RS" + totalAmount);
                                break;

                            case A:
                                System.out.println("Accessory Options");
                                System.out.println("======================");
                                System.out.println("H - earrings (RS20 each)");
                                System.out.println("S - Shoes");
                                System.out.println("B - Bags");
                                System.out.println("O - HandBags");
                                System.out.println("======================");
                                System.out.print("Enter your accessory type (H, S, B, O): ");
                                module = br.nextLine();

                                switch (SubCategory2.valueOf(module)) {
                                    case H:
                                        itemCost = 20;
                                        break;
                                        
                                    case S:
                                        System.out.println("Shoe Options");
                                        System.out.println("======================");
                                        System.out.println("N - Nike (RS70 each)");
                                        System.out.println("P - Puma (RS75 each)");
                                        System.out.println("F - Adidas (RS80 each)");
                                        System.out.println("======================");
                                        System.out.print("Enter your shoe type (N, P, F): ");
                                        module = br.nextLine();

                                        switch (SubCategory3.valueOf(module)) {
                                            case N:
                                                itemCost = 70;
                                                break;
                                                
                                            case P:
                                                itemCost = 75;
                                                break;
                                                
                                            case F:
                                                itemCost = 80;
                                                break;
                                                
                                            default:
                                                System.out.println("Invalid shoe type selected.");
                                                continue;
                                        }
                                        
                                        System.out.println("Available Sizes for Shoes: 5, 6, 7, 8, 9");
                                        System.out.print("Enter your shoe size (5-9): ");
                                        int shoeSize = Integer.parseInt(br.nextLine());
                                        if (shoeSize < 5 || shoeSize > 9) {
                                            System.out.println("Invalid shoe size selected.");
                                            continue;
                                        }
                                        break;

                                    case B:
                                        System.out.println("Bags Options");
                                        System.out.println("======================");
                                        System.out.println("L - AmericanTourister (RS50 each)");
                                        System.out.println("I - SkyBags (RS60 each)");
                                        System.out.println("======================");
                                        System.out.print("Enter your bag type (L, I): ");
                                        module = br.nextLine();

                                        switch (SubCategory4.valueOf(module)) {
                                            case L:
                                                itemCost = 50;
                                                break;
                                                
                                            case I:
                                                itemCost = 60;
                                                break;
                                                
                                            default:
                                                System.out.println("Invalid bag type selected.");
                                                continue;
                                        }
                                        break;

                                    case O:
                                        System.out.println("HandBags Options");
                                        System.out.println("======================");
                                        System.out.println("G - Gucci (RS90 each)");
                                        System.out.println("N - Prada (RS100 each)");
                                        System.out.println("V - LouisVuitton (RS120 each)");
                                        System.out.println("======================");
                                        System.out.print("Enter your handbag type (G, N, L): ");
                                        module = br.nextLine();

                                        switch (SubCategory5.valueOf(module)) {
                                            case G:
                                                itemCost = 90;
                                                break;
                                                
                                            case N:
                                                itemCost = 100;
                                                break;
                                                
                                            case V:
                                                itemCost = 120;
                                                break;
                                                
                                            default:
                                                System.out.println("Invalid handbag type selected.");
                                                continue;
                                        }
                                        break;

                                    default:
                                        System.out.println("Invalid accessory type selected.");
                                        continue;
                                }
                                
                                System.out.print("Enter the number of items: ");
                                itemCount = Integer.parseInt(br.nextLine());
                                totalAmount = itemCost * itemCount;
                                System.out.println("Total cost for selected accessories: RS" + totalAmount);
                                break;

                            case R:
                                // TO return to Main Menu
                                continue;

                            default:
                                System.out.println("Invalid option selected.");
                                continue;
                        }
                        break;

                    default:
                        System.out.println("Invalid category selected.");
                        continue;
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid input. Please try again.");
            }
        }

        br.close();
    }
}

