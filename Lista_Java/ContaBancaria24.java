package assuncao.isaac.testejava.assuncao.isaac.testejava.Metodos.ListaJava;

public class ContaBancaria24 {
    private String nome = "fulano";
    private double saldo = 3500.00;

    public String getNome() {
        return nome;
    }

    public double getSaldo() {
        return saldo;
    }


    public void setSaldoDepositar(double valor) {
        saldo += valor;
    }
    public void setSaldoDepositar(int valor) {
        saldo += valor;
    }
    public void setSaldoSacar(double valor) {
        if (valor > saldo) {
            System.out.println("operação inválida");
        }
        else saldo -= valor;
    }

    public static void main(String[] args) {
        ContaBancaria24 bancaria24 = new ContaBancaria24();
        int sacarOUdepositar = 1;
        double valor = 2345.00;
        int valor2 = 1000;

        switch (sacarOUdepositar){
            case 1:
                bancaria24.setSaldoDepositar(valor);
                bancaria24.setSaldoDepositar(valor2);
                break;
            case 2:
                bancaria24.setSaldoSacar(valor);
                break;
            default:
                System.out.println("Operação inválida");
                break;
        }
        System.out.println(bancaria24.getNome());
        System.out.println(bancaria24.getSaldo());

    }
}

