package controller;

import dao.DAO;
import modelos.Categoria;

public class CategoriaController extends Controller<Categoria>{
    public CategoriaController() {
        objetoBase = new Categoria();
        dao = new DAO<Categoria>(Categoria.class);
    }
}
