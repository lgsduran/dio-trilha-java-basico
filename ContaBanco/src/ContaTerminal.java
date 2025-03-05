import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        try (Scanner terminal = new Scanner(System.in)) {
            System.out.println("Por favor, digite o número da conta!");
            int numero = terminal.nextInt();

            System.out.println("Por favor, digite o número da Agência!");
            String agencia = terminal.next();

            System.out.println("Por favor, digite o Nome do Cliente!");
            String nome = terminal.next();
           
            System.out.println("Por favor, digite o saldo!");
            double saldo = terminal.nextDouble();
            
            System.out.println("Olá "+nome+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e seu saldo "+saldo+" já está disponível para saque.");
        }		
    }
}
