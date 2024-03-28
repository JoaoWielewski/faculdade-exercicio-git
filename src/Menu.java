import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Menu {
    private final ArrayList<Usuario> usuarios = new ArrayList<>();

    public Menu() {
    }

    public void imprimirMenu() {
        System.out.println("1- Cadastrar usuário");
        System.out.println("2- Listar usuários");
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
        } else if (Objects.equals(escolha, "2")) {
            for (Usuario usuario : usuarios) {
                System.out.println("Nome:" + usuario.getNome());
                System.out.println("Sobrenome:" + usuario.getSobrenome());
                System.out.println("Genero:" + usuario.getGenero());
                System.out.println("Idade:" + usuario.getIdade());
                System.out.println("Comida preferida:" + usuario.getComidaPreferida());
                System.out.println();
            }
        }
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public void addUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }
}