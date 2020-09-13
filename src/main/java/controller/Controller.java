package controller;

import java.util.List;

import dao.DAO;
import modelos.ObjetoBase;

public class Controller {
    private final ObjetoBase objetoBase;
    private final DAO<ObjetoBase> dao;

    public Controller(final ObjetoBase objetoBase) {
        this.objetoBase = objetoBase;
        dao = new DAO<>(objetoBase.getClass());
    }

    public ObjetoBase inserir(final String... dados) {
        objetoBase.stringToObjetoBase(dados);
        dao.inserir(objetoBase);
        return objetoBase;
    }

    public void atualizar(final String... dados) {
        objetoBase.stringToObjetoBase(dados);
        dao.atualizar(objetoBase);
    }

    public void deletar(final int id) {
        dao.deletar(id);
    }

    public ObjetoBase recuperar(final int id) {
        return dao.recuperar(id);
    }

    public List<ObjetoBase> recuperarTodos() {
        return dao.recuperarTodos();
    }
}
