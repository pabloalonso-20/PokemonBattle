import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pokemon.Pikachu;
import pokemon.Pokemon;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PikachuTest {
    Pikachu pikachu;
    @BeforeEach
    void setUp(){
        pikachu = new Pikachu(180);
    }

    @Test
    void testNameGetter(){
        String expect = "Pikachu";
        String actual = pikachu.getName();
        assertEquals(expect,actual);
    }

    @Test
    void testHealthGetter(){
        int expect = 180;
        int actual = pikachu.getHealth();
        assertEquals(expect,actual);
    }

    @Test
    void testTypeGetter(){
        String expect = "Electric";
        String actual = pikachu.getType();
        assertEquals(expect,actual);
    }
    @Test
    void attackOneTestGivenFullHealth(){
        int expected = 140;
        int actual = pikachu.attackOne(pikachu,1).getHealth();
        assertEquals(expected, actual);
    }

    @Test
    void attackTwoTestGivenFullHealth(){
        int expected = 145;
        int actual = pikachu.attackTwo(pikachu,1).getHealth();
        assertEquals(expected, actual);
    }

    @Test
    void attackThreeTestGivenFullHealth(){
        int expected = 130;
        int actual = pikachu.attackThree(pikachu,1).getHealth();
        assertEquals(expected, actual);
    }
    @Test
    void attackFourTestGivenFullHealth(){
        int expected = 145;
        int actual = pikachu.attackFour(pikachu,1).getHealth();
        assertEquals(expected, actual);
    }


}
