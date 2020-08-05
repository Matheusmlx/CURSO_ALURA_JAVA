public class TesteContas {
    public static void main(String[] args) {


      ContaPoupanca cp  =  new ContaPoupanca(222,445);

      cp.deposita(45);

      ContaCorrente cc = new ContaCorrente(458,985);

      cc.deposita(98);

        System.out.println("Saldo da conta Corrente " + cc.getSaldo());
        System.out.println("Saldo da conta Poupança " + cp.getSaldo());






    }
}
