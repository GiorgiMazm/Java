package Animals;

public class Dinosaur extends Animal {
    Boolean meatEater;


    public Dinosaur(int legs, boolean canSpeak, boolean tail, Boolean meatEater, String name) {
        super(legs, canSpeak, tail, name);
        this.meatEater = meatEater;
    }
}
