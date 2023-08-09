package Controller;

import Model.CaixaModel;
import View.CaixaView;


public class CaixaController {

	private CaixaModel caixaModel;
	private CaixaView caixaView;

	public CaixaController(double saldo, CaixaView caixaView) {
		caixaModel = new CaixaModel(saldo);
		this.caixaView = caixaView;
	}

	public void depositarSaldo(double valor) {
		if (valor > 0) {
			caixaModel.setSaldo(caixaModel.getSaldo() + valor);
			caixaView.exibirDepositoSucesso(valor);
		}else {
			caixaView.exibirMensagemValorInvalido(valor);
		}
	}
	public void exibirSaldo(){
		double saldo = caixaModel.getSaldo();
		caixaView.exibirDepositoSucesso(saldo);
		
	}
	public void saldoAtual(){
		double saldo = caixaModel.getSaldo();
		caixaView.exibirSaldo(saldo);
		
	}
	public void sacarSaldo(double valor) {
		if(valor > 0 && valor <= caixaModel.getSaldo()) {
			caixaModel.setSaldo(caixaModel.getSaldo() - valor);
			caixaView.exibirSaqueSucesso( caixaModel.getSaldo());
		} else {
			caixaView.exibirSaqueInvalido(valor);
		}
		
	}
}
