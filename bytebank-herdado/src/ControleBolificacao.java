public class ControleBolificacao {

    private double soma;
    //parametro Generico para facilitar o poliformismo
    public void registra(Funcionario f){
        //GetBonificacai depende do objeto que esta sendo chamado
        double boni = f.getBonificacao();
        this.soma += boni;
    }

    public double getSoma(){
        return this.soma;
    }

}
