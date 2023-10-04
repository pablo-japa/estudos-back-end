package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Aluno;

public class AlunoDAO {
	private static final String URL = "jdbc:mysql://localhost:3306/seubanco";
	private static final String USUARIO = "root";
	private static final String SENHA = "aluno";
	private Connection connection;

	public AlunoDAO() {

	}

	// Método para abrir uma conexão com o banco de dados
	public void abreConexao() throws SQLException {
		try {
			// Carrega o driver JDBC específico (substitua pelo driver do seu banco de
			// dados)
			Class.forName("com.mysql.cj.jdbc.Driver");

			// Estabelece a conexão com o banco de dados usando os atributos URL, USUARIO e
			// SENHA
			connection = DriverManager.getConnection(URL, USUARIO, SENHA);
		} catch (ClassNotFoundException | SQLException e) {
			// Lida com erros de carregamento do driver ou conexão
			throw new SQLException("Erro ao abrir a conexão com o banco de dados", e);
		}
	}

	// Método para fechar a conexão com o banco de dados
	public void fechaConexao() {
		if (connection != null) {
			try {
				connection.close();
			} catch (SQLException e) {
				// Lida com erros de fechamento da conexão
				e.printStackTrace();
			}
		}
	}

	// Método para inserir um aluno no banco de dados
	public void inserirAluno(Aluno aluno) throws SQLException {
try { 
		abreConexao();
		String sql = "INSERT INTO banco_aluno (idAluno, nome, idade) VALUES (?, ?, ?)";
		try (PreparedStatement preparedStatement = connection.prepareStatement(sql)){
			preparedStatement.setInt(1, aluno.getIdAluno());
			preparedStatement.setString(2, aluno.getNome());
			preparedStatement.setInt(3, aluno.getIdade());
			preparedStatement.executeUpdate();
		}catch (SQLException e) {
			e.printStackTrace();
		}
}finally {
    fechaConexao();
	}
	

	// Método para buscar um aluno pelo ID (id_aluno) no banco de dados
	public Aluno buscarAlunoPorId(int id) throws SQLException {
		
		String sql ="SELECT * FROM aluno WHERE idALuno = ?";

		return null;
	}

	// Método para atualizar os dados de um aluno no banco de dados
	public boolean atualizarAluno(Aluno aluno) throws SQLException {

		return false;
	}

	// Método para excluir um aluno pelo ID (id_aluno) no banco de dados
	public boolean excluirAluno(int id) throws SQLException {

		return false;
	}

	// Método para listar todos os alunos no banco de dados
	public List<Aluno> listarAlunos() throws SQLException {
		List<Aluno> alunos = new ArrayList<>();

		return alunos;
	}
}
