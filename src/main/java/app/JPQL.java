package app;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Produto;
import model.Usuario;

public class JPQL {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("fiapgs1");
		EntityManager em = emf.createEntityManager();
		JPQLMetodos jpql = new JPQLMetodos();
		
		// Lista todos os usuários
		List<Usuario> allUsuarios = jpql.getAllUsuarios(em);
		for (Usuario usuario : allUsuarios) {
			System.out.println(usuario);
		}
		
		// Listas usuario por ID
		Usuario usuario = jpql.getUsuarioById(em, 1L);
		System.out.println(usuario);
		
		// Lista todos os produtos
		List<Produto> allProdutos = jpql.getAllProdutos(em);
		for (Produto produto : allProdutos) {
			System.out.println(produto);
		}
		// Produtos por usuário		
		List<Produto> usuarioProdutos = jpql.getProdutosByUsuario(em, usuario);
		for (Produto produto : usuarioProdutos) {
			System.out.println(produto);
		}
		
		// Produtos por categoria
		List<Produto> categoriaProdutos = jpql.getProdutosByCategoria(em, "Categoria 1");
		for (Produto produto : categoriaProdutos) {
			System.out.println(produto);
		}
		
		em.close();
		emf.close();
	}

}
