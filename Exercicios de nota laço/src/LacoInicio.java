import java.util.Scanner;

public class LacoInicio {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int i,n,t;
		
		i = 1;
		
		System.out.println("Escreva o número da tabuada que você quer calcular.");
		t = in.nextInt();
		
		while (i<=10) {
			
			n = i*t;
			
		System.out.println(t + " X " + i + " = " + n);
		i++;
		
		}
		
	}

}
