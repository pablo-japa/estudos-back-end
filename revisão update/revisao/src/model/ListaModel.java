package model;

public class ListaModel {
	
	public static enum Status{
		A, P, C
	}
	
	
	private int id_tarefa;
	private String titulo;
	private String descricao;
	private Status status;
	
	
	public ListaModel(int id_tarefa, String titulo, String descricao, Status status) {
		this.id_tarefa = id_tarefa;
		this.titulo = titulo;
		this.descricao = descricao;
		this.status = status;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public Status getStatus() {
		return status;
	}


	public void setStatus(Status status) {
		this.status = status;
	}


	public int getId_tarefa() {
		return id_tarefa;
	}


	public void setId_tarefa(int id_tarefa) {
		this.id_tarefa = id_tarefa;
	}
	
	
}
