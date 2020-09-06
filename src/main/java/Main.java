import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelos.Categoria;

public class Main {
    public static void main(final String... args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");

        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

        Categoria categoria = new Categoria();
        categoria.setId(10);
        categoria.setNome("Educação");
        categoria.setDescricao("Categoria de educação");

        entityManager.persist(categoria);

        entityManager.getTransaction().commit();

    }
}
