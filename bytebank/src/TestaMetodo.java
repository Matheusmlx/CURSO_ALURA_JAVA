public class TestaMetodo {

    public static void main(String[] args) {
     Conta contaLuiz  = new Conta();
     contaLuiz.deposita(45);

     System.out.println(contaLuiz.saldo);

     System.out.println(contaLuiz.saca(20));

     Conta contaMatheus = new Conta();
     contaMatheus.deposita(1000);

     if(contaMatheus.transfere(200,contaLuiz)){
         System.out.println("Tranferencia feita com Sucesso!!");
     }else{
         System.out.println("Erro na transferencia !!!!");
     }

     System.out.println(contaMatheus.saldo);
     System.out.println(contaLuiz.saldo);





    }
}
