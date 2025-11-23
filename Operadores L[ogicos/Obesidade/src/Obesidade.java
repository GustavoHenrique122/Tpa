 import java.util.Scanner;

public class Obesidade {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		double p, a, a2, imc;
		
		System.out.println("Digite seu peso.");
		p = in.nextDouble();
		
		System.out.println("Digite seu altura.");
		a = in.nextDouble();
		
		a2 = (a*a);
		
		imc = (p/a2);
		
		if (imc<18.5) {
			System.out.println("Você está com o IMC "+imc+" por tanto você está com excesso de magreza.");
		}
		else if (imc<25) {
			System.out.println("Você está com o IMC "+imc+" por tanto você está com peso normal.");
		}
		else if (imc<30) {
			System.out.println("Você está com o IMC "+imc+" por tanto você está com excesso do peso.");
		}
		else if (imc<35) {
			System.out.println("Você está com o IMC "+imc+" por tanto você está com obesidade grau 1.");
		}
		else if (imc<40 ) {
			System.out.println("Você está com o IMC "+imc+" por tanto você está com obesidade grau 2.");
		}
		else {
			System.out.println("Você está com o IMC "+imc+" por tanto você está com obesidade grau 3.");
		}
	}

}
