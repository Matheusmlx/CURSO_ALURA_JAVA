import java.util.*;

public class OrdenaStrings {
    public static void main(String[] args) {
        List<String> palavras = new ArrayList<String>();
        palavras.add("Alura online");
        palavras.add("editora casa do codigo");
        palavras.add("caelum");

        Collections.sort(palavras);

        System.out.println(palavras);
    }
}

class ComparadorPorTamanho implements Comparator<String> {
    @Override
    public int compare(String s1, String s2){
        if(s1.length() < s2.length())
            return -1;
        if(s)
        return 0;
    }
}
