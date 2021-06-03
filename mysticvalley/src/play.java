import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;


public class play {


	static void Digita(String mensagem, TimeUnit unit, long tempo_mensagem) throws InterruptedException {
		for (char caractere : mensagem.toCharArray()) {
			System.out.print(caractere);
			unit.sleep(tempo_mensagem);
		}
	}
	static int temp_dialog =0, temp_narrativa = 150, temp_quest = 25;

	static Scanner entrada = new Scanner(System.in);//Scanner global.
    static void opc4()throws Exception {
        Digita("� Boa noite a todos, reuni voc�s para anunciar o culpado do roubo do artefato,\n"
                + " nossa primeira pista como todos sabem foi um pelo achado dos minotauros,\n"
                + " nunca descartamos eles como suspeitos, porem para ter uma visao melhor da ilha estava indo ao monte mais alto,\n"
                + " no caminho achei pegadas para um casebre antigo,\n"
                + " la dentro havia registros de tuneis secretos do grande salao que o ladr�o usou para roubar o artefato,\n"
                + " e tambem achei um corpo de um p� grande�\n"
                + "   todos ficaram chocados e absmados, � raro haver um assassinato na ilha, continuou o detetive�\n"
                + " � e tambem a pista principal para solucionar o caso,\n"
                + " o que aconteceu foi que inicialmente um membro dos p�s grandes junto com o xerife estavam planejando o roubo,\n"
                + " depois que terminaram de planejar o xerife assassinou o p� grande por seguran�a,\n"
                + " depois de roubar o artefato tentou incriminar os minotauros para nao ser pego�\n"
                + " e complementou mostrando o distintivo do xerife. O xerife ficou com uma cara assustada,\n"
                + " continuou o detetive...  � Dito tudo isso, minha conclus�o final � que o pr�prio xerife de voc�s � o grande respons�vel por esse roubo!! � \n"
                + "Guardas de imediato foram e prenderam o xerife na pior sela de  Mystic Valley,\n"
                + " a sela do subsolo, dias depois o artefato foi encontrado e protegido com a melhor seguran�a poss�vel. \n"
                + "A cidade ficou em choque com o acontecido, mas mesmo com tudo isso a paz voltar� a prosperar e todos na ilha continuar�o protegidos e felizes.",TimeUnit.MILLISECONDS, temp_dialog);
        Digita("Parabéns!! Você conclui a história do jogo e solucionou o mistério que intrigava os moradores de Mystic Valley!! \n",TimeUnit.MILLISECONDS, temp_dialog);
        System.out.println("    |@@@@|     |####|\r\n"
        		+ "    |@@@@|     |####|\r\n"
        		+ "    |@@@@|     |####|\r\n"
        		+ "    \\@@@@|     |####/\r\n"
        		+ "     \\@@@|     |###/\r\n"
        		+ "      `@@|_____|##'\r\n"
        		+ "           (O)\r\n"
        		+ "        .-'''''-.\r\n"
        		+ "      .'  * * *  `.\r\n"
        		+ "     :  *       *  :\r\n"
        		+ "    : ~           ~ :\r\n"
        		+ "    : ~           ~ :\r\n"
        		+ "     :  *       *  :\r\n"
        		+ "      `.  * * *  .'\r\n"
        		+ "        `-.....-'");
    }

   

    static void opc1()throws Exception {
        Digita("�Boa noite a todos, reuni voc�s para anunciar o culpado do roubo do artefato,\n"
                + " nossa primeira e �nica pista como todos sabem foi um pelo achado,\n "
                + "nunca descartamos os lobisomens e os centauros  como suspeitos, fui atr�s de mais pistas,\n"
                + " tentei entender  melhor mas a minha conclus�o sempre era a mesma,\n"
                + " com a ajuda do xerife decidi que o culpado do roubo � o cl� dos lobisomens !! �\n"
                + " completou o detetive dizendo � e tamb�m achei um corpo em um casebre antigo, o corpo era do cl� dos p�s grandes,\n"
                + " vou iniciar outra investiga��o para saber o que houve.�\n"
                + "Todos ficaram em choque e com raiva ao mesmo tempo, com isso o cl� dos lobisomens foram banidos da ilha para sempre,\n "
                + "1 dia depois o xerife fugiu da ilha e o artefato nunca foi achado. \n\n"
                + "O culpado era o XERIFE !! ",TimeUnit.MILLISECONDS, temp_dialog);
    }

    static void opc2()throws Exception {
        Digita(" �Boa noite a todos, reuni voc�s para  anunciar que irei largar o caso,\n"
                + " n�o h� provas suficientes para incriminar e declarar algu�m como culpado,\n"
                + " foi um desafio enorme para mim e pe�o desculpas por n�o conseguir a recuperar o artefato,\n "
                + "o xerife ir� continuar com o processo da investiga��o, irei embora da ilha ao amanhecer.�\n"
                + "Todos da ilha ficaram decepcionados e chateados com o bruxo, eles estavam muito confiantes nele.\n"
                + "Ap�s o bruxo deixar a ilha o xerife fugiu 1 dia depois e o artefato nunca foi achado.\n\n"
                + "O culpado era o XERIFE !! ",TimeUnit.MILLISECONDS, temp_dialog);
    }

    static void opc3()throws Exception {
        Digita("�Boa noite a todos, reuni voc�s para anunciar que a investiga��o a partir de agora ser� mais\n"
                + " r�gida e rigorosa, irei interrogar TODOS a partir de agora, a partir de amanh� vai come�ar\n"
                + " um toque de recolher quando o sol se p�r e eu quero acesso a todos os locais de cada cl�,\n"
                + " a investiga��o est� muito complicada, n�o h� muitas pistas, por isso as novas medidas!� \n"
                + "Mesmo com as novas medidas adotadas, nenhuma outra pista foi achada,\n"
                + " 2 dias depois o xerife abandonou a ilha e o artefato nunca foi achado.\n\n"
                + "O culpado era o XERIFE !! ",TimeUnit.MILLISECONDS, temp_dialog);
    }

    static void opc5()throws Exception {
        
    
        Digita("�Boa noite a todos, reuni voc�s para anunciar o culpado do roubo do artefato, nossa primeira"
                + " e �nica pista como todos sabem foi um pelo achado dos centauros, nunca descartamos"
                + " ele como suspeitos, fui atr�s de mais pistas, tentei entender o melhor mas a minha"
                + " conclus�o sempre era a mesma, com a ajuda do xerife decidi que o culpado do roubo"
                + " � o cl� dos centauros !! � completou o detetive dizendo � e tamb�m achei um corpo"
                + " em um casebre antigo, o corpo era do cl� dos p�s grandes, vou iniciar outra"
                + " investiga��o para saber o que houve.�\n"
                + "Todos ficaram em choque e com raiva ao mesmo tempo, com isso o cl� dos centauros foram"
                + " banidos da ilha para sempre, 1 dia depois o xerife fugiu da ilha e o artefato nunca foi achado. \n\n"
                + "O culpado era o XERIFE !! ",TimeUnit.MILLISECONDS, temp_dialog);
    }

