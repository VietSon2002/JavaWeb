/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nvson.data.dao;

import nvson.data.impl.CategoryImpl;
import nvson.data.impl.ProductImpl;

/**
 *
 * @author LENOVO
 */
public class Database {
    public static CategoryDao getCategoryDao(){
        return new CategoryImpl();
        }
    public static ProductDao getProductDao(){
        return new ProductImpl();
        }
}
