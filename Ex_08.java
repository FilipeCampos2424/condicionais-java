import java.util.Scanner;

public class Ex_08{
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Informe seu peso (kg): ");
        double peso = leia.nextDouble();
        System.out.println("Informe sua altura (m): ");
        double altura = leia.nextDouble();
        Double imc = peso / (altura * altura);
        String resultado = (imc < 18.5) ? "Abaixo do peso" : (imc < 25) ? "Peso normal" : (imc < 30) ? "Sobrepeso" : "Obesidade";
        System.out.println(resultado);
        
    }   
}  