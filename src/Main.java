public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();

        menu.imprimirMenu();

        menu.addUsuario(new Usuario("Marco", "10", "masculino", "Silva", "Macarrão"));
        menu.addUsuario(new Usuario("Sandra", "12", "feminino", "Aurélia", "Peixe"));
        menu.addUsuario(new Usuario("Guilherminho", "5", "masculino", "Rocha", "Batata"));
    }

}