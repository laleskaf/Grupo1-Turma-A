import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class play {


	static void Digita(String mensagem, TimeUnit unit, long tempo_mensagem) throws InterruptedException {
		for (char caractere : mensagem.toCharArray()) {
			System.out.print(caractere);
			unit.sleep(tempo_mensagem);
		}
	}
	static int temp_dialog =30, temp_narrativa = 150, temp_transicao = 25;

	static Scanner entrada = new Scanner(System.in);//Scanner global.
    static void opc4()throws Exception {
        Digita("“ Boa noite a todos, reuni vocês para anunciar o culpado do roubo do artefato,\n"
                + " nossa primeira pista como todos sabem foi um pelo achado dos minotauros,\n"
                + " nunca descartamos eles como suspeitos, porem para ter uma visao melhor da ilha estava indo ao monte mais alto,\n"
                + " no caminho achei pegadas para um casebre antigo,\n"
                + " la dentro havia registros de tuneis secretos do grande salao que o ladrão usou para roubar o artefato,\n"
                + " e tambem achei um corpo de um pé grande”\n"
                + "   todos ficaram chocados e absmados, é raro haver um assassinato na ilha, continuou o detetive…\n"
                + " “ e tambem a pista principal para solucionar o caso,\n"
                + " o que aconteceu foi que inicialmente um membro dos pés grandes junto com o xerife estavam planejando o roubo,\n"
                + " depois que terminaram de planejar o xerife assassinou o pé grande por segurança,\n"
                + " depois de roubar o artefato tentou incriminar os minotauros para nao ser pego”\n"
                + " e complementou mostrando o distintivo do xerife. O xerife ficou com uma cara assustada,\n"
                + " continuou o detetive...  “ Dito tudo isso, minha conclusão final é que o próprio xerife de vocês é o grande responsável por esse roubo!! ” \n"
                + "Guardas de imediato foram e prenderam o xerife na pior sela de  Mystic Valley,\n"
                + " a sela do subsolo, dias depois o artefato foi encontrado e protegido com a melhor segurança possível. \n"
                + "A cidade ficou em choque com o acontecido, mas mesmo com tudo isso a paz voltará a prosperar e todos na ilha continuarão protegidos e felizes.",TimeUnit.MILLISECONDS, temp_dialog);
    }

    static void opc1()throws Exception {
        Digita("“Boa noite a todos, reuni vocês para anunciar o culpado do roubo do artefato,\n"
                + " nossa primeira e única pista como todos sabem foi um pelo achado,\n "
                + "nunca descartamos os lobisomens e os centauros  como suspeitos, fui atrás de mais pistas,\n"
                + " tentei entender  melhor mas a minha conclusão sempre era a mesma,\n"
                + " com a ajuda do xerife decidi que o culpado do roubo é o clã dos lobisomens !! ”\n"
                + " completou o detetive dizendo “ e também achei um corpo em um casebre antigo, o corpo era do clã dos pés grandes,\n"
                + " vou iniciar outra investigação para saber o que houve.”\n"
                + "Todos ficaram em choque e com raiva ao mesmo tempo, com isso o clã dos lobisomens foram banidos da ilha para sempre,\n "
                + "1 dia depois o xerife fugiu da ilha e o artefato nunca foi achado. \n\n"
                + "O culpado era o XERIFE !! ",TimeUnit.MILLISECONDS, temp_dialog);
    }

    static void opc2()throws Exception {
        Digita(" “Boa noite a todos, reuni vocês para  anunciar que irei largar o caso,\n"
                + " não há provas suficientes para incriminar e declarar alguém como culpado,\n"
                + " foi um desafio enorme para mim e peço desculpas por não conseguir a recuperar o artefato,\n "
                + "o xerife irá continuar com o processo da investigação, irei embora da ilha ao amanhecer.”\n"
                + "Todos da ilha ficaram decepcionados e chateados com o bruxo, eles estavam muito confiantes nele.\n"
                + "Após o bruxo deixar a ilha o xerife fugiu 1 dia depois e o artefato nunca foi achado.\n\n"
                + "O culpado era o XERIFE !! ",TimeUnit.MILLISECONDS, temp_dialog);
    }

    static void opc3()throws Exception {
        Digita("“Boa noite a todos, reuni vocês para anunciar que a investigação a partir de agora será mais\n"
                + " rígida e rigorosa, irei interrogar TODOS a partir de agora, a partir de amanhã vai começar\n"
                + " um toque de recolher quando o sol se pôr e eu quero acesso a todos os locais de cada clã,\n"
                + " a investigação está muito complicada, não há muitas pistas, por isso as novas medidas!” \n"
                + "Mesmo com as novas medidas adotadas, nenhuma outra pista foi achada,\n"
                + " 2 dias depois o xerife abandonou a ilha e o artefato nunca foi achado.\n\n"
                + "O culpado era o XERIFE !! ",TimeUnit.MILLISECONDS, temp_dialog);
    }

    static void opc5()throws Exception {
        
    
        Digita("“Boa noite a todos, reuni vocês para anunciar o culpado do roubo do artefato, nossa primeira"
                + " e única pista como todos sabem foi um pelo achado dos centauros, nunca descartamos"
                + " ele como suspeitos, fui atrás de mais pistas, tentei entender o melhor mas a minha"
                + " conclusão sempre era a mesma, com a ajuda do xerife decidi que o culpado do roubo"
                + " é o clã dos centauros !! ” completou o detetive dizendo “ e também achei um corpo"
                + " em um casebre antigo, o corpo era do clã dos pés grandes, vou iniciar outra"
                + " investigação para saber o que houve.”\n"
                + "Todos ficaram em choque e com raiva ao mesmo tempo, com isso o clã dos centauros foram"
                + " banidos da ilha para sempre, 1 dia depois o xerife fugiu da ilha e o artefato nunca foi achado. \n\n"
                + "O culpado era o XERIFE !! ",TimeUnit.MILLISECONDS, temp_dialog);
    }

	static float entradaDados() {
		float n;//Declarando n como variavel local	
		System.out.println(" *Entrada de dados* \nDigite um nÃºmero de cada vez. ");
		System.out.println("NÃºmero: ");
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
					+ "| |1-AdiÃ§Ã£o         | |\r\n"
					+ "| |2-SubtraÃ§Ã£o      | |\r\n"
					+ "| |3-DivisÃ£o        | |\r\n"
					+ "| |4-MultiplicaÃ§Ã£o  | |\r\n"              
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

			System.out.println("OpÃ§Ã£o: ");
			op = entrada.nextInt();
		}while(op < 1 || op >4); //Mostra as opÃ§Ãµes novamente quando o jogador colocar um nÃºmero diferente das opÃ§Ãµes mostradas.

		return op;
	}
	static float adicao (float n1,float n2) {
		float resultado;
		resultado = n1+n2;

		System.out.printf(" _____________________\r\n"
				+ "|  _________________  |\r\n"
				+ "| |    *AdiÃ§Ã£o*     | |\r\n"
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
				+ "| |   *SubtraÃ§Ã£o*   | |\r\n"
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
				+ "| | *MultiplicaÃ§Ã£o* | |\r\n"
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
				+ "| |    *DivisÃ£o*    | |\r\n"
				+ "| |                 | |\r\n"
				+ "| |                 | |\r\n"
				+ "| |%.1f  Ã·  %.1f    | |\r\n"
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
			//chama a funÃ§Ã£o de adiÃ§Ã£o
			resultado =  adicao(n1,n2);
			break;
		case 2:
			//chama a funÃ§Ã£o subtraÃ§Ã£o
			resultado =  subtracao(n1,n2);
			break;
		case 3:
			//chama a funÃ§Ã£o divisÃ£o
			resultado = divisao(n1,n2);
			break;
		case 4:
			//chama a funÃ§Ã£o multiplicaÃ§Ã£o
			resultado =  multiplicacao(n1,n2);
			break;
		default:
			resultado = 0;
		}
		return resultado;


	}





	public static void main(String[] args) throws Exception{
            
            OutputStreamWriter bufferOut = new OutputStreamWriter(
                               new FileOutputStream("c:\\temp\\acentos.txt"),"UTF-8");

		bufferOut.write("acento agudo: áéíóú\n");
		bufferOut.write("acento circunflexo: âêîôû\n");
		bufferOut.write("fim");


		
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
			System.out.println("2- InstruÃƒÂ§ÃƒÂµes ");
			System.out.println("3- Sinopse");
			System.out.println("4- CrÃƒÂ©ditos ");
			System.out.println("5- Sair ");
			System.out.print("Escolha uma opÃƒÂ§ÃƒÂ£o: ");
			escolha = entrada.nextInt();

			switch (escolha) {

			case 1:
				break;
			case 2:
				System.out.println("VocÃƒÂª escolheu {INSTRUÃƒâ€¡Ãƒâ€¢ES}");
				System.out.printf("\n");
				System.out.println("Em uma ilha muito distante, existe uma vila chamada Mystic Valley.");
				System.out.println("Em uma noite de comemoraÃƒÂ§ÃƒÂµes acontece um roubo onde o item mais raro de toda ilha ÃƒÂ© levado,");
				System.out.println("entÃƒÂ£o um detetive com seus poderes sobrenaturais se dispÃƒÂµe a encontrar o culpado.");
				System.out.println("Nessa aventura vocÃƒÂªs desvendarÃƒÂ£o esse mistÃƒÂ©rio que intriga os moradores de Mystic Valley.");
				System.out.printf("\n");
				System.out.println("O jogo Mystic Valley ÃƒÂ© um jogo de multipla escolha, em que suas escolhas influenciam diretamente o jogo, ");

				System.out.println("podendo mudar os caminhos e a histÃƒÂ³ria, o intuito dessas escolhas sÃƒÂ£o praticar a sua lÃƒÂ³gica, esperamos que vocÃƒÂª se divirta e que aumente a sua lÃƒÂ³gica !");
				break;
			case 3:
				System.out.println("VocÃƒÂª escolheu {CRÃƒâ€°DITOS}");
				System.out.println("Giovana SimÃƒÂµes");
				System.out.println("Guilherme Profirio");
				System.out.println("Laleska Fernandes");
				System.out.println("Leonardo Messias");
				System.out.println("Thalles Negreiro");// nome de cada integrante
				break;
			case 4:
				System.out.println("VocÃª escolheu Sinopse");
				System.out.println("Em uma ilha muito distante, existe uma vila chamada Mystic Valley. Em uma noite de comemoraÃ§Ãµes acontece um roubo onde o item mais raro de toda ilha Ã© levado,"
						+ "entÃ£o um detetive com seus poderes sobrenaturais se dispÃµe a encontrar o culpado. Nessa aventura vocÃªs desvendarÃ£o esse mistÃ©rio que intriga os moradores de Mystic Valley.");
			case 5:
				System.err.println(" VocÃƒÂª saiu !");
				break;
			default:
				System.out.println("OpÃƒÂ§ÃƒÂ£o invÃƒÂ¡lida !!!");
				break;

			}
		} while (!(escolha == 5 || escolha == 1));

		if (escolha == 1) {
			System.out.println("VocÃƒÂª escolheu {JOGAR}");
			//continuar o cÃƒÂ³digo aqui 
			System.out.printf("\n");
			System.out.println("CapÃƒÂ­tulo  I - Potion of immortality\n");
		        Digita ("\nNo meio de um oceano tÃƒÂ£o tÃƒÂ£o distante existe uma ilha misteriosa, quase tÃƒÂ£o grande quanto um paÃƒÂ­s, "
			+ "\nnessa ilha existe vilarejo chamado Mystic Valley "
			+"\nonde habita diversas criaturas mÃƒÂ¡gicas de todas as espÃƒÂ©cies,"
			+"\nque sÃƒÂ£o separadas por clÃƒÂ£s. O clÃƒÂ£ dos bruxos ÃƒÂ© um dos mais poderosos de toda ilha,"
			+"\npois eles possuem conhecimentos antigos, fÃƒÂ³rmulas e poÃƒÂ§ÃƒÂµes mÃƒÂ¡gicas,"
			+"\numa dessas poÃƒÂ§ÃƒÂµes talvez a mais rara e cobiÃƒÂ§ada de toda ilha, ÃƒÂ© a potion of immortality,"
			+"\nonde o mito diz: Aquele que a consumir nunca morrerÃƒÂ¡.",TimeUnit.MILLISECONDS, temp_dialog);
			
			Digita("\n\nTodos os forasteiros de todos os cantos do mundo sÃƒÂ£o atraÃƒÂ­dos por essa ideia,"
			+"\ncom a cobiÃƒÂ§a de a possui-la para si prÃƒÂ³prio, "
			+"\nmas ao chegarem nas margens da ilha apenas aqueles seres mÃƒÂ¡gicos ou aqueles que provarem seu valor poderam adentrar-la,"
			+"\natravÃƒÂ©s de um enigma implantado por mÃƒÂ¡gia......",TimeUnit.MILLISECONDS, temp_dialog);
			System.out.printf("\n");

			do {
				Digita("Em um jardim: "
                                        +"\nA) todas as flores, menos duas sÃƒÂ£o rosas "
				        +"\nB) todas as flores, menos duas sÃƒÂ£o margaridas"
				        +"\nC) todas as flores, menos duas sÃƒÂ£o orquÃƒÂ­deas.",TimeUnit.MILLISECONDS, temp_dialog);
				        
                                Digita("Quantas flores hÃƒÂ¡ no jardim?"// desafio 1
				+"\na) " + urna.get(0)
				+"\nb) " + urna.get(1)
				+"\nc) " + urna.get(2)
				+"\nd) " + urna.get(3)
				+"\ne) " + urna.get(4),TimeUnit.MILLISECONDS, temp_dialog);
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
			Digita("ParabÃƒÂ©ns !!!! VocÃƒÂª entrou na ilha, aqui comeÃƒÂ§a a sua histÃƒÂ³ria....."
			+"\nBOA SORTE!!",TimeUnit.MILLISECONDS, temp_dialog);// final capitulo 1

		} 


	
	
		
        String escolhacaminho,caminhoalternativo = "Tentar resolver sozinho.", 
                caminhocerto = "Pedir ajuda a um jovem bruxo que está a observar.",
                escolhacap2,enigcap2 = "10";
        
        System.out.println("Capítulo II  - O roubo\n\n");
        Digita("Em uma noite de comemorações onde todos os clãs estavam reunidos no grande salão, o alarme do clã dos bruxos "
                + "\necoa por todos os cantos da cidade, mostrando assim que algo muito ruim havia acontecido. Rapidamente todos "
                + "daquela festa se apavoram e procuram pelo xerife da cidade que foi incumbido a preservar a ordem de toda vila. "
                + "\nO xerife diz – “Reúna todos meus homens em frente à delegacia imediatamente!”",TimeUnit.MILLISECONDS, temp_dialog);
        Digita("\n\nCom todos os homens do xerife reunidos ele faz um pronunciamento sobre o ocorrido. "
                + "\nO xerife diz – “Vamos nos separar e descobrir o que foi levado dos bruxos, a partir de agora ninguém entra "
                + "ou sai desta ilha”."
                + "\nAo chegarem na região dos bruxos, logo descobrem que o item levado foi o mais valioso de toda ilha, o templo"
                + "\nonde estava guardada por muitos anos havia sido violado por um usurpador, mas para qualquer ser que desejasse "
                + "\nadentra-la, precisaria primeiro decifrar o enigma escrito em língua de bruxo logo acima do portão de entrada."
                ,TimeUnit.MILLISECONDS, temp_dialog);

        do{
            
                 List <String> list = Arrays.asList("Pedir ajuda a um jovem bruxo que está a observar."
                ,"Tentar resolver sozinho.","Invadir com força bruta, mas sabendo que há um feitiço de proteção.");
                Collections.shuffle(list);
                
                Digita("\nVocê tem algumas opções para resolução deste enigma:"
                        + "\n1 – " + list.get(0)
                        + "\n2 – " + list.get(1)
                        + "\n3 – " + list.get(2)
                        + "\nIndique qual caminho deseja seguir em número: ",TimeUnit.MILLISECONDS, temp_dialog);
                escolhacaminho = entrada.next();
                
                switch(escolhacaminho){
                    case "1":
                        if(list.get(0).equals(caminhocerto)){
                            escolhacaminho = caminhocerto;
                            
                        }else if(list.get(0).equals(caminhoalternativo)){
                            Digita("\n(não consigo traduzir sozinho, pois está em uma língua desconhecida), pensou o xerife"
                                    + "\ntente novamente!\n",TimeUnit.MILLISECONDS, temp_dialog);
                            break;
                        }else{
                            Digita("\nvocê foi empurrado para trás e todos riram"
                                    + "\ntente novamente!\n",TimeUnit.MILLISECONDS, temp_dialog);
                        }
                        break;
                    case "2":
                        if(list.get(1).equals(caminhocerto)){
                            escolhacaminho = caminhocerto;
                            
                        }else if(list.get(1).equals(caminhoalternativo)){
                            Digita("\n(não consigo traduzir sozinho, pois está em uma língua desconhecida), pensou o xerife"
                                    + "\ntente novamente!\n",TimeUnit.MILLISECONDS, temp_dialog);
                        }else{
                            Digita("\nvocê foi empurrado para trás e todos riram"
                                    + "\ntente novamente!\n",TimeUnit.MILLISECONDS, temp_dialog);
                        }
                        break;
                    case "3":
                        if(list.get(2).equals(caminhocerto)){
                            escolhacaminho = caminhocerto;
                        }else if(list.get(2).equals(caminhoalternativo)){
                            Digita("\n(não consigo traduzir sozinho, pois está em uma língua desconhecida), pensou o xerife"
                                    + "\ntente novamente!\n",TimeUnit.MILLISECONDS, temp_dialog);
                        }else{
                            Digita("\nvocê foi empurrado para trás e todos riram"
                                    + "\ntente novamente!\n",TimeUnit.MILLISECONDS, temp_dialog);
                        }
                        break;
                    default:
                            System.out.println("Opção invalida!"
                                    + "\nTente novamente.");
                }
        }while ((!(escolhacaminho.equals(caminhocerto))));
        
            Digita("\nCom a ajuda do jovem bruxo a placa foi traduzida, "
                    + "\npara que enfim o xerife consiga prosseguir com a sua investigação" 
                    + "\nrevelando assim um novo desafio que diz:",TimeUnit.MILLISECONDS, temp_dialog);
            Digita("\nNo caminho de casa até o templo, um mago conta 10 árvores a sua direita."
                    + "\nApós ida ao templo, ele retorna para casa e conta 10 árvores a sua esquerda.",TimeUnit.MILLISECONDS, temp_dialog);
            
            do{
                List<String> list = Arrays.asList("20","15","10","30","25");
                Collections.shuffle(list);
                
                Digita("\nQuantas árvores ele viu no total nesse dia?"
                        + "\nA) " + list.get(0)
                        + "\nB) " + list.get(1)
                        + "\nC) " + list.get(2)
                        + "\nD) " + list.get(3)
                        + "\nE) " + list.get(4)
                        + "\nQual é a Alternativa Correta:",TimeUnit.MILLISECONDS, temp_dialog);
                escolhacap2 = entrada.next();
                
                switch (escolhacap2.toUpperCase()) {
			case "A": 
				if(list.get(0).equals(enigcap2)) {
					escolhacap2 = enigcap2;
				}else{
					System.out.println("\nAlternativa Incorreta!");
				}
				break;

			case "B": 
				if(list.get(1).equals(enigcap2)) {
					escolhacap2 = enigcap2;
				}else{
					System.out.println("\nAlternativa Incorreta!");
				}
				
				break;
			case "C": 
				if(list.get(2).equals(enigcap2)) {
					escolhacap2 = enigcap2;
				}else{
					System.out.println("\nAlternativa Incorreta!");
				}
				break;
			case "D": 
				if(list.get(3).equals(enigcap2)) {
					escolhacap2 = enigcap2;
				}else{
					System.out.println("\nAlternativa Incorreta!");
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
                                System.out.println("\nAlternativa Incorreta!");
                            }else{
                              System.out.println("Opção invalida!");  
                            }
                            
                        
                        
                            
            }
        }while((!(escolhacap2.equalsIgnoreCase(enigcap2))));
            Digita("\n\nAlternativa correta! Você conseguiu desfazer o feitiço de proteção!"
                    + "\n\nPois, são as mesmas 10 árvores vistas de diferente perspectivas."
                    + "\nNa ida, árvores estavam á direita do mago, mas na volta"
                    + "\nquando ele estava no sentido contrário, as árvores podiam ser vista á esquerda\n",TimeUnit.MILLISECONDS, temp_dialog);
            
            /*FIM CAP ||*/
            

		//FIM CAP II

		Digita("CapÃ­tulo III - A primeira pista\n",TimeUnit.MILLISECONDS, temp_dialog);//InÃ­cio Cap III


		System.out.println("\nCom isso o xerife percebe que nÃ£o conseguiria solucionar este crime sem um profissional especializado no ramo da investigaÃ§Ã£o.\r\n"
				+ "EntÃ£o ele chamou um detetive para ajudÃ¡-lo a solucionar esse crime. Ao entrarem mais fundo no templo, o detetive logo encontrou a primeira pista,\r\n"
				+ "um tufo de pelos foi encontrado caÃ­do no templo, como na ilha habita diversas criaturas diferentes, nÃ£o foi possÃ­vel identificar de quem era esse pelo.\r\n"
				+ "Imediatamente o xerife propÃ´s uma assemblÃ©ia e convocou todos os clÃ£s para debaterem de quem era o pelo e achar o culpado.\r\n"
				+ "O pelo era amarronzado, com uma textura sedosa, bem liso. A assemblÃ©ia comeÃ§ou, todos os clÃ£s estavam reunidos, separados por grupos para melhor anÃ¡lise,\r\n"
				+ "o xerife e detetive, foram passando de grupo em grupo, para compararem o pelo.\r\n");

		Digita("\nDe quem era o pelo?\n",TimeUnit.MILLISECONDS, temp_dialog);

		System.out.println("\nAo comparar o pelo, surge o seguinte desafio:\r\n \n"
				+ "		\nDecifre o cÃ³digo para descobrir quem Ã© o dono do pelo: \r\n \n"
				+ "Î© = 5   | á„¿á´¥á„½= 2  |  ã‰§â–¼ã‰§ = 3  | È£ = 1  |<(Âº) = 6 | ï¿½?à¹‹: = 9| â—¤-.-â—¥ = 4 | â™ž = 7 | ÏŸ = 8 | å‚˜ =9\r\n"
				+ "â™¨=10 | âœ© = 11 | à²œ=12 | ï¿½? = 13 | ÊšÄ­Éž = 14 | â—‘ = 15 | â˜ª = 16 | â˜€ = 17 | â˜˜ = 18 | áƒš = 19\r\n"
				+ "âŒ˜ = 20 | ï¿½?ï¿½ = 21 \n ");

		Digita("\nã‰§â–¼ã‰§  |  ( (â™¨ - â—¤-.-â—¥) - È£ )  |  ÊšÄ­Éž  | âŒ˜ |  È£ |  ((âœ© + áƒš) - ï¿½?à¹‹:) |  â˜˜ |  ( â™¨+Î©) \n",TimeUnit.MILLISECONDS, temp_dialog);

		String operacao,certo = " 3 | 5 | 14 | 20 | 1 | 21 | 18 | 15 ";//Resposta certa do desafio.

		System.out.println("\nPara te ajudar, use calculadora: \n" );

		String calculadora;//VariÃ¡vel para ver se o jogador quer utilizar dnv a calculadora.
		do {
			int op = menu();//Chama a funÃ§Ã£o menu, que darÃ¡ as opÃ§Ãµes da calculadora.
			float n1 = entradaDados();//Chama a funÃ§Ã£o que pede ao jogador o primeiro dado.
			float n2 = entradaDados();//Chama a funÃ§Ã£o que pede ao jogador o segundo dado.
			float result = controlador(op,n1,n2);//Chama a funÃ§Ã£o que faz a operaÃ§Ã£o.
			System.out.println("\nPrecisa utilizar novamente? ");
			calculadora = entrada.nextLine().toUpperCase();//Recebe o que o jogador digitou e deixa tudo em MaiÃºsculo.

		}while(calculadora.equalsIgnoreCase("SIM"));
		do {

			List <String> emb = Arrays.asList (" 4 | 6 | 15 | 21 | 2 | 22 | 19 | 16 " ,  " 3 | 4 | 13 | 19 | 1 | 20 | 17 | 14 " , " 3 | 5 | 14 | 21 | 1 | 21 | 17 | 15 " ,  " 6 | 5 | 19 | 10 | 4 | 21 | 15 | 18 ", " 3 | 5 | 14 | 20 | 1 | 21 | 18 | 15 ");

			Collections.shuffle(emb);//Embaralha.

			Digita("\n       *Quais valores foram encontrados?*        \n ",TimeUnit.MILLISECONDS, temp_dialog);

			System.out.println("\nSelecione a sequÃªncia equivalente:\n");

			System.out.println(" <A>" + emb.get(0)+"\n");//OpÃ§Ãµes com embaralhar a ordem.
			System.out.println(" <B>" + emb.get(1)+"\n");
			System.out.println(" <C>" + emb.get(2)+"\n");
			System.out.println(" <D>" + emb.get(3)+"\n");
			System.out.println(" <E>" + emb.get(4)+"\n");
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
					Digita("\n    Decifre mais uma parte do cÃ³digo e encontre o culpado!! \n",TimeUnit.MILLISECONDS, temp_dialog);
					System.out.println("\n A= 1 | B= 2 | C= 3 | D= 4 | E= 5 | F= 6 | G= 7 | H= 8 | I= 9 | J= 10 | K= 11 | L= 12 | M= 13 "
							+ "\n N= 14 | O= 15 | P= 16 | Q= 17 | R= 18 | S=19 | T=20 | U= 21 | V= 22 | W= 23 | X= 24 | Y= 25 | Z= 26 \n ");

					Digita("\n                           *Quem foi o culpado  encontrado?*        \n ",TimeUnit.MILLISECONDS, temp_dialog);

					culpado = entr.nextLine().toUpperCase();

					if(culpado.equals(correto)) {
						System.out.println("\nIsso aÃ­, vocÃª encontrou a primeira pista, o dono do pelo faz parte do clÃ£ dos Centauros!! \n "
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



			}
			Digita("CapÃ­tulo IV - O Ã?libi\n",TimeUnit.MILLISECONDS, temp_dialog);//InÃ­cio Cap IV

			String escolhaCap4;
			String alternativa1Cap4 = "Bosque do Anseio";
			String alternativa2Cap4 = "Bosque do cafÃ©";
			String alternativa3Cap4 = "Bosque da Casa";
			String alternativa4Cap4 = "Bosque do chÃ¡";
			String alternativa5Cap4 = "Bosque do chalÃ©";
			List<String> urna1 = Arrays.asList(alternativa1Cap4, alternativa2Cap4, alternativa3Cap4, alternativa4Cap4, alternativa5Cap4);
			Collections.shuffle(urna1);
			System.out.println("A assembleia havia comeÃ§ado, o clima estava muito tenso em Mystic Valley,\n"
					+ " logo de cara muitos clÃ£s junto com o prÃ³prio xerife, acusaram o clÃ£ dos centauros,\n"
					+ " por conta do pelo ser da mesma cor e da mesma textura, quando o clÃ£ dos centauros estavam prestes a serem condenados,\n"
					+ " o jovem bruxo detetive que o xerife havia pedido ajuda, chega na assembleia e diz:\n\n");
			System.out.println("Bruxo:   - NÃ£o foram os centauros, eu estive durante a semana toda e estive na noite do roubo,/\n "
					+ "junto com o clÃ£ dos centauros, eu acredito que quem roubou, colocou os pelos de centauros, para incrimina-los.");
			System.out.println("Todos na assembleia ficam pensativos, e decidem concordar com o jovem bruxo, menos o xerife,"
					+ " que ainda tem suas ressalvas com aquela clÃ£, devido a confusÃµes em que ele jÃ¡ se envolveu antes com o clÃ£ de centauros,\n"
					+ " e entÃ£o o jovem bruxo e o xerife saem para ir atrÃ¡s do verdadeiro culpado.\n ");
			System.out.println(" entÃ£o o jovem bruxo comeÃ§a os interrogatÃ³rios por toda Mystic Valley,\n "
					+ "enquanto o xerife parece estar bem incomodado com as atitudes do bruxo,\n"
					+ " o xerife entÃ£o decide ir a cena do roubo sozinho. O bruxo entÃ£o decide ir atrÃ¡s do xerife discretamente .\n");
			do {
				System.out.println("Enquanto o jovem bruxo seguia as pegadas ele percebeu que algumas delas estavam um pouco apagadas"
						+ " e teria que caminhar um pouco mais atÃ© encontrar a prÃ³xima. Caminhando ele passou por trÃªs bosques :\n");
				System.out.println("1) Bosque do ChÃ¡");
				System.out.println("2) Bosque do ChalÃ©");
				System.out.println("3) Bosque do Japeri");
				System.out.println(" \n"
						+ "Em um determinado ponto da sua caminhada ele tinha que escolher um caminho para continuar seguindo as pegadas,"
						+ "pela lÃ³gica qual o prÃ³ximo caminho ele deveria escolher :");
				System.out.println("a) " + urna1.get(0));
				System.out.println("b) " + urna1.get(1));
				System.out.println("c) " + urna1.get(2));
				System.out.println("d) " + urna1.get(3));
				System.out.println("e) " + urna1.get(4));
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
		}
		Digita("\n CapÃ­tulo V  - O monte mais alto da Ilha \n",TimeUnit.MILLISECONDS, temp_dialog);//InÃ­cio Cap V

		String escolhaCap4;
		String alternativa1Cap4 = "Bosque do Anseio";
		String alternativa2Cap4 = "Bosque do cafÃ©";
		String alternativa3Cap4 = "Bosque da Casa";
		String alternativa4Cap4 = "Bosque do chÃ¡";
		String alternativa5Cap4 = "Bosque do chalÃ©";
		List<String> urna2 = Arrays.asList(alternativa1Cap4, alternativa2Cap4, alternativa3Cap4, alternativa4Cap4, alternativa5Cap4);
		Collections.shuffle(urna2);
		Digita("ApÃ³s os Ãºltimos acontecimentos o jovem bruxo (detetive) e o xerife pareciam jÃ¡ nÃ£o caminhar na mesma direÃ§Ã£o. \n"
				+ " Enquanto o Jovem bruxo (detetive) continuava acreditando na inocÃªncia do clÃ£ dos centauros,\n"
				+ " o xerife nÃ£o aceitava que qualquer outro clÃ£ pudesse ter cometido um crime que abalou tanto a confianÃ§a de toda a Ilha.\n"
				+ " (e todos nÃ³s sabemos que apÃ³s a confianÃ§a ser perdida, uma guerra estÃ¡ prÃ³xima).\r\n"
				+ "\n\n"
				+ "Incomodado com o sentimento de desconfianÃ§a do Xerife, o Jovem bruxo (detetive) comeÃ§ou a pensar : "
				+ "\n- â€œEu preciso encontrar o culpado o mais rÃ¡pido possÃ­vel para mostrar ao xerife que eu estou certo!â€?\n "
				+ "disse ele caminhando atÃ© o monte mais alto da Ilha, onde ele pudesse ver tudo de cima. \r\n"
				+ "De Repente o jovem bruxo (detetive) que caminhava cabisbaixo comeÃ§ou a perceber algo diferente no chÃ£o \r\n"
				+ "",TimeUnit.MILLISECONDS, temp_dialog);
		
		Digita(" â€”â€”â€”-Ooooâ€”\r\n"
				+ "\r\n"
				+ "â€”â€”â€”â€“(â€”-)â€”\r\n"
				+ "\r\n"
				+ "â€”â€”â€”â€”)â€“/â€”-\r\n"
				+ "\r\n"
				+ "â€”â€”â€”â€”(_/-\r\n"
				+ "\r\n"
				+ "â€”-oooOâ€”-\r\n"
				+ "\r\n"
				+ "â€”-(â€”)â€”-\r\n"
				+ "\r\n"
				+ "â€”â€“\\â€“(â€“\r\n"
				+ "\r\n"
				+ "â€”â€”\\_)-\r\n"
				+ "\n \n"
				+ "â€œIsso sÃ£o mais pegadas?â€? disse alto, assustado.\r\n"
				+ "â€œMas elas sÃ£o muito granâ€¦. SÃ³ pode ser de um membro do clÃ£ dos pÃ©s grandesâ€? complementando. \r\n"
				+ "\n",TimeUnit.MILLISECONDS, temp_dialog);
		
		do {
			System.out.println("Enquanto o jovem bruxo seguia as pegadas ele percebeu que algumas delas estavam um pouco apagadas"
					+ " e teria que caminhar um pouco mais atÃ© encontrar a prÃ³xima. Caminhando ele passou por trÃªs bosques :\n");
			System.out.println("1) Bosque do ChÃ¡");
			System.out.println("2) Bosque do ChalÃ©");
			System.out.println("3) Bosque do Japeri");
			System.out.println(" \n"
					+ "Em um determinado ponto da sua caminhada ele tinha que escolher um caminho para continuar seguindo as pegadas,"
					+ "pela lÃ³gica qual o prÃ³ximo caminho ele deveria escolher :");
			System.out.println("a) " + urna2.get(0));
			System.out.println("b) " + urna2.get(1));
			System.out.println("c) " + urna2.get(2));
			System.out.println("d) " + urna2.get(3));
			System.out.println("e) " + urna2.get(4));
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
		Digita("Muito bem!! Parece que esta no caminho certo,\n"
				+ "Seguindo as pegadas, o jovem bruxo de longe avista um casebre abandonado no meio da mataâ€¦\r\n"
				+ "\n" ,TimeUnit.MILLISECONDS, temp_dialog);
                
                 
                  
        
        String opc1 = "CULPAR O CLA DOS LOBISOMENS";

        String opc2 = "ABANDONAR O CASO";

        String opc3 = "TOMAR MEDIDAS MAIS RIGIDAS";

        String opc4 = "CULPAR O XERIFE PELO ROUBO";

        String opc5 = "CULPA O CLA DOS CENTAUROS";

        List<String> urna3 = Arrays.asList(opc1, opc2, opc3, opc4, opc5);
        Collections.shuffle(urna3);

        Digita ("O jovem bruxo estava muito tenso e pensativo sobre o que iria achar no casebre,\n"
                + " chegando no casebre o bruxo sentia um forte odor que estava o deixando tonto porém isso \n"
                + "não o impediu de continuar a investigação no casebre, até que ele encontrou uma estranha \n"
                + "porta azul com um símbolo estranho, ele foi se aproximando cada vez mais da porta e cada\n "
                + "vez mais ele sentia um formigamento em suas pernas, quando o bruxo abriu a porta ele encontrou\n"
                + " o motivo do forte odor.\n" 
                +" Era um corpo de um membro do clã dos Pés grandes, logo o bruxo falou :\n" 
                +" “Um assassinato nessa ilha ?? Estranho”\n" 
                +"O bruxo foi investigando mais a estranha sala até que encontrou registros de túneis antigos\n"
                + " e secretos que havia  no grande salão, logo o bruxo ja relacionou o assassinato com o grande\n"
                + " roubo, invsetigando mais a fundo a sala achou algo muito estranho e familiar, era o distintivo\n"
                + " do xerife da ilha, o bruxo ficou pensativo e muito assustado, começou a criar teorias em sua cabeça.\n"
                + " Mas será que o xerife seria capaz de trair a todos na ilha ?\n" 
                + "O bruxo foi até o gabinete do xerife para lhe fazer perguntas, porém ele foi cauteloso, o bruxo\n"
                + " fez a primeira pergunta:\n\n"
                + "- Eu estava aqui pensando… O clã dos Pés grandes tem um histórico de crimes aqui na ilha ? “\n"
                + "- “Não, desde que eu comecei nesse cargo aqui na ilha nunca tive problemas com eles, mas são \n"
                + " muito ambiciosos, querem ser os melhores em tudo, até em poder... .” disse o xerife \n" 
                +"- “ E os lobisomens? Já teve algum problema com eles ? “ disse logo em seguida o xerife.\n" 
                +"- “ Problemas sempre tive, em noite de lua cheia fazem coisas sem pensar e ficam muito agressivos. ” \n" 
                +"- “ Hmmm entendo, E o senhor sabe de algum casebre antigo no monte ??\n" 
                +"Xerife respirou…. pensou… e respondeu : “Não, fui poucas vezes ao monte e nunca vi nada alem de fadas,\n"
                + " árvores e gnomos.”\n" 
                +"O bruxo começou a suspeitar que o xerife estaria mentindo, ele estava agindo de uma forma diferente\n"
                + " do normal, estava suando, nervoso e apreensivo.\n "
                + "Então fez a principal pergunta em tom mais alto e firme: \n" 
                +"- “ Xerife, você poderia mostrar o seu distintivo por favor!”\n" 
                +"- “ Aonde você está querendo chegar com isso BRUXO??” disse o xerife.\n" 
                +"- “ Por favor, mostre !” disse o bruxo em tom grosseiro.\n" 
                +"- “ Eu o perdi, a uma semana mais ou menos” disse o xerife\n" 
                +"- “ AH, então você perdeu, tudo bem ! Reúna todos os clãs no grande salão em 10 minutos, já sei quem\n"
                + " é o verdadeiro culpado.” disse o bruxo, e em seguida saiu do gabinete.\n" 
                +" O bruxo estava nervoso, nunca teve um caso tão complicado para solucionar, ele estava em dúvida por\n"
                + " dentro se estava fazendo o certo, se estava no caminho certo ou não, se o culpado era o xerife,\n"
                + " se era os minotauros ou nenhum desses.",TimeUnit.MILLISECONDS, temp_dialog);

        
        Digita("\n\nO destino da ilha está nas suas mãos"
        +"\nQual decisão você irá tomar???? "
        +"\na) " + urna.get(0)
        +"\nb) " + urna.get(1)
        +"\nc) " + urna.get(2)
        +"\nd) " + urna.get(3)
        +"\ne) " + urna.get(4),TimeUnit.MILLISECONDS, temp_dialog);
        
        String decisaoCap6 = entrada.next();
        switch (decisaoCap6.toLowerCase()) {
            case "a":

                if (urna.get(0).equals(opc1)) {
                    opc1();
                } else if (urna.get(0).equals(opc2)) {
                    opc2();
                } else if (urna.get(0).equals(opc3)) {
                    opc3();
                } else if (urna.get(0).equals(opc4)) {
                    opc4();
                } else if (urna.get(0).equals(opc5)) {
                    opc5();
                }
                break;
            case "b":
                if (urna.get(1).equals(opc1)) {
                    opc1();
                } else if (urna.get(1).equals(opc2)) {
                    opc2();
                } else if (urna.get(1).equals(opc3)) {
                    opc3();
                } else if (urna.get(1).equals(opc4)) {
                    opc4();
                } else if (urna.get(1).equals(opc5)) {
                    opc5();
                }
                break;
            case "c":
                if (urna.get(2).equals(opc1)) {
                    opc1();
                } else if (urna.get(2).equals(opc2)) {
                    opc2();
                } else if (urna.get(2).equals(opc3)) {
                    opc3();
                } else if (urna.get(2).equals(opc4)) {
                    opc4();
                } else if (urna.get(2).equals(opc5)) {
                    opc5();
                }
                break;
            case "d":
                if (urna.get(3).equals(opc1)) {
                    opc1();
                } else if (urna.get(3).equals(opc2)) {
                    opc2();
                } else if (urna.get(3).equals(opc3)) {
                    opc3();
                } else if (urna.get(3).equals(opc4)) {
                    opc4();
                } else if (urna.get(3).equals(opc5)) {
                    opc5();
                }
                break;
            case "e":
                if (urna.get(4).equals(opc1)) {
                    opc1();
                } else if (urna.get(4).equals(opc2)) {
                    opc2();
                } else if (urna.get(4).equals(opc3)) {
                    opc3();
                } else if (urna.get(4).equals(opc4)) {
                    opc4();
                } else if (urna.get(4).equals(opc5)) {
                    opc5();
                }

        }
	}
}
	



