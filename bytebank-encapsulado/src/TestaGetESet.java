public class TestaGetESet {

    public static void main(String[] args) {
        Conta conta = new Conta(12,45);

        conta.setNumero(12);

        System.out.println(conta.getNumero());

        conta.setAgencia(48);

        System.out.println(conta.getAgencia());

        Cliente matheus = new Cliente();
        matheus.setNome("Matheus");
        matheus.setCpf("4512");
        matheus.setProfissao("Programador");
        //conta.titular = matheus;

        conta.setTitular(matheus);
        System.out.println(conta.getTitular().getNome());

        conta.getTitular().setCpf("04587");

        System.out.println(conta.getTitular().getCpf());


    }
}
