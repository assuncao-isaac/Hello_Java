package assuncao.isaac.testejava.assuncao.isaac.testejava.Metodos.ListaJava;

public class Livro23 {
    String titulo;
    String autor;
    int numDePaginas;
    public Livro23(String titulo, String autor, int numDePaginas){
        this.autor = autor;
        this.numDePaginas = numDePaginas;
        this.titulo = titulo;
    }
    public Livro23(String titulo){
        this.titulo = titulo;
    }
    public void imprimir(){
        System.out.println("---------------------------");
        System.out.println("Livro: "+ titulo);
        System.out.println("Autor: "+ autor);
        System.out.println("Número de páginas: "+ numDePaginas);
        System.out.println("---------------------------");
    }
    public static void main(String[] args) {
        Livro23 livro23 = new Livro23("A volta dos que não foram", "Zé ninguem", 180);
        Livro23 livro24 = new Livro23("As tranças do rei careca");
        livro23.imprimir();
        livro24.imprimir();
    }
}

