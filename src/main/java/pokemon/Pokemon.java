package pokemon;

public interface Pokemon {
    //ascii art
    public void printPokemon();

    public int getHealth();
    public void setHealth(int health);
    public String getName();
    public String getType();
    public String getWeakness();

    //pokemon move types
    public String moveTypeOne();
    public String moveTypeTwo();
    public String moveTypeThree();
    public String moveTypeFour();

    //sound
    public void makeSound();

    public void printMoveSet();

    //pokemon attacks
    public Pokemon attackOne(Pokemon pokemon, float effective);
    public Pokemon attackTwo(Pokemon pokemon, float effective);
    public Pokemon attackThree(Pokemon pokemon, float effective);
    public Pokemon attackFour(Pokemon pokemon, float effective);



}
