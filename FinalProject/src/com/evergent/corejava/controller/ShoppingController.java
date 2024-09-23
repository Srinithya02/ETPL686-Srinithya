package com.evergent.corejava.controller;

import java.util.List;
import java.util.Scanner;

import com.evergent.corejava.bean.ShoppingBean;
import com.evergent.corejava.service.ShoppingService;

public class ShoppingController {

    public static void main(String[] args) {
        ShoppingService shoppingService = new ShoppingService();
        Scanner scanner = new Scanner(System.in);
        int choice;

        System.out.println("------- Welcome to the Shopping System -------");
        do {
            System.out.println("1. Show Product Catalog");
            System.out.println("2. Purchase a Product");
            System.out.println("3. View Transaction History");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    List<ShoppingBean> productList = shoppingService.showCatalog();
                    for (ShoppingBean product : productList) {
                        System.out.println(product.getProductId() + ". " + product.getProductName() + " - $" + product.getPrice() + " (Available: " + product.getQuantity() + ")");
                    }
                    break;
                case 2:
                    System.out.print("Enter Product ID to purchase: ");
                    int productId = scanner.nextInt();
                    System.out.print("Enter quantity: ");
                    int quantity = scanner.nextInt();
                    int purchase = shoppingService.purchaseItem(productId, quantity);
                    if (purchase != 0) {
                        System.out.println("Purchase successful.");
                    } else {
                        System.out.println("Purchase failed. Please try again.");
                    }
                    break;
                case 3:
                    System.out.print("Enter Product ID to view transactions: ");
                    int prodId = scanner.nextInt();
                    String transactions = shoppingService.getTransactionHistory(prodId);
                    System.out.println("Transaction History: \n" + transactions);
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);
        
        scanner.close();
    }
}
