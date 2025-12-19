package Proprios.desafios.Livro.Dominio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Biblioteca {
    private List<Livro> livros = new ArrayList<>();
    private List<Usuario> usuarios = new ArrayList<>();

    public void adicionarLivro(Livro[] livro){
        livros.addAll(Arrays.asList(livro));
    }


    public void adicionarUsuario(Usuario[] usuario){
        usuarios.addAll(Arrays.asList(usuario));

    }

    public void listaGeral(){
        System.out.println("==========LISTA DE LIVROS==========");
        for (Livro livro : livros) {
            System.out.println(livro);
        }
        System.out.println("==========LISTA DE USUARIOS==========");
        for (Usuario usuario : usuarios) {
            System.out.println(usuario);
        }
    }
    public void livrosDisponiveis(){
        System.out.println("==========LISTA DE LIVROS DISPONIVEIS==========");
        for (Livro livro : livros) {
            if (livro.isDisponivel()) {
                System.out.println(livro);
            }
        }
    }



    public void emprestarParaUsuario(Usuario usuario, Livro livro){
        if (livros.contains(livro) && usuarios.contains(usuario)){
            Livro[] livro1 = {livro};
            usuario.pegarLivro(livro1);
        }
        else System.out.println("usuario ou livro não estão nesta biblioteca");
    }
    public void devolverParaBiblioteca(Usuario usuario, Livro livro){
        if (livros.contains(livro) && usuarios.contains(usuario)) {
            Livro[] livro1 = {livro};
            usuario.devolverLivro(livro1);
        }
        else System.out.println("usuario ou livro não estão nesta biblioteca");
    }
}
