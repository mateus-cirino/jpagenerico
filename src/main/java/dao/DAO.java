package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

import modelos.ObjetoBase;

public class DAO <T extends ObjetoBase> {
    private final EntityManager entityManager;

    private final Class<T> classePersistencia;

    public DAO(final Class<T> classePersistencia) {
        this.classePersistencia = classePersistencia;

        entityManager = Persistence
                            .createEntityManagerFactory("default")
                            .createEntityManager();

        abrirTransacao();
    }

    private void abrirTransacao() {
        entityManager.getTransaction().begin();
    }

    private void commit() {
        entityManager.getTransaction().commit();
    }

    public void inserir(final T objeto) {
        entityManager.persist(objeto);
        commit();
    }

    public void atualizar(final T objeto) {
        entityManager.merge(objeto);
        commit();
    }

    public T deletar(final int id) {
        final T objeto = entityManager.find(classePersistencia, id);
        entityManager.remove(objeto);
        commit();
        return  objeto;
    }

    public T recuperar(final int id) {
        return entityManager.find(classePersistencia, id);
    }

    public List<T> recuperarTodos() {
        final String selectAll = "select u from " + classePersistencia.getName() + " u ";
        final Query selectAllQuery = entityManager.createQuery(selectAll);
        return (List<T>) selectAllQuery.getResultList();
    }
}
