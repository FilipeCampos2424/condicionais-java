import java.util.Scanner;

public class TeatroMenu {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int NUM_SALAS = 2;

        String[] nomesSalas = {
                "Sala Beethoven",
                "Sala Principal"
        };

        String[] espetaculos = {
                "O Fantasma da Ópera",
                "Hamlet"
        };

        double[] precoInteiro = {100, 120};

        char[][][] cadeiras = new char[NUM_SALAS][12][12];

        for (int s = 0; s < NUM_SALAS; s++) {
            for (int i = 0; i < 12; i++) {
                for (int j = 0; j < 12; j++) {
                    cadeiras[s][i][j] = ' ';
                }
            }
        }

        int opcao;

        do {

            System.out.println("\n===== TEATRO DEVISATE =====");
            System.out.println("1 - Exibir mapa da sala");
            System.out.println("2 - Reservar cadeira");
            System.out.println("3 - Comprar cadeira");
            System.out.println("4 - Cancelar reserva");
            System.out.println("5 - Relatório financeiro");
            System.out.println("0 - Sair");
            System.out.println("\nEscolha: ");

            opcao = leia.nextInt();
            if (opcao == 0) break;

            System.out.println("Escolha a sala:");
            for (int i = 0; i < NUM_SALAS; i++) {
                System.out.println(i + " - " + nomesSalas[i]);
            }

            int s = leia.nextInt();

            if (s < 0 || s >= NUM_SALAS) {
                System.out.println("Sala inválida!");
                continue;
            }


    } while (opcao != 0);

    
}
}