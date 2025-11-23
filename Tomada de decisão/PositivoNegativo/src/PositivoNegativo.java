import java.util.Scanner;

public class PositivoNegativo {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int nun;
		
		System.out.println("Digite um número inteiro.");
		nun = in.nextInt();
		
		if (nun<0) {
			System.out.println("O número "+nun+" é negativo.");
		}
		else if (nun == 0) {
			System.out.println("O número "+nun+" é neutro.");
		}
		else {
			System.out.println("O número "+nun+" é positivo.");
		}
	}

}
