package dietel.Chapter3;

public class Invoice {
    private String number;
    private String description;
    private int quantity;
    private double pricePerItem;

    public Invoice(String number, String description, int quantity, double pricePerItem) {
        this.number = number;
        this.description = description;

        if (quantity > 0) {
            this.quantity = quantity;
        }

        if (pricePerItem > 0.0) {
            this.pricePerItem = pricePerItem;
        }
    }

    public double getInvoiceAmount() {
        return quantity * pricePerItem;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantityPurchased() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity > 0) {
            this.quantity = quantity;
        }
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    public void setPricePerItem(double pricePerItem) {
        if (pricePerItem > 0.0) {
            this.pricePerItem = pricePerItem;
        }
    }
}
