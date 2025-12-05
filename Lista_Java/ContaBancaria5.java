package assuncao.isaac.testejava.assuncao.isaac.testejava.Metodos.ListaJava;

public class ContaBancaria5 {
    private String titular;
    private double saldo;

    public ContaBancaria5( String titular, double saldo){
        this.titular = titular;
        this.saldo = saldo;
    }
    public void depositar(double valor){
        if (valor > 0){
            this.saldo += valor;
        }
        else {
            System.out.println("Número inválido");
        }
    }
    public void sacar(double valor){
        if (valor > 0){
            this.saldo -= valor;
        }
        else {
            System.out.println("Número inválido");
        }
    }
    public void imprimir(){
        System.out.println(titular);
        System.out.println(saldo);
    }

    public static void main(String[] args) {
        ContaBancaria5 contaBancaria5 = new ContaBancaria5("Cosacas", 5432.00);
        contaBancaria5.imprimir();
        double valor = 100; String escolha = "depositar";
        switch (escolha){
            case "sacar":
                contaBancaria5.sacar(valor);
                break;
            case "depositar":
                contaBancaria5.depositar(valor);
                break;
        }
        System.out.println("pos operação de "+ escolha );
        contaBancaria5.imprimir();


    }

}
