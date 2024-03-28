import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Menu {
    private final ArrayList<Usuario> usuarios = new ArrayList<>();

    public Menu() {
    }

    public void imprimirMenu() {
        System.out.println("1- Cadastrar usuário");
        System.out.println("ou digite qualquer coisa para sair");
        Scanner scanner = new Scanner(System.in);
        String escolha = scanner.nextLine();
        if (Objects.equals(escolha, "1")) {
            System.out.println("Escolha o nome do usuario: ");
            String nome = scanner.nextLine();
            System.out.println("Escolha a idade do usuario: ");
            String idade = scanner.nextLine();
            System.out.println("Escolha o genero do usuario: ");
            String genero = scanner.nextLine();
            System.out.println("Escolha o sobrenome do usuario: ");
            String sobrenome = scanner.nextLine();
            System.out.println("Escolha a comida preferida do usuario: ");
            String comida = scanner.nextLine();

            Usuario usuario = new Usuario(nome, idade, genero, sobrenome, comida);
            usuarios.add(usuario);
        }
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public void addUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }
}