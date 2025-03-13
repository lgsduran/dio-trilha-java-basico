public class App {
    public static void main(String[] args) throws Exception {
        Cliente elvis = new Cliente();
		elvis.setNome("Venilton");
		
		Conta cc = new ContaCorrente(elvis);
		Conta poupanca = new ContaPoupanca(elvis);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
    }
}
