import java.util.Scanner;

public class Salario {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		double s, IRPF, al, des;
		
		System.out.println("Digite seu salário.");
		s = in.nextDouble();
		
		if (s<=1434.59) {
			System.out.println("Sem nenhuma resução.");
		}
		else if (s<=2150) {
			des = (107.59);
			
			al = (7.5/100);
			
			IRPF = (s*al-des);
			
			System.out.println("Uma redução de "+IRPF+".");
		}
		else if (s<=2866.7) {
			des = (268.84);
			
			al = (15/100);
			
			IRPF = (s*al-des);
			
			System.out.println("Uma redução de "+IRPF+".");
		}
		else if (s<3582) {
			des = (483.84);
			
			al = (22.5/100);
			
			IRPF = (s*al-des);
			
			System.out.println("Uma redução de "+IRPF+".");
		}
		else if (s>=3582) {
			des = (662.94);
			
			al = (27.5/100);
			
			IRPF = (s*al-des);
			
			System.out.println("uma redução de "+IRPF+".");
		}
	}

}

