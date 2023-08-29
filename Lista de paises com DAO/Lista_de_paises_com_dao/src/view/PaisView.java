package view;

import java.util.List;
import model.Pais;

public class PaisView {
	public void exibirListaDePaises(List<Pais> paises) {
		System.out.println("----Lista De Paises----");
		for (Pais pais : paises) {
			System.out.println("Pais: " + pais.getNome() + " capital: " + pais.getCapital() + " População: "
					+ pais.getPopulacao());
			System.out.println("-----------------------");

		}

	}

}
