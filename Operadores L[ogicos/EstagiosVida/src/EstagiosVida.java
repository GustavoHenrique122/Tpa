import java.util.Scanner;

public class EstagiosVida {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int dn, h, i;
		
		System.out.println("Digite o seu ano de seu nacimento.");
		dn = in.nextInt();
		
		System.out.println("Digite o ano em que estamos.");
		h = in.nextInt();
		
		i = (h-dn);
		
		if (i<10) {
			System.out.println("Você é uma criança.");
		}
		else if (i<18) {
			System.out.println("Você é um adolecente.");
		}
		else if (i<60) {
			System.out.println("Você é um adulto.");
		}
		else {
			System.out.println("Você é um idoso.");
		}
	}

}
