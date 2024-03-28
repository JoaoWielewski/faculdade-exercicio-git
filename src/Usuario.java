public class Usuario {
    private String nome;
    private String idade;
    private String genero;
    private String sobrenome;
    private String comidaPreferida;

    public Usuario(String nome, String idade, String genero, String sobrenome, String comidaPreferida) {
        this.nome = nome;
        this.idade = idade;
        this.genero = genero;
        this.sobrenome = sobrenome;
        this.comidaPreferida = comidaPreferida;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getComidaPreferida() {
        return comidaPreferida;
    }

    public void setComidaPreferida(String comidaPreferida) {
        this.comidaPreferida = comidaPreferida;
    }
}