import org.junit.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;


public class TesteCurso {

    public static void main(String [] args) {
        List<Curso> cursos = new ArrayList<Curso>();
        cursos.add(new Curso("JavaScript",45));
        cursos.add(new Curso("Python",150));
        cursos.add(new Curso("HTML BASICO",113));
        cursos.add(new Curso("Spring Boot",55));

        cursos.sort(Comparator.comparing(Curso::getAlunos));

        //cursos.forEach(c -> System.out.println(c.getNome()));

        //Stream não modifica o array original
       int sum = cursos.stream()
               .filter(c -> c.getAlunos() > 50)
               .mapToInt(Curso::getAlunos)
               .sum();
        //System.out.println(sum);



        Optional<Curso> optionalCurso = cursos
                 .stream()
                 .filter( c -> c.getAlunos() >= 100)
                .findFirst();

        optionalCurso.ifPresent(c -> System.out.println(c.getNome()));


    }


}
