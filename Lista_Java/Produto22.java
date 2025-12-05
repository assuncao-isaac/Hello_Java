package assuncao.isaac.testejava.assuncao.isaac.testejava.Metodos.ListaJava;

import java.util.Scanner;

public class Produto22 {
    String nome;
    double preco;
    int quantidade;

    public Produto22(String nome, double preco, int quantidade){
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
        Scanner scanner = new Scanner(System.in);
        System.out.println("Produto: ");
        String produto = scanner.nextLine();
        System.out.println("Preço: ");
        double preco = scanner.nextDouble();
        System.out.println("Quantidade: ");
        int quantidade = scanner.nextInt();
        Produto22 produto22 = new Produto22(produto,preco,quantidade);
        produto22.imprimir();
    }
}
