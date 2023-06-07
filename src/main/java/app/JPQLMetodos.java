package app;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import model.Produto;
import model.Usuario;

public class JPQLMetodos {	
	
	public Usuario getUsuarioById(EntityManager em, Long id) {
		TypedQuery<Usuario> query = em.createQuery("SELECT u FROM Usuario u WHERE u.id = :id", Usuario.class);
        query.setParameter("id", id);
        Usuario usuario = query.getSingleResult();
	    return usuario;
	}
	
	public List<Usuario> getAllUsuarios(EntityManager em) {
	    TypedQuery<Usuario> query = em.createQuery("SELECT u FROM Usuario u", Usuario.class);
	    List<Usuario> usuarios = query.getResultList();
	    return usuarios;
	}
	
	public List<Produto> getAllProdutos(EntityManager em) {
        TypedQuery<Produto> query = em.createQuery("SELECT p FROM Produto p", Produto.class);
        List<Produto> produtos = query.getResultList();
        return produtos;
    }
	
	public List<Produto> getProdutosByUsuario(EntityManager em, Usuario usuario) {
	    TypedQuery<Produto> query = em.createQuery("SELECT p FROM Produto p WHERE p.usuario = :usuario", Produto.class);
	    query.setParameter("usuario", usuario);
	    List<Produto> produtos = query.getResultList();
	    return produtos;
	}
	
	public List<Produto> getProdutosByCategoria(EntityManager em, String categoria) {
	    TypedQuery<Produto> query = em.createQuery("SELECT p FROM Produto p WHERE p.categoria = :categoria", Produto.class);
	    query.setParameter("categoria", categoria);
	    List<Produto> produtos = query.getResultList();
	    return produtos;
	}
}
