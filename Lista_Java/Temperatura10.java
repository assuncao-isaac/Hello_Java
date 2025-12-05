package assuncao.isaac.testejava.assuncao.isaac.testejava.Metodos.ListaJava;

public class Temperatura10 {
    double temperatura;
    public Temperatura10(double temperatura){
        this.temperatura = temperatura;
    }
    public double celParaFahr(double temperatura){
        return (9.0/5 * temperatura) + 32;
    }
    public static void main(String[] args) {
        Temperatura10 temperatura10 = new Temperatura10(32.5);
        System.out.println(temperatura10.celParaFahr(temperatura10.temperatura));
    }
}
