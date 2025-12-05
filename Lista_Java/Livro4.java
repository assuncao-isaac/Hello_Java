package assuncao.isaac.testejava.assuncao.isaac.testejava.Metodos.ListaJava;

public class Livro4 {
    String titulo;
    String autor;
    int numDePaginas;
    public Livro4(String titulo, String autor, int numDePaginas){
        this.autor = autor;
        this.numDePaginas = numDePaginas;
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
        Livro4 livro4 = new Livro4("A volta dos que não foram", "Zé ninguem", 180);
        livro4.imprimir();
    }
}

