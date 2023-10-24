package dao;

import model.Professor;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityNotFoundException;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;

public class ProfessorDao {
	
	private EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("professor-pu");
	private EntityManager entityManager;
	
	public ProfessorDao() {
		entityManager = entityManagerFactory.createEntityManager();
	}
	
	public void adicionarProfessor(Professor professor) {
		entityManager.getTransaction().begin();
		entityManager.persist(professor);
		entityManager.getTransaction().commit();
	}
	
	public boolean atualizarProfessor(Integer id, String nome, String especialidade, String dataAdmissao) {
		Professor professor = buscarProfessorPorId(id);
		entityManager.getTransaction().begin();
		professor.setNome(nome);
		professor.setEspecialidade(especialidade);
		professor.setDataAdmissao(dataAdmissao);
		entityManager.getTransaction().commit();
		
	return true;
			
	}
	
	public Professor buscarProfessorPorId(Integer id) {
		return entityManager.find(Professor.class, id);
	}
	
	public Professor buscarProfessorPorNome (String nomeProfessor) {
		try {
			return entityManager.createQuery("SELECT p FROM Professor p WHERE p.nome = :nomeProfessor", Professor.class)
		}
	}

}
