package bytebackherdado;

public class Designer extends Funcionario {
  @Override
  public double getBonificacao() {
    System.out.println("add bonificação para Designer");
    return 200;
  }
}
