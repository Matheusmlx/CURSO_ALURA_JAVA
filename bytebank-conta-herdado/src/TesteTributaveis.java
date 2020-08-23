public class TesteTributaveis {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(2222,333);
        cc.deposita(100.0);

        SeguroDeVida sd = new SeguroDeVida();

        CalculadorImposto calculadorImposto = new CalculadorImposto();
        calculadorImposto.somarImposto(cc);
        calculadorImposto.somarImposto(sd);

        System.out.println(calculadorImposto.getValorImposto());



    }
}
