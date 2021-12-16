package automation.lesson7;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorEx {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("one", "", "two", "", "three"));


        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().isEmpty()) {
                iterator.remove();
            }
        }
//            System.out.println(list);

        List<String> pageValues = new ArrayList<>(Arrays.asList("Name", "Jon", "Location", "The Wall", "Field", "Data"));

        Iterator<String> iterator1 = pageValues.listIterator();
        while (iterator1.hasNext()) {
            if (iterator1.next().equals("Location")) {
                System.out.println(iterator1.next());
                break;
            }
        }

    }
}
