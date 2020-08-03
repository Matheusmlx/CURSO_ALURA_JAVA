//Gerente é um Funcionario, Gerente herda da class Funcionario
public class Gerente extends  Funcionario{

    private int senha;

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public boolean autentica(int senha){
        if(this.senha == senha){
            return true;
        }else{
            return false;
        }
    }

    //this -- referente ao objeto
    //super -- referente a classe mae
    public double getBonificacao(){
        //aproveitando o metodo da classe mãe pelo super.Bonificacao
        return super.getBonificacao() +  super.getSalario();
    }


}
