public class CalculadorImposto implements Tributabel{

    private double totalImposto;

    public void somarImposto(Tributabel t){
        double valor  = t.getValorImposto();
        this.totalImposto +=valor;
    }

    @Override
    public double getValorImposto(){
        return this.totalImposto;
    }


}
