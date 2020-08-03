public class TesteTraferaValor {
    public static void main(String[] args) {
      Conta contaMatheus  = new Conta(15545,959);
      contaMatheus.deposita(450);
      Conta contaJoao = new Conta(12334,24226);

        System.out.println(contaMatheus.tranfere(550,contaJoao));


    }
}
