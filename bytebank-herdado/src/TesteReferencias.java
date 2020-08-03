public class TesteReferencias {

    public static void main(String[] args) {
        Gerente gerenteMatheus = new  Gerente();

        gerenteMatheus.setNome("Matheus");
        gerenteMatheus.setSalario(5000.0);
        System.out.println(gerenteMatheus.getNome());

        Funcionario funcionario1 = new  Gerente();
        funcionario1.setSalario(2000.0);


        ControleBolificacao controle = new ControleBolificacao();
        controle.registra(gerenteMatheus);
        System.out.println(controle.getSoma());
        controle.registra(funcionario1);


    }
}
