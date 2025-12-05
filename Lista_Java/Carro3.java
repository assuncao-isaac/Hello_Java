package assuncao.isaac.testejava.assuncao.isaac.testejava.Metodos.ListaJava;

public class Carro3 {
    String marca;
    String modelo;
    int ano;

    public Carro3(int ano,String modelo, String marca){
        this.ano = ano;
        this.modelo = modelo;
        this.marca = marca;
    }
    public void imprimir(){
        System.out.println("ano: "+ ano);
        System.out.println("modelo: "+ modelo);
        System.out.println("marca: "+ marca);
    }
    public static void main(String[] args) {
        Carro3 carro3 = new Carro3(1980,"Escort","Ford");
        carro3.imprimir();
    }
}
