import java.util.Scanner;

public class Ex_15{
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        String userCorreto = "Admin";
        String senhaCorreta = "123456";
        System.out.println("Informe seu nome de usuário: ");
        String user = leia.nextLine();
        System.out.println("Informe sua senha: ");
        String senha = leia.nextLine();        
        String resultado = (user.equals("Admin") && senha.equals("123456")) ? "Acesso Permitido" : "Acesso Negado";
        System.out.println(resultado);
        leia.close();
    }   
}  