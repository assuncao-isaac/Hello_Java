package assuncao.isaac.testejava.assuncao.isaac.testejava.Metodos.ListaJava;

public class ContaBancaria11 {
    private String nome = "fulano";
    private double saldo = 3500.00;

    public String getNome() {
        return nome;
    }

    public double getSaldo() {
        return saldo;
    }


    public void setSaldo1(double valor) {
        saldo += valor;
    }
    public void setSaldo2(double valor) {
        if (valor > saldo) {
            System.out.println("operação inválida");
        }
        else saldo -= valor;
    }

    public static void main(String[] args) {
        ContaBancaria11 bancaria11 = new ContaBancaria11();
        int sacarOUdepositar = 2;
        double valor = 2345.00;

        switch (sacarOUdepositar){
            case 1:
                bancaria11.setSaldo1(valor);
                break;
            case 2:
                bancaria11.setSaldo2(valor);
                break;
            default:
                System.out.println("Operação inválida");
                break;
        }
        System.out.println(bancaria11.getNome());
        System.out.println(bancaria11.getSaldo());

    }
}

