import java.util.Scanner;

public class Ex_01{
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Informe um número inteiro: ");
        int numero = leia.nextInt();
        String resultado = (numero % 2 == 0) ? "O número informado é par." : "O número informado é ímpar.";
        System.out.println(resultado);
        leia.close();
    }   
}  