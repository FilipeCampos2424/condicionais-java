import java.util.Scanner;

public class TeatroMenu{
    public static void main(String[] args) {
        char[][] sala = new char[12][12];
        for (int = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                sala[i][j] = 'L';
            }
        }
        Scanner leia = newScanner(System.in);
        int opcao;
        double precoInteiro = 100;
        double precoMeio = precoInteiro / 2;
        
        do {
            System.out.println("\n=== TEATRO DEVISATE ===");
            System.out.println("\n(1) Mostrar o mapa");
            System.out.println("\n(2) Reservar Cadeira");
            System.out.println("\n(3) Comprar Cadeira");
            System.out.println("\n(4) Cancelar Reserva");
            System.out.println("\n(0) Sair");  
        opcao = leia.nextInt();

        } while (opcao != 0);

        
    }
}