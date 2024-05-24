import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da conta e pressione enter.");
        int numeroConta = scanner.nextInt();

        System.out.println("Por favor, digite o número da agência e pressione enter.");
        String agencia = scanner.next();

        System.out.println("Por favor, digite seu nome e pressione enter.");
        String nomeCliente = scanner.next();

        System.out.println("Seu saldo inicial é de R$ 0.00, deseja realizar um deposito? Se sim, digite um valor maior do que zero, se não, digite zero.");
        double deposito = scanner.nextDouble();
        double saldo = 0;
        if (deposito > 0) {
            saldo = deposito;

            System.out.println("Olá, " + nomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é "
                    + agencia + ", conta " + numeroConta + " e seu saldo de R$ " + saldo
                    + " já está disponível para saque.");

        } else {
            System.out.println("Olá, " + nomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é "
                    + agencia + ", conta " + numeroConta + " e seu saldo é de R$ " + saldo);
        }
    }
}
