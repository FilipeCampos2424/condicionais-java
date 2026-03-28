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
            System.out.println("7 - Lista de Exercícios");
            System.out.println("0 - Sair");
            System.out.println("\nEscolha: ");

            opcao = leia.nextInt();
            if (opcao == 0) {
            System.out.println("Encerrando programa....");
            break;
            
            } 

        if (opcao != 7) {

       
            System.out.println("Escolha a sala:");
            for (int i = 0; i < NUM_SALAS; i++) {
                System.out.println(i + " - " + nomesSalas[i]);
            }

            int s = leia.nextInt();

            if (s < 0 || s >= NUM_SALAS) {
                System.out.println("Sala inválida!");
                continue;
            }

            double meia = precoInteiro[s] / 2;  

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

//Reservar 
            if (opcao == 2) {
                if (estado == ' '){
                    cadeiras[s][l][c] = 'R';
                    System.out.println("Reserva feita! Valor pago: R$"+meia);
                }
                else {
                    System.out.println("Falha na reserva, cadeira já ocupada.");
                }
            }

//Comprar
            if (opcao == 3) {
                if (estado == ' '){
                    cadeiras[s][l][c] = 'X';
                    System.out.println("Compra realizada! Valor pago: R$"+precoInteiro[s]);
                }
                else if (estado == 'R'){
                    cadeiras[s][l][c] = 'X';
                    System.out.println("Compra realizada! Valor adicional pago: R$"+meia);
                }
                else {
                    System.out.println("Falha na compra, cadeira já ocupada.");
                }
            }

//Cancelar
            if (opcao == 4) {
                if (estado == 'R') {
                    cadeiras[s][l][c] = ' ';
                    System.out.println("Reserva cancelada com sucesso! Valor do Reembolso: R$"+meia);
                }
                else {
                    System.out.println("Não há reserva para cancelar.");
                }
            }

        }

//Relatório

            else if (opcao == 5) {
                int livres = 0, reservadas = 0, ocupadas = 0;

                for (int i = 0; i < 12; i++){
                    for (int j = 0; j < 12; j++) {

                        switch (cadeiras[s][i][j]) {
                            case ' ': livres++; break;
                            case 'R': reservadas++; break;
                            case 'X': ocupadas++; break;
                        }
                    }
                }


                double arrecadado = ocupadas * precoInteiro[s];
                double reservas = reservadas * meia;
                double potencialReservas = arrecadado + reservas;
                double potencialMax = potencialReservas + livres * precoInteiro[s];

                System.out.println("\n===== RELATÓRIO FINANCEIRO =====");
                System.out.println("Livres: "+livres);
                System.out.println("Reservadas: "+reservadas);
                System.out.println("Ocupadas: "+ocupadas);
                System.out.println("Total arrecadado: R$"+arrecadado);
                System.out.println("Total em reservas: R$"+reservas);
                System.out.println("Receita potencial de reservas: R$"+potencialReservas);
                System.out.println("Receita potencial máxima: R$"+potencialMax);
            }
             }

