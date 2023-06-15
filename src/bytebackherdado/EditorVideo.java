package bytebackherdado;

public class EditorVideo extends Funcionario {

  @Override
  public double getBonificacao() {
    System.out.println("add bonificação para editor de video");
    return super.getBonificacao() + 100;
  }
}
