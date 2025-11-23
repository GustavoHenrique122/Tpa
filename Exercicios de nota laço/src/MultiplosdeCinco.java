
public class MultiplosdeCinco {
	
	public static void main(String[] args) {

		int i = 1, soma = 0;
		
		for (i = 1; i <= 400; i++) {
			if (i % 5 == 0) {
				
				soma = soma + i;
				
			    System.out.print(i+" ");
			    
			}
		
		}
		
		System.out.println("A soma dos números é "+soma);
	}

}