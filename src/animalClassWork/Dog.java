package animalClassWork;

public class Dog extends Animal{
    private String sound;

    public Dog(String name, String movement, String reproduction, String sound) {
        super(name, movement, reproduction);
        this.sound = sound;
    }

    public String sound(){
        return "I barke";
    }


}
