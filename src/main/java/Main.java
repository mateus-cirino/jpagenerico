import controller.CategoriaController;

public class Main {
    public static void main(final String... args) {
        final CategoriaController categoriaController = new CategoriaController();
        System.out.println(categoriaController.recuperar(12).toString());
    }
}
