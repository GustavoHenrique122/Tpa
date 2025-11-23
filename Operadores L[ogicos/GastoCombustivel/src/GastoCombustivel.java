import java.util.Scanner;

public class GastoCombustivel {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		double gc, d, ct;
		
		System.out.println("Digite a capacidade do tanque do seu carro.");
		ct = in.nextDouble();
		
		System.out.println("Digite a distancia percorrida.");
		d = in.nextDouble();
		 
		gc = (d/ct);
		
		if (gc>=10) {
			System.out.println("Seu carro é economico.");
		}
		else {
			System.out.println("Seu carro não é economico.");
		}
	}

}
