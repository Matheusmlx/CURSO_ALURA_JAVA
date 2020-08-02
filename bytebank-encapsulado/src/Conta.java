//Isso não é uma conta , é apenas uma especificação
class Conta {
    //atributos
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular = new Cliente();

    //metodo  = como uma classe ira se comportar
    // this = faz referencia ao objeto de referencia
    public void  deposita(double valor){
       this.saldo += valor;
    }

    public boolean saca(double valor){
        if(this.saldo >=valor){
            this.saldo -= valor;
            return true;
        }

        return false;

    }

    public boolean transfere(double valor, Conta destino){
        if(this.saldo >= valor){
            this.saldo -= valor;
            destino.deposita(valor);
            return true;
        }
        return false;
    }


    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }
}
