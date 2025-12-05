package assuncao.isaac.testejava.assuncao.isaac.testejava.Metodos.ListaJava;

import java.util.ArrayList;
import java.util.Scanner;

public class Aluno21 {

    double media;
    String nome;


    public Aluno21(String nome, double media){
        this.nome = nome;
        this.media = media;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Aluno21> alunos = new ArrayList<>();

        System.out.println("número de alunos: ");
        int quantidade = scanner.nextInt();


        for (int i = 0; i < quantidade; i++) {
            System.out.println("-------------------");
            scanner.nextLine();
            System.out.println("nome do "+(i+1)+"* aluno");
            String nomes = scanner.nextLine();

            double somaNotas = 0;
                for (int j = 0; j < 4; j++) {
                    System.out.println((j+1)+"* nota do aluno "+ nomes);
                    somaNotas = scanner.nextDouble() + somaNotas;
                }
            double media = somaNotas / 4;
            alunos.add(new Aluno21(nomes,media));
        }
        double mediaTurma = 0;
        for (Aluno21 a : alunos) {
            mediaTurma += a.media;
        }

        mediaTurma /= alunos.size();
        System.out.println("Média da turma: " + mediaTurma);

    }
}
