package View;

public class CaixaView {
	
	public void exibirDepositoSucesso(double saldo) {
		System.out.println("-------Caixa Eletrônico-------");
		System.out.println("Saldo: " + saldo );
		System.out.println("Saldo Depositado");
		System.out.println("--------//---------//---------");
	}
	public void exibirMensagemValorInvalido(double saldo) {
		System.out.println("Valor Invalido");
		
		
	}
	public void exibirSaldo(double saldo) {
		System.out.println("-------Caixa Eletrônico-------");
		System.out.println("Saldo Atual: " + saldo);
		System.out.println("--------//---------//---------");
	}
	public void exibirSaqueSucesso(double saldo) {
		System.out.println("-------Caixa Eletrônico-------");
		System.out.println("Saque realizado com sucesso!");
		System.out.println("Saldo Restante: " + saldo);
		System.out.println("--------//---------//---------");
				
	}
	public void exibirSaqueInvalido(double saldo) {
		System.out.println("-------Caixa Eletrônico-------");
		System.out.println("Valor de saque Invalido: ");
		System.out.println("Saldo: " + saldo);
		System.out.println("--------//---------//---------");
		
		
	}
}
