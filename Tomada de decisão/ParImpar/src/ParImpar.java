import java.util.Scanner;

public class ParImpar {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int nun;
		
		System.out.println("Digite o seu número.");
		nun = in.nextInt();
		
		if (nun % 2 == 0) {
			System.out.println("O número "+nun+" é par.");
		}
		else {
			System.out.println("O número "+nun+" é impar.");
		}
	}

}
