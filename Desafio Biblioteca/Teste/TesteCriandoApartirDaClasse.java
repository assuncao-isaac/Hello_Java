package Proprios.desafios.Livro.Teste;

import Proprios.desafios.Livro.Dominio.Biblioteca;
import Proprios.desafios.Livro.Dominio.Livro;
import Proprios.desafios.Livro.Dominio.Usuario;


public class TesteCriandoApartirDaClasse {
    public static void main(String[] args) {
        Usuario joao = new Usuario("Joao");
        Usuario fabio = new Usuario("Fabio");
        Usuario cleber = new Usuario("Cleber");
        Livro livroa = new Livro(true, "2020", "Joao","A volta dos que não foram");
        Livro livrob = new Livro(false,"1981","Viviane Felix", "o belo girassol");
        Livro livroc = new Livro(true,"0001","######", "######");

        Livro[] livro1 = {livroa,livrob};
        Livro[] livro2 = {livroc};
        Usuario[] usuarios = {joao,fabio,cleber};

        Biblioteca biblioteca = new Biblioteca();
        biblioteca.adicionarUsuario(usuarios);
        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);



        biblioteca.livrosDisponiveis();
        biblioteca.emprestarParaUsuario(fabio,livroa);
        biblioteca.livrosDisponiveis();
        biblioteca.devolverParaBiblioteca(fabio,livroa);
        biblioteca.emprestarParaUsuario(cleber,livroa);

        biblioteca.listaGeral();

    }
}
