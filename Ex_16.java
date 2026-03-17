import java.util.Scanner;

public class Ex_16{
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Informe um número inteiro: ");
        int numero = leia.nextInt();
        int multiplo = 0;
        int multi3 = 0;
        int multi5 = 0;
        if (numero % 3 == 0 && numero % 5 == 0) {
            multiplo = numero; 
        }
        else if (numero % 3 == 0) {
            multi3 = numero;
        }
        else if (numero % 5 == 0) {
            multi5 = numero;
        }

    String resultado = (numero == multiplo) ? "O número informado é múltiplo de 3 e 5" : (numero == multi3) ? "O número informado é apenas múltiplo de 3" : "O número informado é apenas múltiplo de 5";
    System.out.println(resultado);
    leia.close();
    }   
}  