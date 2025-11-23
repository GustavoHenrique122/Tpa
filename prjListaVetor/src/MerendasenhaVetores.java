import java.util.Scanner;

public class MerendasenhaVetores {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int a[] = new int[10];
        int existe, i;

        for (i = 0; i < 10; i++) {

            a[i] = (int)(Math.random() * 10);

            System.out.println("Sua senha é: " + a[i]);

            existe = 0;
            for (int j = 0; j < i; j++) {
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
