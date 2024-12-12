import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String username = "admin";
        String password = "Jeann123";
        boolean loop = true;  // Inicializa a variável loop

        do {
            System.out.print("Digite o nome de usuário: ");
            String inputUsername = in.nextLine();

            System.out.print("Digite a senha: ");
            String inputPassword = in.nextLine();

            if (inputUsername.equals(username) && inputPassword.equals(password)) {
                System.out.println("Login com sucesso!");
                break;
            } else {
                System.out.println("Login negado!");
            }


            loop = repetir();
        } while (loop);
    }

    public static boolean repetir() {
        Scanner JJ = new Scanner(System.in);
        System.out.print("Tentar novamente? (S/N): ");
        return JJ.nextLine().toUpperCase(Locale.ROOT).equals("S");
    }
}
