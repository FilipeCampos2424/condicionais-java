import java.util.Scanner;

public class Ex_14{
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Informe o primeiro número inteiro: ");
        int n1 = leia.nextInt();
        System.out.println("Informe o segundo número inteiro: ");
        int n2 = leia.nextInt();
        System.out.println("Informe o terceiro número inteiro: ");
        int n3 = leia.nextInt();
        String resultado = (n1 > n2 && n1 > n3) ? "O número "+n1+" é o maior." : (n2 > n1 && n2 > n3) ? "O número "+n2+" é o maior." : (n1 == n2 && n2 == n3) ? "Empate, todos são iguais" : "O número "+n3+" é o maior.";
        System.out.println(resultado);
        
    }   
}  