//Isso não é uma conta , é apenas uma especificação
class Conta {
    //atributos
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular = new Cliente();
    //Atributos estaticos fazem parte da classe em si não mais da instancia
    private static int total;
    //Construtor padrão
    //rotina de criação -- impoe uma regra para ser seguida e responsavel pela inicialização dos atributos

    public Conta(int agencia, int numero){
        total ++;


        this.agencia = agencia;
        this.numero = numero;
//        System.out.println("Acabei de criei a conta com os valores");
//        System.out.println("Agencia " + this.agencia);
//        System.out.println("Numero " + this.numero);

    }


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
