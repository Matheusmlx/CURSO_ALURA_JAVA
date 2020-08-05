public class TesteFuncionario {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Gerente() ;

        funcionario1.setNome("Matheus Luiz");
        funcionario1.setSalario(1.200);
        funcionario1.setCpf("223333");

        System.out.println(funcionario1.getNome());
        System.out.println(funcionario1.getBonificacao());
    }
}
