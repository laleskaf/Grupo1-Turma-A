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
    static int temp_dialog =48, temp_narrativa = 150, temp_transicao = 25;

	public static void main(String[] args) throws Exception{
        
    
		
		
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
        static void capitulo2() throws Exception{
        Scanner entrada = new Scanner(System.in);
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
            System.out.println("Teste");
            
            }
      
}



