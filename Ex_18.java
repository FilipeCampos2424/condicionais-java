import java.util.Scanner;

public class Ex_18{
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Informe um número inteiro de 1 a 10: ");
        int numero = leia.nextInt();
        if (numero < 1 || numero > 10)  {
        System.out.println("Número inválido.");
        }
      
        else {
        switch (numero) {
            case 1: 
            System.out.println("1 = I");
            break;

            case 2: 
            System.out.println("2 = II");
            break;

            case 3: 
            System.out.println("3 = III");
            break;

            case 4: 
            System.out.println("4 = IV");
            break;

            case 5: 
            System.out.println("5 = V");
            break;

            case 6: 
            System.out.println("6 = VI");
            break;

            case 7: 
            System.out.println("7 = VII");
            break; 

            case 8: 
            System.out.println("8 = VIII");
            break; 

            case 9: 
            System.out.println("9 = IX");
            break;

            case 10: 
            System.out.println("10 = X");
            break;    
            
        }   
          }
        
        }

    }   
