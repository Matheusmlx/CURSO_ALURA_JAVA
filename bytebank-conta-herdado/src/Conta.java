//Isso não é uma conta , é apenas uma especificação
//Classes abstradas não podem ser instanciadas
public abstract class  Conta {
    //atributos
    protected double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total;

    public Conta(int agencia, int numero){

        this.agencia = agencia;
        this.numero = numero;
    }


    //metodo  = como uma classe ira se comportar
    // this = faz referencia ao objeto de referencia
    // Métodos abstrados não podem ser usado
    public abstract void  deposita(double valor);

    public boolean saca(double valor){
        if(this.saldo >=valor){
            this.saldo -= valor;
            return true;
        }

        return false;

    }

    public boolean tranfere(double valor, Conta contaDestino){
        if(this.saldo>= valor){
            this.saldo -= valor;
            contaDestino.deposita(valor);
            return true;
        }
        return false;
    }


    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        if(agencia <= 0){
            System.out.println("nao pode valor menor igual a 0");
            return;
        }
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        if(numero <=0){
            System.out.println("nao pode valor =< 0");
            return;
        }
        this.numero = numero;
    }

    public double getSaldo(){
        return this.saldo;
    }
    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }
    //Metodos estaticos fazem parte da Classe em si, não mais das instancias daquela classe, pois isso que não se usa mais para referencia atributos estaticos
    // tanto o atributo estatico quanto o metodo estatico, passam a pertencer a Classe em si , não mais para cada instantica --- é algo compartilhado
    public static int getTotal(){
        //return total ou
        return Conta.total;
    }
}
