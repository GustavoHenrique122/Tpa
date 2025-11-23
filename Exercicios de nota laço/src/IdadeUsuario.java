import java.util.Scanner;
public class IdadeUsuario {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int anoa, anon, idade, op;
		
		do {
			
			System.out.println("Digite o ano Atual");
			anoa = in.nextInt();
			
			System.out.println("Digite o ano de Nascimento");
			anon = in.nextInt();
			
			idade = anoa - anon;
			
			System.out.println("idade: " + idade);
			
			System.out.println("Deseja continuar? 1 = Sim | 0 = Não");
			op = in.nextInt();
			
			
			
		}while (op != 0);
		
		in.close();	
	}
	
}
