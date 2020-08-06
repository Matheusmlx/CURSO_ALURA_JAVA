//Contrato Autenticavel
    //quem assinar esse contrato, precisa immplementar
    // metdo setSenha
    //metodo autentica
public abstract interface Autenticavel {


    public abstract void setSenha(int senha);


    public abstract boolean autentica(int senha);

}