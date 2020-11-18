import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pokemon.Bulbasaur;
import pokemon.Pikachu;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BulbasaurTest {
    Bulbasaur bulbasaur;
    @BeforeEach
    void setUp(){
        bulbasaur = new Bulbasaur(200);
    }
    @Test
    void testNameGetter(){
        String expect = "Bulbasaur";
        String actual = bulbasaur.getName();
        assertEquals(expect,actual);
    }

    @Test
    void testHealthGetter(){
        int expect = 200;
        int actual = bulbasaur.getHealth();
        assertEquals(expect,actual);
    }

    @Test
    void testTypeGetter(){
        String expect = "Grass";
        String actual = bulbasaur.getType();
        assertEquals(expect,actual);
    }
    @Test
    void attackOneTestGivenFullHealth(){
        int expected = 150;
        int actual = bulbasaur.attackOne(bulbasaur,1).getHealth();
        assertEquals(expected, actual);
    }

    @Test
    void attackTwoTestGivenFullHealth(){
        int expected = 160;
        int actual = bulbasaur.attackTwo(bulbasaur,1).getHealth();
        assertEquals(expected, actual);
    }

    @Test
    void attackThreeTestGivenFullHealth(){
        int expected = 180;
        int actual = bulbasaur.attackThree(bulbasaur,1).getHealth();
        assertEquals(expected, actual);
    }
    @Test
    void attackFourTestGivenFullHealth(){
        int expected = 165;
        int actual = bulbasaur.attackFour(bulbasaur,1).getHealth();
        assertEquals(expected, actual);
    }


}
