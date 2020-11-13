import pokemon.Bulbasaur;
import pokemon.Pikachu;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;



public class Main {

    public static void main(String[] args) throws InterruptedException {
        //instantiating Classes
        Menu menu = new Menu();

        Scanner scanner = new Scanner(System.in);


        //welcome screen
        menu.welcome();

        //create player one
        //enter player 1 name
        System.out.println("Enter Player 1 name: ");
//        String player1Name = scanner.nextLine();
        //choose pokemon

        Player player1 = new Player(scanner.nextLine(), menu.choosePokemon());
        //player1.getPokemon().makeSound();


        //create player two
        //enter player 2 name
        System.out.println("Enter Player 2 name: ");
//        String player2Name = scanner.nextLine();
        //choose pokemon.Pokemon
        Player player2 = new Player(scanner.nextLine(), menu.choosePokemon());
        TimeUnit.SECONDS.sleep(3);

        menu.pokemonBattle(player1,player2);

        int choice = 0;



        //BATTLE LOOP
        while((player1.getPokemon().getHealth() >0) && (player2.getPokemon().getHealth() > 0)){
            System.out.println("\n\n\u001BIt is your turn " + player1.getName() + ". Choose your attack move!");
            //print out pokemon's move set
            player1.getPokemon().printMoveSet();
            choice = scanner.nextInt();

        //PLAYER 1
            System.out.println(player1.getPokemon().getName() + ", attack!");

            switch(choice){
                case 1:
                    player2.setPokemon(player1.getPokemon().attackOne(player2.getPokemon()));
//                    player1.setPokemon(player2.getPokemon().attackOne(player2.getPokemon()));
                    break;
                case 2:
                    player2.setPokemon(player1.getPokemon().attackTwo(player2.getPokemon()));
//                    player1.setPokemon(player2.getPokemon().attackTwo(player2.getPokemon()));
                    break;
                case 3:
                    player2.setPokemon(player1.getPokemon().attackThree(player2.getPokemon()));
//                    player1.setPokemon(player2.getPokemon().attackThree(player2.getPokemon()));
                    break;
                case 4:
                    player2.setPokemon(player1.getPokemon().attackFour(player2.getPokemon()));
//                    player1.setPokemon(player2.getPokemon().attackFour(player2.getPokemon()));
                    break;
                default:
                    player2.setPokemon(player1.getPokemon().attackOne(player2.getPokemon()));
//                    player1.setPokemon(player2.getPokemon().attackOne(player2.getPokemon()));
            }
            System.out.println(player2.getName() + "'s " + player2.getPokemon().getName() + " has " + player2.getPokemon().getHealth() + " health left.");



            //check if pokemon did not faint by last attack
            if(player2.getPokemon().getHealth() > 0) {

                //PLAYER 2
                System.out.println("\n\n\033[1;33m It is your turn " + player2.getName() + ". Choose your attack move!");
                player2.getPokemon().printMoveSet();
                choice = scanner.nextInt();
                System.out.println(player2.getPokemon().getName() + ", attack!");
                switch(choice){
                    case 1:
                        player1.setPokemon(player2.getPokemon().attackOne(player1.getPokemon()));
//                    System.out.println(player1.getPokemon().getHealth());
                      //  player2.setPokemon(player1.getPokemon().attackOne(player1.getPokemon()));
                        break;
                    case 2:
                        player1.setPokemon(player2.getPokemon().attackTwo(player1.getPokemon()));
                       // player2.setPokemon(player1.getPokemon().attackTwo(player1.getPokemon()));
                        break;
                    case 3:
                        player1.setPokemon(player2.getPokemon().attackThree(player1.getPokemon()));
                        //player2.setPokemon(player1.getPokemon().attackThree(player1.getPokemon()));
                        break;
                    case 4:
                        player1.setPokemon(player2.getPokemon().attackFour(player1.getPokemon()));
                       // player2.setPokemon(player1.getPokemon().attackFour(player1.getPokemon()));
                        break;
                    default:
                        player1.setPokemon(player2.getPokemon().attackOne(player1.getPokemon()));
                      //  player2.setPokemon(player1.getPokemon().attackOne(player1.getPokemon()));
                }
                System.out.println(player1.getName() + "'s pokemon has " + player1.getPokemon().getHealth() + " health left.");

            }

        }//end of battle loop
        if(player1.getPokemon().getHealth() > player2.getPokemon().getHealth()){
            System.out.println("\n\n\u001B\t\t\tCONGRATULATIONS " + player1.getName() + "!\u001B[0m");
            System.out.println("\t\t\tYOU ARE THE WINNER!");
            TimeUnit.SECONDS.sleep(3);
            player1.getPokemon().printPokemon();
        }
        else{
            System.out.println("\n\n\u001B\t\t\tCONGRATULATIONS " + player2.getName() + "!\u001B[0m");
            System.out.println("\t\t\tYOU ARE THE WINNER!");
            TimeUnit.SECONDS.sleep(3);
            player2.getPokemon().printPokemon();
        }





    }

//    public static void playMusic(String filepath)
//    {
//        InputStream music;
//        try{
//            music = new FileInputStream(new File(filepath));
//            AudioStream audios= new AudioStream(music);
//            AudioPlayer.player.start(audios);
//        }
//        catch (Exception e){
//
//        }
//    }

}
