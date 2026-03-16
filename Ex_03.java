import java.util.Scanner;

public class Ex_03{
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Informe a média do aluno: ");
        int media = leia.nextInt();
        String resultado = (media >= 7) ? "Aprovado" : (media >= 5 && media < 7) ? "Recuperação" : "Reprovado";
        System.out.println(resultado);
        leia.close();
    }   
}  