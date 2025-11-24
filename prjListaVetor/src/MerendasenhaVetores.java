import java.util.Scanner;

public class MerendasenhaVetores {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int a[], existe = 0, i, j;

        final int TAM = 10;

        a = new int[TAM];

        for (i = 0; i < 10; i++) {

            a[i] = (int)(Math.random() * 10);

            System.out.println("Sua senha é: " + a[i]);

            for (j = 0; j < i; j++) {
            	
                if (a[i] == a[j]) {
                    existe = 1;
                }
            }

            if (existe == 0) {
                System.out.println("Pode comer");
            } else {
                System.out.println("Senha repetida");
            }
        }
    }
}
