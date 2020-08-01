//Isso não é uma conta , é apenas uma especificação
class Conta {
    //atributos
    private double saldo;
    int agencia;
    int numero;
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

    public double pegaSaldo(){
        return this.saldo;
    }
 }
