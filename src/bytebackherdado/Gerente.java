package bytebackherdado;

//gerente extend um funcionado pq é um funcionario tbm
public class Gerente extends Funcionario {
  
  private int senha;

  public boolean autentica(int senha) {
    if(this.senha == senha) {
      return true;
    } else {
      return false;
    }
  }


  public int getSenha() {
    return senha;
  }
  public void setSenha(int senha) {
    this.senha = senha;
  }
 
  @Override
  public double getBonificacao (){// reescrita, deixa a msm assinatura
    System.out.println("add bonificação para GERENTE");
    return super.getBonificacao()  + super.getSalario(); //super significa que o atributo ou metodo vem da classe mae, passo super no lugar do this, this implica que o atributo vem da classe local;
    //super.getBonificação() -> trazendo um metodo da classe cae, caso o valor altere la, será alterado nos filhos tbm, sem a necerssidade de alterar de um por um!
  }
}
