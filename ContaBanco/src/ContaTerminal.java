import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a Agência: ");
        String agencia = scanner.nextLine();

        System.out.println("Digite o número da Conta: ");
        int numero_conta = scanner.nextInt();
        //adicionado para aguardar o Enter do usuário, caso não seja colocado ele não pega o valor seguinte
        scanner.nextLine();

        System.out.println("Digite o nome do cliente: ");
        String nome_cliente = scanner.nextLine();

        System.out.println("Digite o saldo do cliente: ");
        Double saldo = scanner.nextDouble();

        scanner.close();

        System.out.println("Olá " + nome_cliente + " obrigado por criar uma conta no nosso banco. Sua agencia é: " + agencia + " conta: " + numero_conta + " e seu saldo " + saldo + " já está disponivel para saque. ");

        
    }
}
