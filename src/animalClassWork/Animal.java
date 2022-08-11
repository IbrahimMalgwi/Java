package animalClassWork;

public class Animal {
    private String name;
    private String movement;
    private String reproduction;

    public Animal(String name, String natureOfSkin, String reproduction) {
        this.name = name;
        this.movement = natureOfSkin;
        this.reproduction = reproduction;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getMovement() {
        return movement;
    }
    public void setMovement(String movement) {
        this.movement = movement;
    }
    public String getReproduction() {
        return reproduction;
    }
    public void setReproduction(String reproduction) {
        this.reproduction = reproduction;
    }
    public String animalName() {
        return "My name is animal";
    }
    public String movement(){
        return "I Can walk, I can Fly, I can Jump";
    }

    public String reproduction(){
        return "I lay eggs, I birth kids";
    }
}
