package app;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import model.Produto;
import model.Usuario;

public class CriaUsuariosEProdutos {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("fiapgs1");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tr = em.getTransaction();

        tr.begin();

        Usuario usuario1 = new Usuario("Usuário 1", "11111111111", "usuario1@example.com", "1234567890",
                LocalDate.of(2000, 1, 1), "senha1", "Endereço 1");
        em.persist(usuario1);
        Usuario usuario2 = new Usuario("Usuário 2", "22222222222", "usuario2@example.com", "0987654321",
                LocalDate.of(1995, 5, 10), "senha2", "Endereço 2");
        em.persist(usuario2);
        Usuario usuario3 = new Usuario("Usuário 3", "33333333333", "usuario3@example.com", "9876543210",
                LocalDate.of(1998, 12, 25), "senha3", "Endereço 3");
        em.persist(usuario3);

        Produto produto1 = new Produto(usuario2, "Produto 1", "Categoria 1", LocalDate.of(2023, 12, 31), 5, 4, 3, 4, 5, "Descrição do Produto 1");
        em.persist(produto1);
        Produto produto2 = new Produto(usuario1, "Produto 2", "Categoria 2", LocalDate.of(2022, 10, 15), 4, 3, 4, 5, 4, "Descrição do Produto 2");
        em.persist(produto2);
        Produto produto3 = new Produto(usuario3, "Produto 3", "Categoria 1", LocalDate.of(2023, 6, 30), 5, 5, 5, 3, 5, "Descrição do Produto 3");
        em.persist(produto3);

        tr.commit();

        em.close();
        emf.close();
    }
}
