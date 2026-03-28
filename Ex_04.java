import java.util.Scanner;

public class Ex_04{
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Informe a temperatura em °C: ");
        int temperatura = leia.nextInt();
        String resultado = (temperatura < 15) ? "Frio" : (temperatura <= 25) ? "Agradável" : "Quente";
        System.out.println(resultado);
        
    }   
}  