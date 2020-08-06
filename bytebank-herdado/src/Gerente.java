//Gerente é um Funcionario, Gerente herda da class Funcionario
public class Gerente extends  Funcionario implements Autenticavel{

    private int senha;

    @Override
    public void setSenha(int senha) {
        this.senha = senha;
    }

    @Override
    public boolean autentica(int senha) {
        if(this.senha == senha){
            return true;
        }
        return false;
    }

    //this -- referente ao objeto
    //super -- referente a classe mae
    public double getBonificacao(){
        //aproveitando o metodo da classe mãe pelo super.Bonificacao
        return this.getSalario();
    }


}
