package dao;

import java.sql.*;
import model.Pais;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;

public class PaisDAO {

	private String url = "jdbc:mysql://localhost:3306/PrimeiroBanco";
	private String usuario = "root";
	private String senha = "aluno";
	private Connection connection;

	public boolean abreConexao() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			connection = DriverManager.getConnection(url, usuario, senha);

			if (connection != null) {
				return true;
			} else {
				return false;
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean testaConexao() {
		boolean conectou = abreConexao();

		fechaConexao();

		return conectou;
	}

	private List<Pais> listaDePaises;

	public PaisDAO() {

		listaDePaises = new ArrayList<>();
	}

	public void adicionarPais(Pais pais) {
		//só entra nessa parte do codigo se o abreconexão() der como TRUE
		//ou seja, conexão ligada.
		if (abreConexao()) {
			//uso de try catch para tratar excepções
			try {
				
			//usa String sql para conversar com o MYSQL, indicando os valores 
				//e inserindo no Banco de dados
			String sql = "INSERT INTO pais (nome, capital) VALUES (?, ?)";
			PreparedStatement pS = connection.prepareStatement(sql);
			pS.setString(1, pais.getNome());
			pS.setString(2, pais.getCapital());
			pS.execute();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
			
		}	

	}

	public List<Pais> obterListaDePaises() {
		List<Pais> listaDePaises = new ArrayList<>();

		try (Connection c = DriverManager.getConnection(url, usuario, senha)) {
			String sql = "SELECT * FROM pais;";
			PreparedStatement preparedStatement = c.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery(sql);
			while (resultSet.next()) {
				String nome = resultSet.getString("nome");
				String capital = resultSet.getString("capital");
				Pais pais = new Pais(nome, capital);
				listaDePaises.add(pais);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return listaDePaises;
	}

	public void removerPais(Pais pais) {

		listaDePaises.remove(pais);
	}

	public void limparListaDePaises() {

		try (Connection c = DriverManager.getConnection(url, usuario, senha)) {
			String sql = "DELETE FROM pais";
			PreparedStatement preparedStatement = c.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery(sql);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public Pais obterPrimeiroPais() {
		Pais pais = null;

		try (Connection c = DriverManager.getConnection(url, usuario, senha)) {
			String sql = "SELECT * FROM pais LIMIT 1;";
			PreparedStatement preparedStatement = c.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery(sql);
			while (resultSet.next()) {
				String nome = resultSet.getString("nome");
				String capital = resultSet.getString("capital");
				pais = new Pais(nome, capital);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return pais;
	}

	public Pais obterTerceiroPais() {
		Pais pais = null;

		try (Connection c = DriverManager.getConnection(url, usuario, senha)) {
			String sql = "SELECT * FROM pais LIMIT 2, 1;";
			PreparedStatement preparedStatement = c.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery(sql);
			while (resultSet.next()) {
				String nome = resultSet.getString("nome");
				String capital = resultSet.getString("capital");
				pais = new Pais(nome, capital);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return pais;
	}

	public Pais obterQuartoPais() {
		Pais pais = null;

		try (Connection c = DriverManager.getConnection(url, usuario, senha)) {
			String sql = "SELECT * FROM pais LIMIT 3, 1;";
			PreparedStatement preparedStatement = c.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery(sql);
			while (resultSet.next()) {
				String nome = resultSet.getString("nome");
				String capital = resultSet.getString("capital");
				pais = new Pais(nome, capital);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return pais;
	}

	public void fechaConexao() {
		try {
			if (connection != null) {
				connection.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
