class Product {
    private int price;
    private int stock;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if (price >= 0) {
            this.price = price;
            System.out.println("Price set to: " + price);
        } else {
            System.out.println("Error: Price cannot be negative.");
        }
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        if (stock >= 0) {
            this.stock = stock;
            System.out.println("Stock set to: " + stock);
        } else {
            System.out.println("Error: Stock cannot be negative.");
        }
    }

   void displayStatus() {
        System.out.println("Product Price: " + price + " | Units in Stock: " + stock);
    }
}

public class code17 {
    public static void main(String[] args) {
        Product pt = new Product();
        
        pt.setPrice(500);
        pt.setStock(10);

        pt.setPrice(-1);
        pt.setStock(-2);
        
        pt.displayStatus();
    }
}
