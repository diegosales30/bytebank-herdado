package bytebackherdado;
public class Gerente extends Funcionario implements Autenticavel {

  private AutenticacaoUtil autenticador;
  
  public Gerente(){
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
    System.out.println("add bonificação para GERENTE");
    return super.getSalario(); //super significa que o atributo ou metodo vem da classe mae, passo super no lugar do this, this implica que o atributo vem da classe local;
    //super.getBonificação() -> trazendo um metodo da classe cae, caso o valor altere la, será alterado nos filhos tbm, sem a necerssidade de alterar de um por um!
  }
}
