package assuncao.isaac.testejava.assuncao.isaac.testejava.Metodos.ListaJava;

public class Produto2 {
    String nome;
    double preco;
    int quantidade;

    public Produto2(String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    public void imprimir(){
        System.out.println("Nome: "+nome);
        System.out.println("Preço: "+preco);
        System.out.println("Quantidade: "+ quantidade);
        System.out.println("Valor em estoque: "+valorEstoque(quantidade, preco));
    }
    public double valorEstoque(int quantidade, double preco){
     return quantidade*preco;
    }
    public static void main(String[] args) {
        Produto2 produto2 = new Produto2("requeijão", 15, 235);
        produto2.imprimir();
    }
}
