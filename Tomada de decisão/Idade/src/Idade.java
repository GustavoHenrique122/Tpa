import java.util.Scanner;

public class Idade {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int anoh, anon, idade;
		
		System.out.println("Digite o ano atual.");
		anoh = in.nextInt();
		
		System.out.println("Digite o seu ano de nacimento.");
		anon = in.nextInt();
		
		idade = (anoh-anon);
		
		System.out.println("Você tem "+idade+" anos de idade.");
		
		if (idade<18) {
			System.out.println("Você é menor de idade.");
		}
		else {
			System.out.println("Você é maior de idade.");
		}
	}
	
}
