public class TesteSistema {
    public static void main(String[] args) {
        Gerente g = new Gerente();
        g.setSenha(2222);

        SistemaInterno si = new SistemaInterno();
        si.autentica(g);

        Administrador administrador = new Administrador();
        administrador.setSenha(3333);

        si.autentica(administrador);

        Cliente cliente = new Cliente();
        cliente.setSenha(2222);

        si.autentica(cliente);
    }
}
