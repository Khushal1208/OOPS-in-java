package OOPS.Questions.question13;

import java.util.ArrayList;
import java.util.List;

//Write a Java program to create a class called "Inventory" with a collection of products
//and methods to add and remove products, and to check for low inventory.
public class Inventory {
    private ArrayList<Product>  products ;
    public Inventory(){
        products = new ArrayList<Product>() ;
    }
    public void addProduct(Product product){
        products.add(product);
    }
    public void removeProduct(Product product){
        products.remove(product);
    }
    public ArrayList<Product> getProducts(){
        return products;
    }
    public void checkInventory(){
        for(Product product: products){
            if(product.getQuatity()<=100){
                System.out.println("Low Inventory of " +product.getName()+" Current quantity: " + product.getQuatity());
            }
            else if((product.getQuatity()>100)&&(product.getQuatity()<=150)){
                System.out.println("sufficient Inventory of "+product.getName()+" Current quantity: " + product.getQuatity());
            }
            else{
                System.out.println("Full Inventory of "+product.getName()+" Current quantity: " + product.getQuatity());
            }
        }
    }



}
