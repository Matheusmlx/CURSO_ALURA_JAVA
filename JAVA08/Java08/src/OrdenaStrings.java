import java.util.*;
import java.util.function.Consumer;

public class OrdenaStrings {
    public static void main(String[] args) {

        List<String> palavras = new ArrayList<String>();
        palavras.add("Alura online");
        palavras.add("editora casa do codigo");
        palavras.add("caelum");

       // Comparator<String> comparador = (String s1, String s2) -> Integer.compare(s1.length(),s2.length());

        palavras.sort( (s1,s2) -> Integer.compare(s1.length(),s2.length()));

        System.out.println(palavras);

        //Consumer<String> impressor =s -> System.out.println(s);
        //palavras.forEach(impressor);

        //palavras.forEach(s -> System.out.println(s));

        new Thread(new Runnable() {

            @Override
            public void run() {
                System.out.println("Executando um Runnable");
            }

        }).start();

        new Thread( () -> System.out.println("Executando um Runnable")).start();
    }
}

//O lambda só funciona quando você tem uma interface com apenas um metodo abstrado -> Interface Funcional

