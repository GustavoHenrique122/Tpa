import java.util.Scanner;

public class EquacaoSegundo {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		double a, b, b2, c, d, x, x1, x2, raizQuagrada;
		
		System.out.println("A formula para resolver uma equação é Ax²+Bx+C");
		
		System.out.println("Digite o valor de A.");
		a = in.nextDouble();
		
		System.out.println("Digite o valor de B.");
		b = in.nextDouble();
		
		b2 = (b*b);
		
		System.out.println("Digite o valor de C.");
		c = in.nextDouble();
		
		d = (b2-4*a*c);
		
		double  raizQuadrada = Math.sqrt(d);
		
		if (a == 0) {
			System.out.println("Não é uma função");
		}
			if (d<0) {
				System.out.println("Não existem raízes reais para a equação");
			}
			else if (d == 0) {
				System.out.println("Existem apenas uma raiz real para a função");
			}
			else {
				x1 = (-b+raizQuadrada)/(2*a);
				
				x2 = (-b-raizQuadrada)/(2*a);
				
				System.out.println("Existem duas raizez reais " +x1+" e "+x2);
			}
		}
	}
