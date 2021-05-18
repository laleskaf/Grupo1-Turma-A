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
            System.out.println("2- Instru��es ");
            System.out.println("3- Cr�ditos ");
            System.out.println("4- Sair ");
            System.out.print("Escolha uma op��o: ");
            escolha = entrada.nextInt();

            switch (escolha) {

                case 1:
                    break;
                case 2:
                    System.out.println("Voc� escolheu {INSTRU��ES}");
                    System.out.printf("\n");
                    System.out.println("Em uma ilha muito distante, existe uma vila chamada Mystic Valley.");
                    System.out.println("Em uma noite de comemora��es acontece um roubo onde o item mais raro de toda ilha � levado,");
                    System.out.println("ent�o um detetive com seus poderes sobrenaturais se disp�e a encontrar o culpado.");
                    System.out.println("Nessa aventura voc�s desvendar�o esse mist�rio que intriga os moradores de Mystic Valley.");
                    System.out.printf("\n");
                    System.out.println("O jogo Mystic Valley � um jogo de multipla escolha, em que suas escolhas influenciam diretamente o jogo, ");

                    System.out.println("podendo mudar os caminhos e a hist�ria, o intuito dessas escolhas s�o praticar a sua l�gica, esperamos que voc� se divirta e que aumente a sua l�gica !");
                    break;
                case 3:
                    System.out.println("Voc� escolheu {CR�DITOS}");
                    System.out.println("Leonardo Messias");
                    System.out.println("Thalles Negreiro");
                    System.out.println("Laleska Fernandes");
                    System.out.println("Giovana Sim�es");
                    System.out.println("Guilherme Profirio");// nome de cada integrante
                    break;
                case 4:
                    System.err.println(" Voc� saiu !");
                    break;
                default:
                    System.out.println("Op��o inv�lida !!!");
                    break;

            }
        } while (!(escolha == 4 || escolha == 1));

        if (escolha == 1) {
            System.out.println("Voc� escolheu {JOGAR}");
            //continuar o c�digo aqui 
            System.out.printf("\n");
            System.out.println("Cap�tulo  I - Potion of immortality\n"
                    + "No meio de um oceano t�o t�o distante existe uma ilha misteriosa, quase t�o grande quanto um pa�s, ");
            System.out.println("nessa ilha existe vilarejo chamado Mystic Valley ");
            System.out.println("onde habita diversas criaturas m�gicas de todas as esp�cies,");
            System.out.println("que s�o separadas por cl�s. O cl� dos bruxos � um dos mais poderosos de toda ilha,");
            System.out.println("pois eles possuem conhecimentos antigos, f�rmulas e po��es m�gicas,");
            System.out.println("uma dessas po��es talvez a mais rara e cobi�ada de toda ilha, � a potion of immortality,");
            System.out.println("onde o mito diz: Aquele que a consumir nunca morrer�.");
            System.out.printf("\n");
            System.out.println("Todos os forasteiros de todos os cantos do mundo s�o atra�dos por essa ideia,");
            System.out.println("com a cobi�a de a possui-la para si pr�prio, ");
            System.out.println("mas ao chegarem nas margens da ilha apenas aqueles seres m�gicos ou aqueles que provarem seu valor poderam adentrar-la,");
            System.out.println("atrav�s de um enigma implantado por m�gia......");
            System.out.printf("\n");

            do {
                System.out.println("Em um jardim: A) todas as flores, menos duas s�o rosas ");
                System.out.println("B) todas as flores, menos duas s�o margaridas");
                System.out.println("C) todas as flores, menos duas s�o orqu�deas.");
                System.out.println("Quantas flores h� no jardim?");// desafio 1

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
            System.out.println("Parab�ns !!!! Voc� entrou na ilha, aqui come�a a sua hist�ria.....");
            System.out.println("BOA SORTE");// final capitulo 1

        }


	}

}
