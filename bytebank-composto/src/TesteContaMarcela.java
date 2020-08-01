import javax.sound.midi.Soundbank;

public class TesteContaMarcela {
    public static void main(String[] args) {
        Conta contaDaMarcela = new Conta();



        System.out.println(contaDaMarcela.titular);

        contaDaMarcela.titular.nome = "Marcela";
        System.out.println(contaDaMarcela.titular.nome);
    }
}
