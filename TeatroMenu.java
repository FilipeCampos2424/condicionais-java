import java.util.Scanner;

public class TeatroMenu {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        //Declarando variáveis

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

        //matriz da sala

        char[][][] cadeiras = new char[NUM_SALAS][12][12];

        for (int s = 0; s < NUM_SALAS; s++) {
            for (int i = 0; i < 12; i++) {
                for (int j = 0; j < 12; j++) {
                    cadeiras[s][i][j] = ' ';
                }
            }
        }

        int opcao;

//menu
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

//mostrar o mapa da sala
            if (opcao == 1) {
                System.out.println("\n===========================================");
                System.out.println(" SALA: " + nomesSalas[s]);
                System.out.println(" ESPETÁCULO: " + espetaculos[s]);
                System.out.println("===========================================\n");

                System.out.print("    ");
                for (int i = 1; i <= 12; i++)
                System.out.printf("%4d", i);

                System.out.println();

                int livres = 0, reservadas = 0, ocupadas = 0;

                for (int i = 0; i < 12; i++) {
                
                System.out.print("  " + (char) ('A' + i) + "   ");

                for (int j = 0; j < 12; j++) {

                    char estado = cadeiras[s][i][j];

                    char simbolo = estado == ' ' ? ' ' : estado;

                    System.out.print("["+ simbolo + "] " );

                    if (estado == ' ') livres++;
                    else if (estado == 'R') reservadas++;
                    else ocupadas++;
                }
                System.out.println();

                }

                System.out.println("\n[ ] Livre   [R] Reservada   [X] Ocupada");
                System.out.println("Livres: "+livres+ " | Reservadas: "+reservadas+" | Ocupadas: "+ocupadas);            
            }
//informar a linha e coluna pra aplicar nas opções que precisam

            else if (opcao >= 2 && opcao <= 4) {
                System.out.print("Linha (A-L): ");
                char linha = leia.next().toUpperCase().charAt(0);
                
                System.out.print("Coluna (1-12): ");
                int coluna = leia.nextInt();
                
                int l = linha - 'A';
                int c = coluna - 1;

                if (l < 0 || l >= 12 || c < 0 || c >= 12) {
                    System.out.println("Posição Inválida!");
                    continue;
                }
                char estado = cadeiras[s][l][c];

            }



    } while (opcao != 0);

    
}
}