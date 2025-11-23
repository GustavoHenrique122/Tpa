import java.util.Scanner;

public class Placacarro {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int p;
		
		System.out.println("Escreva o ultimo digito da placa do seu carro.");
		p = in.nextInt();
		
		switch (p) {
		
		case 1:
		case 2:
			
			System.out.println("Você não pode rodar com esse carro segunda.");
			break;
			
		case 3:
		case 4:
			
			System.out.println("Você não pode rodar com esse carro terça.");
			break;
			
		case 5:
		case 6:
			
			System.out.println("Você não pode rodar com esse carro quarta.");
			break;
			
		case 7:
		case 8:
			
			System.out.println("Você não pode rodar com esse carro quinta.");
			break;
			
		case 9:
		case 0:
			
			System.out.println("Você não pode rodar com esse carro sexta.");
			break;
			
		default:
			
			System.out.println("Não dá para colocar este número em uma placa de carro.");
		}


	}

}
