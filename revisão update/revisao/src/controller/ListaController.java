package controller;
import java.util.ArrayList;
import java.util.List;
import model.ListaModel;
import model.ListaModel.Status;
import view.ListaView;
import dao.ListaDao;



public class ListaController {
	
	private ListaDao dao;
	private ListaView view;
	
	public ListaController() {
		view = new ListaView();
		dao = new ListaDao();
		
	}
	
	public void adicionarTarefa(int id_tarefa, String titulo, String descricao, Status status) {
		ListaModel listaModel = new ListaModel (id_tarefa, titulo, descricao, status);
		dao.adicionarTarefa(listaModel);
		
		
	}
	
	public void atualizarTarefa() {
		
	}
	
	public void finalizarTarefas() {
		
	}
	
	public void listarTarefas() {
		
	}
	public void limparLista() {
		dao.limparLista();
		view.limparlista();
		
	}
}