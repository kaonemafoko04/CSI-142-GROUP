//First Domain class: Product.java
public class Product
    {
    private String name; // Name of the product
    private double price; // Price of the product
    private int quantity; // Quantity available in stock

    // Constructor using 'this' keyword
    public Product(String name, double price, int quantity)
    {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters and Setters
    public String getName() 
        {
        return name;
    }

    public void setName(String name) 
        {
        this.name = name;
    }

    public double getPrice()
        {
        return price;
    }

    public void setPrice(double price)
        {
        this.price = price;
    }

    public int getQuantity()
        {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    //Printing Method
    @Override
    public String toString() {
        return "Product{name='" + name + "', price=" + price + ", quantity=" + quantity + "}";
    }
}
