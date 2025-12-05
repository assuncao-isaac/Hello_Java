package assuncao.isaac.testejava.assuncao.isaac.testejava.Metodos.ListaJava;

public class Triangulo9 {
    int lado1;
    int lado2;
    int lado3;

    public Triangulo9(int lado1,int lado2,int lado3){
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }
    public boolean verificadorDeTriangulo(int lado1,int lado2,int lado3){
        boolean triangulo;
        triangulo = lado1 + lado2 > lado3 && lado2 + lado3 > lado1 && lado1 + lado3 > lado2;
        return triangulo;
    }

    public static void main(String[] args) {
        Triangulo9 triangulo9 = new Triangulo9(4,5,6);
        System.out.println(triangulo9.verificadorDeTriangulo(triangulo9.lado1, triangulo9.lado2, triangulo9.lado3));

    }
}
