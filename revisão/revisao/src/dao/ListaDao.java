package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.ListaModel;

public class ListaDao {

	private String url = "jdbc:mysql://localhost:3306/projeto_revisao";;
	private String usuario = "root";
	private String senha = "aluno";
	private Connection connection;

public void adicionarTarefa(ListaModel listaModel) {
	
	try (Connection connection = DriverManager.getConnection(url, usuario, senha)){
		String sql = "INSERT INTO tarefa" + "(idTarefa, titulo, descricao, status)" + "VALUES (?,?,?,?);";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setInt(1, listaModel.getIdTarefa());
		preparedStatement.setString(2, listaModel.getTitulo());
		preparedStatement.setString(3, listaModel.getDescricao());
		preparedStatement.setString(4, listaModel.getStatus().name());
		preparedStatement.executeUpdate();
	} catch (SQLException e) {
		e.printStackTrace();
	}
}
}