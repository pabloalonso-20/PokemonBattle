import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pokemon.Vulpix;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VulpixTest {

    Vulpix vulpix;
    @BeforeEach
    void setup(){
        vulpix = new Vulpix(100);
    }

    @Test
    void testNameGetter(){
        String expect = "Vulpix";
        String actual = vulpix.getName();
        assertEquals(expect,actual);
    }

    @Test
    void testHealthGetter(){
        int expect = 100;
        int actual = vulpix.getHealth();
        assertEquals(expect,actual);
    }

    @Test
    void testTypeGetter(){
        String expect = "Fire";
        String actual = vulpix.getType();
        assertEquals(expect,actual);
    }
    


}
