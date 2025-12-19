package Proprios.desafios.Livro.Dominio;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private static int CONTADOR = 1;
    private final int id;
    private final String nome;
    private List<Livro> livros = new ArrayList<>();

    //metodos devolver livro & pegar livro:
    //========================================

    public Usuario(String nome) {
        this.id = CONTADOR;
        this.nome = nome;
        CONTADOR++;

    }
    public void devolverLivro(Livro[] livrosDaDevolucao){
        List<Livro> paraRetirar = new ArrayList<>();
        for (Livro livro : livrosDaDevolucao) {
            if (livros.contains(livro)) paraRetirar.add(livro);
            else System.out.println("livro:\""+livro.getTitulo() +"\" não está com "+nome+" e não pode ser devolvido");
        }
        for (Livro livro : paraRetirar) {
            retirarsetLivros(livro);
            livro.setDevolver();
        }
    }

    public void pegarLivro(Livro[] livrosDesejaveis) {
        if (livros.size() >= 3) {
            System.out.println("Você já possui " + livros.size() + " livros. Limite de 3 atingido.");
            return;
        }
        for (Livro livro : livrosDesejaveis) {
            if (livros.size() >= 3) {
                System.out.println("Limite de 3 atingido. Não é possível pegar mais livros.");
                break;
            }
            if (livros.contains(livro)) {
                System.out.println("Este livro já está com o usuário: " + livro.getTitulo());
                continue;
            }
            if (livro.setEmprestar()) {
                adicionarLivros(livro);
            }
        }
    }

    public void adicionarLivros(Livro livross) {
        livros.add(livross);
    }
    public void retirarsetLivros(Livro livross) {
        livros.remove(livross);
    }
    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", livros=" + livros +
                '}';
    }

}
