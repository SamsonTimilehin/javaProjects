package customerInvoice;

public class Item {
    private String name;
    private double price;
    private int quantity;
    private String invoiceNumber;

    public Item() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public double totalCost(){
        return price * quantity;
    }

    @Override
    public String toString() {
        return String.format("Product Name: %s%n Price: %f%n Quantity: %d%n Cost: %f%n"
                ,getName(),getPrice(),getQuantity(),totalCost());
    }
}
