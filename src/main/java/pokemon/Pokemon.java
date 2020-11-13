package pokemon;

public interface Pokemon {
    //ascii art
    public void printPokemon();

    public int getHealth();
    public void setHealth(int health);
    public String getName();

    //sound
    public void makeSound();

    public void printMoveSet();

    //pokemon attacks
    public Pokemon attackOne(Pokemon pokemon);
    public Pokemon attackTwo(Pokemon pokemon);
    public Pokemon attackThree(Pokemon pokemon);
    public Pokemon attackFour(Pokemon pokemon);



}
