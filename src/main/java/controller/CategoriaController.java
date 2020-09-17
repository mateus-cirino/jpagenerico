package controller;

import dao.DAO;
import modelos.Categoria;

public class CategoriaController extends Controller<Categoria>{
    @Override
    protected void iniciarController() {
        this.objetoBase = new Categoria();
        dao = new DAO<Categoria>(Categoria.class);
    }
}
