public class TestaBanoc {

    public static void main(String[] args) {
        Cliente paulo  = new Cliente();
        paulo.nome = "Paulo";
        paulo.cpf = "2222.22.222.2222.222";
        paulo.profissao = "Programador";

         Conta contaDoPaulo =new Conta();
         contaDoPaulo.deposita(100);
         contaDoPaulo.titular= paulo;

        System.out.println(contaDoPaulo.titular.nome);
    }
}
