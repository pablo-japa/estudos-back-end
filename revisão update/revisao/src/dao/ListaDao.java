package dao;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.net.ssl.SSLEngineResult.Status;

import java.sql.ResultSet;

import model.ListaModel;
import model.ListaModel.Status;

public class ListaDao {

	private String url = "jdbc:mysql://localhost:3306/projeto_revisao";
	private String usuario = "root";
	private String senha = "aluno";
	private Connection connection;

	public void adicionarTarefa(ListaModel listaModel) {

		try (Connection connection = DriverManager.getConnection(url, usuario, senha)) {
			String sql = "INSERT INTO tarefa" + "(id_tarefa, titulo, descricao, status)" + "VALUES (?,?,?,?);";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, listaModel.getId_tarefa());
			preparedStatement.setString(2, listaModel.getTitulo());
			preparedStatement.setString(3, listaModel.getDescricao());
			preparedStatement.setString(4, listaModel.getStatus().name());
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void limparLista() {
		try (Connection connection = DriverManager.getConnection(url, usuario, senha)) {
			String sql = "DELETE FROM tarefa";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public List<ListaModel> listarTarefas() {
		List<ListaModel> listaDeTarefas = new ArrayList<>();
		
		try (Connection connection = DriverManager.getConnection(url, usuario, senha)){
			String sql = "SELECT * from tarefa";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery(sql);
			
			while (resultSet.next()) {
				int id_tarefa = resultSet.getInt("id_tarefa");
				String titulo = resultSet.getString("titulo");
				String descricao = resultSet.getString("descricao");
				Status status = Status.valueOf(resultSet.getString("status"));
				
				ListaModel listaModel = new ListaModel(id_tarefa, titulo, descricao, status);
				
				listaDeTarefas.add(listaModel);
				

			}

		}catch (SQLException e) {
			e.printStackTrace();
		}
		return listaDeTarefas;
		
	}

}
