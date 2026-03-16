import java.util.Scanner;

public class Ex_06{
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Informe o ano: ");
        int ano = leia.nextInt();
        String resultado = (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0) ? "O Ano informado é bissexto." : "O Ano informado NÃO é bissexto.";
        System.out.println(resultado);
        leia.close();
    }   
}  