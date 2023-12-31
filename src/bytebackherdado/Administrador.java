package bytebackherdado;

public class Administrador extends Funcionario implements Autenticavel {
  
  private AutenticacaoUtil autenticador;

  public Administrador() {
    this.autenticador = new AutenticacaoUtil();
  }

  @Override
  public void setSenha(int senha) {
    this.autenticador.setSenha(senha);
  }

  @Override
  public boolean autentica(int senha) {
    return this.autenticador.autentica(senha);
  }
  
  @Override
  public double getBonificacao (){// reescrita, deixa a msm assinatura
    System.out.println("add bonificação para ADMINISTRADOR");
    return 50;
  }
}
