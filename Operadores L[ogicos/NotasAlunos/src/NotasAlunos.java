import java.util.Scanner;

public class NotasAlunos {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		Double n1, n2, nr, m, mr;
		
		System.out.println("Digite a primeira nota.");
		n1 = in.nextDouble();
		
		System.out.println("Digite a segunda nota.");
		n2 = in.nextDouble();
		
		m = ((n1+n2)/2);
		
		if (m<3) {
			System.out.println("Você está reprovado.");
		}
		else if (m>=3 & m<6) {
			System.out.println("O aluno tera que fazer um outro exame.");
			
			System.out.println("Digite a nota do novo exame.");
			nr = in.nextDouble();
			
			mr = ((n1+n2+nr)/3);
			
			if (mr>=6) {
				System.out.println("O aluno está aprovado.");
			}
			else {
				System.out.println("O aluno está aprovado.");
			}
		}
		else {
			System.out.println("O aluno está aprovado.");
			
		}
	}

}
