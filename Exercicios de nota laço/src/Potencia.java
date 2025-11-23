import java.util.Scanner;

public class Potencia {
	
	public static void main (String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int b, p, i;
		
		System.out.println("Apresente a base.");
		b = in.nextInt();
		
		System.out.println("Apresente a potencia.");
		p = in.nextInt();
		
		i=b;
		
		do {
			b = b*i;
			i++;
		} while (i<=p);
		
		System.out.println(b);
	}

}
