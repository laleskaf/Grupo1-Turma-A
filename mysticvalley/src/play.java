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
	static int temp_dialog =30, temp_narrativa = 150, temp_transicao = 25;

	static Scanner entrada = new Scanner(System.in);//Scanner global.


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
			System.out.println("2- InstruÃ§Ãµes ");
			System.out.println("3- CrÃ©ditos ");
			System.out.println("4- Sair ");
			System.out.print("Escolha uma opÃ§Ã£o: ");
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
			case 3:
				System.out.println("VocÃª escolheu {CRÃ‰DITOS}");
				System.out.println("Giovana SimÃµes");
				System.out.println("Guilherme Profirio");
				System.out.println("Laleska Fernandes");
				System.out.println("Leonardo Messias");
				System.out.println("Thalles Negreiro");// nome de cada integrante
				break;
			case 4:
				System.err.println(" VocÃª saiu !");
				break;
			default:
				System.out.println("OpÃ§Ã£o invÃ¡lida !!!");
				break;

			}
		} while (!(escolha == 4 || escolha == 1));

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
				        +"\nC) todas as flores, menos duas sÃ£o orquÃ­deas.",TimeUnit.MILLISECONDS, temp_dialog);
				        
                                Digita("Quantas flores hÃ¡ no jardim?"// desafio 1
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
			Digita("ParabÃ©ns !!!! VocÃª entrou na ilha, aqui comeÃ§a a sua histÃ³ria....."
			+"\nBOA SORTE!!",TimeUnit.MILLISECONDS, temp_dialog);// final capitulo 1

		} 


	
	
		
        String escolhacaminho,caminhoalternativo = "Tentar resolver sozinho.", 
                caminhocerto = "Pedir ajuda a um jovem bruxo que est� a observar.",
                escolhacap2,enigcap2 = "10";
        
        System.out.println("\n Cap�tulo II  - O roubo\n\n");
        Digita("Em uma noite de comemora��es onde todos os cl�s estavam reunidos no grande sal�o, o alarme do cl� dos bruxos "
                + "\necoa por todos os cantos da cidade, mostrando assim que algo muito ruim havia acontecido. Rapidamente todos "
                + "daquela festa se apavoram e procuram pelo xerife da cidade que foi incumbido a preservar a ordem de toda vila. "
                + "\nO xerife diz � �Re�na todos meus homens em frente � delegacia imediatamente!�",TimeUnit.MILLISECONDS, temp_dialog);
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
                        + "\nIndique qual caminho deseja seguir em n�mero: ",TimeUnit.MILLISECONDS, temp_dialog);
                escolhacaminho = entrada.next();
                
                switch(escolhacaminho){
                    case "1":
                        if(list.get(0).equals(caminhocerto)){
                            escolhacaminho = caminhocerto;
                            
                        }else if(list.get(0).equals(caminhoalternativo)){
                            Digita("\n(n�o consigo traduzir sozinho, pois est� em uma l�ngua desconhecida), pensou o xerife"
                                    + "\ntente novamente!\n",TimeUnit.MILLISECONDS, temp_dialog);
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
                        + "\nQual � a Alternativa Correta:",TimeUnit.MILLISECONDS, temp_dialog);
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
                              System.out.println("Op��o invalida!");  
                            }
                            
                        
                        
                            
            }
        }while((!(escolhacap2.equalsIgnoreCase(enigcap2))));
            Digita("\n\nAlternativa correta! Voc� conseguiu desfazer o feiti�o de prote��o!"
                    + "\n\nPois, s�o as mesmas 10 �rvores vistas de diferente perspectivas."
                    + "\nNa ida, �rvores estavam � direita do mago, mas na volta"
                    + "\nquando ele estava no sentido contr�rio, as �rvores podiam ser vista � esquerda\n",TimeUnit.MILLISECONDS, temp_dialog);
            
            /*FIM CAP ||*/
            
            
            /*FIM CAP ||*/
            

		//FIM CAP II

		Digita("Capítulo III - A primeira pista\n",TimeUnit.MILLISECONDS, temp_dialog);//Início Cap III


		System.out.println("\nCom isso o xerife percebe que não conseguiria solucionar este crime sem um profissional especializado no ramo da investigação.\r\n"
				+ "Então ele chamou um detetive para ajudá-lo a solucionar esse crime. Ao entrarem mais fundo no templo, o detetive logo encontrou a primeira pista,\r\n"
				+ "um tufo de pelos foi encontrado caído no templo, como na ilha habita diversas criaturas diferentes, não foi possível identificar de quem era esse pelo.\r\n"
				+ "Imediatamente o xerife propôs uma assembléia e convocou todos os clãs para debaterem de quem era o pelo e achar o culpado.\r\n"
				+ "O pelo era amarronzado, com uma textura sedosa, bem liso. A assembléia começou, todos os clãs estavam reunidos, separados por grupos para melhor análise,\r\n"
				+ "o xerife e detetive, foram passando de grupo em grupo, para compararem o pelo.\r\n");

		Digita("\nDe quem era o pelo?\n",TimeUnit.MILLISECONDS, temp_dialog);

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

			System.out.println("\nSelecione a sequência equivalente:\n");

			System.out.println(" <A>" + emb.get(0)+"\n");//Opções com embaralhar a ordem.
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



			}
			Digita("Capítulo IV - O Álibi\n",TimeUnit.MILLISECONDS, temp_dialog);//Início Cap IV

			String escolhaCap4;
			String alternativa1Cap4 = "Bosque do Anseio";
			String alternativa2Cap4 = "Bosque do café";
			String alternativa3Cap4 = "Bosque da Casa";
			String alternativa4Cap4 = "Bosque do chá";
			String alternativa5Cap4 = "Bosque do chalé";
			List<String> urna1 = Arrays.asList(alternativa1Cap4, alternativa2Cap4, alternativa3Cap4, alternativa4Cap4, alternativa5Cap4);
			Collections.shuffle(urna1);
			System.out.println("A assembleia havia começado, o clima estava muito tenso em Mystic Valley,\n"
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
				System.out.println("Enquanto o jovem bruxo seguia as pegadas ele percebeu que algumas delas estavam um pouco apagadas"
						+ " e teria que caminhar um pouco mais até encontrar a próxima. Caminhando ele passou por três bosques :\n");
				System.out.println("1) Bosque do Chá");
				System.out.println("2) Bosque do Chalé");
				System.out.println("3) Bosque do Japeri");
				System.out.println(" \n"
						+ "Em um determinado ponto da sua caminhada ele tinha que escolher um caminho para continuar seguindo as pegadas,"
						+ "pela lógica qual o próximo caminho ele deveria escolher :");
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
		Digita("\n Capítulo V  - O monte mais alto da Ilha \n",TimeUnit.MILLISECONDS, temp_dialog);//Início Cap V

		String escolhaCap4;
		String alternativa1Cap4 = "Bosque do Anseio";
		String alternativa2Cap4 = "Bosque do café";
		String alternativa3Cap4 = "Bosque da Casa";
		String alternativa4Cap4 = "Bosque do chá";
		String alternativa5Cap4 = "Bosque do chalé";
		List<String> urna2 = Arrays.asList(alternativa1Cap4, alternativa2Cap4, alternativa3Cap4, alternativa4Cap4, alternativa5Cap4);
		Collections.shuffle(urna2);
		Digita("Após os últimos acontecimentos o jovem bruxo (detetive) e o xerife pareciam já não caminhar na mesma direção. \n"
				+ " Enquanto o Jovem bruxo (detetive) continuava acreditando na inocência do clã dos centauros,\n"
				+ " o xerife não aceitava que qualquer outro clã pudesse ter cometido um crime que abalou tanto a confiança de toda a Ilha.\n"
				+ " (e todos nós sabemos que após a confiança ser perdida, uma guerra está próxima).\r\n"
				+ "\n\n"
				+ "Incomodado com o sentimento de desconfiança do Xerife, o Jovem bruxo (detetive) começou a pensar : "
				+ "\n- “Eu preciso encontrar o culpado o mais rápido possível para mostrar ao xerife que eu estou certo!”\n "
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
				+ "“Isso são mais pegadas?” disse alto, assustado.\r\n"
				+ "“Mas elas são muito gran…. Só pode ser de um membro do clã dos pés grandes” complementando. \r\n"
				+ "\n",TimeUnit.MILLISECONDS, temp_dialog);
		
		do {
			System.out.println("Enquanto o jovem bruxo seguia as pegadas ele percebeu que algumas delas estavam um pouco apagadas"
					+ " e teria que caminhar um pouco mais até encontrar a próxima. Caminhando ele passou por três bosques :\n");
			System.out.println("1) Bosque do Chá");
			System.out.println("2) Bosque do Chalé");
			System.out.println("3) Bosque do Japeri");
			System.out.println(" \n"
					+ "Em um determinado ponto da sua caminhada ele tinha que escolher um caminho para continuar seguindo as pegadas,"
					+ "pela lógica qual o próximo caminho ele deveria escolher :");
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
				+ "Seguindo as pegadas, o jovem bruxo de longe avista um casebre abandonado no meio da mata…\r\n"
				+ "\n" ,TimeUnit.MILLISECONDS, temp_dialog);
	}

	}
	


