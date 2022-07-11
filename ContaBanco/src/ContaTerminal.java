import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // Fazer:
        // * Conhecer e importar a classe Scanner;
        // * Exibir as mensagens para o nosso usuário;
        // * Obter pela classe scanner os valores digitados no terminla;
        // * Exibir a mensagem conta criada;

        Scanner sc = new Scanner(System.in);

        double saldo = 237.48;
        
        System.out.println("\n");
        System.out.println("Programa: ");
        System.out.println("Por favor, digite o número da Agência !");
        System.out.print("Agência: ");
        String agencia = sc.nextLine();
        System.out.println("Por favor, digite o número da Conta !");
        System.out.print("Numero: ");
        int numero = sc.nextInt();
        System.out.println("Por favor, digite o Nome Completo !");
        System.out.print("Nome: ");
        String nomeCompleto = sc.nextLine();
        System.out.println("\n");
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo R$%.2f já está disponível para saque.", nomeCompleto, agencia, numero, saldo);


        sc.close();
    }
}
