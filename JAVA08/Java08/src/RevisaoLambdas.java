import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class RevisaoLambdas {
    public static void main(String[] args) {
        List<String> palavras = new ArrayList<>();
        palavras.add("alura online ");
        palavras.add("casa do código ");
        palavras.add("caelum");



       // palavras.sort((s1,s2) -> Integer.compare(s1.length(),s2.length()));

        Function<String,Integer> funcao = s -> s.length();

        //Palavras orde comparando o tamanho do length
        palavras.sort(Comparator.comparing(String::length));

        System.out.println(palavras);

        palavras.forEach(System.out::println);
    }

}
