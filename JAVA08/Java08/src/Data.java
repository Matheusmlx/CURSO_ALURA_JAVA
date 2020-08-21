import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;

public class Data {
    public static void main(String[] args) {
        //Buscando a data atual
        LocalDate hoje = LocalDate.now();
        System.out.println(hoje);

        LocalDate olimpiadasRio = LocalDate.of(2026, Month.MARCH,10);

        int anos = olimpiadasRio.getYear() - hoje.getYear();

        //System.out.println(olimpiadasRio);

        //Buscando o numero de dias que tem a semana , passando como argumento o n semanas
        Period perido = Period.ofWeeks(1);

        Period periodo = Period.between(hoje,olimpiadasRio);

        //System.out.println(periodo.getYears());

        //Metodo imutavel ou seja não altera o objeto referente
        LocalDate proximasOlimpiadas =  olimpiadasRio.plusYears(4);



        System.out.println(proximasOlimpiadas);
        //Utilizando o formato local da maquina
        DateTimeFormatter formatadorLocal = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        //Utilizando um formato definido por você
        DateTimeFormatter formatadorManual = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        //System.out.println(proximasOlimpiadas.format(formatadorLocal));


        if(hoje.isAfter(olimpiadasRio)){
            System.out.println("Hoje é depois do que a data das olimpiadas");
        }

        if(hoje.isBefore(olimpiadasRio)){
            //System.out.println("Hoje é antes da data das Olimpiadas");
        }

        if(olimpiadasRio.isAfter(hoje)){
           // System.out.println("Olimpiadas  é depois do que a data de Hoje!");
        }

        LocalDateTime agora = LocalDateTime.now();
        //Transformando de AM para PM é só aumentando o hh para HH
        DateTimeFormatter formatadorDateAndTimeAM = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm"  );

        DateTimeFormatter formatadorDateAndTimePM = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm a");

        //System.out.println(agora.format(formatadorDateAndTimePM));
        //System.out.println(agora.format(formatadorDateAndTimeAM));

        YearMonth mes = YearMonth.now();

        System.out.println(mes);

        LocalTime intervalo = LocalTime.of(15,30);

        System.out.println(intervalo);



    }
}
