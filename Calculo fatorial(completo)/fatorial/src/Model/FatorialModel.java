package Model;

public class FatorialModel {
	
	public long calcularFatorial(int numero) {
		if (numero < 0) {
			throw new IllegalArgumentException("O numero não pode ser zero");
		}
		
		long resultado = 1;
		for (int i = 1; i <= numero; i++) {
			resultado *= i;
		}
		
		return resultado;
	}

}
