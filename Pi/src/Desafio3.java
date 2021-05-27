import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Desafio3 {

	public static void main(String[] args) {
		
		Scanner ent = new Scanner(System.in);
		
		System.out.println("Capítulo III - A primeira pista\n");
		System.out.println("Com isso o xerife percebe que não conseguiria solucionar este crime sem um profissional especializado no ramo da investigação. Então ele chamou um detetive para ajudá-lo a solucionar esse crime.\r\n"
				+ "Ao entrarem mais fundo no templo, o detetive logo encontrou a primeira pista, um tufo de pelos foi encontrado caído no templo, como na ilha habita diversas criaturas diferentes, não foi possível identificar de quem era esse pelo. Imediatamente o xerife propôs uma assembléia e convocou todos os clãs para debaterem de quem era o pelo e achar o culpado.\r\n"
				+ "O pelo era amarronzado, com uma textura sedosa, bem liso. A assembléia começou, todos os clãs estavam reunidos, separados por grupos para melhor análise, o xerife e detetive, foram passando de grupo em grupo, para compararem o pelo.\r\n \n"
				+ "De quem era o pelo?\r\n \n"
				+ "");
		
		System.out.println("Ao comparar o pelo, surge o seguinte desafio:\r\n \n"
				+ "		Decifre o código para descobrir quem é o dono do pelo: \r\n \n"
				+ "Ω = 5   | ᄿᴥᄽ= 2  |  ㉧▼㉧ = 3  | ȣ = 1  |<(º) = 6 | ●๋: = 9| ◤-.-◥ = 4 | ♞ = 7 | ϟ = 8 | 傘 =9\r\n"
				+ "♨=10 | ✩ = 11 | ಜ=12 | ஐ = 13 | ʚĭɞ = 14 | ◑ = 15 | ☪ = 16 | ☀ = 17 | ☘ = 18 | ლ = 19\r\n"
				+ "⌘ = 20 | ❃ = 21 \n");
		
		System.out.println("㉧▼㉧  |  ( (♨ - ◤-.-◥) - ȣ )  |  ʚĭɞ  | ⌘ |  ȣ |  ((✩ + ლ) - ●๋:) |  ☘ |  ( ♨+Ω)\r\n"
				+ "");
		
		String operacao,certo = " 3 |  5 |  14 | 20 | 1 | 21 | 18 | 15 ";
		int cont = 0;
		
		do {
		
		List <String> emb = Arrays.asList ("4 | 6 | 15 | 21 | 2 | 22 | 19 | 16" ,  "3 | 4 | 13 | 19 | 1 | 20 | 17 | 14 " , "3 | 5 | 14 | 21 | 1 | 21 | 17 | 15" ,  "6 | 5 | 19 | 6 | 4 | 3 | 15 | 18 ", "3 |  5 |  14 | 20 | 1 | 21 | 18 | 15");
		
		Collections.shuffle(emb);
		
		System.out.println("        *Quais valores foram encontrados?*         ");
		System.out.println("Selecione a sequência equivalente:\n ");

		System.out.println("<A>" + emb.get(0)+"\n");
		System.out.println("<B>" + emb.get(1)+"\n");
		System.out.println("<C>" + emb.get(2)+"\n");
		System.out.println("<D>" + emb.get(3)+"\n");
		System.out.println("<E>" + emb.get(4)+"\n");
		operacao = ent.next();
		
		switch(operacao.toUpperCase()) {
		
		case "A":
			if (emb.get(0).equals(certo)){
				operacao = certo;
			}else {
			System.out.println("Resposta incorreta!\n ");
			
		}break;
		
		case "B":
			if (emb.get(1).equals(certo)){
				operacao = certo;		
			}else {
			System.out.println("Resposta incorreta!\n ");
			
		}break;
		
		
		case "C":
			if (emb.get(2).equals(certo)){
				operacao = certo;
			}else {
			System.out.println("Resposta incorreta!\n ");
			
		}break;
		
		case "D":
			if (emb.get(3).equals(certo)){
				operacao = certo;
			}else {
			System.out.println("Resposta incorreta!\n ");
			
		}break;
		
		case "E":
			if (emb.get(4).equals(certo)){
				operacao = certo;
			}else {
			System.out.println("Resposta incorreta!\n ");
			
		}break;
			
			
		}cont++;
		
		}while(!(operacao.equalsIgnoreCase(certo)));{
			
			if(operacao.equalsIgnoreCase(certo)) {
				System.out.println("Resposta Correta!!);
			}else {
				System.out.println("Resposta incorreta nas 3 tentativas");
			}
	}

}
}
//COLOCAR CALCULADORA 
