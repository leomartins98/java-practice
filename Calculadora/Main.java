package Calculadora;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int escolha;
        int n1, n2;
        Scanner entrada = new Scanner(System.in);            

        System.out.println("Digite o primeiro número: ");
        n1 = entrada.nextInt();
        
        System.out.println("Digite o segundo número: ");
        n2 = entrada.nextInt();

        System.out.println("Digite a operação desejada.\n\n 1 - Soma \n 2 - Subtração \n 3 - Multiplicação");
        escolha = entrada.nextInt();
        
        if (escolha==1) {
            Soma tipo = new Soma();
            System.out.println("O resultado da soma é: "+tipo.calcular(n1, n2)); 
        }
        else if (escolha==2) {
            Subtracao tipo = new Subtracao();
            System.out.println("O resultado da subtração é: "+tipo.calcular(n1, n2)); 
        }
        else if (escolha==3) {
            Multiplicacao tipo = new Multiplicacao();
            System.out.println("O resultado da multiplicação é: "+tipo.calcular(n1, n2));
        }
        else {
            System.out.println("Operação incorreta. Tente novamente.");
            Main.main(args);
        }
    }
}
