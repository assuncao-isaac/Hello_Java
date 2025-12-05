package assuncao.isaac.testejava.assuncao.isaac.testejava.Metodos.ListaJava;

public class Carro14 {
    double combustivel;

    public Carro14(double combustivel){
        this.combustivel = combustivel;
    }
    public boolean ligarCarro(double combustivel){
        return combustivel > 0;
    }
    public static void main(String[] args) {
        Carro14 carro14 = new Carro14(0);
        System.out.println(carro14.ligarCarro(carro14.combustivel));
    }
}
