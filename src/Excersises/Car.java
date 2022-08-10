package chapterThree;

public class Car {

    private String model;
    private String type;
    private double price;

    public Car(String model, String type, double price) {
        this.model = model;
        this.type = type;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price>0){
            this.price = price;
        }
        else throw new ArithmeticException("price should be greater than zero");

    }

    public void displayCarPrice(Car car, double discount){
        System.out.println("the price before the discount is "+car.getPrice());
        price=price-(price*discount);
        System.out.println("the price after the discount is done is "+price);
    }
}
