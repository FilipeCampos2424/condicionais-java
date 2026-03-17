import java.util.Scanner;

public class Ex_19{
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Informe a velocidade (km/h)do veículo: ");
        double vel = leia.nextDouble();
        System.out.println("Informe o limite de km/h da via: ");
        double limite = leia.nextDouble();   
        double por20 = limite * 1.20;
        double por50 = limite * 1.50;    

         String resultado = (vel <= limite) ? "Sem multa" : (vel <= por20) ? "Multa leve" : (vel <= por50) ? "Multa grave" : "Multa gravíssima + suspensão";

        System.out.println(resultado);  
        leia.close();
    }   
}  