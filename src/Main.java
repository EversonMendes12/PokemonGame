import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String escolha;
        Player p = new Player();

        System.out.println(" ///////// BEM VINDO! /////////"
                + "\n Vamos iniciar nossa aventura Pokemon."
                + "\n\nDigite SIM para se registrar"
                + "\nou digite MENU");
        escolha = scan.next();

        if (escolha.equals("sim") || escolha.equals("SIM")) {

            p.registrarPlayer();
        } else if (escolha.equals("menu") || escolha.equals("MENU")) {
         int op;
            System.out.println("MENU:: "
                    + "\n1 - CATCH");
            op = scan.nextInt();

            if (op == 1){
                p.catchPokemon();
            }
        }

    }

}
