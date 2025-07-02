package Constructors_Instance_vs_Class_Variables_Access_Modifier;

public class Product {

   
    private String productName;
    private double price;

    private static int totalProducts = 0;

    
    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;
    }

    public void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: ₹" + price);
    }

    public static void displayTotalProducts() {
        System.out.println("Total Products Created: " + totalProducts);
    }

    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 55000);
        Product p2 = new Product("Smartphone", 20000);

        p1.displayProductDetails();
        System.out.println();
        p2.displayProductDetails();
        System.out.println();
        Product.displayTotalProducts();
    }
}

