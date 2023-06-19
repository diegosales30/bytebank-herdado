package bytebackherdado;

//interface nao tem immplementação
//tudo na interface é abstrato, e definir contrato e precisa ser assinano
//quem acessa essa interface precisa implementar 
//metodo setsenha e metodo autentica
public abstract interface Autenticavel {
  
  public abstract void setSenha(int senha);

  public abstract boolean autentica(int senha);


}