	static float entradaDados() {
		float n;//Declarando n como variavel local	
		System.out.println(" *Entrada de dados* \nDigite um número de cada vez. ");
		System.out.println("Número: ");
		n= entrada.nextFloat();
		return n;

	}

	static int menu() {
		int op;//Declarando op como variavel local	
		do {
			System.out.println(" _____________________\r\n"
					+ "|  _________________  |\r\n"
					+ "| |     *Menu*      | |\r\n"
					+ "| |                 | |\r\n"
					+ "| |1-Adição         | |\r\n"
					+ "| |2-Subtração      | |\r\n"
					+ "| |3-Divisão        | |\r\n"
					+ "| |4-Multiplicação  | |\r\n"              
					+ "| |_________________| |\r\n"
					+ "|  ___ ___ ___   ___  |\r\n"
					+ "| | 7 | 8 | 9 | | + | |\r\n"
					+ "| |___|___|___| |___| |\r\n"
					+ "| | 4 | 5 | 6 | | - | |\r\n"
					+ "| |___|___|___| |___| |\r\n"
					+ "| | 1 | 2 | 3 | | x | |\r\n"
					+ "| |___|___|___| |___| |\r\n"
					+ "| | . | 0 | = | | / | |\r\n"
					+ "| |___|___|___| |___| |\r\n"
					+ "|_____________________|");

			System.out.println("Opção: ");
			op = entrada.nextInt();
		}while(op < 1 || op >4); //Mostra as opções novamente quando o jogador colocar um número diferente das opções mostradas.

		return op;
	}
	static float adicao (float n1,float n2) {
		float resultado;
		resultado = n1+n2;

		System.out.printf(" _____________________\r\n"
				+ "|  _________________  |\r\n"
				+ "| |    *Adição*     | |\r\n"
				+ "| |                 | |\r\n"
				+ "| |                 | |\r\n"
				+ "| |%.1f  +  %.1f    | |\r\n"
				+ "| |       =         | |\r\n"
				+ "| |%.1f             | |\r\n"              
				+ "| |_________________| |\r\n"
				+ "|  ___ ___ ___   ___  |\r\n"
				+ "| | 7 | 8 | 9 | | + | |\r\n"
				+ "| |___|___|___| |___| |\r\n"
				+ "| | 4 | 5 | 6 | | - | |\r\n"
				+ "| |___|___|___| |___| |\r\n"
				+ "| | 1 | 2 | 3 | | x | |\r\n"
				+ "| |___|___|___| |___| |\r\n"
				+ "| | . | 0 | = | | / | |\r\n"
				+ "| |___|___|___| |___| |\r\n"
				+ "|_____________________|",n1,n2,resultado);

		return resultado;}

	static float subtracao(float n1, float n2) {
		float resultado;
		resultado = n1 - n2;

		System.out.printf(" _____________________\r\n"
				+ "|  _________________  |\r\n"
				+ "| |   *Subtração*   | |\r\n"
				+ "| |                 | |\r\n"
				+ "| |                 | |\r\n"
				+ "| |%.1f  -  %.1f    | |\r\n"
				+ "| |       =         | |\r\n"
				+ "| |%.1f             | |\r\n"              
				+ "| |_________________| |\r\n"
				+ "|  ___ ___ ___   ___  |\r\n"
				+ "| | 7 | 8 | 9 | | + | |\r\n"
				+ "| |___|___|___| |___| |\r\n"
				+ "| | 4 | 5 | 6 | | - | |\r\n"
				+ "| |___|___|___| |___| |\r\n"
				+ "| | 1 | 2 | 3 | | x | |\r\n"
				+ "| |___|___|___| |___| |\r\n"
				+ "| | . | 0 | = | | / | |\r\n"
				+ "| |___|___|___| |___| |\r\n"
				+ "|_____________________|",n1,n2,resultado);

		return resultado;
	}
	static float multiplicacao(float n1, float n2) {
		float resultado;
		resultado = n1 * n2;

		System.out.printf(" _____________________\r\n"
				+ "|  _________________  |\r\n"
				+ "| | *Multiplicação* | |\r\n"
				+ "| |                 | |\r\n"
				+ "| |                 | |\r\n"
				+ "| |%.1f  x  %.1f    | |\r\n"
				+ "| |       =         | |\r\n"
				+ "| |%.1f             | |\r\n"              
				+ "| |_________________| |\r\n"
				+ "|  ___ ___ ___   ___  |\r\n"
				+ "| | 7 | 8 | 9 | | + | |\r\n"
				+ "| |___|___|___| |___| |\r\n"
				+ "| | 4 | 5 | 6 | | - | |\r\n"
				+ "| |___|___|___| |___| |\r\n"
				+ "| | 1 | 2 | 3 | | x | |\r\n"
				+ "| |___|___|___| |___| |\r\n"
				+ "| | . | 0 | = | | / | |\r\n"
				+ "| |___|___|___| |___| |\r\n"
				+ "|_____________________|",n1,n2,resultado);

		return resultado;
	}
	static float divisao(float n1, float n2) {
		float resultado;
		resultado =  n1 / n2;

		System.out.printf(" _____________________\r\n"
				+ "|  _________________  |\r\n"
				+ "| |    *Divisão*    | |\r\n"
				+ "| |                 | |\r\n"
				+ "| |                 | |\r\n"
				+ "| |%.1f  ÷  %.1f    | |\r\n"
				+ "| |       =         | |\r\n"
				+ "| |%.1f             | |\r\n"              
				+ "| |_________________| |\r\n"
				+ "|  ___ ___ ___   ___  |\r\n"
				+ "| | 7 | 8 | 9 | | + | |\r\n"
				+ "| |___|___|___| |___| |\r\n"
				+ "| | 4 | 5 | 6 | | - | |\r\n"
				+ "| |___|___|___| |___| |\r\n"
				+ "| | 1 | 2 | 3 | | x | |\r\n"
				+ "| |___|___|___| |___| |\r\n"
				+ "| | . | 0 | = | | / | |\r\n"
				+ "| |___|___|___| |___| |\r\n"
				+ "|_____________________|",n1,n2,resultado);

		return resultado;
	}

	static float controlador(int op,float n1, float n2) {

		float resultado = 0;

		switch (op) {
		case 1:
			//chama a função de adição
			resultado =  adicao(n1,n2);
			break;
		case 2:
			//chama a função subtração
			resultado =  subtracao(n1,n2);
			break;
		case 3:
			//chama a função divisão
			resultado = divisao(n1,n2);
			break;
		case 4:
			//chama a função multiplicação
			resultado =  multiplicacao(n1,n2);
			break;
		default:
			resultado = 0;
		}
		return resultado;


	}





