package assuncao.isaac.testejava.assuncao.isaac.testejava.Metodos.ListaJava;

public class Funcionario6 {
    String nome;
    double salario;

    public Funcionario6(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }
    public double bonusDe10Porcento(double salario){
        salario = (salario * 0.10) + salario;
        return salario ;
    }

    public static void main(String[] args) {
        Funcionario6 funcionario6 = new Funcionario6("cosacas", 3500.00);
        System.out.println(funcionario6.bonusDe10Porcento(funcionario6.salario));


    }
}
