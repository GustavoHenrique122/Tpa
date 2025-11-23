import java.util.Scanner;

public class Temperatura {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		double f, c;
		
		System.out.println("Digite a temperatura em fahrenheit.");
		f = in.nextDouble();
		
		c = 5/9*(f-32);
		
		System.out.println("Está "+c+"graus celsius.");
		
		if (c<0) {
			System.out.println("Está extremamente frio.");
		}
		else if (c<=10) {
			System.out.println("Está frio.");
		}
		else if (c<=20) {
			System.out.println("Está moderadamente frio.");
		}
		else if (c<=24) {
			System.out.println("Está ameno.");
		}
		else {
			System.out.println("Está calor.");
		}
	}

}
