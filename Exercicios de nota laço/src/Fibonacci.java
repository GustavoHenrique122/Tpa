import java.util.Scanner;

public class Fibonacci {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int p = 0, e = 1, n, i = 0, pr;
		
		System.out.println("Digite o número de termos");
		n = in.nextInt();
		
		do {
			System.out.print(p + " ");
			pr = p + e;
			p = e;
			e = pr;
			i++;
		} while (i<n);
		
	}

}
