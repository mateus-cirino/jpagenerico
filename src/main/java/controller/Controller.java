package controller;

import java.util.List;

import dao.DAO;
import modelos.ObjetoBase;

public class Controller<T extends ObjetoBase> {
    protected T objetoBase;
    protected DAO<T> dao;

    public T inserir(final String... dados) {
        objetoBase.stringToObjetoBase(dados);
        return dao.inserir(objetoBase);
    }

    public void atualizar(final String... dados) {
        objetoBase.stringToObjetoBase(dados);
        dao.atualizar(objetoBase);
    }

    public void deletar(final int id) {
        dao.deletar(id);
    }

    public T recuperar(final int id) {
        return dao.recuperar(id);
    }

    public List<T> recuperarTodos() {
        return dao.recuperarTodos();
    }
}
