import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;


public class play {

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
			System.out.println("2- Instruções ");
			System.out.println("3- Sinopse");
			System.out.println("4- Créditos ");
			System.out.println("5- Sair ");
			System.out.print("Escolha uma opção: \n");
			escolha = entrada.nextInt();

			switch (escolha) {

			case 1:
				break;
			case 2:
				System.out.println("\nVocê escolheu a opção Intruções:");
				System.out.printf("\n");
				System.out.println("O jogo Mystic Valley é um jogo de multipla escolha, em que suas escolhas influenciam diretamente o jogo,"
						+ "\npodendo mudar os caminhos e a história, o intuito dessas escolhas sÃo praticar a sua lógica,"
						+ "\nesperamos que você se divirta e que aumente a sua lógica !");
				break;
			case 4:
				System.out.println("\nVocê escolheu a opção Créditos:\n");
				System.out.println("Giovana Simões");
				System.out.println("Guilherme Profirio");
				System.out.println("Laleska Fernandes");
				System.out.println("Leonardo Messias");
				System.out.println("Thalles Negreiro");// nome de cada integrante
				break;
			case 3:
				System.out.println("\nVocê escolheu a opção Sinopse:\n");
				System.out.println("Em uma ilha muito distante, existe uma vila chamada Mystic Valley. "
						+ "\nEm uma noite de comemorações acontece um roubo onde o item mais raro de toda ilha é levado,"
						+ "\nentão um detetive com seus poderes sobrenaturais se dispõe a encontrar o culpado."
						+ "\nNessa aventura vocês desvendarão esse mistério que intriga os moradores de Mystic Valley.");
				break;
			case 5:
				System.err.println("\nVocê saiu !");
				break;
			default:
				System.out.println("\nOpção inválida !!!");
				break;

			}
		} while (!(escolha == 5 || escolha == 1));

		if (escolha == 1) {
			System.out.println("\nVocê escolheu a opção Jogar:");
			//continuar o código aqui 
			System.out.printf("\n");
			Digita("Capítulo  I - Potion of immortality\n",TimeUnit.MILLISECONDS, temp_dialog);
			Digita ("\nNo meio de um oceano tão tão distante existe uma ilha misteriosa, quase tão grande quanto um país, "
					+ "\nnessa ilha existe vilarejo chamado Mystic Valley "
					+"\nonde habita diversas criaturas mágicas de todas as espécies,"
					+"\nque são separadas por clãs. O clãs dos bruxos é um dos mais poderosos de toda ilha,"
					+"\npois eles possuem conhecimentos antigos, fórmulas e poções mágicas,"
					+"\numa dessas poções talvez a mais rara e cobiçada de toda ilha, a potion of immortality,"
					+"\nonde o mito diz: Aquele que a consumir nunca morrerá.",TimeUnit.MILLISECONDS, temp_dialog);

			Digita("\n\nTodos os forasteiros de todos os cantos do mundo são atraídos por essa ideia,"
					+"\ncom a cobiça de a possui-la para si próprio, "
					+"\nmas ao chegarem nas margens da ilha apenas aqueles seres mágicos ou aqueles que provarem seu valor poderam adentrar-la,"
					+"\natravés de um enigma implantado por mágia......",TimeUnit.MILLISECONDS, temp_dialog);
			System.out.printf("\n");

			do {
				Digita("Em um jardim:\n "
						+"\n-Todas as flores, menos duas são rosas "
						+"\n-Todas as flores, menos duas são margaridas"
						+"\n-Todas as flores, menos duas são orquídeas.\n",TimeUnit.MILLISECONDS, temp_quest);

				Digita("\nQuantas flores há no jardim?\n"// desafio 1
						+"\nA) " + urna.get(0)
						+"\nB) " + urna.get(1)
						+"\nC) " + urna.get(2)
						+"\nD) " + urna.get(3)
						+"\nE) " + urna.get(4),TimeUnit.MILLISECONDS, temp_quest);
				System.out.print(":");
				resposta = entrada.next();
				switch (resposta.toUpperCase()) {
				case "A":
					if (urna.get(0).equals(alternativa1)) {
						resposta = alternativa1;
					} else {
						System.err.println("Alternativa incorreta!");
					}
					break;
				case "B":
					if (urna.get(1).equals(alternativa1)) {
						resposta = alternativa1;
					} else {
						System.err.println("Alternativa incorreta!");
					}
					break;
				case "C":
					if (urna.get(2).equals(alternativa1)) {
						resposta = alternativa1;
					} else {
						System.err.println("Alternativa incorreta!");
					}
					break;
				case "D":
					if (urna.get(3).equals(alternativa1)) {
						resposta = alternativa1;
					} else {
						System.err.println("Alternativa incorreta!");
					}
					break;
				case "E":
					if (urna.get(4).equals(alternativa1)) {
						resposta = alternativa1;
					} else {
						System.err.println("Alternativa incorreta!");
					}
					break;
				}

			} while ((!(resposta.equalsIgnoreCase(alternativa1))));
			Digita("\nParabéns !!!! Você entrou na ilha, aqui começa a sua história....."
					+"\nBOA SORTE!!",TimeUnit.MILLISECONDS, temp_dialog);// final capitulo 1

		String escolhacaminho,caminhoalternativo = "Tentar resolver sozinho.", 
				caminhocerto = "Pedir ajuda a um jovem bruxo que está a observar.",
				escolhacap2,enigcap2 = "10";

		System.out.println("\n\nCapítulo II  - O roubo\n");
		Digita("Em uma noite de comemorações onde todos os clãs estavam reunidos no grande salão, o alarme do clã dos bruxos "
				+ "\necoa por todos os cantos da cidade, mostrando assim que algo muito ruim havia acontecido. Rapidamente todos "
				+ "\ndaquela festa se apavoram e procuram pelo xerife da cidade que foi incumbido a preservar a ordem de toda vila. "
				+ "\nO xerife diz – “Reúna todos meus homens em frente à delegacia imediatamente!”\n\n",TimeUnit.MILLISECONDS, temp_dialog);
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
				+ "\nO xerife diz – “Vamos nos separar e descobrir o que foi levado dos bruxos, a partir de agora ninguém entra "
				+ "ou sai desta ilha”."
				+ "\nAo chegarem na região dos bruxos, logo descobrem que o item levado foi o mais valioso de toda ilha, o templo"
				+ "\nonde estava guardada por muitos anos havia sido violado por um usurpador, mas para qualquer ser que desejasse "
				+ "\nadentra-la, precisaria primeiro decifrar o enigma escrito em língua de bruxo logo acima do portão de entrada.\n"
				,TimeUnit.MILLISECONDS, temp_dialog);

		do{

			List <String> list = Arrays.asList("Pedir ajuda a um jovem bruxo que está a observar."
					,"Tentar resolver sozinho.","Invadir com força bruta, mas sabendo que há um feitiço de proteção.");
			Collections.shuffle(list);

			Digita("\nVocê tem algumas opções para resolução deste enigma:\n"
					+ "\n1 – " + list.get(0)
					+ "\n2 – " + list.get(1)
					+ "\n3 – " + list.get(2)
					+ "\n\nIndique qual caminho deseja seguir em número:\n",TimeUnit.MILLISECONDS, temp_dialog);
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
				System.err.println("Opção invalida!"
						+ "\nTente novamente.");
			}
		}while ((!(escolhacaminho.equals(caminhocerto))));

		Digita("\nCom a ajuda do jovem bruxo a placa foi traduzida, para que enfim o xerife consiga prosseguir com a sua investigação" 
				+ "\nrevelando assim um novo desafio que diz:\n",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("\nNo caminho de casa até o templo, um mago conta 10 árvores a sua direita. Após ida ao templo, ele retorna para casa e conta"
				+ "\n10 árvores a sua esquerda.\n",TimeUnit.MILLISECONDS, temp_dialog);

		do{
			List<String> list = Arrays.asList("20","15","10","30","25");
			Collections.shuffle(list);

			Digita("\nQuantas árvores ele viu no total nesse dia?\n"
					+ "\nA) " + list.get(0)
					+ "\nB) " + list.get(1)
					+ "\nC) " + list.get(2)
					+ "\nD) " + list.get(3)
					+ "\nE) " + list.get(4)
					+ "\n\nQual é a Alternativa Correta:",TimeUnit.MILLISECONDS, temp_dialog);
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
					System.err.println("\nAlternativa Incorreta!");
				}
				break;
			default:
				if(escolhacap2.equals(enigcap2)){
					escolhacap2 = enigcap2;
				}
				else if(!(escolhacap2.equals(enigcap2))){
					System.err.println("\nAlternativa Incorreta!");
				}else{
					System.err.println("Opção inválida!");  
				}




			}
		}while((!(escolhacap2.equalsIgnoreCase(enigcap2))));
		Digita("\n\nAlternativa correta! Você conseguiu desfazer o feitiço de proteção!"
				+ "\n\nPois, são as mesmas 10 árvores vistas de diferente perspectivas.Na ida, árvores estavam á direita do mago, "
				+ "\nmas na volta quando ele estava no sentido contrário, as árvores podiam ser vista á esquerda\n",TimeUnit.MILLISECONDS, temp_dialog);

		//FIM CAP II

		System.out.println("\n\nCapítulo III - A primeira pista\n");//Início Cap III


		Digita("\nCom isso o xerife percebe que não conseguiria solucionar este crime sem um profissional especializado no ramo da investigação."
				+ "\nEntão ele chamou um detetive para ajudá-lo a solucionar esse crime. Ao entrarem mais fundo no templo, o detetive logo encontrou"
				+ "\na primeira pista, um tufo de pelos foi encontrado caído no templo, como na ilha habita diversas criaturas diferentes, não foi "
				+ "\npossível identificar de quem era esse pelo. Imediatamente o xerife propôs uma assembléia e convocou todos os clãs para debaterem "
				+ "\nde quem era o pelo e achar o culpado.O pelo era amarronzado, com uma textura sedosa, bem liso. A assembléia começou, todos os clãs "
				+ "\nestavam reunidos, separados por grupos para melhor análise, o xerife e detetive, foram passando de grupo em grupo, para compararem o pelo.\r\n"

		+"\nDe quem era o pelo?\n",TimeUnit.MILLISECONDS, temp_dialog);

		System.out.println("\nAo comparar o pelo, surge o seguinte desafio:\r\n \n"
				+ "		\nDecifre o código para descobrir quem é o dono do pelo: \r\n \n"
				+ "Ω = 5   | ᄿᴥᄽ= 2  |  ㉧▼㉧ = 3  | ȣ = 1  |<(º) = 6 | ๋: = 9| ◤-.-◥ = 4 | ♞ = 7 | ϟ = 8 | 傘 =9\r\n"
				+ "♨=10 | ✩ = 11 | ಜ=12 | �? = 13 | ʚĭɞ = 14 | ◑ = 15 | ☪ = 16 | ☀ = 17 | ☘ = 18 | ლ = 19\r\n"
				+ "⌘ = 20 | �?� = 21 \n ");

		Digita("\n㉧▼㉧  |  ( (♨ - ◤-.-◥) - ȣ )  |  ʚĭɞ  | ⌘ |  ȣ |  ((✩ + ლ) - ๋:) |  ☘ |  ( ♨+Ω) \n",TimeUnit.MILLISECONDS, temp_dialog);

		String operacao,certo = " 3 | 5 | 14 | 20 | 1 | 21 | 18 | 15 ";//Resposta certa do desafio.

		 System.out.println("\nPara te ajudar, use calculadora: \n" );

		String calculadora;//Variável para ver se o jogador quer utilizar dnv a calculadora.
		do {
			int op = menu();//Chama a função menu, que dará as opções da calculadora.
			float n1 = entradaDados();//Chama a função que pede ao jogador o primeiro dado.
			float n2 = entradaDados();//Chama a função que pede ao jogador o segundo dado.
			float result = controlador(op,n1,n2);//Chama a função que faz a operação.
			//System.out.println("\n\nPrecisa utilizar novamente? ");
			calculadora = entrada.nextLine().toUpperCase();//Recebe o que o jogador digitou e deixa tudo em Maiúsculo.

		}while(calculadora.equalsIgnoreCase("SIM"));
		do {

			List <String> emb = Arrays.asList (" 4 | 6 | 15 | 21 | 2 | 22 | 19 | 16 " ,  " 3 | 4 | 13 | 19 | 1 | 20 | 17 | 14 " , " 3 | 5 | 14 | 21 | 1 | 21 | 17 | 15 " ,  " 6 | 5 | 19 | 10 | 4 | 21 | 15 | 18 ", " 3 | 5 | 14 | 20 | 1 | 21 | 18 | 15 ");

			Collections.shuffle(emb);//Embaralha.

			Digita("\n\n       *Quais valores foram encontrados?*        \n ",TimeUnit.MILLISECONDS, temp_dialog);

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
					System.err.println("Resposta incorreta! Tente novamente...\n ");

				}break;

			case "B":
				if (emb.get(1).equals(certo)){
					operacao = certo;		
				}else {
					System.err.println("Resposta incorreta! Tente novamente...\n ");

				}break;


			case "C":
				if (emb.get(2).equals(certo)){
					operacao = certo;
				}else {
					System.err.println("Resposta incorreta! Tente novamente...\n ");

				}break;

			case "D":
				if (emb.get(3).equals(certo)){
					operacao = certo;
				}else {
					System.err.println("Resposta incorreta! Tente novamente...\n ");

				}break;

			case "E":
				if (emb.get(4).equals(certo)){
					operacao = certo;
				}else {
					System.err.println("Resposta incorreta! Tente novamente...\n ");

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
				String alternativa1Cap4 = "Centauro";
				String alternativa2Cap4 = "Humano";
				String alternativa3Cap4 = "Minotauro";
				String alternativa4Cap4 = "Caminho sem pegadas";
				String alternativa5Cap4 = "Pés Grandes";
				String escolhaCap4;
				List<String> urna4 = Arrays.asList(alternativa1Cap4, alternativa2Cap4, alternativa3Cap4, alternativa4Cap4, alternativa5Cap4);
				Collections.shuffle(urna4);
				Digita("A assembleia havia começado, o clima estava muito tenso em Mystic Valley, logo de cara muitos clãs junto com o próprio xerife,"
						+ "\nacusaram o clã dos centauros, por conta do pelo ser da mesma cor e da mesma textura, quando o clã dos centauros estavam prestes\n"
						+ "\na serem condenados, o jovem bruxo detetive que o xerife havia pedido ajuda, chega na assembleia e diz:\n"
						+ "\nBruxo:  - “Não foram os centauros, eu estive durante a semana toda e estive na noite do roubo, junto com o clã dos centauros,"
						+ "\neu acredito que quem roubou, colocou os pelos de centauros, para incriminá-los”. \n"
						+ "\nTodos na assembleia ficam pensativos, e decidem concordar com o jovem bruxo, menos o xerife, que ainda tem suas ressalvas com aquela clã,"
						+ "\ndevido a confusões em que ele já se envolveu antes com o clã de centauros, e então o jovem bruxo e o xerife saem para ir atrás do verdadeiro"
						+ "\nculpado. E então o jovem bruxo começa os interrogatórios por toda Mystic Valley, enquanto o xerife parece estar bem incomodado com as atitudes "
						+ "\ndo bruxo, o xerife então vai à cena do roubo sozinho.O bruxo então decide ir atrás do xerife discretamente .\n",TimeUnit.MILLISECONDS, temp_dialog);
				
				do {
					Digita("\nApós pouco mais de 3 minutos de perseguição o bruxo  perdeu o xerife de vista,\n"
							+ "detetive foi tentar achar vestígios do caminho dele. Ele achou um 4 caminhos com pegadas diferentes,"
							+ "\no primeiro caminho era pegadas de centauros, o segundo caminho era pegadas de humano, terceiro caminho"
							+ "\nera pegadas de minotauros e o quarto caminho pegadas de pés grandes.\n"
							+ "\nQual o caminho certo a seguir ?\n",TimeUnit.MILLISECONDS, temp_dialog);
					Digita("\nA) " + urna4.get(0)
					+"\nB) " + urna4.get(1)
					+"\nC) " + urna4.get(2)
					+"\nD) " + urna4.get(3)
					+"\nE) " + urna4.get(4)
					+":",TimeUnit.MILLISECONDS, temp_quest);
					escolhaCap4 = entrada.next();
					switch (escolhaCap4.toUpperCase()) {
					case "A":
						if (urna4.get(0).equals(alternativa2Cap4)) {
							escolhaCap4 = alternativa2Cap4;
						} else {
							System.err.println("\nAlternativa Incorreta!");
						}
						break;
					case "B":
						if (urna4.get(1).equals(alternativa2Cap4)) {
							escolhaCap4 = alternativa2Cap4;
						} else {
							System.err.println("\nAlternativa Incorreta!");
						}
						break;
					case "C":
						if (urna4.get(2).equals(alternativa2Cap4)) {
							escolhaCap4 = alternativa2Cap4;
						} else {
							System.err.println("\nAlternativa Incorreta!");
						}
						break;
					case "D":
						if (urna4.get(3).equals(alternativa2Cap4)) {
							escolhaCap4 = alternativa2Cap4;
						} else {
							System.err.println("\nAlternativa Incorreta!");
						}
						break;
					case "E":
						if (urna4.get(4).equals(alternativa2Cap4)) {
							escolhaCap4 = alternativa2Cap4;
						} else {
							System.err.println("\nAlternativa Incorreta!");
						}
						break;
					}
				} while ((!(escolhaCap4.equalsIgnoreCase(alternativa2Cap4))));
				Digita("\nAlternativa Correta!!",TimeUnit.MILLISECONDS, temp_dialog);
			}//Fim Cap 4

		}

		System.out.println("\n\nCapítulo V  - O monte mais alto da Ilha \n");//Início Cap V


		String answer;
		String option1 = "Bosque do Anseio";
		String option2 = "Bosque do Café";
		String option3 = "Bosque da Casa";
		String option4 = "Bosque do Chá";
		String option5 = "Bosque do Chalé";
		List<String> casket = Arrays.asList(option1, option2, option3, option4, option5);
		Collections.shuffle(casket);

		Digita("Após os últimos acontecimentos o jovem bruxo (detetive) e o xerife pareciam já não caminhar na mesma direção. \n"
				+ "Enquanto o Jovem bruxo (detetive) continuava acreditando na inocência do clã dos centauros,\n"
				+ "o xerife não aceitava que qualquer outro clã pudesse ter cometido um crime que abalou tanto a confiança de toda a Ilha.\n"
				+ "(e todos nós sabemos que após a confiança ser perdida, uma guerra está próxima).\r\n"
				+ "Incomodado com o sentimento de desconfiança do Xerife, o Jovem bruxo (detetive) começou a pensar : \n"
				+ "\n-“Eu preciso encontrar o culpado o mais rápido possível para mostrar ao xerife que eu estou certo!“\n "
				+ "\nDisse ele caminhando até o monte mais alto da Ilha, onde ele pudesse ver tudo de cima. \r\n"
				+ "De Repente o jovem bruxo (detetive) que caminhava cabisbaixo começou a perceber algo diferente no chão\n\n",TimeUnit.MILLISECONDS, temp_dialog);

		Digita("  oOOO()\r\n"
				+ " /  _)\r\n"
				+ " |  (\r\n"
				+ " \\__)  ()OOOo\r\n"
				+ "        (_  \\\r\n"
				+ "         )  |\r\n"
				+ " oOOO()  (__/\r\n"
				+ " /  _)\r\n"
				+ " |  (\r\n"
				+ " \\__)  ()OOOo\r\n"
				+ "        (_  \\\r\n"
				+ "         )  |\r\n"
				+ " oOOO()  (__/\r\n"
				+ " /  _)\r\n"
				+ " |  (\r\n"
				+ " \\__)  ()OOOo\r\n"
				+ "        (_  \\\r\n"
				+ "         )  |\r\n"
				+ " oOOO()  (__/\r\n"
				+ " /  _)\r\n"
				+ " |  (\r\n"
				+ " \\__)  ()OOOo\r\n"
				+ "        (_  \\\r\n"
				+ "         )  |\r\n"
				+ "        (__/ \n"
		
				+ "\n \n"
				+ "“Isso são mais pegadas?? Disse alto, assustado.\r\n"
				+ "“Mas elas são muito gran…. Só pode ser de um membro do clã dos pés grandes? Complementando.“\n",TimeUnit.MILLISECONDS, temp_dialog);

		do {
			Digita("\nEnquanto o jovem bruxo seguia as pegadas ele percebeu que algumas delas estavam um pouco apagadas\n"
					+ "e teria que caminhar um pouco mais até encontrar a próxima. Caminhando ele passou por três bosques :\n",TimeUnit.MILLISECONDS, temp_dialog);
			Digita("\n1) Bosque do Chá",TimeUnit.MILLISECONDS, temp_dialog);
			Digita("\n2) Bosque do Chalé",TimeUnit.MILLISECONDS, temp_dialog);
			Digita("\n3) Bosque do Japeri",TimeUnit.MILLISECONDS, temp_dialog);
			Digita(" \n"
					+ "\nEm um determinado ponto da sua caminhada ele tinha que escolher um caminho para continuar seguindo as pegadas,"
					+ "\npela lógica qual o próximo caminho ele deveria escolher :\n",TimeUnit.MILLISECONDS, temp_dialog);
			Digita("\nA) " + casket.get(0)
			+"\nB) " +casket.get(1)
			+"\nC) " + casket.get(2)
			+"\nD) " + casket.get(3)
			+"\nE) " + casket.get(4)
			+":",TimeUnit.MILLISECONDS, temp_quest);
			answer = entrada.next();
			switch (answer.toUpperCase()) {
			case "A":
				if (casket.get(0).equals(option1)) {
					answer= option1;
				} else {
					System.err.println("\nAlternativa Incorreta!");
				}
				break;
			case "B":
				if (casket.get(1).equals(option1)) {
					answer = option1;
				} else {
					System.err.println("\nAlternativa Incorreta!");
				}
				break;
			case "C":
				if (casket.get(2).equals(option1)) {
					answer = option1;
				} else {
					System.err.println("\nAlternativa Incorreta!");
				}
				break;
			case "D":
				if (casket.get(3).equals(option1)) {
					answer = option1;
				} else {
					System.err.println("\nAlternativa Incorreta!");
				}
				break;
			case "E":
				if (casket.get(4).equals(option1)) {
					answer = option1;
				} else {
					System.err.println("\nAlternativa Incorreta!");
				}
				break;
			}
		} while ((!(answer.equalsIgnoreCase(option1))));
		Digita("\nMuito bem!! Parece que esta no caminho certo,Seguindo as pegadas, o jovem bruxo de longe avista um "
				+ "\ncasebre abandonado no meio da mata…\r\n"
				+ "\n",TimeUnit.MILLISECONDS, temp_dialog);
		
		System.out.println("Capítulo VI - O Culpado\n");

		String opc1 = "CULPAR O CLA DOS LOBISOMENS";

		String opc2 = "ABANDONAR O CASO";

		String opc3 = "TOMAR MEDIDAS MAIS RIGIDAS";

		String opc4 = "CULPAR O XERIFE PELO ROUBO";

		String opc5 = "CULPA O CLA DOS CENTAUROS";

		List<String> urna3 = Arrays.asList(opc1, opc2, opc3, opc4, opc5);
		Collections.shuffle(urna3);

		Digita ("O jovem bruxo estava muito tenso e pensativo sobre o que iria achar no casebre,\n"
				+ "chegando no casebre o bruxo sentia um forte odor que estava o deixando tonto porém isso\n"
				+ "não o impediu de continuar a investigação no casebre, até que ele encontrou uma estranha\n"
				+ "porta azul com um símbolo estranho, ele foi se aproximando cada vez mais da porta e cada\n "
				+ "vez mais ele sentia um formigamento em suas pernas, quando o bruxo abriu a porta ele encontrou\n"
				+ "o motivo do forte odor.\n" 
				+"Era um corpo de um membro do clã dos Pés grandes, logo o bruxo falou :\n" 
				+"“Um assassinato nessa ilha ?? Estranho”\n" 
				+"O bruxo foi investigando mais a estranha sala até que encontrou registros de túneis antigos\n"
				+ "e secretos que havia  no grande salão, logo o bruxo ja relacionou o assassinato com o grande\n"
				+ "roubo, invsetigando mais a fundo a sala achou algo muito estranho e familiar, era o distintivo\n"
				+ "do xerife da ilha, o bruxo ficou pensativo e muito assustado, começou a criar teorias em sua cabeça.\n"
				+ "Mas será que o xerife seria capaz de trair a todos na ilha ?\n" 
				+ "O bruxo foi até o gabinete do xerife para lhe fazer perguntas, porém ele foi cauteloso, o bruxo\n"
				+ "fez a primeira pergunta:\n\n"
				+ "-Eu estava aqui pensando… O clã dos Pés grandes tem um histórico de crimes aqui na ilha ? “\n"
				+ "-“Não, desde que eu comecei nesse cargo aqui na ilha nunca tive problemas com eles, mas são\n"
				+ "muito ambiciosos, querem ser os melhores em tudo, até em poder... .” disse o xerife \n" 
				+"-“ E os lobisomens? Já teve algum problema com eles ? “ disse logo em seguida o xerife.\n" 
				+"-“ Problemas sempre tive, em noite de lua cheia fazem coisas sem pensar e ficam muito agressivos. ”\n" 
				+"-“ Hmmm entendo, E o senhor sabe de algum casebre antigo no monte ??\n" 
				+"Xerife respirou…. pensou… e respondeu : “Não, fui poucas vezes ao monte e nunca vi nada alem de fadas,\n"
				+ "árvores e gnomos.”\n" 
				+"O bruxo começou a suspeitar que o xerife estaria mentindo, ele estava agindo de uma forma diferente\n"
				+"do normal, estava suando, nervoso e apreensivo.\n "
				+"Então fez a principal pergunta em tom mais alto e firme: \n" 
				+"-“ Xerife, você poderia mostrar o seu distintivo por favor!”\n" 
				+"-“ Aonde você está querendo chegar com isso BRUXO??” disse o xerife.\n" 
				+"-“ Por favor, mostre !” disse o bruxo em tom grosseiro.\n" 
				+"-“ Eu o perdi, a uma semana mais ou menos” disse o xerife\n" 
				+"-“ AH, então você perdeu, tudo bem ! Reúna todos os clãs no grande salão em 10 minutos, já sei quem\n"
				+"é o verdadeiro culpado.” disse o bruxo, e em seguida saiu do gabinete.\n" 
				+"O bruxo estava nervoso, nunca teve um caso tão complicado para solucionar, ele estava em dúvida por\n"
				+"dentro se estava fazendo o certo, se estava no caminho certo ou não, se o culpado era o xerife,\n"
				+"se era os minotauros ou nenhum desses.",TimeUnit.MILLISECONDS, temp_dialog);


		Digita("\n\nO destino da ilha está nas suas mãos!!\n"
				+"\nQual decisão você irá tomar????\n"
				+"\nA) " + urna3.get(0)
				+"\nB) " + urna3.get(1)
				+"\nC) " + urna3.get(2)
				+"\nD) " + urna3.get(3)
				+"\nE) " + urna3.get(4),TimeUnit.MILLISECONDS, temp_dialog);

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

	static void Digita(String mensagem, TimeUnit unit, long tempo_mensagem) throws InterruptedException {
		for (char caractere : mensagem.toCharArray()) {
			System.out.print(caractere);
			unit.sleep(tempo_mensagem);
		}
	}
	static int temp_dialog = 12, temp_narrativa = 150, temp_quest = 10;

	static Scanner entrada = new Scanner(System.in);//Scanner global.
	static void opc4()throws Exception {
		Digita("\n“Boa noite a todos, reuni vocês para anunciar o culpado do roubo do artefato,\n"
				+ "nossa primeira pista como todos sabem foi um pelo achado dos minotauros,\n"
				+ "nunca descartamos eles como suspeitos, porem para ter uma visao melhor da ilha estava indo ao monte mais alto,\n"
				+ "no caminho achei pegadas para um casebre antigo,\n"
				+ "la dentro havia registros de tuneis secretos do grande salao que o ladrão usou para roubar o artefato,\n"
				+ "e tambem achei um corpo de um pé grande”\n"
				+ "todos ficaram chocados e absmados, é raro haver um assassinato na ilha, continuou o detetive…\n"
				+ "“e tambem a pista principal para solucionar o caso,\n"
				+ "o que aconteceu foi que inicialmente um membro dos pés grandes junto com o xerife estavam planejando o roubo,\n"
				+ "depois que terminaram de planejar o xerife assassinou o pé grande por segurança,\n"
				+ "depois de roubar o artefato tentou incriminar os minotauros para nao ser pego”\n"
				+ "e complementou mostrando o distintivo do xerife. O xerife ficou com uma cara assustada,\n"
				+ "continuou o detetive...  “ Dito tudo isso, minha conclusão final é que o próprio xerife de vocês é o grande responsável por esse roubo!! ” \n"
				+ "Guardas de imediato foram e prenderam o xerife na pior sela de  Mystic Valley,\n"
				+ "a sela do subsolo, dias depois o artefato foi encontrado e protegido com a melhor segurança possível. \n"
				+ "A cidade ficou em choque com o acontecido, mas mesmo com tudo isso a paz voltará a prosperar e todos na ilha continuarão protegidos e felizes.\n",TimeUnit.MILLISECONDS, temp_dialog);
		Digita("\nParabéns!! Você conclui a história do jogo e solucionou o mistério que intrigava os moradores de Mystic Valley!! \n\n\n",TimeUnit.MILLISECONDS, temp_dialog);
		System.out.println("    |@@@@|     |####|\r\n"
				+ "    |@@@@|     |####|\r\n"
				+ "    |@@@@|     |####|\r\n"
				+ "    \\@@@@|     |####/\r\n"
				+ "     \\@@@|     |###/\r\n"
				+ "       `@@|___|##'\r\n"
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

	static void opc1() throws Exception{
		Digita("“Boa noite a todos, reuni vocês para anunciar o culpado do roubo do artefato,\n"
				+ "nossa primeira e única pista como todos sabem foi um pelo achado,\n "
				+ "nunca descartamos os lobisomens e os centauros  como suspeitos, fui atrás de mais pistas,\n"
				+ "tentei entender  melhor mas a minha conclusão sempre era a mesma,\n"
				+ "com a ajuda do xerife decidi que o culpado do roubo é o clã dos lobisomens !! ”\n"
				+ "completou o detetive dizendo “ e também achei um corpo em um casebre antigo, o corpo era do clã dos pés grandes,\n"
				+ "vou iniciar outra investigação para saber o que houve.”\n"
				+ "Todos ficaram em choque e com raiva ao mesmo tempo, com isso o clã dos lobisomens foram banidos da ilha para sempre,\n "
				+ "1 dia depois o xerife fugiu da ilha e o artefato nunca foi achado. \n\n"
				+ "O culpado era o XERIFE !! ",TimeUnit.MILLISECONDS, temp_dialog);
	}

	static void opc2() throws Exception{
		Digita(" “Boa noite a todos, reuni vocês para  anunciar que irei largar o caso,\n"
				+ " não há provas suficientes para incriminar e declarar alguém como culpado,\n"
				+ " foi um desafio enorme para mim e peço desculpas por não conseguir a recuperar o artefato,\n "
				+ "o xerife irá continuar com o processo da investigação, irei embora da ilha ao amanhecer.”\n"
				+ "Todos da ilha ficaram decepcionados e chateados com o bruxo, eles estavam muito confiantes nele.\n"
				+ "Após o bruxo deixar a ilha o xerife fugiu 1 dia depois e o artefato nunca foi achado.\n\n"
				+ "O culpado era o XERIFE !! ",TimeUnit.MILLISECONDS, temp_dialog);
	}

	static void opc3() throws Exception{
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
				+ "e única pista como todos sabem foi um pelo achado dos centauros, nunca descartamos"
				+ "ele como suspeitos, fui atrás de mais pistas, tentei entender o melhor mas a minha"
				+ "conclusão sempre era a mesma, com a ajuda do xerife decidi que o culpado do roubo"
				+ "é o clã dos centauros !! ” completou o detetive dizendo “ e também achei um corpo"
				+ "em um casebre antigo, o corpo era do clã dos pés grandes, vou iniciar outra"
				+ "investigação para saber o que houve.”\n"
				+ "Todos ficaram em choque e com raiva ao mesmo tempo, com isso o clã dos centauros foram"
				+ "banidos da ilha para sempre, 1 dia depois o xerife fugiu da ilha e o artefato nunca foi achado. \n\n"
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
}




