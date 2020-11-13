import pokemon.Bulbasaur;
import pokemon.Pikachu;
import pokemon.Pokemon;
import pokemon.Vulpix;

import java.util.Scanner;

public class Menu {


    public Menu() {
    }

    public void welcome(){
        System.out.println("\033[1;33m\t\t\t\t\tPOKEMON BATTLE APP");
        System.out.println("                                  ,'\\\n" +
                "    _.----.        ____         ,'  _\\   ___    ___     ____\n" +
                "_,-'       `.     |    |  /`.   \\,-'    |   \\  /   |   |    \\  |`.\n" +
                "\\      __    \\    '-.  | /   `.  ___    |    \\/    |   '-.   \\ |  |\n" +
                " \\.    \\ \\   |  __  |  |/    ,','_  `.  |          | __  |    \\|  |\n" +
                "   \\    \\/   /,' _`.|      ,' / / / /   |          ,' _`.|     |  |\n" +
                "    \\     ,-'/  /   \\    ,'   | \\/ / ,`.|         /  /   \\  |     |\n" +
                "     \\    \\ |   \\_/  |   `-.  \\    `'  /|  |    ||   \\_/  | |\\    |\n" +
                "      \\    \\ \\      /       `-.`.___,-' |  |\\  /| \\      /  | |   |\n" +
                "       \\    \\ `.__,'|  |`-._    `|      |__| \\/ |  `.__,'|  | |   |\n" +
                "        \\_.-'       |__|    `-._ |              '-.|     '-.| |   |\n" +
                "                                `'                            '-._|");
    }

    public Pokemon choosePokemon(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("\u001B[31mChoose your pokemon: ");
        System.out.println("Enter [1] if you choose Pikachu");
        System.out.println("Enter [2] if you choose Bulbasaur");
        System.out.println("Enter [3] if you choose Vulpix\n");
        int choice = scanner.nextInt();
        switch(choice){
            case 1:
                Pikachu pikachu = new Pikachu(140);
                System.out.println("You have chosen Pikachu!");
                pikachu.printPokemon();
                pikachu.makeSound();
                return pikachu;
            case 2:
                Bulbasaur bulbasaur = new Bulbasaur(155);
                System.out.println("You have chosen Bulbasaur!");
                bulbasaur.printPokemon();
                bulbasaur.makeSound();
                return bulbasaur;
            case 3:
                Vulpix vulpix = new Vulpix(150);
                System.out.println("You have chosen Vulpix");
                vulpix.printPokemon();
                vulpix.makeSound();
                return vulpix;
            default:
                Pikachu pikachu1 = new Pikachu(140);
                return pikachu1;
        }
    }

    public void pokemonBattle(Player player1, Player player2){

        System.out.println("\n\n\n\n");
        System.out.println("\u001B[46m\n\t\t\t\t\t" + player1.getName() +"\tVS\t" + player2.getName()+"\n\u001B[0m");
        System.out.println("\u001B[31m          XX                                    XX\n" +
                "        XX..X                                  X..XX\n" +
                "      XX.....X                                X.....XX\n" +
                " XXXXX.....XX                                  XX.....XXXXX\n" +
                "X |......XX%,.@                              @#%,XX......| X\n" +
                "X |.....X  @#%,.@                          @#%,.@  X.....| X\n" +
                "X  \\...X     @#%,.@                      @#%,.@     X.../  X\n" +
                " X# \\.X        @#%,.@                  @#%,.@        X./  #\n" +
                "  ##  X          @#%,.@              @#%,.@          X   #\n" +
                ", \"# #X            @#%,.@          @#%,.@            X ##\n" +
                "   `###X             @#%,.@      @#%,.@             ####'\n" +
                "  . ' ###              @#%.,@  @#%,.@              ###`\"\n" +
                "    . \";\"                @#%.@#%,.@                ;\"` ' .\n" +
                "      '                    @#%,.@                   ,.\n" +
                "      ` ,                @#%,.@  @@                `\n" +
                "                          @@@  @@@                  .");

    }



}
