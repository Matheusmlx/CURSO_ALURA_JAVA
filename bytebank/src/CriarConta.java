public class CriarConta {
    public static void main(String[] args) {
        //primeira conta não é um objeto do tipo Conta, apenas uma referencia para a classe Conta
        //objeto ou instância são sinonimos
        Conta  primeiraConta =   new Conta();
        primeiraConta.saldo = 200;

        primeiraConta.saldo += 100;

       Conta segundaConta  = new Conta();
       segundaConta.saldo = 50;
        System.out.println("primeira conta tem " + primeiraConta.saldo);
        System.out.println("segunda conta tem " + segundaConta.saldo);

        if(primeiraConta == segundaConta){
            System.out.println("São as mesmas contas");
        }else{
            //Nese caso as referencias, primeiraConta e segundaConta, referenciam contas diferentes
            System.out.println("São contas diferentes");
        }
    }
}
