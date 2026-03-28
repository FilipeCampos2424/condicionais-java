import java.util.Scanner;

public class Ex_17{
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Informe o valor da compra (R$): ");
        double valor = leia.nextDouble();
        double desconto = 0;
        
        if (valor > 500) {
            desconto = valor * 0.20;
            System.out.println("(Desconto de 20%)");
        }
        else if (valor >= 200) {
            desconto = valor * 0.10 ;
            System.out.println("(Desconto de 10%)");
        }
        else {
            //sem desconto        
        }
        double valorFinal = valor - desconto;
        System.out.println("Valor final da compra: "+valorFinal);  
        
    }   
}  