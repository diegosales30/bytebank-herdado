package bytebackherdado;

public class TesteReferencias {
  public static void main(String[] args) {
    //polimorfismo serve pra chegar no mesmo lugar usando 
    //referencias diferentes 
    //ex: Funcionario gerente1 = new Gerente(); usando o mais genérico
    //ex: Gerente gerente1 = new Gerente(); usnado a propria referencia
    
    //gerente
    Gerente gerente1 = new Gerente();
    gerente1.setSalario(5000.0);

    //funcionario padrão
    // Funcionario trabalhador = new Funcionario();
    // trabalhador.setSalario(2000.0);
    //nao pode criar mais funcionario pq é abstrato

    //editor de video
    EditorVideo  editor = new EditorVideo();
    editor.setSalario(2500.0);

    //editor de video
    Designer  design = new Designer();
    design.setSalario(2000.0);

    
    ControleBonificacao controle = new ControleBonificacao();
    controle.registra(gerente1); 
    
    controle.registra(editor);
    controle.registra(design);


    System.out.println(controle.getSoma());
  }
}