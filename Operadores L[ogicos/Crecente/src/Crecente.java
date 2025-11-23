import java.util.Scanner;

public class Crecente {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int menor, meio ,maior, a, b, c;
		
		System.out.println("Digite um valor.");
		a = in.nextInt();
		
		System.out.println("Digite um valor.");
		b = in.nextInt();
		
		System.out.println("Digite um valor.");
		c = in.nextInt();
		
        if (a<=b & a<=c) {
            menor = a;
            
            if (b<=c) {
                meio = b;
                
                maior = c;
                
            } else {
                meio = c;
                
                maior = b;
                
            }
        } else if (b <= a & b <= c) {
            menor = b;
            
            if (a <= c) {
                meio = a;
                
                maior = c;
                
            } else {
                meio = c;
                
                maior = a;
                
            }
        } else {
            menor = c;
            if (a <= b) {
                meio = a;
                
                maior = b;
                
            } else {
                meio = b;
                
                maior = a;
                
            }
        }
        System.out.println("Valores em ordem crescente "+menor+", "+meio+", "+maior+".");
	}
	
}
