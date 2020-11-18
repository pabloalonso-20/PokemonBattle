package pokemon;

public class Bulbasaur implements Pokemon {

    private String name = "Bulbasaur";
    private int health;
    private String type = "Grass";
    private String weakness = "Fire";

    Move solarBeam = new Move("Solar beam", 45, "Grass");
    Move petalDance = new Move("Petal dance", 45, "Grass");
    Move leechSeed = new Move("Leech seed", 25, "Grass");
    Move megaDrain = new Move("Mega drain", 35, "Grass");


    public Bulbasaur(int health){
        this.health = health;
    }

    @Override
    public void printPokemon() {
        System.out.println("\u001B[32m                                           /\n" +
                "                        _,.------....___,.' ',.-.\n" +
                "                     ,-'          _,.--\"        |\n" +
                "                   ,'         _.-'              .\n" +
                "                  /   ,     ,'                   `\n" +
                "                 .   /     /                     ``.\n" +
                "                 |  |     .                       \\.\\\n" +
                "       ____      |___._.  |       __               \\ `.\n" +
                "     .'    `---\"\"       ``\"-.--\"'`  \\               .  \\\n" +
                "    .  ,            __               `              |   .\n" +
                "    `,'         ,-\"'  .               \\             |    L\n" +
                "   ,'          '    _.'                -._          /    |\n" +
                "  ,`-.    ,\".   `--'                      >.      ,'     |\n" +
                " . .'\\'   `-'       __    ,  ,-.         /  `.__.-      ,'\n" +
                " ||:, .           ,'  ;  /  / \\ `        `.    .      .'/\n" +
                " j|:D  \\          `--'  ' ,'_  . .         `.__, \\   , /\n" +
                "/ L:_  |                 .  \"' :_;                `.'.'\n" +
                ".    \"\"'                  \"\"\"\"\"'                    V\n" +
                " `.                                 .    `.   _,..  `\n" +
                "   `,_   .    .                _,-'/    .. `,'   __  `\n" +
                "    ) \\`._        ___....----\"'  ,'   .'  \\ |   '  \\  .\n" +
                "   /   `. \"`-.--\"'         _,' ,'     `---' |    `./  |\n" +
                "  .   _  `\"\"'--.._____..--\"   ,             '         |\n" +
                "  | .\" `. `-.                /-.           /          ,\n" +
                "  | `._.'    `,_            ;  /         ,'          .\n" +
                " .'          /| `-.        . ,'         ,           ,\n" +
                " '-.__ __ _,','    '`-..___;-...__   ,.'\\ ____.___.'\n" +
                " `\"^--'..'   '-`-^-'\"--    `-^-'`.''\"\"\"\"\"`.,^.`.--' ");
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
    public String getType() {
        return type;
    }

    @Override
    public String getWeakness() {
        return weakness;
    }

    @Override
    public String moveTypeOne() {
        return solarBeam.getDescription();
    }

    @Override
    public String moveTypeTwo() {
        return petalDance.getDescription();
    }

    @Override
    public String moveTypeThree() {
        return leechSeed.getDescription();
    }

    @Override
    public String moveTypeFour() {
        return megaDrain.getDescription();
    }

    @Override
    public void makeSound() {
        System.out.println("Bulba, Bulbasaur!");
    }

    @Override
    public void printMoveSet() {
        System.out.println("1. Solar Beam\t2. Petal Dance\n3. Leech Seed 4. Mega Drain");
    }


    public Pokemon attackOne(Pokemon pokemon, float effective) {

        pokemon.setHealth((int) (pokemon.getHealth() - (solarBeam.getDamage() * effective)));
        return pokemon;
    }


    public Pokemon attackTwo(Pokemon pokemon, float effective) {
        pokemon.setHealth((int) (pokemon.getHealth() - (petalDance.getDamage() * effective)));
        return pokemon;
    }


    public Pokemon attackThree(Pokemon pokemon, float effective) {
        pokemon.setHealth((int) (pokemon.getHealth() - (leechSeed.getDamage() * effective)));
        return pokemon;
    }


    public Pokemon attackFour(Pokemon pokemon, float effective) {
        pokemon.setHealth((int) (pokemon.getHealth() - (megaDrain.getDamage() * effective)));
        return pokemon;
    }


}