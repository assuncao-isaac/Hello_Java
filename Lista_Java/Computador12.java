package assuncao.isaac.testejava.assuncao.isaac.testejava.Metodos.ListaJava;

public class Computador12 {
    private String usuario = "joaozin";
    private String senha = "12345";

    public String getUsuario() {
        return usuario;
    }

    public void setSenha(String senhaAntiga, String senhaNova) {
        if (senhaAntiga.equals(senha)) {
            senha = senhaNova;
            System.out.println("Nova credencial: ");
            System.out.println(getUsuario());
            System.out.println(senha);
        }
        else System.out.println("Senha antiga inválida, tente novamente!");
    }

    public static void main(String[] args) {
        Computador12 computador12 = new Computador12();
        String senhaAntiga = "12345";
        String senhaNova = "54321";
        computador12.setSenha(senhaAntiga, senhaNova);

    }

}
