import java.util.Scanner;

public class PrimoVetor {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		final int TAM = 10;
		
		int a[], i, d=0, ii;
		
		a = new int [TAM];

        for (i = 0; i<TAM; i++) {
            for (ii = 1; ii<=a[i]; ii++) {
                if (a[i] % ii == 0) {
                    d++;
                }
            }

            if (d == 2) {
                System.out.println(a[i] + " é primo.");
            } else {
                System.out.println(a[i] + " NÃO é primo.");
            }
        }
    }
}

