package com.evergent.corejava.service;

import java.util.List;

import com.evergent.corejava.bean.ShoppingBean;
import com.evergent.corejava.dao.ShoppingDAO;

public class ShoppingService {
    private ShoppingDAO shoppingDAO = new ShoppingDAO();
    private String str = "";

    public List<ShoppingBean> showCatalog() {
        return shoppingDAO.getAllProducts();
    }

    public int purchaseItem(int productId, int quantity) {
        int update = shoppingDAO.purchaseProduct(productId, quantity);
        if (update != 0) {
            str = "Purchased " + quantity + " units of product ID: " + productId;
            shoppingDAO.addTransaction(productId, str);
        }
        return update;
    }

    public String getTransactionHistory(int productId) {
        return shoppingDAO.getTransactionHistory(productId);
    }
}
