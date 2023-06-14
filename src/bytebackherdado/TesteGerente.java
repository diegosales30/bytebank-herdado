package bytebackherdado;

public class TesteGerente {
  public static void main(String[] args) {
    Gerente g1 = new Gerente();

    g1.setNome("Diego");
    g1.setCpf("023225226-25");
    g1.setSalario(5000.0);

    System.out.println(g1.getNome());
    System.out.println(g1.getCpf());
    System.out.println(g1.getSalario());

    g1.setSenha(123456);
    boolean logado = g1.autentica(123456); //senha errada.
    System.out.println("Logado: " + logado);
    System.out.println(g1.getBonificacao()); //bonificaçao que vem da classe mae.
    
  }
}
