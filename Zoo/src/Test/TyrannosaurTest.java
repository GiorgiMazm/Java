package Test;

import Animals.Tyrannosaur;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TyrannosaurTest {

    @Test
    void crush() {
        var tyran = new Tyrannosaur(4, true,true,true, "Goga");
        assertEquals(tyran.name + " has destroyed everything around", tyran.crush());
    }
}