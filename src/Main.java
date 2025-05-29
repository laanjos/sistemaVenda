import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner (System.in);
        double total = 0;
        char continuar = 's';

        do{

            System.out.print("Digite o nome do produto:");
            String nome = entrada.nextLine();

            System.out.print("Digite o preço do produto:");
            double preco = entrada.nextDouble();
            entrada.nextLine();

            Produto p = new Produto(nome, preco);
            total += preco;

            System.out.println("Deseja adicionar outro produto? (s/n): ");
            continuar = entrada.nextLine().charAt(0);

        } while (continuar == 's' || continuar == 'S');

        System.out.println("Total da compra: R$" + total);

        if(total<50){
            System.out.println("Compra pequena.");
        } else if(total<=200){
            System.out.println("Compra média.");
        }else {
            System.out.println("Compra grande.");
        }

    }
}