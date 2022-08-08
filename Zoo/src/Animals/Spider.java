package Animals;

public class Spider extends Animal {
    public Spider(int legs, boolean canSpeak, boolean tail, String name) {
        super(legs, canSpeak, tail, name);
    }

    private Boolean insectCatch;

    public String weaveWebs() {
        return this.name + " has weaved a huge web";
    }

    public Boolean isInsectCatch() {
        return insectCatch;
    }

    public void setInsectCatch(Boolean insectCatch) {
        this.insectCatch = insectCatch;
    }

    public String checkWeb () {
        if (this.insectCatch) {
            return "hunt was successfully, an insect is caught";
        } else {
            return  "hunt was unsuccessfully, the web is empty";
        }
    }
}
