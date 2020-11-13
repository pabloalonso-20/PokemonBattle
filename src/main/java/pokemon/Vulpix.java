package pokemon;

public class Vulpix implements Pokemon {
    private String name = "Vulpix";
    private int health = 185;


    Move flamethrower = new Move("Flamethrower", 40, "Fire");
    Move fireSpin = new Move("Fire Spin", 30, "Fire");
    Move fireBlast = new Move("Fire Blast", 50, "Fire");
    Move quickAttack = new Move("Quick Attack", 40, "Normal");

    public Vulpix(int health){
        this.health = health;
    }

    @Override
    public void printPokemon() {
        System.out.println("\u001B[31m               _,.+-----__,._\n" +
                "              /  /    ,'     `.\n" +
                "     ,+._   ./...\\_  /   ,..   \\\n" +
                "     | `.`+'       `-' .' ,.|  |\n" +
                "     |  |( ,    ,.`,   |  `-',,........_       __......_\n" +
                "      \\ |..`/,-'  '\"\"\"' `\"\"'\"  _,.---\"-,  .-+-'      _.-\"\"`--._\n" +
                "       .\"|       /\"\\`.      ,-'       / .','      ,-'          \\\n" +
                "      .'-'      |`-'  |    `./       / / /       /   ,.-'       |\n" +
                "     j`v+\"      `----\"       ,'    ,'./ .'      /   |        ___|\n" +
                "     |                      |   _,','j  |      /    L   _.-\"'    `--.\n" +
                "      \\                     `.-'  j  |  L     F      \\-'             \\\n" +
                "       \\ .-.               ,'     |  L   .    /    ,'       __..      `\n" +
                "        \\ `.|            _/_      '   \\  |   /   ,'       ,\"    `.     '\n" +
                "         `.             '   `-.    `.__| |  /  ,'         |            |\n" +
                "           `\"-,.               `----'   `-.' .'   _,.--\"\"\"'\" --.      ,'\n" +
                "              |          ,.                `.  ,-'              `.  _'\n" +
                "             /|         /                    \\'          __.._    \\'\n" +
                "   _...--...' +,..-----'                      \\-----._,-'     \\    |\n" +
                " ,'    |     /        \\                        \\      |       j    |\n" +
                "/| /   |    j  ,      |                         ,._   `.    -'    /\n" +
                "\\\\'   _`.__ | |      _L      |-----\\            `. \\    `._    _,'\n" +
                " \"\"`\"'     \"`\"---'\"\"`._`-._,-'      `.              `.     `--'\n" +
                "                       \"`--.......____:.         _  / \\\n" +
                "                               `-----.. `>-.....`,-'   \\\n" +
                "                                      `|\"    `.  ` . \\ |\n" +
                "                                        `._`..'    `-\"'\n" +
                "                                           \"' mh");

    }

    @Override
    public int getHealth() {
        return this.health;
    }

    @Override
    public void setHealth(int health) {
        this.health = health;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void makeSound() {
        System.out.println("Vulpix, Vulpix!");
    }

    @Override
    public void printMoveSet() {
        System.out.println("1: Flamethrower \t2: Quick Attack\n3: Fire Spin\t4: Fire Blast");
    }

    @Override
    public Pokemon attackOne(Pokemon pokemon) {
        pokemon.setHealth(pokemon.getHealth() - flamethrower.getDamage());
        return pokemon;
    }

    @Override
    public Pokemon attackTwo(Pokemon pokemon) {
        pokemon.setHealth(pokemon.getHealth() - quickAttack.getDamage());
        return pokemon;
    }

    @Override
    public Pokemon attackThree(Pokemon pokemon) {
        pokemon.setHealth(pokemon.getHealth() - fireSpin.getDamage());
        return pokemon;
    }

    @Override
    public Pokemon attackFour(Pokemon pokemon) {
        pokemon.setHealth(pokemon.getHealth() - fireBlast.getDamage());
        return pokemon;
    }
}
