import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String loginCorreto = "java8";
        String senhaCorreta = "java8";
        int tentativasRestantes = 3;
        boolean acessoPermitido = false;
        
        while (tentativasRestantes > 0 && !acessoPermitido) {

            System.out.print("Digite o login: ");
            String login = scanner.nextLine();
            
            System.out.print("Digite a senha: ");
            String senha = scanner.nextLine();
            
            if (login.equals(loginCorreto) && senha.equals(senhaCorreta)) {
                acessoPermitido = true;
                System.out.println("Acesso permitido. Bem-vindo!");
            } else {
                tentativasRestantes--;
                System.out.println("Login ou senha incorretos.");
                if (tentativasRestantes > 0) {
                    System.out.println("Você tem " + tentativasRestantes + " tentativas restantes.");
                } else {
                    System.out.println("Você excedeu o número de tentativas. Acesso negado.");
                }
            }
        }
        
        scanner.close();
    }
}
