import java.util.Scanner;

public class FaixaEtaria {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		double i, tpp1, tpp2, tpp3, tpp4, tpp5, f1 = 0.0, f2 = 0.0, f3 = 0.0, f4 = 0.0, f5 = 0.0, tp = 0.0;
		
		int op;	
		
		do {
			
			System.out.println("Digite a idade: ");
			i = in.nextDouble();
			
			if (i<15) {
				
				System.out.println("Ele esta na faixa 1.");
				f1++;
				
			} else if (i<=30) {
				
				System.out.println("Ele esta na faixa 2.");
				
				f2++;
				
			} else if (i<=45) {
				
				System.out.println("Ele esta na faixa 3.");
				f3++;
				
			} else if (i<=60) {
				
				System.out.println("Ele esta na faixa 4.");
				f4++;
				
			} else {
				
				System.out.println("Ele esta na faixa 5.");
				f5++;
				
			}
			
			System.out.println("Você quer continuar? (1=Sim, 2=Não)");
			op = in.nextInt();
			
		}while(op == 1);
		
		tp = f1 + f2 + f3 + f4 + f5;
		
		tpp1 = f1 * (100/tp);
		
		tpp2 = f2 * (100/tp);
		
		tpp3 = f3 * (100/tp);
		
		tpp4 = f4 * (100/tp);
		
		tpp5 = f5 * (100/tp);

		System.out.println("Existem "+f1+" pessoas e um percentual de "+tpp1+"% na faixa 1");
		
		System.out.println("Existem "+f2+" pessoa e um percentual de "+tpp2+"% na faixa 2");
		
		System.out.println("Existem "+f3+" pessoa e um percentual de "+tpp3+"% na faixa 3");
		
		System.out.println("Existem "+f4+" pessoa e um percentual de "+tpp4+"% na faixa 4");
		
		System.out.println("Existem "+f5+" pessoa e um percentual de "+tpp5+"% na faixa 5");
		
	}

}
