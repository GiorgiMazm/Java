package Animals;

public class Tyrannosaur extends Dinosaur {

    public Tyrannosaur(int legs, boolean canSpeak, boolean tail, Boolean meatEater, String name) {
        super(legs, canSpeak, tail, meatEater, name);
    }

    public String crush() {
        return this.name + " has destroyed everything around";
    }
}
