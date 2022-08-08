import Animals.*;

public class Main {
    public static void main(String[] args) {
        var rex = new Tyrannosaur(4, true, true, true, "Rex");
        var brood = new Spider(8, false, false, "Brood-mother");
        System.out.println(rex.crush());

        System.out.println(brood.weaveWebs());
        brood.setInsectCatch(true);
        System.out.println(brood.checkWeb());
    }
}