// lista de exercícios inteira

            else if (opcao == 7) {

                int paginaAtual = 0;
                int itensPorPagina = 7;
                int totalExercicios = 20;
                int totalPaginas = (int) Math.ceil((double) totalExercicios / itensPorPagina);

            
                    String[] titulos = new String[totalExercicios];
                    String[] enunciados = new String[20];
                    for (int i = 0; i < titulos.length; i++) {
                        titulos[i] = "Exercício " + (i + 1);
                    }
                    enunciados[0] = "Leia um número inteiro e informe se ele é par ou ímpar. Obrigatório: use o operador ternário para exibir a mensagem.\n";
                    enunciados[1] = "Leia dois números inteiros e exiba qual é o maior. Obrigatório: use o operador ternário para determinar e exibir o maior.\n";
                    enunciados[2] = "Leia a média de um aluno (0 a 10) e exiba: (Aprovado) se média >= 7  (Recuperação) se média >= 5 e < 7  (Reprovado) se média < 5.\n";
                    enunciados[3] = "Leia a temperatura em graus Celsius e classifique: Abaixo de 15ºC (Frio)  Entre 15ºC e 25ºC (Aradável)  Acima de 25ºC (Quente)\n";
                    enunciados[4] = "Leia dois números e um operador (+, -, *, /) e realize a operação correspondente usando switch. Trate a divisão por zero.\n";
                    enunciados[5] = "Leia um ano e informe se ele é bissexto ou não.\n";
                    enunciados[6] = "Leia três lados e verifique se formam um triângulo válido. Se sim, classifique como equilátero, isósceles ou escaleno.\n";
                    enunciados[7] = "Leia o peso (kg) e a altura (m) de uma pessoa, calcule o IMC (peso / altura²) e classifique: IMC < 18.5 → (Abaixo do peso) 18.5 ≤ IMC < 25 → (Peso normal) 25 ≤ IMC < 30 → (Sobrepeso) IMC ≥ 30 → (Obesidade) Desafio: use o ternário para exibir se o IMC está dentro ou fora da faixa saudável.\n";
                    enunciados[8] = "Leia um número de 1 a 7 e exiba o nome do dia da semana correspondente usando switch. Para qualquer outro número, exiba (Dia inválido).\n";
                    enunciados[9] = "Leia um número e informe se é positivo, negativo ou zero. Obrigatório: use o operador ternário aninhado.\n";
                    enunciados[10] = "Uma sala de cinema cobra: Menores de 12 anos: R$ 10,00\n Entre 12 e 60 anos: R$ 20,00\n Acima de 60 anos: R$ 10,00 (meia)\n Leia a idade e exiba o valor do ingresso.\n";
                    enunciados[11] = "Leia uma nota (0-10) e exiba o conceito: 9 a 10\n → A 7 a 8 → B\n 5 a 6 → C\n 0 a 4 → D\n";
                    enunciados[12] = "Leia o número do mês (1-12) e exiba a estação do ano correspondente (considere o hemisfério sul).\n";
                    enunciados[13] = "Leia três números inteiros e exiba qual é o maior entre os três. Trate o caso de empate.\n";
                    enunciados[14] = "Defina um usuário e senha fixos no código. Leia o usuário e a senha digitados e exiba (Acesso permitido) ou (Acesso negado). Obrigatório: use o operador ternário para exibir a mensagem.\n";
                    enunciados[15] = "Leia um número inteiro e informe: \nSe é múltiplo de 3 e de 5 simultaneamente \nSe é múltiplo apenas de 3 \nSe é múltiplo apenas de 5 \nSe não é múltiplo de nenhum \nDesafio: use o ternário onde for possível. \n";
                    enunciados[16] = "Uma loja dá desconto conforme o valor da compra: \nAcima de R$ 500 → 20% de desconto \nEntre R$ 200 e R$ 500 → 10% de desconto \nAbaixo de R$ 200 → sem desconto \nLeia o valor e exiba o valor final após o desconto.\n";
                    enunciados[17] = "Leia um número de 1 a 10 e exiba seu equivalente em algarismo romano usando switch.\n";
                    enunciados[18] = "Leia a velocidade de um veículo e o limite da via. Classifique: \nDentro do limite → Sem multa \nAté 20% acima → Multa leve \nEntre 20% e 50% acima → Multa grave \nAcima de 50% → Multa gravíssima + suspensão \n";
                    enunciados[19] = "Leia a escolha de dois jogadores (pedra, papel ou tesoura) e determine quem venceu ou se houve empate usando if/else encadeado. Desafio: use o operador ternário para exibir o resultado final (Jogador 1 venceu, Jogador 2 venceu ou Empate).\n";

    

                
                    char opcaoPagina = 'b';

                    do {

                    int inicio = paginaAtual * itensPorPagina;
                    int fim = Math.min(inicio + itensPorPagina, totalExercicios);
                
                    System.out.println("\n====LISTA DE EXERCÍCIOS ====");
                    System.out.println("Página " + (paginaAtual + 1));
                    for (int i = inicio; i < fim; i++) {
                        System.out.println("(" + (i + 1) + ") " + titulos[i]);
                    }

                    System.out.println((paginaAtual > 0 ? "(A) Anterior " : "") + (paginaAtual < totalPaginas - 1 ? "(P) Próxima " : "") + "(V) Voltar ao teatro");
                    System.out.println("Escolha: ");
                    String entrada = leia.next();

                    if (entrada.matches("\\d+")) {
                        int escolha = Integer.parseInt(entrada);

                        if (escolha >= 1 && escolha <= totalExercicios) {
                            System.out.println("\n" + titulos[escolha - 1]);
                            System.out.println("\n" + enunciados[escolha - 1]);
                        switch (escolha) {

                            case 1:
                                Ex_01 ex1 = new Ex_01();
                                ex1.main(new String[]{});
                                break;
                        
                            case 2:
                                Ex_02 ex2 = new Ex_02();
                                ex2.main(new String[]{});
                                break;
                            case 3:
                                Ex_03 ex3 = new Ex_03();
                                ex3.main(new String[]{});
                                break;
                            case 4:
                                Ex_04 ex4 = new Ex_04();
                                ex4.main(new String[]{});
                                break;
                            case 5:
                                Ex_05 ex5 = new Ex_05();
                                ex5.main(new String[]{});
                                break;

                            case 6:
                                Ex_06 ex6 = new Ex_06();
                                ex6.main(new String[]{});
                                break;
                        
                            case 7:
                                Ex_07 ex7 = new Ex_07();
                                ex7.main(new String[]{});
                                break;
                            case 8:
                                Ex_08 ex8 = new Ex_08();
                                ex8.main(new String[]{});
                                break;
                            case 9:
                                Ex_09 ex9 = new Ex_09();
                                ex9.main(new String[]{});
                                break;
                            case 10:
                                Ex_10 ex10 = new Ex_10();
                                ex10.main(new String[]{});
                                break;

                            case 11:
                                Ex_11 ex11 = new Ex_11();
                                ex11.main(new String[]{});
                                break;
                        
                            case 12:
                                Ex_12 ex12 = new Ex_12();
                                ex12.main(new String[]{});
                                break;
                            case 13:
                                Ex_13 ex13 = new Ex_13();
                                ex13.main(new String[]{});
                                break;
                            case 14:
                                Ex_14 ex14 = new Ex_14();
                                ex14.main(new String[]{});
                                break;
                            case 15:
                                Ex_15 ex15 = new Ex_15();
                                ex15.main(new String[]{});
                                break;

                            case 16:
                                Ex_16 ex16 = new Ex_16();
                                ex16.main(new String[]{});
                                break;
                        
                            case 17:
                                Ex_17 ex17 = new Ex_17();
                                ex17.main(new String[]{});
                                break;
                            case 18:
                                Ex_18 ex18 = new Ex_18();
                                ex18.main(new String[]{});
                                break;
                            case 19:
                                Ex_19 ex19 = new Ex_19();
                                ex19.main(new String[]{});
                                break;
                            case 20:
                                Ex_20 ex20 = new Ex_20();
                                ex20.main(new String[]{});
                                break;                                                                 


                        }
                            System.out.println("Informe qualquer tecla para voltar..");
                            leia.next();
                        
                       } 
                       } else {
                            opcaoPagina = entrada.charAt(0);
                        
                    

                    switch (opcaoPagina) {
                        case 'A':
                        case 'a':
                            if (paginaAtual > 0) paginaAtual--;
                            break;

                        case 'P':
                        case 'p':
                            if (paginaAtual < totalPaginas - 1) paginaAtual++;
                            break;

                        case 'V':
                        case 'v':
                            break;

                        default:
                            System.out.println("Opção Inválida.");

                         } 
                     } 
            
                    } while (opcaoPagina != 'V' && opcaoPagina != 'v');
        

            }
     

        } while (opcao != 0);
    }
}