	public static void main(String[] args) throws Exception{

		System.out.println("                ______              \r\n"
				+ "             .-'      `-.           \r\n"
				+ "           .'            `.         \r\n"
				+ "          /                \\        \r\n"
				+ "         ;                 ;`       \r\n"
				+ "         |  Mystic Valley  |;       \r\n"
				+ "         ;                 ;|\r\n"
				+ "         '\\               / ;       \r\n"
				+ "          \\`.           .' /        \r\n"
				+ "           `.`-._____.-' .'         \r\n"
				+ "             / /`_____.-'           \r\n"
				+ "            / / /                   \r\n"
				+ "           / / /\r\n"
				+ "          / / /\r\n"
				+ "         / / /\r\n"
				+ "        / / /\r\n"
				+ "       / / /\r\n"
				+ "      / / /\r\n"
				+ "     / / /\r\n"
				+ "    / / /\r\n"
				+ "    \\/_/  \n");
		
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
			System.out.println("  \n   *Menu*      ");
			System.out.println("\n1- Jogar ");
			System.out.println("2- InstruÃ§Ãµes ");
			System.out.println("3- Sinopse");
			System.out.println("4- CrÃ©ditos ");
			System.out.println("5- Sair ");
			System.out.print("Escolha uma opÃ§Ã£o: \n");
			escolha = entrada.nextInt();

			switch (escolha) {

			case 1:
				break;
			case 2:
				System.out.println("VocÃª escolheu {INSTRUÃ‡Ã•ES}");
				System.out.printf("\n");
				System.out.println("Em uma ilha muito distante, existe uma vila chamada Mystic Valley.");
				System.out.println("Em uma noite de comemoraÃ§Ãµes acontece um roubo onde o item mais raro de toda ilha Ã© levado,");
				System.out.println("entÃ£o um detetive com seus poderes sobrenaturais se dispÃµe a encontrar o culpado.");
				System.out.println("Nessa aventura vocÃªs desvendarÃ£o esse mistÃ©rio que intriga os moradores de Mystic Valley.");
				System.out.printf("\n");
				System.out.println("O jogo Mystic Valley Ã© um jogo de multipla escolha, em que suas escolhas influenciam diretamente o jogo, ");

				System.out.println("podendo mudar os caminhos e a histÃ³ria, o intuito dessas escolhas sÃ£o praticar a sua lÃ³gica, esperamos que vocÃª se divirta e que aumente a sua lÃ³gica !");
				break;
			case 4:
				System.out.println("VocÃª escolheu {CRÃ‰DITOS}");
				System.out.println("Giovana SimÃµes");
				System.out.println("Guilherme Profirio");
				System.out.println("Laleska Fernandes");
				System.out.println("Leonardo Messias");
				System.out.println("Thalles Negreiro");// nome de cada integrante
				break;
			case 3:
				System.out.println("Você escolheu Sinopse");
				System.out.println("Em uma ilha muito distante, existe uma vila chamada Mystic Valley. Em uma noite de comemorações acontece um roubo onde o item mais raro de toda ilha é levado,"
						+ "então um detetive com seus poderes sobrenaturais se dispõe a encontrar o culpado. Nessa aventura vocês desvendarão esse mistério que intriga os moradores de Mystic Valley.");
				break;
			case 5:
				System.err.println(" VocÃª saiu !");
				break;
			default:
				System.out.println("OpÃ§Ã£o invÃ¡lida !!!");
				break;

			}
		} while (!(escolha == 5 || escolha == 1));

