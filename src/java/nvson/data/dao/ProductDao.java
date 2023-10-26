/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package nvson.data.dao;

import java.util.List;
import nvson.data.model.Product;

/**
 *
 * @author LENOVO
 */
public interface ProductDao {
    public List<Product> findAll();
    public boolean insert (Product products);
    public boolean update (Product products);
    public boolean delete (int id);
    public Product find (int id);  
}
