package designPattern;

public class Duck {
    private Quackable quackBehaviour;
    private Flyable flyBehaviour;

    public Duck(Quackable quack, Flyable fly) {
        this.quackBehaviour = quack;
        this.flyBehaviour = fly;
    }

    public void setQuackBehaviour(Quackable quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }

    public void setFlyBehaviour(Flyable flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    public void fly (){
        flyBehaviour.fly();

    }

    public void quack() {
        quackBehaviour.quack();
    }
}
