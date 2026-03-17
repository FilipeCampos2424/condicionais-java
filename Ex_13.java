import java.util.Scanner;

public class Ex_13{
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Informe o mês do ano (1 a 12): ");
        int mes = leia.nextInt();
        if (mes < 1 || mes > 12)  {
        System.out.println("Mês inválido.");
        }
      
        else {
        switch (mes) {
            case 1: 
            System.out.println("Verão (Janeiro)");
            break;

            case 2: 
            System.out.println("Verão (Fevereiro)");
            break;

            case 3: 
            System.out.println("Outono (Março)");
            break;

            case 4: 
            System.out.println("Outono (Abril)");
            break;

            case 5: 
            System.out.println("Outono (Maio)");
            break;

            case 6: 
            System.out.println("Inverno (Junho)");
            break;

            case 7: 
            System.out.println("Inverno (Julho)");
            break; 

            case 8: 
            System.out.println("Inverno (Agosto)");
            break; 

            case 9: 
            System.out.println("Primavera (Setembro)");
            break;

            case 10: 
            System.out.println("Primavera (Outubro)");
            break;

            case 11: 
            System.out.println("Primavera (Novembro)");
            break;

            case 12: 
            System.out.println("Verão (Dezembro)");
            break;          
            
        }   
          }
        leia.close();
        }

    }   
