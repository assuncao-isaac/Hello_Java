package assuncao.isaac.testejava.assuncao.isaac.testejava.Metodos.ListaJava;

public class Pessoa13 {
    String nome;
    int idade;

    public Pessoa13(String nome, int idade){
        this.nome = nome;
        if (idade > 120 || idade < 0) System.out.println("idade inválida");
        else this.idade = idade;

    }
    public void imprimir(){
        System.out.println("nome: "+ nome);
        System.out.println("idade: "+ idade);
    }
    public static void main(String[] args) {
        Pessoa13 pessoa13 = new Pessoa13("joao", 121);
        pessoa13.imprimir();

    }
}

