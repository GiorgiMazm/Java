package Test;

import Animals.Spider;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpiderTest {
   public Spider getSpider() {
       return new Spider(8, false, false, "Peter" );
   }
    @Test
    void weaveWebs() {
        assertEquals(getSpider().name + " has weaved a huge web", getSpider().weaveWebs());
    }


    @Test
    void setInsectCatch() {
       getSpider().setInsectCatch(false);
       assertFalse(getSpider().isInsectCatch());
    }
}