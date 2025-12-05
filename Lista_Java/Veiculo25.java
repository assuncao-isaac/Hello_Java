package assuncao.isaac.testejava.assuncao.isaac.testejava.Metodos.ListaJava;

public class Veiculo25 {
    String marca;
    String modelo;
    int ano;

    public Veiculo25(){
        this.ano = 0;
        this.modelo = "#####";
        this.marca = "######";
    }

    public Veiculo25(int ano, String modelo, String marca){
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
        Veiculo25 carro25 = new Veiculo25();
        carro25.imprimir();
        System.out.println("-----------------------------------------");
        carro25 = new Veiculo25(1980, "Escort", "Ford");
        carro25.imprimir();
    }
}
