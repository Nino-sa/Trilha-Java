import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("----------------------------------------------");

        System.out.println("Digite o número de conta:");
        int numeroDeConta = teclado.nextInt();
        teclado.nextLine(); // consome o \n deicao pelo next Int

        System.out.println("Digite o número da sua agência: ");
        String numeroAgencia = teclado.nextLine();

        System.out.println("Digite seu Nome: ");
        String nomeCliente = teclado.nextLine();

        System.out.println();
        System.out.println("Digite o saldo disponível:");
        double saldo = teclado.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + numeroAgencia + ", conta " + numeroDeConta + "e seu saldo " + saldo
                + ", já está disponível para saque!");

    }

}
