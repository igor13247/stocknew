import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Stock {
    public static void main(String[] args){
        List<String> strings = new LinkedList<>();
        strings.add("Tomato");
        strings.add("Carrot");
        strings.add("Apple");
        strings.add("Orange");

        /* Реализован вывод for-each */
        for (String s : strings) {
            System.out.print(s + ", ");
        }
        System.out.println();
        System.out.println();

        /* Реализован Iterator и вывода hasNext */
        Iterator<String> iter = strings.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
    }
}
