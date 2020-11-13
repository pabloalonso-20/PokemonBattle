import pokemon.Pokemon;

public class Player {

   private String name;
   private Pokemon pokemon;

   //constructor
    public Player() {
    }

    public Player(String name, Pokemon pokemon) {
        this.name = name;
        this.pokemon = pokemon;
    }


    //getters and setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Pokemon getPokemon() {
        return pokemon;
    }

    public void setPokemon(Pokemon pokemon) {
        this.pokemon = pokemon;
    }
}
