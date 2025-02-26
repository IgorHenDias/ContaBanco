import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Conta!");
        int numero = sc.nextInt();
        sc.nextLine();

        System.out.println("Por favor, digite o número da Agência");
        String agencia = sc.nextLine();

        System.out.println("Por favor, informe seu nome");
        String nome = sc.nextLine();

        System.out.println("Por favor, informe seu saldo");
        double saldo = sc.nextDouble();

        sc.close();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, Sua agência é " +
                agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}