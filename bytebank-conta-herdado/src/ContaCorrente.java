//new ContaCorrent()
public class ContaCorrente extends Conta implements Tributabel{

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
    public double getValorImposto() {
        return super.saldo * 0.01;
    }

    @Override
    public void deposita(double valor){
        super.saldo +=valor;
    }
}
