package bytebackherdado;
//para usar interface precisa usar o implements;
public class Cliente implements Autenticavel {
  
  private AutenticacaoUtil autenticador;


  public Cliente() {
    this.autenticador = new AutenticacaoUtil();

  }

  public void logado () {
    System.out.println("cliente logado");
  }

  @Override
  public void setSenha(int senha) {
    this.autenticador.setSenha(senha);
  }

  @Override
  public boolean autentica(int senha) {
    return this.autenticador.autentica(senha);
  }

  

}
