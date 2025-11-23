import java.util.Scanner;
//Não consegui fazer, então pesquisei

public class Idade {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Variáveis para armazenar os extremos
        String nomeMaisVelho = "";
        int idadeMaisVelho = -1;

        String nomeMaisNovo = "";
        int idadeMaisNovo = 200; // assumindo que ninguém tem mais de 200 anos

        for (int i = 1; i <= 5; i++) {
            System.out.println("Usuário " + i + ":");
            System.out.print("Nome: ");
            String nome = in.nextLine();

            System.out.print("Idade: ");
            int idade = in.nextInt();
            in.nextLine(); // Limpar o buffer do Enter

            // Verifica se é o mais velho
            if (idade > idadeMaisVelho) {
                idadeMaisVelho = idade;
                nomeMaisVelho = nome;
            }

            // Verifica se é o mais novo
            if (idade < idadeMaisNovo) {
                idadeMaisNovo = idade;
                nomeMaisNovo = nome;
            }
        }

        // Exibe os resultados
        System.out.println("\nUsuário mais velho:");
        System.out.println("Nome: " + nomeMaisVelho + ", Idade: " + idadeMaisVelho);

        System.out.println("\nUsuário mais novo:");
        System.out.println("Nome: " + nomeMaisNovo + ", Idade: " + idadeMaisNovo);

        in.close();
    }
}