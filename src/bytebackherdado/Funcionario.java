package bytebackherdado;

public class Funcionario {

  private String nome;
  private String cpf;
  //protected double salario; //publico para as classes filhos, privado pro resto, mas nao usamos muito.
  private double salario;

  public double getBonificacao() {
    return this.salario * 0.05;
  }

  //get e set nome
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  //get e set cpf
  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  //get e set salario
  public double getSalario() {
    return salario;
  }
  public void setSalario(double salario) {
    this.salario = salario;
  }
}