import java.util.Scanner;

public class Ex_09{
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Informe o dia da semana (1 a 7): ");
        int dia = leia.nextInt();
        if (dia < 1 || dia > 7) {
        System.out.println("Dia inválido.");
        }
        else {
        switch (dia) {
            case 1: 
            System.out.println("Segunda-Feira");
            break;

            case 2: 
            System.out.println("Terça-Feira");
            break;

            case 3: 
            System.out.println("Quarta-Feira");
            break;

            case 4: 
            System.out.println("Quinta-Feira");
            break;

            case 5: 
            System.out.println("Sexta-Feira");
            break;

            case 6: 
            System.out.println("Sábado");
            break;

            case 7: 
            System.out.println("Domingo");
            break;            
        }   
        }
        leia.close();
    }   
}  