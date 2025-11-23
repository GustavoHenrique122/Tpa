import java.util.Scanner;

public class Prova {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        
        int a;

        double sr = 0, mr = 0, maiorr = 0;
        
        double r;

        for (a = 1; a <= 40; a++) {
        	
            System.out.println("Qual a renda do aluno " + a + "?");
            r = in.nextDouble();
            
            sr += r;

            if (a == 1) {
            	
                maiorr = r;
                
            } else if (r > maiorr) {
            	
                maiorr = r;
                
            }
        }

        mr = sr / 40;

        System.out.println("Soma das rendas: " + sr);
        
        System.out.println("Renda média: " + mr);
        
        System.out.println("Maior renda: " + maiorr);
    }
}