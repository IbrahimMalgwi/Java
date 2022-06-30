package petrol;

public class PetrolPurchase {
    private String location;
    private String fuel;
    private double price;
    private int quantity;
    private double discount;

    public PetrolPurchase(){
    }

    public PetrolPurchase(String location) {
        this.location = location;
        this.fuel = fuel;
        this.price = price;
        this.quantity = quantity;
        this.discount = discount;
    }

    public void getLocation(){
    }
    public void setLocation(String location){
        this.location = location;
    }

    public String getTypeOfPetrol(){
        return fuel;
    }
    public void setTypeOfPetrol(String fuel){
        this.fuel = fuel;
    }

    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }

    public int getQuantity(){
        return quantity;
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    public double getDiscount(){
        return discount;
    }

    public void setDiscount(double discount){
        this.discount = discount;
    }

}
