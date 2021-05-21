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
        static void capitulo2() throws Exception{
        Scanner entrada = new Scanner(System.in);
        String escolhacaminho,caminhoalternativo = "Tentar resolver sozinho.", 
                caminhocerto = "Pedir ajuda a um jovem bruxo que est� a observar.",
                escolhacap2,enigcap2 = "10";
        
        System.out.println("Cap�tulo II  - O roubo\n\n");
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
            }
}



