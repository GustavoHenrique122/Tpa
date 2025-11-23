public class JoaoPedro {
	
	public static void main(String[] args) {
		
		double aj, ap, a = 0;
		
		aj = 134;
		ap = 145;
		
		do {
			aj += 2.5;
			
			ap += 2;
			
			a++;
		}while(aj<=ap);
		System.out.print("Demorou "+a+" anos para que João passe Pedro.");
	}

}
