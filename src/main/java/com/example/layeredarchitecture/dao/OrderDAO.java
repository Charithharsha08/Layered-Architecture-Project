package com.example.layeredarchitecture.dao;

import com.example.layeredarchitecture.model.ItemDTO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

public interface OrderDAO {
     String generateNewOrderId() throws ClassNotFoundException, SQLException;
     boolean searchOrderId(String orderId) throws SQLException, ClassNotFoundException;
     boolean saveOrder(String orderId, LocalDate orderDate, String customerId) throws SQLException, ClassNotFoundException;
}
