/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nvson.data.impl;

import nvson.data.dao.ProductDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import nvson.data.driver.MySQLDriver;
import java.util.List;
import nvson.data.model.Product;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author LENOVO
 */
public class ProductImpl implements ProductDao {
    Connection con = MySQLDriver.getConnection(); 
    @Override
    public List<Product> findAll(){
        List<Product> listProduct = new ArrayList<>();
        String sql ="select * from products";
        try {
            PreparedStatement sttm = con.prepareStatement(sql);
            ResultSet rs = sttm.executeQuery();
            while(rs.next()){
                int id = rs.getInt("id");
                int id_category = rs.getInt("id_category");
                String name = rs.getString("name");
                String image = rs.getString("image");
                double price =rs.getDouble("price");
                int quantity = rs.getInt("quantity");
                boolean status =rs.getBoolean("status");
                listProduct.add(new Product(id, id_category, name, image, price, quantity, status));
            }
        } catch (SQLException ex) {
            Logger.getLogger(CategoryImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listProduct;    
    }
    @Override
    public boolean insert (Product products){
        return true;
    }
    @Override
    public boolean update (Product products){
        return true;
    }
    @Override
    public boolean delete (int id){
        return true;
    }
    @Override
    public Product find (int id){
        return null;
    }  
}