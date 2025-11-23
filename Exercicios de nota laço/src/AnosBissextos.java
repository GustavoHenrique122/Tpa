import java.util.Scanner;

public class AnosBissextos {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int ai, af, ab, a;
		
		int i = 0;
		
	    System.out.println("Escreva os anos que você quer saber os anos bissextos.");
		
		System.out.println("Escreva o primeiro ano:");
		ai = in.nextInt();
		
		System.out.println("Escreva o ultimo ano:");
		af = in.nextInt();
		
		while (ai <= af){
			
			if (ai % 4 == 0 && ai % 100 != 0) {
				System.out.println(ai+" ");
				
				i++;
			}
			
			ai++;
			
		}
		
		System.out.println("Existem "+i+" anos.");
	}

}
