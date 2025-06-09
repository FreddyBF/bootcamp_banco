import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("======= CONTA BANCARIA =====");
        System.out.println("Informe seu nome: ");
        String nome = input.nextLine();

        System.out.println("Digite o numero de conta: ");
        String numeroConta = input.nextLine();

        System.out.println("Informe o seu saldo: ");
        float saldo = input.nextFloat();

        System.out.println("Digite: o numero da agencia: ");
        String agencia = input.nextLine();

        System.out.println("======= DADOS DO CLIENTE =====");
        System.out.println("Olá " + nome + "Obrigado por criar uma conta em nosso banco ");
        System.out.println(" Agencia: " + agencia + " Conta Numero: " + numeroConta + " Saldo: " + saldo);
        System.out.println(" Sua conta já esta disponivel para saque");


    }
}