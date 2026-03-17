import java.util.Scanner;

public class Ex_10{
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Informe um número inteiro: ");
        int numero = leia.nextInt();
        String resultado = (numero < 0) ? "O número informado é negativo" : (numero == 0) ? "O número informado é nulo" : "O número informado é positivo";
        System.out.println(resultado);
        leia.close();
    }   
}  