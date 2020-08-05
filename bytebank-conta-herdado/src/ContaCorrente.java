//new ContaCorrent()
public class ContaCorrente extends Conta{

    public ContaCorrente(int agencia, int numero){
        super(agencia,numero);
    }
    //Anotação na configuração
    //Sobrescrevendo o metodo
    @Override
    public boolean saca(double valor) {
        double valorASacar = valor +0.2;
        return super.saca(valorASacar);
    }

    @Override
    public void deposita(double valor){
        super.saldo +=valor;
    }
}
