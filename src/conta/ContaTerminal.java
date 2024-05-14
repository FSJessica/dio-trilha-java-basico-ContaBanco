package conta;

import java.util.Scanner;

public class ContaTerminal {
//    int numero = 1021;
//    String agencia = "067-8";
//    String cliente = "MARIO ANDRADE";
//    Double saldo = 237.48;
    static Scanner scanner;

    public static void main(String[] args){
        receberDadosUsuario();
    }

    public static void receberDadosUsuario() {
        scanner = new Scanner (System.in);
        System.out.println("Por favor, digite o seu nome: ");
        String cliente = scanner.nextLine();

        scanner = new Scanner (System.in);
        System.out.println("Por favor, digite o número da Agência: ");
        String agencia = scanner.nextLine();

        scanner = new Scanner (System.in);
        System.out.println("Por favor, digite o número da sua conta: ");
        String numeroString = scanner.nextLine();
        int numero = Integer.parseInt(numeroString);

        scanner = new Scanner (System.in);
        System.out.println("Por favor, digite seu saldo: ");
        String saldoString = scanner.nextLine(); // Lê a entrada do usuário como uma String
        double saldo = Double.parseDouble(saldoString);

        System.out.println("Olá " + cliente + " ,obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " conta " + numero + " e seu saldo de " + saldo + " já está disponível para saque!");
        scanner.close();
    }
}