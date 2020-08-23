//Gerente é um Funcionario, Gerente herda da class Funcionario
public class Gerente extends  Funcionario implements Autenticavel{

    private AutenticacaoUtil autenticador;

    public  Gerente (){
         this.autenticador = new AutenticacaoUtil();
    }

    @Override
    public void setSenha(int senha) {
        this.autenticador.setSenha(senha);
    }

    @Override
    public boolean autentica(int senha) {
      return this.autenticador.autentica(senha);
    }

    //this -- referente ao objeto
    //super -- referente a classe mae
    public double getBonificacao(){
        //aproveitando o metodo da classe mãe pelo super.Bonificacao
        return this.getSalario();
    }


}
