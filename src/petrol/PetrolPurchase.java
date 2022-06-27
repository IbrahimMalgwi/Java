package petrol;

public class PetrolPurchase {
    private String location;
    private String typeOfPetrol;
    private double price;
    private int quantity;
    private double discount;

    public PetrolPurchase(){

    }

    public PetrolPurchase(String location, String typeOfPetrol, double price, int quantity, double discount) {
        this.location = location;
        this.typeOfPetrol = typeOfPetrol;
        this.price = price;
        this.quantity = quantity;
        this.discount = discount;
    }

    public String getLocation(){
        return location;
    }
    public void setLocation(String location){
        this.location = location;
    }

    public String getTypeOfPetrol(){
        return typeOfPetrol;
    }
    public void setTypeOfPetrol(String typeOfPetrol){
        this.typeOfPetrol = typeOfPetrol;
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
