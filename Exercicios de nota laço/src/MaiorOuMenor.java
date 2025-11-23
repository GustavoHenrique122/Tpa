import java.util.Scanner;

public class MaiorOuMenor {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int i, maior,menor,idade;
		
		i = 1;
		maior = 0;
		menor = 0;
		
		while (i <= 5) {
		
		System.out.println("Insira a idade da " + i + "° pessoa");
		idade = in.nextInt();
		
		if (idade >= 18) {
			maior = maior + 1;
		}
		else {			
			menor = menor + 1;
		}
		i++;
		}
		System.out.println("O número de pessoas maiores de idade é: " + maior);
		System.out.println("O número de pessoas menores de idade é: " + menor);

		
	}

}