package Proprios.desafios.Livro.Dominio;

public class Livro {

    private static int CONTADOR = 1;
    private final int id;
    private final String titulo;
    private final String autor;
    private final String ano;
    private boolean disponivel;

    public Livro(boolean disponivel, String ano, String autor, String titulo) {
        this.disponivel = disponivel;
        this.ano = ano;
        this.autor = autor;
        this.titulo = titulo;
        this.id = CONTADOR;
        CONTADOR++;
    }

    //Metodos emprestar e devolver :

    public boolean isDisponivel() {
        return disponivel;
    }
    public boolean setDevolver(){
        disponivel = true;
        return true;
    }
    public boolean setEmprestar() {
        if (!disponivel){
            System.out.println("Livro:\""+titulo+"\" indisponivel");
            return false;
        }
        else {
            System.out.println("Livro:\""+titulo+"\" emprestado");
            disponivel = false;
            return true;
        }
    }
    //=============================================

    public String getTitulo() {
        return titulo;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", ano='" + ano + '\'' +
                ", disponivel=" + disponivel +
                '}';
    }
}
