package assuncao.isaac.testejava.assuncao.isaac.testejava.Metodos.ListaJava;

public class Pessoa1 {
    String nome;
    int idade;

    public Pessoa1(String nome, int idade){
        this.nome = nome;
        this.idade = idade;

    }
    public void imprimir(){
        System.out.println("nome: "+ nome);
        System.out.println("idade: "+ idade);
    }
    public static void main(String[] args) {
        Pessoa1 pessoa1 = new Pessoa1("joao", 21);
        pessoa1.imprimir();

    }
}
