package assuncao.isaac.testejava.assuncao.isaac.testejava.Metodos.ListaJava;

public class Retangulo8 {
    int base;
    int altura;
    public Retangulo8(int base, int altura){
        this.altura = altura;
        this.base = base;
    }
    public int areaDoRetangulo(int base, int altura){
        return base * altura;
    }
    public static void main(String[] args) {
        Retangulo8 retangulo8 = new Retangulo8(5,6);
        System.out.println(retangulo8.areaDoRetangulo(retangulo8.base, retangulo8.altura));

    }
}
