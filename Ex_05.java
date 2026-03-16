import java.util.Scanner;

public class Ex_05{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe o primeiro número:");
        int N1 = ler.nextInt();
        System.out.println("Informe o segundo número:");
        int N2 = ler.nextInt();
        System.out.println("Escolha o operador (1) Adição (2) Subtração (3) Multiplicação (4) Divisão");
        int selecao = ler.nextInt();
        switch (selecao) {
            case 1:
            int adicao = N1 + N2;
            System.out.println("Resultado: "+adicao);
            break;

            case 2:
            int subtracao = N1 - N2;
            System.out.println("Resultado: "+subtracao);
            break;

            case 3:
            int multiplicacao = N1 * N2;
            System.out.println("Resultado: "+multiplicacao);
            break;
            case 4:
            int divisao = N1 / N2;
            System.out.println("Resultado: "+divisao);
            break;

 }
    }

}