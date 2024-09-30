package TreeSet;

import java.util.*;

class Product implements Comparable<Product> {
    private String Name;
    private Double Price;

    public Product(String Name,Double Price) {
        this.Name=Name;
        this.Price=Price;
    }

    public String getName() {
        return Name;
    }

    public Double getPrice() {
        return Price;
    }

    @Override
    public int compareTo(Product other) {
        return Double.compare(this.Price, other.Price);  // Compare products by price
    }
    }

public class Main {
    public static void main(String[] args) {
        TreeSet<Product> productCatalog = new TreeSet<>();

        // Adding products to the TreeSet
        productCatalog.add(new Product("Laptop", 999.99));
        productCatalog.add(new Product("Smartphone", 499.99));
        productCatalog.add(new Product("Headphones", 99.99));
        productCatalog.add(new Product("Smartwatch", 199.99));

        // Displaying products sorted by price
        System.out.println("Product catalog sorted by price:");
        for (Product product : productCatalog) {
            System.out.println(product.getName() + " - $" + product.getPrice());
        }
    }
}