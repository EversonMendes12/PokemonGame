import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String escolha;
        boolean continuar = true;
        Player p = new Player();

        System.out.println(" ///////// BEM VINDO! /////////"
                + "\n Vamos iniciar nossa aventura Pokemon.");

        while (continuar) {
            System.out.println("Digite SIM para se registrar"
                    + "\nou digite MENU");
            escolha = scan.next();

            if (escolha.equals("sim") || escolha.equals("SIM")) {

                p.registrarPlayer();

                System.out.println("Deseja encerrar? digite 0");
                int laco = scan.nextInt();
                if (laco == 0) continuar = false;
                else continuar = true;

            }
            if (escolha.equals("menu") || escolha.equals("MENU")) {
                int op;
                System.out.println("MENU:: "
                        + "\n1 - CATCH");
                op = scan.nextInt();

                if (op == 1) p.catchPokemon();


                System.out.println("Deseja encerrar? digite 0");
                int laco = scan.nextInt();
                if (laco == 0) continuar = false;
                else continuar = true;

            }
        }
    }

}
