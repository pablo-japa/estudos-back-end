package Model;

public class PessoaModel {
	
	String pessoa;
	String sexo;
	int idade;
	int altura;
	double peso;
	
	public PessoaModel(String pessoa, String sexo, int idade, int altura, double peso) {
		this.pessoa = pessoa;
		this.sexo = sexo;
		this.altura = altura;
		this.idade = idade;
		this.peso = peso;
		
	}
	
	public double calcularImc() {
		double alturaMetros = altura / 100.0;
		return peso / (alturaMetros * alturaMetros);
	}

	public String getPessoa() {
		return pessoa;
	}

	public void setPessoa(String pessoa) {
		this.pessoa = pessoa;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		
		if (altura >= 0) {
			this.altura = altura;
		} else {
			throw new IllegalArgumentException ("Altura não pode ser negativa");
		}
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		if (peso >= 0) {
			this.peso = peso;
		} else
			throw new IllegalArgumentException ("O peso não pode ser negativo");
	}
	

}
