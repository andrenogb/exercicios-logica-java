public class Pessoa {

    String nome;
    String sobrenome;
    int idade;
    String dataDeNascimento;


    void olaMundo(){
        System.out.println("Ola mundo!!!");
    }

    void exibeFichaPessoa(){
        System.out.println("O nome da pessoa é: " + nome);
        System.out.println("O sobrenome é: " + sobrenome);
        System.out.println("Idade: " + idade);
        System.out.println("Data de nascimento: " + dataDeNascimento);

    }
}
