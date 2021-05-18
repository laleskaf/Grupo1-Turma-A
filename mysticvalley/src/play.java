import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;
import java.util.List;


public class play {

	public static void main(String[] args) {


		
		
        Scanner entrada = new Scanner(System.in);
        int escolha;
        String resposta;
        String alternativa1 = "3";
        String alternativa2 = "2";
        String alternativa3 = "0";
        String alternativa4 = "9";
        String alternativa5 = "1";

        List<String> urna = Arrays.asList(alternativa1, alternativa2, alternativa3, alternativa4, alternativa5);
        Collections.shuffle(urna);

        do {
            System.out.println("1- Jogar ");
            System.out.println("2- Instruções ");
            System.out.println("3- Créditos ");
            System.out.println("4- Sair ");
            System.out.print("Escolha uma opção: ");
            escolha = entrada.nextInt();

            switch (escolha) {

                case 1:
                    break;
                case 2:
                    System.out.println("Você escolheu {INSTRUÇÕES}");
                    System.out.printf("\n");
                    System.out.println("Em uma ilha muito distante, existe uma vila chamada Mystic Valley.");
                    System.out.println("Em uma noite de comemorações acontece um roubo onde o item mais raro de toda ilha é levado,");
                    System.out.println("então um detetive com seus poderes sobrenaturais se dispõe a encontrar o culpado.");
                    System.out.println("Nessa aventura vocês desvendarão esse mistério que intriga os moradores de Mystic Valley.");
                    System.out.printf("\n");
                    System.out.println("O jogo Mystic Valley é um jogo de multipla escolha, em que suas escolhas influenciam diretamente o jogo, ");

                    System.out.println("podendo mudar os caminhos e a história, o intuito dessas escolhas são praticar a sua lógica, esperamos que você se divirta e que aumente a sua lógica !");
                    break;
                case 3:
                    System.out.println("Você escolheu {CRÉDITOS}");
                    System.out.println("Leonardo Messias");
                    System.out.println("Thalles Negreiro");
                    System.out.println("Laleska Fernandes");
                    System.out.println("Giovana Simões");
                    System.out.println("Guilherme Profirio");// nome de cada integrante
                    break;
                case 4:
                    System.err.println(" Você saiu !");
                    break;
                default:
                    System.out.println("Opção inválida !!!");
                    break;

            }
        } while (!(escolha == 4 || escolha == 1));

        if (escolha == 1) {
            System.out.println("Você escolheu {JOGAR}");
            //continuar o código aqui 
            System.out.printf("\n");
            System.out.println("Capítulo  I - Potion of immortality\n"
                    + "No meio de um oceano tão tão distante existe uma ilha misteriosa, quase tão grande quanto um país, ");
            System.out.println("nessa ilha existe vilarejo chamado Mystic Valley ");
            System.out.println("onde habita diversas criaturas mágicas de todas as espécies,");
            System.out.println("que são separadas por clãs. O clã dos bruxos é um dos mais poderosos de toda ilha,");
            System.out.println("pois eles possuem conhecimentos antigos, fórmulas e poções mágicas,");
            System.out.println("uma dessas poções talvez a mais rara e cobiçada de toda ilha, é a potion of immortality,");
            System.out.println("onde o mito diz: Aquele que a consumir nunca morrerá.");
            System.out.printf("\n");
            System.out.println("Todos os forasteiros de todos os cantos do mundo são atraídos por essa ideia,");
            System.out.println("com a cobiça de a possui-la para si próprio, ");
            System.out.println("mas ao chegarem nas margens da ilha apenas aqueles seres mágicos ou aqueles que provarem seu valor poderam adentrar-la,");
            System.out.println("através de um enigma implantado por mágia......");
            System.out.printf("\n");

            do {
                System.out.println("Em um jardim: A) todas as flores, menos duas são rosas ");
                System.out.println("B) todas as flores, menos duas são margaridas");
                System.out.println("C) todas as flores, menos duas são orquídeas.");
                System.out.println("Quantas flores há no jardim?");// desafio 1

                System.out.println("a) " + urna.get(0));
                System.out.println("b) " + urna.get(1));
                System.out.println("c) " + urna.get(2));
                System.out.println("d) " + urna.get(3));
                System.out.println("e) " + urna.get(4));
                System.out.print(":");
                resposta = entrada.next();
                switch (resposta.toUpperCase()) {
                    case "A":
                        if (urna.get(0).equals(alternativa1)) {
                            resposta = alternativa1;
                        } else {
                            System.err.println("Incorreta");
                        }
                        break;
                    case "B":
                        if (urna.get(1).equals(alternativa1)) {
                            resposta = alternativa1;
                        } else {
                            System.err.println("incorreta");
                        }
                        break;
                    case "C":
                        if (urna.get(2).equals(alternativa1)) {
                            resposta = alternativa1;
                        } else {
                            System.err.println("incorreta");
                        }
                        break;
                    case "D":
                        if (urna.get(3).equals(alternativa1)) {
                            resposta = alternativa1;
                        } else {
                            System.err.println("incorreta");
                        }
                        break;
                    case "E":
                        if (urna.get(4).equals(alternativa1)) {
                            resposta = alternativa1;
                        } else {
                            System.err.println("incorreta");
                        }
                        break;
                }

            } while ((!(resposta.equalsIgnoreCase(alternativa1))));
            System.out.println("Parabéns !!!! Você entrou na ilha, aqui começa a sua história.....");
            System.out.println("BOA SORTE");// final capitulo 1

        }


	}

}
