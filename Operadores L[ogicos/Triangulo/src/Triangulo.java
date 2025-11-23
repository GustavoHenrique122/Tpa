  import java.util.Scanner;

public class Triangulo {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		double a, b, c;
		
		System.out.println("Digite o valor de A do triângulo.");
		a = in.nextDouble();
		
		System.out.println("Digite o valor B triângulo.");
		b = in.nextDouble();
		
		System.out.println("Digite o valor do triângulo.");
		c = in.nextDouble();
		
		if (a>b+c || b>a+c || c>a+b) {
		    System.out.println("Isto não se enquandra como um triângulo.");
		}
		else if (a == b & b == c) {
			System.out.println("Isto é um triângulo equilatero");
		}
		else if (a!=b & b!=c & a!=c) {
			System.out.println("Isto é um triângulo escaleno.");
		}
		else if (a == b & b!=c || a == c & b!=c || b == c & c!=a) {
			System.out.println("Isto é um triângulo isósceles.");
		}
	}

}
