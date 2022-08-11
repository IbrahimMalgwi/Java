package animalClassWork;

public class Chicken extends Animal {
    private String natureOfSkin;

    public Chicken(String name, String movement, String reproduction, String natureOfSkin){
        super(name, movement, reproduction);
        this.natureOfSkin = natureOfSkin;
    }

    public String setNatureOfSkin(){
        return "I have feathers";
    }

    @Override
    public String toString(){
        return String.format("%s %s%n %s%n %s%n %s%n", "The Animal has", getName(), getMovement(), getReproduction());
    }

}
