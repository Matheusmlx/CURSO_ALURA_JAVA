public class TestaValores {
    public static void main(String[] args) {

        Conta conta = new Conta(45,12);
        Conta conta2 = new Conta(45,123);
        Conta conta3 = new Conta(45,1234);


        //Eu preciso mesmo chamar uma instancia de uma classe para perguntar o total de contas que existem ?
        System.out.println("Total de contas é " + Conta.getTotal());


    }
}
