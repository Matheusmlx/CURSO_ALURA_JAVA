import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DataTeste {

    public static void main(String[] args) {

        LocalDate aniversario = LocalDate.of(2021, Month.MARCH,03);

        DateTimeFormatter formatadorData = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);

        System.out.println(aniversario.format(formatadorData));

        LocalDate dataAtual = LocalDate.now();
        System.out.println("Data Atual " + dataAtual);
        Period peridoEntreAtualEAniversario = Period.between(dataAtual,aniversario);

        Duration duracao = Duration.ofHours(1);

        System.out.println("Uma hora tem " + duracao.getSeconds() + " Segundos");



        System.out.println("Faltam " + peridoEntreAtualEAniversario.getMonths() + " Meses " + " Para o aniversario ");

        System.out.println("Faltam " + peridoEntreAtualEAniversario.getDays() + " Dias " + " Para o aniversario ");
    }
}
