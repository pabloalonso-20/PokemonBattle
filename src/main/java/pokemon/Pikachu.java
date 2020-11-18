package pokemon;



public class Pikachu implements Pokemon {
    private String name = "Pikachu";
    private int health;
    private String type = "Electric";
    private String weakness = "Rock";


    Move thunderbolt = new Move("Thunderbolt", 40, "Electric");
    Move ironTail = new Move("Iron tail", 35, "Steel");
    Move voltTackle = new Move("Volt Tackle", 50, "Electric");
    Move quickAttack = new Move("Quick Attack", 35, "Normal");


    public Pikachu(int health) {
        this.health = health;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public String getWeakness() {
        return weakness;
    }

    @Override
    public String moveTypeOne() {
        return thunderbolt.getDescription();
    }

    @Override
    public String moveTypeTwo() {
        return ironTail.getDescription();
    }

    @Override
    public String moveTypeThree() {
        return voltTackle.getDescription();
    }

    @Override
    public String moveTypeFour() {
        return quickAttack.getDescription();
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getHealth() {
        return health;
    }

    @Override
    public void setHealth(int health) {
        this.health = health;
    }

    public void printPokemon() {
        System.out.println("\033[1;33mquu..__\n" +
                " $$$b  `---.__\n" +
                "  \"$$b        `--.                          ___.---uuudP\n" +
                "   `$$b           `.__.------.__     __.---'      $$$$\"              .\n" +
                "     \"$b          -'            `-.-'            $$$\"              .'|\n" +
                "       \".                                       d$\"             _.'  |\n" +
                "         `.   /                              ...\"             .'     |\n" +
                "           `./                           ..::-'            _.'       |\n" +
                "            /                         .:::-'            .-'         .'\n" +
                "           :                          ::''\\          _.'            |\n" +
                "          .' .-.             .-.           `.      .'               |\n" +
                "          : /'$$|           .@\"$\\           `.   .'              _.-'\n" +
                "         .'|$u$$|          |$$,$$|           |  <            _.-'\n" +
                "         | `:$$:'          :$$$$$:           `.  `.       .-'\n" +
                "         :                  `\"--'             |    `-.     \\\n" +
                "        :##.       ==             .###.       `.      `.    `\\\n" +
                "        |##:                      :###:        |        >     >\n" +
                "        |#'     `..'`..'          `###'        x:      /     /\n" +
                "         \\                                   xXX|     /    ./\n" +
                "          \\                                xXXX'|    /   ./\n" +
                "          /`-.                                  `.  /   /\n" +
                "         :    `-  ...........,                   | /  .'\n" +
                "         |         ``:::::::'       .            |<    `.\n" +
                "         |             ```          |           x| \\ `.:``.\n" +
                "         |                         .'    /'   xXX|  `:`M`M':.\n" +
                "         |    |                    ;    /:' xXXX'|  -'MMMMM:'\n" +
                "         `.  .'                   :    /:'       |-'MMMM.-'\n" +
                "          |  |                   .'   /'        .'MMM.-'\n" +
                "          `'`'                   :  ,'          |MMM<\n" +
                "            |                     `'            |tbap\\\n" +
                "             \\                                  :MM.-'\n" +
                "              \\                 |              .''\n" +
                "               \\.               `.            /\n" +
                "                /     .:::::::.. :           /\n" +
                "               |     .:::::::::::`.         /\n" +
                "               |   .:::------------\\       /\n" +
                "              /   .''               >::'  /\n" +
                "              `',:                 :    .'\n" +
                "                                   `:.:'");
    }




    public void makeSound() {
        System.out.println("Pika! Pika!");

    }

    public void printMoveSet() {
        System.out.println("1: Thunderbolt\t2: Iron tail\n3: Volt Tackle\t4: Quick Attack");
    }

    //pikachu attack moves

    // thunderbolt
    public Pokemon attackOne(Pokemon pokemon, float effective){
        pokemon.setHealth((int) (pokemon.getHealth() - (thunderbolt.getDamage() * effective)));
        return pokemon;
    }
    // iron tail
    public Pokemon attackTwo (Pokemon pokemon, float effective){
        pokemon.setHealth((int) (pokemon.getHealth() - (ironTail.getDamage() * effective)));
        return pokemon;
    }

    // volt tackle
    public Pokemon attackThree(Pokemon pokemon, float effective){
        pokemon.setHealth((int) (pokemon.getHealth() - (voltTackle.getDamage() * effective)));
        return pokemon;
    }

    // quick attack
    public Pokemon attackFour(Pokemon pokemon, float effective){
        pokemon.setHealth((int) (pokemon.getHealth() - (quickAttack.getDamage() * effective)));
        return pokemon;
    }







}

