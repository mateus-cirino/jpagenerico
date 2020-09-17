import controller.CategoriaController;
import modelos.Categoria;

public class Main {
    public static void main(final String... args) {
        final CategoriaController categoriaController = new CategoriaController();
        Categoria categoria = new Categoria();

        categoria.setNome("mateuss");
        categoria.setDescricao("mateus");

        categoria = categoriaController.inserir(categoria.objetoToString());

        System.out.println(categoriaController.recuperar(categoria.getId()));
    }
}
