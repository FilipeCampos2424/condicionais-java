import java.util.Scanner;

public class Ex_07{
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Informe o primeiro lado: ");
        int l1 = leia.nextInt();
        System.out.println("Informe o segundo lado: ");
        int l2 = leia.nextInt();
        System.out.println("Informe o terceiro lado: ");
        int l3 = leia.nextInt(); 
        

        if ((l1 + l2 > l3) && (l1 + l3 > l2) && (l2 + l3 > l1)) {
        System.out.println("Triângulo informado é válido! Ele é um: "); 
        

        if (l1 == l2 && l2 == l3) {
        System.out.println("Equilátero");
        }

        else if (l1 == l2 || l1 == l3 || l2 == l3) {
            System.out.println("Isósceles");
        }

        else if (l1 != l2 && l1 != l3 && l2 != l3) {
            System.out.println("Escaleno");
        }
        }

        else {
        System.out.println("Os valores informados não fazem um triângulo válido.");
        }

        
    }   
}  