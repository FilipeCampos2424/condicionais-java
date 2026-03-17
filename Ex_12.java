import java.util.Scanner;

public class Ex_12{
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Informe uma nota de 0 a 10: ");
        int nota = leia.nextInt();
        String resultado = (nota <= 4) ? "Nota D" : (nota <= 6) ? "Nota C" : (nota <= 8) ? "Nota B" : "Nota A";
        System.out.println(resultado);
        leia.close();
    }   
}  