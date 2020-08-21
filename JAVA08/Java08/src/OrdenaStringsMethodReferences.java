import sun.security.krb5.internal.PAData;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class OrdenaStringsMethodReferences {

    public static void main(String[] args) {

        List<String> palavras = new ArrayList<String>();
        palavras.add("Alura online");
        palavras.add("editora casa do codigo");
        palavras.add("caelum");



      //  palavras.sort( (s1,s2) -> Integer.compare(s1.length(),s2.length()));
        //Dentro da interface Comparator existe um metodo chamado comparing -> uma interface funcional

        //palavras ordene comparando o tamanho da String
        //palavras.sort(Comparator.comparing(s -> s.length()));

        //Palavras ordene comparando o length String
        //palavras.sort(Comparator.comparing(String::length));





//       Function<String,Integer> funcao = String::length;
//        Comparator<String> comparator = Comparator.comparing(funcao);
//        palavras.sort(comparator);


       // System.out.println(palavras);

//        Consumer<String> impressor = s -> System.out.println(s);
//        palavras.forEach(impressor);

        //palavras.forEach(s -> System.out.println(s));

        palavras.forEach(System.out::println);

    //MethdReferences chama o metodo daquela classe ::

    //## EXERCICIOS

//        palavras.sort((s1, s2) ->{
//            return Integer.compare(s1.length(),s2.length());
//        });

      //  palavras.sort(Comparator.comparing( s -> s.length()));

        palavras.sort(Comparator.comparing(String::length));

        System.out.println(palavras);
    }
}
