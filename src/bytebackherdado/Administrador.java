package bytebackherdado;

public class Administrador extends FuncionarioAutenticavel {

  @Override
  public double getBonificacao (){// reescrita, deixa a msm assinatura
    System.out.println("add bonificação para ADMINISTRADOR");
    return 50;
  }
}
