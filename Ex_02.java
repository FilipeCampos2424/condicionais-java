import java.util.Scanner;

public class Ex_02{
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Informe o primeiro número inteiro: ");
        int n1 = leia.nextInt();
        System.out.println("Informe o segundo número inteiro: ");
        int n2 = leia.nextInt();
        String resultado = (n1 > n2) ? "O número "+n1+" é maior." : "O número "+n2+" é maior.";
        System.out.println(resultado);
        
    }   
}  