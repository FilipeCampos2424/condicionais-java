import java.util.Scanner;

public class Ex_11{
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Informe sua idade: ");
        int idade = leia.nextInt();
        String resultado = (idade < 12) ? "Valor do ingresso: R$10,00" : (idade <= 60) ? "Valor do ingresso: R$20,00" : "Valor do ingresso: R$10,00 (meia entrada)";
        System.out.println(resultado);
        leia.close();
    }   
}  