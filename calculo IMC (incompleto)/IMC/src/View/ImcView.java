package View;
import Dao.ImcDao;
import java.util.List;
import Controller.ImcController;
import Model.PessoaModel;

public class ImcView {
	
	public void exibirLista( List<PessoaModel> listaDePessoas) {
		System.out.println("Lista de Pessoas registradas");
		
		for (PessoaModel pessoaModel: listaDePessoas) {
			System.out.println(":" + pessoaModel.getPessoa());
			
		}
		
		System.out.println("---------------------------");
	}

}