		if (escolha == 1) {
			System.out.println("VocÃª escolheu {JOGAR}");
			//continuar o cÃ³digo aqui 
			System.out.printf("\n");
			System.out.println("CapÃ­tulo  I - Potion of immortality\n");
		        Digita ("\nNo meio de um oceano tÃ£o tÃ£o distante existe uma ilha misteriosa, quase tÃ£o grande quanto um paÃ­s, "
			+ "\nnessa ilha existe vilarejo chamado Mystic Valley "
			+"\nonde habita diversas criaturas mÃ¡gicas de todas as espÃ©cies,"
			+"\nque sÃ£o separadas por clÃ£s. O clÃ£ dos bruxos Ã© um dos mais poderosos de toda ilha,"
			+"\npois eles possuem conhecimentos antigos, fÃ³rmulas e poÃ§Ãµes mÃ¡gicas,"
			+"\numa dessas poÃ§Ãµes talvez a mais rara e cobiÃ§ada de toda ilha, Ã© a potion of immortality,"
			+"\nonde o mito diz: Aquele que a consumir nunca morrerÃ¡.",TimeUnit.MILLISECONDS, temp_dialog);
			
			Digita("\n\nTodos os forasteiros de todos os cantos do mundo sÃ£o atraÃ­dos por essa ideia,"
			+"\ncom a cobiÃ§a de a possui-la para si prÃ³prio, "
			+"\nmas ao chegarem nas margens da ilha apenas aqueles seres mÃ¡gicos ou aqueles que provarem seu valor poderam adentrar-la,"
			+"\natravÃ©s de um enigma implantado por mÃ¡gia......",TimeUnit.MILLISECONDS, temp_dialog);
			System.out.printf("\n");

			do {
				Digita("Em um jardim: "
                                        +"\nA) todas as flores, menos duas sÃ£o rosas "
				        +"\nB) todas as flores, menos duas sÃ£o margaridas"
				        +"\nC) todas as flores, menos duas sÃ£o orquÃ­deas.",TimeUnit.MILLISECONDS, temp_quest);
				        
                                Digita("Quantas flores hÃ¡ no jardim?"// desafio 1
				+"\na) " + urna.get(0)
				+"\nb) " + urna.get(1)
				+"\nc) " + urna.get(2)
				+"\nd) " + urna.get(3)
				+"\ne) " + urna.get(4),TimeUnit.MILLISECONDS, temp_quest);
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
			Digita("ParabÃ©ns !!!! VocÃª entrou na ilha, aqui comeÃ§a a sua histÃ³ria....."
			+"\nBOA SORTE!!",TimeUnit.MILLISECONDS, temp_dialog);// final capitulo 1

		} 


	
	
		
        String escolhacaminho,caminhoalternativo = "Tentar resolver sozinho.", 
                caminhocerto = "Pedir ajuda a um jovem bruxo que est� a observar.",
                escolhacap2,enigcap2 = "10";
        
        System.out.println("\n\nCap�tulo II  - O roubo\n\n");
        Digita("Em uma noite de comemora��es onde todos os cl�s estavam reunidos no grande sal�o, o alarme do cl� dos bruxos "
                + "\necoa por todos os cantos da cidade, mostrando assim que algo muito ruim havia acontecido. Rapidamente todos "
                + "daquela festa se apavoram e procuram pelo xerife da cidade que foi incumbido a preservar a ordem de toda vila. "
                + "\nO xerife diz � �Re�na todos meus homens em frente � delegacia imediatamente!� \n",TimeUnit.MILLISECONDS, temp_dialog);
        System.out.println("                             /^\\/^\\\r\n"
				+ "                             \\----|\r\n"
				+ "                         _---'---~~~~-_\r\n"
				+ "                          ~~~|~~L~|~~~~\r\n"
				+ "                             (/_  /~~--\r\n"
				+ "                           \\~ \\  /  /~\r\n"
				+ "                         __~\\  ~ /   ~~----,\r\n"
				+ "                         \\    | |       /  \\\r\n"
				+ "                         /|   |/       |    |\r\n"
				+ "                         | | | o  o     /~   |\r\n"
				+ "                       _-~_  |        ||  \\  /\r\n"
				+ "                      (// )) | o  o    \\\\---'\r\n"
				+ "                      //_- |  |          \\\r\n"
				+ "                     //   |____|\\______\\__\\\r\n"
				+ "                     ~      |   / |    |\r\n"
				+ "                             |_ /   \\ _|\r\n"
				+ "                           /~___|  /____\\ \n");
        
        Digita("\n\nCom todos os homens do xerife reunidos ele faz um pronunciamento sobre o ocorrido. "
                + "\nO xerife diz � �Vamos nos separar e descobrir o que foi levado dos bruxos, a partir de agora ningu�m entra "
                + "ou sai desta ilha�."
                + "\nAo chegarem na regi�o dos bruxos, logo descobrem que o item levado foi o mais valioso de toda ilha, o templo"
                + "\nonde estava guardada por muitos anos havia sido violado por um usurpador, mas para qualquer ser que desejasse "
                + "\nadentra-la, precisaria primeiro decifrar o enigma escrito em l�ngua de bruxo logo acima do port�o de entrada."
                ,TimeUnit.MILLISECONDS, temp_dialog);

        do{
            
                 List <String> list = Arrays.asList("Pedir ajuda a um jovem bruxo que est� a observar."
                ,"Tentar resolver sozinho.","Invadir com for�a bruta, mas sabendo que h� um feiti�o de prote��o.");
                Collections.shuffle(list);
                
                Digita("\nVoc� tem algumas op��es para resolu��o deste enigma:"
                        + "\n1 � " + list.get(0)
                        + "\n2 � " + list.get(1)
                        + "\n3 � " + list.get(2)
                        + "\nIndique qual caminho deseja seguir em n�mero: ",TimeUnit.MILLISECONDS, temp_quest);
                escolhacaminho = entrada.next();
                
                switch(escolhacaminho){
                    case "1":
                        if(list.get(0).equals(caminhocerto)){
                            escolhacaminho = caminhocerto;
                            
                        }else if(list.get(0).equals(caminhoalternativo)){
                            Digita("\n(n�o consigo traduzir sozinho, pois est� em uma l�ngua desconhecida), pensou o xerife"
                                    + "\ntente novamente!\n",TimeUnit.MILLISECONDS, temp_dialog);
                            break;
                        }else{
                            Digita("\nvoc� foi empurrado para tr�s e todos riram"
                                    + "\ntente novamente!\n",TimeUnit.MILLISECONDS, temp_dialog);
                        }
                        break;
                    case "2":
                        if(list.get(1).equals(caminhocerto)){
                            escolhacaminho = caminhocerto;
                            
                        }else if(list.get(1).equals(caminhoalternativo)){
                            Digita("\n(n�o consigo traduzir sozinho, pois est� em uma l�ngua desconhecida), pensou o xerife"
                                    + "\ntente novamente!\n",TimeUnit.MILLISECONDS, temp_dialog);
                        }else{
                            Digita("\nvoc� foi empurrado para tr�s e todos riram"
                                    + "\ntente novamente!\n",TimeUnit.MILLISECONDS, temp_dialog);
                        }
                        break;
                    case "3":
                        if(list.get(2).equals(caminhocerto)){
                            escolhacaminho = caminhocerto;
                        }else if(list.get(2).equals(caminhoalternativo)){
                            Digita("\n(n�o consigo traduzir sozinho, pois est� em uma l�ngua desconhecida), pensou o xerife"
                                    + "\ntente novamente!\n",TimeUnit.MILLISECONDS, temp_dialog);
                        }else{
                            Digita("\nvoc� foi empurrado para tr�s e todos riram"
                                    + "\ntente novamente!\n",TimeUnit.MILLISECONDS, temp_dialog);
                        }
                        break;
                    default:
                            System.out.println("Op��o invalida!"
                                    + "\nTente novamente.");
                }
        }while ((!(escolhacaminho.equals(caminhocerto))));
        
            Digita("\nCom a ajuda do jovem bruxo a placa foi traduzida, "
                    + "\npara que enfim o xerife consiga prosseguir com a sua investiga��o" 
                    + "\nrevelando assim um novo desafio que diz:",TimeUnit.MILLISECONDS, temp_dialog);
            Digita("\nNo caminho de casa at� o templo, um mago conta 10 �rvores a sua direita."
                    + "\nAp�s ida ao templo, ele retorna para casa e conta 10 �rvores a sua esquerda.",TimeUnit.MILLISECONDS, temp_dialog);
            
            do{
                List<String> list = Arrays.asList("20","15","10","30","25");
                Collections.shuffle(list);
                
                Digita("\nQuantas �rvores ele viu no total nesse dia?"
                        + "\nA) " + list.get(0)
                        + "\nB) " + list.get(1)
                        + "\nC) " + list.get(2)
                        + "\nD) " + list.get(3)
                        + "\nE) " + list.get(4)
                        + "\nQual � a Alternativa Correta:",TimeUnit.MILLISECONDS, temp_quest);
                escolhacap2 = entrada.next();
                
                switch (escolhacap2.toUpperCase()) {
			case "A": 
				if(list.get(0).equals(enigcap2)) {
					escolhacap2 = enigcap2;
				}else{
					System.err.println("\nAlternativa Incorreta!");
				}
				break;

			case "B": 
				if(list.get(1).equals(enigcap2)) {
					escolhacap2 = enigcap2;
				}else{
					System.err.println("\nAlternativa Incorreta!");
				}
				
				break;
			case "C": 
				if(list.get(2).equals(enigcap2)) {
					escolhacap2 = enigcap2;
				}else{
					System.err.println("\nAlternativa Incorreta!");
				}
				break;
			case "D": 
				if(list.get(3).equals(enigcap2)) {
					escolhacap2 = enigcap2;
				}else{
					System.err.println("\nAlternativa Incorreta!");
				}
				break;
                        case "E": 
				if(list.get(4).equals(enigcap2)) {
					escolhacap2 = enigcap2;
				}else{
					System.out.println("\nAlternativa Incorreta!");
				}
				break;
                        default:
                            if(escolhacap2.equals(enigcap2)){
                                escolhacap2 = enigcap2;
                            }
                            else if(!(escolhacap2.equals(enigcap2))){
                                System.err.println("\nAlternativa Incorreta!");
                            }else{
                              System.out.println("Op��o invalida!");  
                            }
                            
                        
                        
                            
            }
        }while((!(escolhacap2.equalsIgnoreCase(enigcap2))));
            Digita("\n\nAlternativa correta! Voc� conseguiu desfazer o feiti�o de prote��o!"
                    + "\n\nPois, s�o as mesmas 10 �rvores vistas de diferente perspectivas."
                    + "\nNa ida, �rvores estavam � direita do mago, mas na volta"
                    + "\nquando ele estava no sentido contr�rio, as �rvores podiam ser vista � esquerda\n",TimeUnit.MILLISECONDS, temp_dialog);
            
            /*FIM CAP ||*/
            

		//FIM CAP II

		Digita("\nCapítulo III - A primeira pista\n",TimeUnit.MILLISECONDS, temp_dialog);//Início Cap III


		Digita("\nCom isso o xerife percebe que não conseguiria solucionar este crime sem um profissional especializado no ramo da investigação.\r\n"
				+ "Então ele chamou um detetive para ajudá-lo a solucionar esse crime. Ao entrarem mais fundo no templo, o detetive logo encontrou a primeira pista,\r\n"
				+ "um tufo de pelos foi encontrado caído no templo, como na ilha habita diversas criaturas diferentes, não foi possível identificar de quem era esse pelo.\r\n"
				+ "Imediatamente o xerife propôs uma assembléia e convocou todos os clãs para debaterem de quem era o pelo e achar o culpado.\r\n"
				+ "O pelo era amarronzado, com uma textura sedosa, bem liso. A assembléia começou, todos os clãs estavam reunidos, separados por grupos para melhor análise,\r\n"
				+ "o xerife e detetive, foram passando de grupo em grupo, para compararem o pelo.\r\n"

		+"\nDe quem era o pelo?\n",TimeUnit.MILLISECONDS, temp_dialog);

		System.out.println("\nAo comparar o pelo, surge o seguinte desafio:\r\n \n"
				+ "		\nDecifre o código para descobrir quem é o dono do pelo: \r\n \n"
				+ "Ω = 5   | ᄿᴥᄽ= 2  |  ㉧▼㉧ = 3  | ȣ = 1  |<(º) = 6 | �?๋: = 9| ◤-.-◥ = 4 | ♞ = 7 | ϟ = 8 | 傘 =9\r\n"
				+ "♨=10 | ✩ = 11 | ಜ=12 | �? = 13 | ʚĭɞ = 14 | ◑ = 15 | ☪ = 16 | ☀ = 17 | ☘ = 18 | ლ = 19\r\n"
				+ "⌘ = 20 | �?� = 21 \n ");

		Digita("\n㉧▼㉧  |  ( (♨ - ◤-.-◥) - ȣ )  |  ʚĭɞ  | ⌘ |  ȣ |  ((✩ + ლ) - �?๋:) |  ☘ |  ( ♨+Ω) \n",TimeUnit.MILLISECONDS, temp_dialog);

		String operacao,certo = " 3 | 5 | 14 | 20 | 1 | 21 | 18 | 15 ";//Resposta certa do desafio.

		System.out.println("\nPara te ajudar, use calculadora: \n" );

		String calculadora;//Variável para ver se o jogador quer utilizar dnv a calculadora.
		do {
			int op = menu();//Chama a função menu, que dará as opções da calculadora.
			float n1 = entradaDados();//Chama a função que pede ao jogador o primeiro dado.
			float n2 = entradaDados();//Chama a função que pede ao jogador o segundo dado.
			float result = controlador(op,n1,n2);//Chama a função que faz a operação.
			System.out.println("\nPrecisa utilizar novamente? ");
			calculadora = entrada.nextLine().toUpperCase();//Recebe o que o jogador digitou e deixa tudo em Maiúsculo.

		}while(calculadora.equalsIgnoreCase("SIM"));
		do {

			List <String> emb = Arrays.asList (" 4 | 6 | 15 | 21 | 2 | 22 | 19 | 16 " ,  " 3 | 4 | 13 | 19 | 1 | 20 | 17 | 14 " , " 3 | 5 | 14 | 21 | 1 | 21 | 17 | 15 " ,  " 6 | 5 | 19 | 10 | 4 | 21 | 15 | 18 ", " 3 | 5 | 14 | 20 | 1 | 21 | 18 | 15 ");

			Collections.shuffle(emb);//Embaralha.

			Digita("\n       *Quais valores foram encontrados?*        \n ",TimeUnit.MILLISECONDS, temp_dialog);

			Digita("\nSelecione a sequência equivalente:\n"

			+ "A)" + emb.get(0)+"\n"//Opções com embaralhar a ordem.
			+ "B)" + emb.get(1)+"\n"
			+ "C)" + emb.get(2)+"\n"
			+ "D)" + emb.get(3)+"\n"
			+ "E)" + emb.get(4)+"\n",TimeUnit.MILLISECONDS, temp_dialog);
			operacao = entrada.next();

			switch(operacao.toUpperCase()) {

			case "A"://Switch com todas as respostas incorretas.
				if (emb.get(0).equals(certo)){
					operacao = certo;
				}else {
					Digita("Resposta incorreta! Tente novamente...\n ",TimeUnit.MILLISECONDS, temp_dialog);

				}break;

			case "B":
				if (emb.get(1).equals(certo)){
					operacao = certo;		
				}else {
					Digita("Resposta incorreta! Tente novamente...\n ",TimeUnit.MILLISECONDS, temp_dialog);

				}break;


			case "C":
				if (emb.get(2).equals(certo)){
					operacao = certo;
				}else {
					Digita("Resposta incorreta! Tente novamente...\n ",TimeUnit.MILLISECONDS, temp_dialog);

				}break;

			case "D":
				if (emb.get(3).equals(certo)){
					operacao = certo;
				}else {
					Digita("Resposta incorreta! Tente novamente...\n ",TimeUnit.MILLISECONDS, temp_dialog);

				}break;

			case "E":
				if (emb.get(4).equals(certo)){
					operacao = certo;
				}else {
					Digita("Resposta incorreta! Tente novamente...\n ",TimeUnit.MILLISECONDS, temp_dialog);

				}break;


			}

		}while(!(operacao.equalsIgnoreCase(certo)));{

			if(operacao.equalsIgnoreCase(certo)) {//If com resposta correta.

				Digita("Resposta Correta!!\n",TimeUnit.MILLISECONDS, temp_dialog);

				String correto = "CENTAURO",culpado;

				Scanner entr = new Scanner(System.in);
				do {
					Digita("\n    Decifre mais uma parte do código e encontre o culpado!! \n",TimeUnit.MILLISECONDS, temp_dialog);
					System.out.println("\n A= 1 | B= 2 | C= 3 | D= 4 | E= 5 | F= 6 | G= 7 | H= 8 | I= 9 | J= 10 | K= 11 | L= 12 | M= 13 "
							+ "\n N= 14 | O= 15 | P= 16 | Q= 17 | R= 18 | S=19 | T=20 | U= 21 | V= 22 | W= 23 | X= 24 | Y= 25 | Z= 26 \n ");

					Digita("\n                           *Quem foi o culpado  encontrado?*        \n ",TimeUnit.MILLISECONDS, temp_dialog);

					culpado = entr.nextLine().toUpperCase();

					if(culpado.equals(correto)) {
						System.out.println("\nIsso aí, você encontrou a primeira pista, o dono do pelo faz parte do clã dos Centauros!! \n "
								+ "       \n         =*===\r\n"
								+ "       $$- - $$$\r\n"
								+ "       $ <    D$$\r\n"
								+ "       $ -   $$$\r\n"
								+ " ,     $$$$  |\r\n"
								+ "///; ,---' _ |----.\r\n"
								+ " \\ )(           /  )\r\n"
								+ " | \\/ \\.   '  _.|  \\              $\r\n"
								+ " |  \\ /(   /    /\\_ \\          $$$$$\r\n"
								+ "  \\ /  (       / /  )         $$$ $$$\r\n"
								+ "       (  ,   /_/ ,`_,-----.,$$  $$$\r\n"
								+ "       |   <----|  \\---##     \\   $$\r\n"
								+ "       /         \\\\\\           |    $\r\n"
								+ "      '   '                    |\r\n"
								+ "      |                 \\      /\r\n"
								+ "      /  \\_|    /______,/     /\r\n"
								+ "     /   / |   /    |   |    /\r\n"
								+ "    (   /--|  /.     \\  (\\  (_\r\n"
								+ "     `----,( ( _\\     \\ / / ,/\r\n"
								+ "           | /        /,_/,/\r\n"
								+ "          _|/        / / (\r\n"
								+ "         / (        ^-/, |\r\n"
								+ "        /, |          ^-  \r\n"                   
								);


					}else 
						System.out.println("Tente novamente! \n");

				}while(!(culpado.equals(correto)));
				
				System.out.println("Capítulo IV  - O Álibi \r\n");
		        String alternativa1Cap4 = " Centauro";
		        String alternativa2Cap4 = " Humano";
		        String alternativa3Cap4 = "Minotauro";
		        String alternativa4Cap4 = " Caminho sem pegadas";
		        String alternativa5Cap4 = " Pés Grandes";
		        String escolhaCap4;
		        List<String> urna4 = Arrays.asList(alternativa1Cap4, alternativa2Cap4, alternativa3Cap4, alternativa4Cap4, alternativa5Cap4);
		        Collections.shuffle(urna4);
		        System.out.println("À assembleia havia começado, o clima estava muito tenso em Mystic Valley,\n"
		                + " logo de cara muitos clãs junto com o próprio xerife, acusaram o clã dos centauros,\n"
		                + " por conta do pelo ser da mesma cor e da mesma textura, quando o clã dos centauros estavam prestes a serem condenados,\n"
		                + " o jovem bruxo detetive que o xerife havia pedido ajuda, chega na assembleia e diz:\n\n");
		        System.out.println("Bruxo:   - Não foram os centauros, eu estive durante a semana toda e estive na noite do roubo,/\n "
		                + "junto com o clã dos centauros, eu acredito que quem roubou, colocou os pelos de centauros, para incrimina-los.");
		        System.out.println("Todos na assembleia ficam pensativos, e decidem concordar com o jovem bruxo, menos o xerife,"
		                + " que ainda tem suas ressalvas com aquela clã, devido a confusões em que ele já se envolveu antes com o clã de centauros,\n"
		                + " e então o jovem bruxo e o xerife saem para ir atrás do verdadeiro culpado.\n ");
		        System.out.println(" então o jovem bruxo começa os interrogatórios por toda Mystic Valley,\n "
		                + "enquanto o xerife parece estar bem incomodado com as atitudes do bruxo,\n"
		                + " o xerife então decide ir a cena do roubo sozinho. O bruxo então decide ir atrás do xerife discretamente .\n");
		   
				do {
		            System.out.println("Após pouco mais de 3 minutos de perseguição o bruxo  perdeu o xerife de vista,\n"
		                    + " detetive foi tentar achar vestígios do caminho dele.\n"
		                    + " Ele achou um 4 caminhos com pegadas diferentes, o primeiro caminho era pegadas de centauros,\n "
		                    + "o segundo caminho era pegadas de humano, terceiro caminho era pegadas de minotauros e o quarto caminho pegadas de pés grandes.\n"
		                    + "  Qual o caminho certo a seguir ?\n");
		            System.out.println("a) " + urna4.get(0));
		            System.out.println("b) " + urna4.get(1));
		            System.out.println("c) " + urna4.get(2));
		            System.out.println("d) " + urna4.get(3));
		            System.out.println("e) " + urna4.get(4));
		            System.out.print(":");
		            escolhaCap4 = entrada.next();
		            switch (escolhaCap4.toUpperCase()) {
		                case "A":
		                    if (urna4.get(0).equals(alternativa2Cap4)) {
		                        escolhaCap4 = alternativa2Cap4;
		                    } else {
		                        System.err.println("Incorreta");
		                    }
		                    break;
		                case "B":
		                    if (urna4.get(1).equals(alternativa2Cap4)) {
		                        escolhaCap4 = alternativa2Cap4;
		                    } else {
		                        System.err.println("incorreta");
		                    }
		                    break;
		                case "C":
		                    if (urna4.get(2).equals(alternativa2Cap4)) {
		                        escolhaCap4 = alternativa2Cap4;
		                    } else {
		                        System.err.println("incorreta");
		                    }
		                    break;
		                case "D":
		                    if (urna4.get(3).equals(alternativa2Cap4)) {
		                        escolhaCap4 = alternativa2Cap4;
		                    } else {
		                        System.err.println("incorreta");
		                    }
		                    break;
		                case "E":
		                    if (urna4.get(4).equals(alternativa2Cap4)) {
		                        escolhaCap4 = alternativa2Cap4;
		                    } else {
		                        System.err.println("incorreta");
		                    }
		                    break;
		            }
		        } while ((!(escolhaCap4.equalsIgnoreCase(alternativa2Cap4))));
		        System.out.println("acerto");
		    }//Fim Cap 4

			}
			Digita("Capítulo V  - O monte mais alto da Ilha\r\n",TimeUnit.MILLISECONDS, temp_dialog);//Início Cap IV

			String escolhaCap4;
			String alternativa1Cap4 = "Bosque do Anseio";
			String alternativa2Cap4 = "Bosque do café";
			String alternativa3Cap4 = "Bosque da Casa";
			String alternativa4Cap4 = "Bosque do chá";
			String alternativa5Cap4 = "Bosque do chalé";
			List<String> urna1 = Arrays.asList(alternativa1Cap4, alternativa2Cap4, alternativa3Cap4, alternativa4Cap4, alternativa5Cap4);
			Collections.shuffle(urna1);
			Digita("A assembleia havia começado, o clima estava muito tenso em Mystic Valley,\n"
					+ " logo de cara muitos clãs junto com o próprio xerife, acusaram o clã dos centauros,\n"
					+ " por conta do pelo ser da mesma cor e da mesma textura, quando o clã dos centauros estavam prestes a serem condenados,\n"
					+ " o jovem bruxo detetive que o xerife havia pedido ajuda, chega na assembleia e diz:\n\n"
			                + "Bruxo:   - Não foram os centauros, eu estive durante a semana toda e estive na noite do roubo,/\n "
					+ "junto com o clã dos centauros, eu acredito que quem roubou, colocou os pelos de centauros, para incrimina-los.\n"
			                + "Todos na assembleia ficam pensativos, e decidem concordar com o jovem bruxo, menos o xerife,\n"
					+ " que ainda tem suas ressalvas com aquela clã, devido a confusões em que ele já se envolveu antes com o clã de centauros,\n"
					+ " e então o jovem bruxo e o xerife saem para ir atrás do verdadeiro culpado.\n "
			                + " então o jovem bruxo começa os interrogatórios por toda Mystic Valley,\n "
					+ "enquanto o xerife parece estar bem incomodado com as atitudes do bruxo,\n"
					+ " o xerife então decide ir a cena do roubo sozinho. O bruxo então decide ir atrás do xerife discretamente .\n",TimeUnit.MILLISECONDS, temp_dialog);
			do {
				Digita("Enquanto o jovem bruxo seguia as pegadas ele percebeu que algumas delas estavam um pouco apagadas"
						+ " e teria que caminhar um pouco mais até encontrar a próxima. Caminhando ele passou por três bosques :\n"
				+ "\n1) Bosque do Chá"
				+ "\n2) Bosque do Chalé"
				+ "\n3) Bosque do Japeri",TimeUnit.MILLISECONDS, temp_dialog);
				Digita(" \n"
						+ "Em um determinado ponto da sua caminhada ele tinha que escolher um caminho para continuar seguindo as pegadas,"
						+ "pela lógica qual o próximo caminho ele deveria escolher :"
				+ "\na) " + urna1.get(0)
				+ "\nb) " + urna1.get(1)
				+ "\nc) " + urna1.get(2)
				+ "\nd) " + urna1.get(3)
				+ "\ne) " + urna1.get(4),TimeUnit.MILLISECONDS, temp_quest);
				
                                System.out.print(":");
				escolhaCap4 = entrada.next();
				
                                switch (escolhaCap4.toUpperCase()) {
				case "A":
					if (urna.get(0).equals(alternativa1Cap4)) {
						escolhaCap4 = alternativa1Cap4;
					} else {
						System.err.println("Incorreta");
					}
					break;
				case "B":
					if (urna.get(1).equals(alternativa1Cap4)) {
						escolhaCap4 = alternativa1Cap4;
					} else {
						System.err.println("incorreta");
					}
					break;
				case "C":
					if (urna.get(2).equals(alternativa1Cap4)) {
						escolhaCap4 = alternativa1Cap4;
					} else {
						System.err.println("incorreta");
					}
					break;
				case "D":
					if (urna.get(3).equals(alternativa1Cap4)) {
						escolhaCap4 = alternativa1Cap4;
					} else {
						System.err.println("incorreta");
					}
					break;
				case "E":
					if (urna.get(4).equals(alternativa1Cap4)) {
						escolhaCap4 = alternativa1Cap4;
					} else {
						System.err.println("incorreta");
					}
					break;
				}
			} while ((!(escolhaCap4.equalsIgnoreCase(alternativa1Cap4))));
			System.out.println("acerto");
			Digita("\n Capítulo V  - O monte mais alto da Ilha \n",TimeUnit.MILLISECONDS,temp_dialog);//Início Cap V


			String answer;
			String option1 = "Bosque do Anseio";
			String option2 = "Bosque do Café";
			String option3 = "Bosque da Casa";
			String option4 = "Bosque do Chá";
			String option5 = "Bosque do Chalé";
			List<String> casket = Arrays.asList(option1, option2, option3, option4, option5);
			Collections.shuffle(casket);
			
			Digita("Após os últimos acontecimentos o jovem bruxo (detetive) e o xerife pareciam já não caminhar na mesma direção. \n"
					+ " Enquanto o Jovem bruxo (detetive) continuava acreditando na inocência do clã dos centauros,\n"
					+ " o xerife não aceitava que qualquer outro clã pudesse ter cometido um crime que abalou tanto a confiança de toda a Ilha.\n"
					+ " (e todos nós sabemos que após a confiança ser perdida, uma guerra está próxima).\r\n"
					+ "\n\n"
					+ "Incomodado com o sentimento de desconfiança do Xerife, o Jovem bruxo (detetive) começou a pensar : "
					+ "\n- “Eu preciso encontrar o culpado o mais rápido possível para mostrar ao xerife que eu estou certo!�?\n "
					+ "disse ele caminhando até o monte mais alto da Ilha, onde ele pudesse ver tudo de cima. \r\n"
					+ "De Repente o jovem bruxo (detetive) que caminhava cabisbaixo começou a perceber algo diferente no chão \r\n"
					+ "",TimeUnit.MILLISECONDS, temp_dialog);
			
			Digita(" ———-Oooo—\r\n"
					+ "\r\n"
					+ "———–(—-)—\r\n"
					+ "\r\n"
					+ "————)–/—-\r\n"
					+ "\r\n"
					+ "————(_/-\r\n"
					+ "\r\n"
					+ "—-oooO—-\r\n"
					+ "\r\n"
					+ "—-(—)—-\r\n"
					+ "\r\n"
					+ "—–\\–(–\r\n"
					+ "\r\n"
					+ "——\\_)-\r\n"
					+ "\n \n"
					+ "“Isso são mais pegadas?�? disse alto, assustado.\r\n"
					+ "“Mas elas são muito gran…. Só pode ser de um membro do clã dos pés grandes�? complementando. \r\n"
					+ "\n",TimeUnit.MILLISECONDS, temp_dialog);
			
			do {
				Digita("Enquanto o jovem bruxo seguia as pegadas ele percebeu que algumas delas estavam um pouco apagadas\n"
						+ " e teria que caminhar um pouco mais até encontrar a próxima. Caminhando ele passou por três bosques :\n",TimeUnit.MILLISECONDS, temp_dialog);
				Digita("1) Bosque do Chá",TimeUnit.MILLISECONDS, temp_dialog);
				Digita("2) Bosque do Chalé",TimeUnit.MILLISECONDS, temp_dialog);
				Digita("3) Bosque do Japeri",TimeUnit.MILLISECONDS, temp_dialog);
				Digita(" \n"
						+ "Em um determinado ponto da sua caminhada ele tinha que escolher um caminho para continuar seguindo as pegadas,"
						+ "pela lógica qual o próximo caminho ele deveria escolher :",TimeUnit.MILLISECONDS, temp_dialog);
				System.out.println("a) " + casket.get(0));
				System.out.println("b) " + casket.get(1));
				System.out.println("c) " + casket.get(2));
				System.out.println("d) " + casket.get(3));
				System.out.println("e) " + casket.get(4));
				System.out.print(":");
				answer = entrada.next();
				switch (answer.toUpperCase()) {
				case "A":
					if (casket.get(0).equals(option1)) {
						answer= option1;
					} else {
						System.err.println("Incorreta");
					}
					break;
				case "B":
					if (casket.get(1).equals(option1)) {
						answer = option1;
					} else {
						System.err.println("incorreta");
					}
					break;
				case "C":
					if (casket.get(2).equals(option1)) {
						answer = option1;
					} else {
						System.err.println("incorreta");
					}
					break;
				case "D":
					if (casket.get(3).equals(option1)) {
						answer = option1;
					} else {
						System.err.println("incorreta");
					}
					break;
				case "E":
					if (casket.get(4).equals(option1)) {
						answer = option1;
					} else {
						System.err.println("incorreta");
					}
					break;
				}
			} while ((!(answer.equalsIgnoreCase(option1))));
			Digita("Muito bem!! Parece que esta no caminho certo,\n"
					+ "Seguindo as pegadas, o jovem bruxo de longe avista um casebre abandonado no meio da mata…\r\n"
					+ "\n",TimeUnit.MILLISECONDS, temp_dialog);
	                 
	                  
	        
	        String opc1 = "CULPAR O CLA DOS LOBISOMENS";

	        String opc2 = "ABANDONAR O CASO";

	        String opc3 = "TOMAR MEDIDAS MAIS RIGIDAS";

	        String opc4 = "CULPAR O XERIFE PELO ROUBO";

	        String opc5 = "CULPA O CLA DOS CENTAUROS";

	        List<String> urna3 = Arrays.asList(opc1, opc2, opc3, opc4, opc5);
	        Collections.shuffle(urna3);

	        Digita ("O jovem bruxo estava muito tenso e pensativo sobre o que iria achar no casebre,\n"
	                + " chegando no casebre o bruxo sentia um forte odor que estava o deixando tonto por�m isso \n"
	                + "n�o o impediu de continuar a investiga��o no casebre, at� que ele encontrou uma estranha \n"
	                + "porta azul com um s�mbolo estranho, ele foi se aproximando cada vez mais da porta e cada\n "
	                + "vez mais ele sentia um formigamento em suas pernas, quando o bruxo abriu a porta ele encontrou\n"
	                + " o motivo do forte odor.\n" 
	                +" Era um corpo de um membro do cl� dos P�s grandes, logo o bruxo falou :\n" 
	                +" �Um assassinato nessa ilha ?? Estranho�\n" 
	                +"O bruxo foi investigando mais a estranha sala at� que encontrou registros de t�neis antigos\n"
	                + " e secretos que havia  no grande sal�o, logo o bruxo ja relacionou o assassinato com o grande\n"
	                + " roubo, invsetigando mais a fundo a sala achou algo muito estranho e familiar, era o distintivo\n"
	                + " do xerife da ilha, o bruxo ficou pensativo e muito assustado, come�ou a criar teorias em sua cabe�a.\n"
	                + " Mas ser� que o xerife seria capaz de trair a todos na ilha ?\n" 
	                + "O bruxo foi at� o gabinete do xerife para lhe fazer perguntas, por�m ele foi cauteloso, o bruxo\n"
	                + " fez a primeira pergunta:\n\n"
	                + "- Eu estava aqui pensando� O cl� dos P�s grandes tem um hist�rico de crimes aqui na ilha ? �\n"
	                + "- �N�o, desde que eu comecei nesse cargo aqui na ilha nunca tive problemas com eles, mas s�o \n"
	                + " muito ambiciosos, querem ser os melhores em tudo, at� em poder... .� disse o xerife \n" 
	                +"- � E os lobisomens? J� teve algum problema com eles ? � disse logo em seguida o xerife.\n" 
	                +"- � Problemas sempre tive, em noite de lua cheia fazem coisas sem pensar e ficam muito agressivos. � \n" 
	                +"- � Hmmm entendo, E o senhor sabe de algum casebre antigo no monte ??\n" 
	                +"Xerife respirou�. pensou� e respondeu : �N�o, fui poucas vezes ao monte e nunca vi nada alem de fadas,\n"
	                + " �rvores e gnomos.�\n" 
	                +"O bruxo come�ou a suspeitar que o xerife estaria mentindo, ele estava agindo de uma forma diferente\n"
	                + " do normal, estava suando, nervoso e apreensivo.\n "
	                + "Ent�o fez a principal pergunta em tom mais alto e firme: \n" 
	                +"- � Xerife, voc� poderia mostrar o seu distintivo por favor!�\n" 
	                +"- � Aonde voc� est� querendo chegar com isso BRUXO??� disse o xerife.\n" 
	                +"- � Por favor, mostre !� disse o bruxo em tom grosseiro.\n" 
	                +"- � Eu o perdi, a uma semana mais ou menos� disse o xerife\n" 
	                +"- � AH, ent�o voc� perdeu, tudo bem ! Re�na todos os cl�s no grande sal�o em 10 minutos, j� sei quem\n"
	                + " � o verdadeiro culpado.� disse o bruxo, e em seguida saiu do gabinete.\n" 
	                +" O bruxo estava nervoso, nunca teve um caso t�o complicado para solucionar, ele estava em d�vida por\n"
	                + " dentro se estava fazendo o certo, se estava no caminho certo ou n�o, se o culpado era o xerife,\n"
	                + " se era os minotauros ou nenhum desses.",TimeUnit.MILLISECONDS, temp_dialog);

	        
	        Digita("\n\nO destino da ilha est� nas suas m�os"
	        +"\nQual decis�o voc� ir� tomar???? "
	        +"\na) " + urna3.get(0)
	        +"\nb) " + urna3.get(1)
	        +"\nc) " + urna3.get(2)
	        +"\nd) " + urna3.get(3)
	        +"\ne) " + urna3.get(4),TimeUnit.MILLISECONDS, temp_quest);
	        
	        String decisaoCap6 = entrada.next();
	        switch (decisaoCap6.toLowerCase()) {
	            case "a":

	                if (urna3.get(0).equals(opc1)) {
	                    opc1();
	                } else if (urna3.get(0).equals(opc2)) {
	                    opc2();
	                } else if (urna3.get(0).equals(opc3)) {
	                    opc3();
	                } else if (urna3.get(0).equals(opc4)) {
	                    opc4();
	                } else if (urna3.get(0).equals(opc5)) {
	                    opc5();
	                }
	                break;
	            case "b":
	                if (urna3.get(1).equals(opc1)) {
	                    opc1();
	                } else if (urna3.get(1).equals(opc2)) {
	                    opc2();
	                } else if (urna3.get(1).equals(opc3)) {
	                    opc3();
	                } else if (urna3.get(1).equals(opc4)) {
	                    opc4();
	                } else if (urna3.get(1).equals(opc5)) {
	                    opc5();
	                }
	                break;
	            case "c":
	                if (urna3.get(2).equals(opc1)) {
	                    opc1();
	                } else if (urna3.get(2).equals(opc2)) {
	                    opc2();
	                } else if (urna3.get(2).equals(opc3)) {
	                    opc3();
	                } else if (urna3.get(2).equals(opc4)) {
	                    opc4();
	                } else if (urna3.get(2).equals(opc5)) {
	                    opc5();
	                }
	                break;
	            case "d":
	                if (urna3.get(3).equals(opc1)) {
	                    opc1();
	                } else if (urna3.get(3).equals(opc2)) {
	                    opc2();
	                } else if (urna3.get(3).equals(opc3)) {
	                    opc3();
	                } else if (urna3.get(3).equals(opc4)) {
	                    opc4();
	                } else if (urna3.get(3).equals(opc5)) {
	                    opc5();
	                }
	                break;
	            case "e":
	                if (urna3.get(4).equals(opc1)) {
	                    opc1();
	                } else if (urna3.get(4).equals(opc2)) {
	                    opc2();
	                } else if (urna3.get(4).equals(opc3)) {
	                    opc3();
	                } else if (urna3.get(4).equals(opc4)) {
	                    opc4();
	                } else if (urna3.get(4).equals(opc5)) {
	                    opc5();
	                }

		}
		
        }
	}




