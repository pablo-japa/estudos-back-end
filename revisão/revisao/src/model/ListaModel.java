package model;

public class ListaModel {
	
	public static enum Status{
		A, P, C
	}
	
	
	private int idTarefa;
	private String titulo;
	private String descricao;
	private Status status;
	
	
	public ListaModel(int idTarefa, String titulo, String descricao, Status status) {
		this.idTarefa = idTarefa;
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


	public int getIdTarefa() {
		return idTarefa;
	}


	public void setIdTarefa(int idTarefa) {
		this.idTarefa = idTarefa;
	}
	
	
}
