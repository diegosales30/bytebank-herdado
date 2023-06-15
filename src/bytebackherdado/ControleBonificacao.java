package bytebackherdado;

public class ControleBonificacao {

  private double soma;

  //funcionario
  public void registra(Funcionario f) {//MESMO USANDO UMA REFERENCIA GENÉRICA, MAE, SEMPRE SERA CHAMADA A REFERENCIA  DE CADA UMA EM ESPECIFICO, ISSO É POLIMORFISMO
    double bonus = f.getBonificacao();
    this.soma = this.soma + bonus;
  }

  public double getSoma() {
    return soma;
  }
}
