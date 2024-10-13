/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;

/**
 *
 * @author siddheshsawant
 */
public class Product {
    
    
    private String name;
    private int price;
    private int id;
    private ArrayList<Feature> features;

    private static int count = 0;
    
    private ImageIcon logoImage;
    
    public ImageIcon getLogoImage() {
        return logoImage;
    }
    
    public void setLogoImage(ImageIcon logoImage) {
        this.logoImage = logoImage;
    }
    
    public static int getCount() {
        return count;
    }
 
    public static void setCount(int count) {
        Product.count = count;
    }
    
    public Product() {
        count++;
        id = count;
        features = new ArrayList<>();
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }
    
    
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    public ArrayList<Feature> getFeatures(){
        return features;
    }
    
    public Feature addNewFeature() {
        Feature newFeature = new Feature();
        features.add(newFeature);
        return newFeature;
    }

    @Override
    public String toString() {
        return name;
    }
  
}
