//Isso não é uma conta , é apenas uma especificação
class Conta {
    //atributos
    private double saldo;
    private int agencia;
    private int numero;
    Cliente titular = new Cliente();

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

    public double getSaldo(){
        return this.saldo;
    }

    public int getNumero(){
        return this.numero;
    }
    public void setNumero(int novoNumero){
        this.numero = numero;
    }
    public int getAgencia(){
        return this.agencia;
    }
    public void setAgencia(int novaAgencia){
        this.agencia = agencia;
    }
 }
