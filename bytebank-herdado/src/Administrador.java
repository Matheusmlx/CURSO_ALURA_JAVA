//Gerente eh um Funcionario, Gerente herda da class Funcionario, assina o contrato Autenticavel
// eh um Autenticavel
public class Administrador extends  Funcionario implements Autenticavel{

    private int senha;
    private AutenticacaoUtil autenticador;


    public Administrador(){
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

    @Override
    public double getBonificacao() {
        return 50;
    }
}
