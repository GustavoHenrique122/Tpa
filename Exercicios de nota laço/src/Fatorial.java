import java.util.Scanner;

public class Fatorial {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int n, i, f;
        
        System.out.println("Escreva o número que você quer descobrir o fatorial.");
        n = in.nextInt();

        if (n < 0) {
            System.out.println("Não existe fatorial de número negativo!");
            return;
        }

        f = 1;
        i = 1;

        do {
            f = f * i;
            i++;
        } while (i <= n);

        System.out.println("Fatorial de " + n + " = " + f);
    }
}
