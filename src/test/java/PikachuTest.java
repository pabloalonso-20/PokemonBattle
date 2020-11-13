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
    void attackOneTestGivenFirstAttack(){
        int expected = 140;
        int actual = pikachu.attackOne(pikachu).getHealth();
        assertEquals(expected, actual);
    }

    @Test
    void attackTwoTestGivenFirstAttack(){
        int expected = 145;
        int actual = pikachu.attackTwo(pikachu).getHealth();
        assertEquals(expected, actual);
    }

    @Test
    void attackThreeTestGivenFirstAttack(){
        int expected = 130;
        int actual = pikachu.attackThree(pikachu).getHealth();
        assertEquals(expected, actual);
    }
    @Test
    void attackFourTestGivenFirstAttack(){
        int expected = 145;
        int actual = pikachu.attackFour(pikachu).getHealth();
        assertEquals(expected, actual);
    }


}
