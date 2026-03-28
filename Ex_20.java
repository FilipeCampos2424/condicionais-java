import java.util.Scanner;
import java.util.Random;

public class Ex_20{
    public static void main(String[] args) {
        Random gerar = new Random();
        int numMaquina = gerar.nextInt(3);
         
        Scanner leia = new Scanner(System.in);
        int jogadorGanhou = 0;
        int maquinaGanhou = 0;
        System.out.println("\nAtivar Debug Mode? (0) Não (1) Sim \n");
        int debugMode = leia.nextInt();
        if (debugMode == 0) {
            System.out.println("Debug Mode DESATIVADO \n\n");
        }
        else if (debugMode == 1) {
            System.out.println("Debug Mode ATIVADO \n\n");
            System.out.println("Número que a máquina escolheu: "+numMaquina+"\n"); 
        }
        else {
            System.out.println("Número inválido.");
        }
        
        System.out.println("PEDRA, PAPEL, TESOURA \n");
        System.out.println("(0) Pedra (1) Papel (2) Tesoura \n");
        

        int numJogador = leia.nextInt();

        if (numJogador == 0 && numMaquina == 1 ) {
            maquinaGanhou++;
        }
        else if (numJogador == 1 && numMaquina == 0 ) {
            jogadorGanhou++;
        }
        else if 
        (numJogador == 1 && numMaquina == 2 ) {
             maquinaGanhou = maquinaGanhou + 1;
        }
        else if (numJogador == 2 && numMaquina == 1 ) {
             jogadorGanhou++;
        }

        else if 
        (numJogador == 2 && numMaquina == 0 ) {
            maquinaGanhou++;
        }
        else if (numJogador == 0 && numMaquina == 2 ) {
            jogadorGanhou++;
        }

        String resultado = (jogadorGanhou == 1) ? "O jogador venceu!" : (maquinaGanhou == 1) ? "A máquina venceu!" : "Empate";
        
        System.out.println(resultado);

        
    }   
}  