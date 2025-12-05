package assuncao.isaac.testejava.assuncao.isaac.testejava.Metodos.ListaJava;

import java.util.ArrayList;

public class Aluno7 {
    ArrayList<Double> notas = new ArrayList<>();

    public double media( ArrayList<Double> notas){
        double media = 0;
        for (Double nota : notas) {
            media = nota + media;
        }
        media /= notas.size();
        return media;
    }


    public static void main(String[] args) {
        Aluno7 aluno7 = new Aluno7();
        aluno7.notas.add(5.6);
        aluno7.notas.add(6.4);
        aluno7.notas.add(2.3);
        aluno7.notas.add(1.9);
        System.out.println(aluno7.media(aluno7.notas));
    }
}
