package model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "professor")
public class Professor{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column (name="nome_completo")
	private String nome;
	
	@Column (name = "especialidade")
	private String especialidade;
	
	@Column (name = "DataAdmissao")
	private String dataAdmissao;
	
	public Professor() {}
	
	public Professor(String nome, String especialidade, String dataAdmissao) {
		this.id = null;
		this.nome = nome;
		this.especialidade = especialidade;
		this.dataAdmissao = dataAdmissao;
	}
	
	

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public String getDataAdmissao() {
		return dataAdmissao;
	}

	public void setDataAdmissao(String dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Integer getId() {
		return id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dataAdmissao == null) ? 0 : dataAdmissao.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Professor other = (Professor) obj;
		if (dataAdmissao == null) {
			if (other.dataAdmissao != null)
				return false;
		} else if (!dataAdmissao.equals(other.dataAdmissao))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
	
	public String toString() {
		return "Pais [id = " + id + ", nome=" + nome + ",dataAdmissao=" + dataAdmissao + "]";
		
	}
	
}
