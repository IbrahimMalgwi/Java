package animalClassWork;

public class Goat extends  Animal {
    private String bathing;

    public Goat (String name, String movement, String reproduction, String bathing){
        super(name, movement, reproduction);
        this.bathing = bathing;
    }

    public String setBathing(){
        return "I dont like water";
    }



}
