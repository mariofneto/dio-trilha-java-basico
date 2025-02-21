import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência !");
        int numeroAgencia = sc.nextInt();
        sc.nextLine();

        System.out.println("digite a Agência: ");
        String agencia = sc.nextLine();

        System.out.println("digite o nome do cliente: ");
        String nomeCliente = sc.nextLine();

        System.out.println("digite o saldo da conta: ");
        double saldoConta = sc.nextDouble();

        String informacoes = "Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é " +
                agencia+", conta "+numeroAgencia+" e seu saldo "+saldoConta+" já está disponível para saque";

        System.out.println(informacoes);
    }
}
