import java.util.Scanner;

public class Player {

    String nome;
    int idade;
    String categoria = "Treinador pokemon";
    int liga;
    String [] pokemon = new String[5];

    public void registrarPlayer(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Bem vindo a está aventura pokemon!\n "
                + "\nDigite seu nome: ");
        nome = scan.next();

        System.out.println("Sua idade: ");
        idade = scan.nextInt();

        System.out.println("\nEscolha uma liga pokemon:"
                + "1 - Kanto"
                + "2 - Hoenn");
        liga = scan.nextInt();

        System.out.println("Escolha um pokemon: "
                + "1 - Charmander"
                + "2 - Squirtle"
                + "3 - Bulbasaur");

        int escolha = scan.nextInt();
        if (escolha == 1){
            pokemon [0] = "Charmander";
        } else if (escolha == 2) {
            pokemon [0] = "Squirtle";
        } else if (escolha == 3) {
            pokemon [0] = "Bulbasaur";
        }
    }

    public void catchPokemon(){

        for (int i = 0; i < 5; i++){
            if (!(pokemon[i] == null)){
                System.out.println("["+pokemon[i]+"]");
            }
        }


    }



}
