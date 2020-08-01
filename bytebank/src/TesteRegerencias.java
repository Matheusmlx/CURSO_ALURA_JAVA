public class TesteRegerencias {
    public static void main(String[] args) {
        //primeiraConta na verdade é uma referencia para a classe tipo Conta
        Conta primeiraConta =  new Conta();
        primeiraConta.saldo = 300;

        System.out.println("Saldo da primeira: " + primeiraConta.saldo);

        Conta segundaConta = primeiraConta;

        System.out.println("Saldoo segunda conta:" + segundaConta.saldo);

        segundaConta.saldo = 450;

        System.out.println("Saldoo segunda conta:" + segundaConta.saldo);
        System.out.println("Saldoo primeira conta:" + primeiraConta.saldo);
        //São iguais porque ambas referenciam para a mesma classe tipo Conta
        if(primeiraConta == segundaConta){
            System.out.println("São a mesma conta");
        }


    }

}
