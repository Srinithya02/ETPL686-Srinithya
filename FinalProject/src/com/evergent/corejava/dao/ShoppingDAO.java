package com.evergent.corejava.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.evergent.corejava.bean.ShoppingBean;
import com.evergent.corejava.dao.ShoppingDB;

public class ShoppingDAO {

    public List<ShoppingBean> getAllProducts() {
        List<ShoppingBean> productList = new ArrayList<>();
        try (Connection con = ShoppingDB.getConnection()) {
            String query = "SELECT * FROM Shopping";
            PreparedStatement pstmt = con.prepareStatement(query);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                ShoppingBean product = new ShoppingBean();
                product.setProductId(rs.getInt("productId"));
                product.setProductName(rs.getString("productName"));
                product.setPrice(rs.getDouble("price"));
                product.setQuantity(rs.getInt("quantity"));
                productList.add(product);
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return productList;
    }

    public int purchaseProduct(int productId, int quantity) {
        try (Connection con = ShoppingDB.getConnection()) {
            String query = "UPDATE Shopping SET quantity = quantity - ? WHERE productId = ?";
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setInt(1, quantity);
            pstmt.setInt(2, productId);
            return pstmt.executeUpdate();
        } catch (Exception e) {
            System.out.println(e.toString());
            return 0;
        }
    }

    public void addTransaction(int productId, String transaction) {
        try (Connection con = ShoppingDB.getConnection()) {
            String query = "INSERT INTO transactions (productId, transaction) VALUES (?, ?)";
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setInt(1, productId);
            pstmt.setString(2, transaction);
            pstmt.executeUpdate();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    public String getTransactionHistory(int productId) {
        StringBuilder transactionHistory = new StringBuilder();
        try (Connection con = ShoppingDB.getConnection()) {
            String query = "SELECT transaction FROM transactions WHERE productId = ?";
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setInt(1, productId);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                transactionHistory.append(rs.getString("transaction")).append("\n");
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return transactionHistory.toString();
    }
}
