public class Main {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();
        pessoa.nome = "André";
        pessoa.sobrenome = "Nogueira Barreto";
        pessoa.idade = 34;
        pessoa.dataDeNascimento = "01/09/1992";

        pessoa.exibeFichaPessoa();
        pessoa.olaMundo();

    }
}
