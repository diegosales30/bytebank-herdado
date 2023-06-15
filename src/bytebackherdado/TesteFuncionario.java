package bytebackherdado;

public class TesteFuncionario {
  public static void main(String[] args) {
    Gerente funcionario = new Gerente();

    funcionario.setNome("Diego sales");
    funcionario.setCpf("02355598741");
    funcionario.setSalario(1500);
    double bonus = funcionario.getBonificacao();
    double total = funcionario.getSalario() + funcionario.getBonificacao();
    //funcionario.setSalario(funcionario.getSalario() + funcionario.getBonificacao());

    System.out.println(
        "Nome: " + funcionario.getNome() + "\n" +
            "CPF: " + funcionario.getCpf() + "\n" +
            "Salario: " + funcionario.getSalario() + "\n" +
            "10% de Bonificação: " + bonus + "\n" +
            "Salario + Bonus: " + total);

  }
}